package typings
package officeDashRuntimeLib.OfficeRuntimeNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("OfficeRuntime")
@js.native
object ^ extends js.Object {
  /**
    * Asynchronous, global, and persistent key-value storage.
    */
  val storage: Storage = js.native
  /**
    * Method that enables a pop up web dialog box.
    * @param url Must be a string.
    * @param options Optional parameter. Must be of type DisplayWebDialogOptions.
    */
  def displayWebDialog(url: java.lang.String): js.Promise[Dialog] = js.native
  def displayWebDialog(url: java.lang.String, options: DisplayWebDialogOptions): js.Promise[Dialog] = js.native
}

