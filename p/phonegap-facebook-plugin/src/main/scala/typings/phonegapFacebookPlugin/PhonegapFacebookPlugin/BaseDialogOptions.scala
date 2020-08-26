package typings.phonegapFacebookPlugin.PhonegapFacebookPlugin

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

//#endregion
//#region Method Parameters
@js.native
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
  var method: String = js.native
}

object BaseDialogOptions {
  @scala.inline
  def apply(method: String): BaseDialogOptions = {
    val __obj = js.Dynamic.literal(method = method.asInstanceOf[js.Any])
    __obj.asInstanceOf[BaseDialogOptions]
  }
  @scala.inline
  implicit class BaseDialogOptionsOps[Self <: BaseDialogOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setMethod(value: String): Self = this.set("method", value.asInstanceOf[js.Any])
  }
  
}

