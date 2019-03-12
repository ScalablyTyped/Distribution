package typings
package phantomjsLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Stream extends js.Object {
  def atEnd(): scala.Boolean
  def close(): scala.Unit
  def flush(): scala.Unit
  def read(): java.lang.String
  def readLine(): java.lang.String
  def seek(position: scala.Double): scala.Unit
  def write(data: java.lang.String): scala.Unit
  def writeLine(data: java.lang.String): scala.Unit
}

object Stream {
  @scala.inline
  def apply(
    atEnd: () => scala.Boolean,
    close: () => scala.Unit,
    flush: () => scala.Unit,
    read: () => java.lang.String,
    readLine: () => java.lang.String,
    seek: scala.Double => scala.Unit,
    write: java.lang.String => scala.Unit,
    writeLine: java.lang.String => scala.Unit
  ): Stream = {
    val __obj = js.Dynamic.literal(atEnd = js.Any.fromFunction0(atEnd), close = js.Any.fromFunction0(close), flush = js.Any.fromFunction0(flush), read = js.Any.fromFunction0(read), readLine = js.Any.fromFunction0(readLine), seek = js.Any.fromFunction1(seek), write = js.Any.fromFunction1(write), writeLine = js.Any.fromFunction1(writeLine))
  
    __obj.asInstanceOf[Stream]
  }
}

