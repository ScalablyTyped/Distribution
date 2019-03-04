package typings
package phonegapDashFacebookDashPluginLib.PhonegapFacebookPluginNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * The response object returned from a success callback for showDialog() of type 'feed'.
  */
trait FeedDialogResult extends BaseDialogResult {
  /**
    * The ID of the posted story, if the person chose to publish.
    */
  var post_id: java.lang.String
}

object FeedDialogResult {
  @scala.inline
  def apply(error_code: java.lang.String, error_message: java.lang.String, post_id: java.lang.String): FeedDialogResult = {
    val __obj = js.Dynamic.literal(error_code = error_code, error_message = error_message, post_id = post_id)
  
    __obj.asInstanceOf[FeedDialogResult]
  }
}

