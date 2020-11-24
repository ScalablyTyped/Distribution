package typings.maximMazurokGapiClientPrivateca.gapi.client.privateca

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ReusableConfigWrapper extends js.Object {
  
  /** Required. A resource path to a ReusableConfig in the format `projects/∗/locations/∗/reusableConfigs/ *`. */
  var reusableConfig: js.UndefOr[String] = js.native
  
  /** Required. A user-specified inline ReusableConfigValues. */
  var reusableConfigValues: js.UndefOr[ReusableConfigValues] = js.native
}
object ReusableConfigWrapper {
  
  @scala.inline
  def apply(): ReusableConfigWrapper = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ReusableConfigWrapper]
  }
  
  @scala.inline
  implicit class ReusableConfigWrapperOps[Self <: ReusableConfigWrapper] (val x: Self) extends AnyVal {
    
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
    def setReusableConfig(value: String): Self = this.set("reusableConfig", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteReusableConfig: Self = this.set("reusableConfig", js.undefined)
    
    @scala.inline
    def setReusableConfigValues(value: ReusableConfigValues): Self = this.set("reusableConfigValues", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteReusableConfigValues: Self = this.set("reusableConfigValues", js.undefined)
  }
}
