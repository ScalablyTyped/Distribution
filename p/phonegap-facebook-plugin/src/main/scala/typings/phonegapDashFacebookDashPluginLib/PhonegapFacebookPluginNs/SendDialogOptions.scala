package typings
package phonegapDashFacebookDashPluginLib.PhonegapFacebookPluginNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * The Send Dialog lets people privately send content to specific friends. They'll have the option to privately
  * share a link as a Facebook message or group post. The Send Dialog does not require any extended permissions.
  *
  * For use with showDialog() of method type 'send'.
  */
trait SendDialogOptions extends BaseDialogOptions {
  /**
    * Required parameter. The URL that is being sent in the message.
    */
  var link: java.lang.String
  /**
    * A user ID of a recipient. Once the dialog comes up, the sender can specify additional people, and groups
    * addresses as recipients. Sending content to a Facebook group will post it to the group's wall.
    */
  var to: java.lang.String
}

object SendDialogOptions {
  @scala.inline
  def apply(link: java.lang.String, method: java.lang.String, to: java.lang.String): SendDialogOptions = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("link")(link)
    __obj.updateDynamic("method")(method)
    __obj.updateDynamic("to")(to)
    __obj.asInstanceOf[SendDialogOptions]
  }
}

