package typings.phonegapFacebookPlugin.PhonegapFacebookPlugin

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * The Share dialog prompts a person to publish an individual story or an Open Graph story to their timeline.
  * This does not require Facebook Login or any extended permissions, so it is the easiest way to enable
  * sharing on web.
  *
  * For use with showDialog() of method type 'share_open_graph'.
  */
@js.native
trait ShareOpenGraphDialogOptions extends BaseDialogOptions {
  
  /**
    * A JSON object of key/value pairs specifying parameters which correspond to the action_type being used.
    * Valid key/value pairs are the same parameters that can be used when publishing Open Graph Actions using
    * the API.
    */
  var action_properties: String = js.native
  
  /**
    * A string specifying which Open Graph action type to publish, e.g., og.likes for the built in like type.
    * The dialog also supports approved custom types.
    */
  var action_type: String = js.native
}
object ShareOpenGraphDialogOptions {
  
  @scala.inline
  def apply(action_properties: String, action_type: String, method: String): ShareOpenGraphDialogOptions = {
    val __obj = js.Dynamic.literal(action_properties = action_properties.asInstanceOf[js.Any], action_type = action_type.asInstanceOf[js.Any], method = method.asInstanceOf[js.Any])
    __obj.asInstanceOf[ShareOpenGraphDialogOptions]
  }
  
  @scala.inline
  implicit class ShareOpenGraphDialogOptionsOps[Self <: ShareOpenGraphDialogOptions] (val x: Self) extends AnyVal {
    
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
    def setAction_properties(value: String): Self = this.set("action_properties", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAction_type(value: String): Self = this.set("action_type", value.asInstanceOf[js.Any])
  }
}
