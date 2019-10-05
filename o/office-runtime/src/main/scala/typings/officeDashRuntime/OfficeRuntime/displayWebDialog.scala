package typings.officeDashRuntime.OfficeRuntime

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("OfficeRuntime.displayWebDialog")
@js.native
object displayWebDialog extends js.Object {
  /**
    * Method that enables a pop up web dialog box.
    * @param url Must be a string.
    * @param options Optional parameter. Must be of type DisplayWebDialogOptions.
    */
  def apply(url: String): js.Promise[Dialog] = js.native
  def apply(url: String, options: DisplayWebDialogOptions): js.Promise[Dialog] = js.native
}

