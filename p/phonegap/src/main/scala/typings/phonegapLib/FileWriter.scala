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

