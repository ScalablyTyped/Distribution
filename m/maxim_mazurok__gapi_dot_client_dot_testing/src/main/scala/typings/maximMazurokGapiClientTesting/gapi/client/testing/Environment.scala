package typings.maximMazurokGapiClientTesting.gapi.client.testing

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Environment extends js.Object {
  
  /** An Android device which must be used with an Android test. */
  var androidDevice: js.UndefOr[AndroidDevice] = js.native
  
  /** An iOS device which must be used with an iOS test. */
  var iosDevice: js.UndefOr[IosDevice] = js.native
}
object Environment {
  
  @scala.inline
  def apply(): Environment = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Environment]
  }
  
  @scala.inline
  implicit class EnvironmentOps[Self <: Environment] (val x: Self) extends AnyVal {
    
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
    def setAndroidDevice(value: AndroidDevice): Self = this.set("androidDevice", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAndroidDevice: Self = this.set("androidDevice", js.undefined)
    
    @scala.inline
    def setIosDevice(value: IosDevice): Self = this.set("iosDevice", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIosDevice: Self = this.set("iosDevice", js.undefined)
  }
}
