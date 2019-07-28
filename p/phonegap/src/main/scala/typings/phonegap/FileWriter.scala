package typings.phonegap

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Defined in lib.d.ts
interface File {
  fullPath: string;
  type: string;
  size: number;
}
*/
trait FileWriter extends js.Object {
  var error: FileError
  var fileName: String
  var length: Double
  var onabort: js.Function
  var onerror: js.Function
  var onprogress: js.Function
  var onwrite: js.Function
  var onwriteend: js.Function
  var onwritestart: js.Function
  var position: Double
  var readyState: js.Any
  def abort(): Unit
  def seek(arg: Double): Unit
  def truncate(arg: Double): Unit
  def write(arg: js.Any): Unit
}

object FileWriter {
  @scala.inline
  def apply(
    abort: () => Unit,
    error: FileError,
    fileName: String,
    length: Double,
    onabort: js.Function,
    onerror: js.Function,
    onprogress: js.Function,
    onwrite: js.Function,
    onwriteend: js.Function,
    onwritestart: js.Function,
    position: Double,
    readyState: js.Any,
    seek: Double => Unit,
    truncate: Double => Unit,
    write: js.Any => Unit
  ): FileWriter = {
    val __obj = js.Dynamic.literal(abort = js.Any.fromFunction0(abort), error = error, fileName = fileName, length = length, onabort = onabort, onerror = onerror, onprogress = onprogress, onwrite = onwrite, onwriteend = onwriteend, onwritestart = onwritestart, position = position, readyState = readyState, seek = js.Any.fromFunction1(seek), truncate = js.Any.fromFunction1(truncate), write = js.Any.fromFunction1(write))
  
    __obj.asInstanceOf[FileWriter]
  }
}

