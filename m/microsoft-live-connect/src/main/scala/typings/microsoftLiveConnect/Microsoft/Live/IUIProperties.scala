package typings.microsoftLiveConnect.Microsoft.Live

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * 'Properties' object passed into the WL.ui method.
  */
@js.native
trait IUIProperties extends js.Object {
  /**
    * The value of the id attribute of the <div> tag to display the button
    * in.
    */
  var element: String = js.native
  /**
    * Specifies the type of button to display. Specify "signin" to display
    * the Live Connect sign-in button. Specify "skydrivepicker" to display
    * the SkyDrive button.
    */
  var name: String = js.native
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
  var state: js.UndefOr[String] = js.native
}

object IUIProperties {
  @scala.inline
  def apply(element: String, name: String): IUIProperties = {
    val __obj = js.Dynamic.literal(element = element.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[IUIProperties]
  }
  @scala.inline
  implicit class IUIPropertiesOps[Self <: IUIProperties] (val x: Self) extends AnyVal {
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
    def setElement(value: String): Self = this.set("element", value.asInstanceOf[js.Any])
    @scala.inline
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
    @scala.inline
    def setState(value: String): Self = this.set("state", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteState: Self = this.set("state", js.undefined)
  }
  
}

