package typings.maximMazurokGapiClientPrivateca.gapi.client.privateca

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait AllowedConfigList extends js.Object {
  
  /**
    * Required. All Certificates issued by the CertificateAuthority must match at least one listed ReusableConfigWrapper. If a ReusableConfigWrapper has an empty field, any value will be
    * allowed for that field.
    */
  var allowedConfigValues: js.UndefOr[js.Array[ReusableConfigWrapper]] = js.native
}
object AllowedConfigList {
  
  @scala.inline
  def apply(): AllowedConfigList = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AllowedConfigList]
  }
  
  @scala.inline
  implicit class AllowedConfigListOps[Self <: AllowedConfigList] (val x: Self) extends AnyVal {
    
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
    def setAllowedConfigValuesVarargs(value: ReusableConfigWrapper*): Self = this.set("allowedConfigValues", js.Array(value :_*))
    
    @scala.inline
    def setAllowedConfigValues(value: js.Array[ReusableConfigWrapper]): Self = this.set("allowedConfigValues", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAllowedConfigValues: Self = this.set("allowedConfigValues", js.undefined)
  }
}
