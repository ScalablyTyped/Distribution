package typings.phonegapFacebookPlugin.PhonegapFacebookPlugin

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * The response object returned from a success callback for showDialog() of type 'share' or 'share_open_graph'.
  */
@js.native
trait ShareDialogResult extends BaseDialogResult {
  /**
    * Only available if the user is logged into your app using Facebook and has granted publish_actions.
    * If present, this is the ID of the published Open Graph story.
    */
  var post_id: String = js.native
}

object ShareDialogResult {
  @scala.inline
  def apply(error_code: String, error_message: String, post_id: String): ShareDialogResult = {
    val __obj = js.Dynamic.literal(error_code = error_code.asInstanceOf[js.Any], error_message = error_message.asInstanceOf[js.Any], post_id = post_id.asInstanceOf[js.Any])
    __obj.asInstanceOf[ShareDialogResult]
  }
  @scala.inline
  implicit class ShareDialogResultOps[Self <: ShareDialogResult] (val x: Self) extends AnyVal {
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
    def setPost_id(value: String): Self = this.set("post_id", value.asInstanceOf[js.Any])
  }
  
}

