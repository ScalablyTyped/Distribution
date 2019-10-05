package typings.phonegapDashFacebookDashPlugin.PhonegapFacebookPlugin

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * The Share dialog prompts a person to publish an individual story or an Open Graph story to their timeline.
  * This does not require Facebook Login or any extended permissions, so it is the easiest way to enable
  * sharing on web.
  *
  * For use with showDialog() of method type 'share_open_graph'.
  */
trait ShareOpenGraphDialogOptions extends BaseDialogOptions {
  /**
    * A JSON object of key/value pairs specifying parameters which correspond to the action_type being used.
    * Valid key/value pairs are the same parameters that can be used when publishing Open Graph Actions using
    * the API.
    */
  var action_properties: String
  /**
    * A string specifying which Open Graph action type to publish, e.g., og.likes for the built in like type.
    * The dialog also supports approved custom types.
    */
  var action_type: String
}

object ShareOpenGraphDialogOptions {
  @scala.inline
  def apply(action_properties: String, action_type: String, method: String): ShareOpenGraphDialogOptions = {
    val __obj = js.Dynamic.literal(action_properties = action_properties, action_type = action_type, method = method)
  
    __obj.asInstanceOf[ShareOpenGraphDialogOptions]
  }
}

