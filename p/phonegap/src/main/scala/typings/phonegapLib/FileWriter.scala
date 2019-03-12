package typings
package phonegapLib

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
  var fileName: java.lang.String
  var length: scala.Double
  var onabort: js.Function
  var onerror: js.Function
  var onprogress: js.Function
  var onwrite: js.Function
  var onwriteend: js.Function
  var onwritestart: js.Function
  var position: scala.Double
  var readyState: js.Any
  def abort(): scala.Unit
  def seek(arg: scala.Double): scala.Unit
  def truncate(arg: scala.Double): scala.Unit
  def write(arg: js.Any): scala.Unit
}

object FileWriter {
  @scala.inline
  def apply(
    abort: () => scala.Unit,
    error: FileError,
    fileName: java.lang.String,
    length: scala.Double,
    onabort: js.Function,
    onerror: js.Function,
    onprogress: js.Function,
    onwrite: js.Function,
    onwriteend: js.Function,
    onwritestart: js.Function,
    position: scala.Double,
    readyState: js.Any,
    seek: scala.Double => scala.Unit,
    truncate: scala.Double => scala.Unit,
    write: js.Any => scala.Unit
  ): FileWriter = {
    val __obj = js.Dynamic.literal(abort = js.Any.fromFunction0(abort), error = error, fileName = fileName, length = length, onabort = onabort, onerror = onerror, onprogress = onprogress, onwrite = onwrite, onwriteend = onwriteend, onwritestart = onwritestart, position = position, readyState = readyState, seek = js.Any.fromFunction1(seek), truncate = js.Any.fromFunction1(truncate), write = js.Any.fromFunction1(write))
  
    __obj.asInstanceOf[FileWriter]
  }
}

