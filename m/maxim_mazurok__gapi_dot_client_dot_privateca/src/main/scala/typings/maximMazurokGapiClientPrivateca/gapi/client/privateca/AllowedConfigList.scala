package typings.maximMazurokGapiClientPrivateca.gapi.client.privateca

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AllowedConfigList extends StObject {
  
  /**
    * Required. All Certificates issued by the CertificateAuthority must match at least one listed ReusableConfigWrapper. If a ReusableConfigWrapper has an empty field, any value will be
    * allowed for that field.
    */
  var allowedConfigValues: js.UndefOr[js.Array[ReusableConfigWrapper]] = js.undefined
}
object AllowedConfigList {
  
  @scala.inline
  def apply(): AllowedConfigList = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AllowedConfigList]
  }
  
  @scala.inline
  implicit class AllowedConfigListMutableBuilder[Self <: AllowedConfigList] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAllowedConfigValues(value: js.Array[ReusableConfigWrapper]): Self = StObject.set(x, "allowedConfigValues", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAllowedConfigValuesUndefined: Self = StObject.set(x, "allowedConfigValues", js.undefined)
    
    @scala.inline
    def setAllowedConfigValuesVarargs(value: ReusableConfigWrapper*): Self = StObject.set(x, "allowedConfigValues", js.Array(value :_*))
  }
}
