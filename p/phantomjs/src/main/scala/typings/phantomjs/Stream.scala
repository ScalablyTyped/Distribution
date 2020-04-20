package typings.phantomjs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Stream extends js.Object {
  def atEnd(): Boolean
  def close(): Unit
  def flush(): Unit
  def read(): String
  def readLine(): String
  def seek(position: Double): Unit
  def write(data: String): Unit
  def writeLine(data: String): Unit
}

object Stream {
  @scala.inline
  def apply(
    atEnd: () => Boolean,
    close: () => Unit,
    flush: () => Unit,
    read: () => String,
    readLine: () => String,
    seek: Double => Unit,
    write: String => Unit,
    writeLine: String => Unit
  ): Stream = {
    val __obj = js.Dynamic.literal(atEnd = js.Any.fromFunction0(atEnd), close = js.Any.fromFunction0(close), flush = js.Any.fromFunction0(flush), read = js.Any.fromFunction0(read), readLine = js.Any.fromFunction0(readLine), seek = js.Any.fromFunction1(seek), write = js.Any.fromFunction1(write), writeLine = js.Any.fromFunction1(writeLine))
    __obj.asInstanceOf[Stream]
  }
}

