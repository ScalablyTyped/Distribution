package typings.microsoftDashLiveDashConnect.MicrosoftNs.LiveNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * 'Properties' object passed into the WL.ui method.
  */
trait IUIProperties extends js.Object {
  /**
    * The value of the id attribute of the <div> tag to display the button
    * in.
    */
  var element: String
  /**
    * Specifies the type of button to display. Specify "signin" to display
    * the Live Connect sign-in button. Specify "skydrivepicker" to display
    * the SkyDrive button.
    */
  var name: String
  /**
    * Windows Store apps using JavaScript: not applicable.
    * Web apps: Optional. If the name property is set to "signin", the
    * WL.init function's response_type property is set to "code", and the
    * app uses server-flow authentication, the state object here can be
    * used to track the web app's calling state on the web app server side.
    * For more info, see the description of the state query parameter in
    * the Server-side scenarios topic's "Getting an authorization code"
    * section.
    * http://msdn.microsoft.com/en-us/library/live/hh243649.aspx
    */
  var state: js.UndefOr[String] = js.undefined
}

object IUIProperties {
  @scala.inline
  def apply(element: String, name: String, state: String = null): IUIProperties = {
    val __obj = js.Dynamic.literal(element = element, name = name)
    if (state != null) __obj.updateDynamic("state")(state)
    __obj.asInstanceOf[IUIProperties]
  }
}

