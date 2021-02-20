package typings.microsoftGraph.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait VerifiedDomain extends StObject {
  
  // For example, 'Email', 'OfficeCommunicationsOnline'.
  var capabilities: js.UndefOr[NullableOption[String]] = js.native
  
  // true if this is the default domain associated with the tenant; otherwise, false.
  var isDefault: js.UndefOr[NullableOption[Boolean]] = js.native
  
  // true if this is the initial domain associated with the tenant; otherwise, false
  var isInitial: js.UndefOr[NullableOption[Boolean]] = js.native
  
  // The domain name; for example, 'contoso.onmicrosoft.com'
  var name: js.UndefOr[NullableOption[String]] = js.native
  
  // For example, 'Managed'.
  var `type`: js.UndefOr[NullableOption[String]] = js.native
}
object VerifiedDomain {
  
  @scala.inline
  def apply(): VerifiedDomain = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[VerifiedDomain]
  }
  
  @scala.inline
  implicit class VerifiedDomainMutableBuilder[Self <: VerifiedDomain] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCapabilities(value: NullableOption[String]): Self = StObject.set(x, "capabilities", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCapabilitiesNull: Self = StObject.set(x, "capabilities", null)
    
    @scala.inline
    def setCapabilitiesUndefined: Self = StObject.set(x, "capabilities", js.undefined)
    
    @scala.inline
    def setIsDefault(value: NullableOption[Boolean]): Self = StObject.set(x, "isDefault", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIsDefaultNull: Self = StObject.set(x, "isDefault", null)
    
    @scala.inline
    def setIsDefaultUndefined: Self = StObject.set(x, "isDefault", js.undefined)
    
    @scala.inline
    def setIsInitial(value: NullableOption[Boolean]): Self = StObject.set(x, "isInitial", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIsInitialNull: Self = StObject.set(x, "isInitial", null)
    
    @scala.inline
    def setIsInitialUndefined: Self = StObject.set(x, "isInitial", js.undefined)
    
    @scala.inline
    def setName(value: NullableOption[String]): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNameNull: Self = StObject.set(x, "name", null)
    
    @scala.inline
    def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    @scala.inline
    def setType(value: NullableOption[String]): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTypeNull: Self = StObject.set(x, "type", null)
    
    @scala.inline
    def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
  }
}
