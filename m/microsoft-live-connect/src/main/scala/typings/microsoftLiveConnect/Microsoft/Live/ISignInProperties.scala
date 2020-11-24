package typings.microsoftLiveConnect.Microsoft.Live

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * 'Properties' object passed into the WL.ui method when 'name' is set to
  * 'signin'.
  */
@js.native
trait ISignInProperties extends IUIProperties {
  
  /**
    * Defines the brand, or type of icon, to be used with the Live Connect
    * sign-in button.
    * @default "windows"
    */
  var brand: js.UndefOr[String] = js.native
  
  /**
    * Specifies the function to call whenever there is any error while the
    * sign-in control is initializing or while the user is signing in.
    */
  var onerror: js.UndefOr[js.Function] = js.native
  
  /**
    * Specifies the function to call after the user completes the sign-in
    * process.
    */
  var onloggedin: js.UndefOr[js.Function] = js.native
  
  /**
    * Specifies the function to call after the user completes the sign-out
    * process.
    */
  var onloggedout: js.UndefOr[js.Function] = js.native
  
  /**
    * If the value of the type property is set to "custom", this value
    * specifies the sign-in text to be displayed in the button.
    */
  var sign_in_text: js.UndefOr[String] = js.native
  
  /**
    * If the value of the type property is "custom", this value specifies
    * the sign-out text to be displayed in the button.
    */
  var sign_out_text: js.UndefOr[String] = js.native
  
  /**
    * Defines the color pallette used for the sign-in button. For Windows
    * Store apps using JavaScript, valid values are "dark" and "light".
    * For web apps, valid values are "blue" and "white".
    */
  var theme: js.UndefOr[String] = js.native
  
  /**
    * Defines the type of button.
    * @default "signin"
    */
  var `type`: js.UndefOr[String] = js.native
}
object ISignInProperties {
  
  @scala.inline
  def apply(element: String, name: String): ISignInProperties = {
    val __obj = js.Dynamic.literal(element = element.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[ISignInProperties]
  }
  
  @scala.inline
  implicit class ISignInPropertiesOps[Self <: ISignInProperties] (val x: Self) extends AnyVal {
    
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
    def setBrand(value: String): Self = this.set("brand", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteBrand: Self = this.set("brand", js.undefined)
    
    @scala.inline
    def setOnerror(value: js.Function): Self = this.set("onerror", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOnerror: Self = this.set("onerror", js.undefined)
    
    @scala.inline
    def setOnloggedin(value: js.Function): Self = this.set("onloggedin", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOnloggedin: Self = this.set("onloggedin", js.undefined)
    
    @scala.inline
    def setOnloggedout(value: js.Function): Self = this.set("onloggedout", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOnloggedout: Self = this.set("onloggedout", js.undefined)
    
    @scala.inline
    def setSign_in_text(value: String): Self = this.set("sign_in_text", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSign_in_text: Self = this.set("sign_in_text", js.undefined)
    
    @scala.inline
    def setSign_out_text(value: String): Self = this.set("sign_out_text", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSign_out_text: Self = this.set("sign_out_text", js.undefined)
    
    @scala.inline
    def setTheme(value: String): Self = this.set("theme", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTheme: Self = this.set("theme", js.undefined)
    
    @scala.inline
    def setType(value: String): Self = this.set("type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteType: Self = this.set("type", js.undefined)
  }
}
