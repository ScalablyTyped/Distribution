package typings.phonegapFacebookPlugin.PhonegapFacebookPlugin

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * The Send Dialog lets people privately send content to specific friends. They'll have the option to privately
  * share a link as a Facebook message or group post. The Send Dialog does not require any extended permissions.
  *
  * For use with showDialog() of method type 'send'.
  */
@js.native
trait SendDialogOptions extends BaseDialogOptions {
  
  /**
    * Required parameter. The URL that is being sent in the message.
    */
  var link: String = js.native
  
  /**
    * A user ID of a recipient. Once the dialog comes up, the sender can specify additional people, and groups
    * addresses as recipients. Sending content to a Facebook group will post it to the group's wall.
    */
  var to: String = js.native
}
object SendDialogOptions {
  
  @scala.inline
  def apply(link: String, method: String, to: String): SendDialogOptions = {
    val __obj = js.Dynamic.literal(link = link.asInstanceOf[js.Any], method = method.asInstanceOf[js.Any], to = to.asInstanceOf[js.Any])
    __obj.asInstanceOf[SendDialogOptions]
  }
  
  @scala.inline
  implicit class SendDialogOptionsOps[Self <: SendDialogOptions] (val x: Self) extends AnyVal {
    
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
    def setLink(value: String): Self = this.set("link", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTo(value: String): Self = this.set("to", value.asInstanceOf[js.Any])
  }
}
