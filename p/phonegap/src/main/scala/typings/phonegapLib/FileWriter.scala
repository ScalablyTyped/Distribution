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
    abort: js.Function0[scala.Unit],
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
    seek: js.Function1[scala.Double, scala.Unit],
    truncate: js.Function1[scala.Double, scala.Unit],
    write: js.Function1[js.Any, scala.Unit]
  ): FileWriter = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("abort")(abort)
    __obj.updateDynamic("error")(error)
    __obj.updateDynamic("fileName")(fileName)
    __obj.updateDynamic("length")(length)
    __obj.updateDynamic("onabort")(onabort)
    __obj.updateDynamic("onerror")(onerror)
    __obj.updateDynamic("onprogress")(onprogress)
    __obj.updateDynamic("onwrite")(onwrite)
    __obj.updateDynamic("onwriteend")(onwriteend)
    __obj.updateDynamic("onwritestart")(onwritestart)
    __obj.updateDynamic("position")(position)
    __obj.updateDynamic("readyState")(readyState)
    __obj.updateDynamic("seek")(seek)
    __obj.updateDynamic("truncate")(truncate)
    __obj.updateDynamic("write")(write)
    __obj.asInstanceOf[FileWriter]
  }
}

