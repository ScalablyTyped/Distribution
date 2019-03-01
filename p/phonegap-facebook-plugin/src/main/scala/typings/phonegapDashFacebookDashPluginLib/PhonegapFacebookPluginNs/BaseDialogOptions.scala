package typings
package phonegapDashFacebookDashPluginLib.PhonegapFacebookPluginNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

//#endregion
//#region Method Parameters
trait BaseDialogOptions extends js.Object {
  /**
    * The type of dialog to show, can be one of the following.
    *
    * Depeneding on the type, a different options object will be used:
    *
    * Method               Options Type
    * feed                 FeedDialogOptions
    * send                 SendDialogOptions
    * share                ShareDialogOptions
    * share_open_graph     ShareOpenGraphDialogOptions
    */
  var method: java.lang.String
}

object BaseDialogOptions {
  @scala.inline
  def apply(method: java.lang.String): BaseDialogOptions = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("method")(method)
    __obj.asInstanceOf[BaseDialogOptions]
  }
}

