package typings.microsoftGraph.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait VerifiedDomain extends StObject {
  
  // For example, Email, OfficeCommunicationsOnline.
  var capabilities: js.UndefOr[NullableOption[String]] = js.undefined
  
  // true if this is the default domain associated with the tenant; otherwise, false.
  var isDefault: js.UndefOr[NullableOption[Boolean]] = js.undefined
  
  // true if this is the initial domain associated with the tenant; otherwise, false.
  var isInitial: js.UndefOr[NullableOption[Boolean]] = js.undefined
  
  // The domain name; for example, contoso.onmicrosoft.com.
  var name: js.UndefOr[NullableOption[String]] = js.undefined
  
  // For example, Managed.
  var `type`: js.UndefOr[NullableOption[String]] = js.undefined
}
object VerifiedDomain {
  
  inline def apply(): VerifiedDomain = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[VerifiedDomain]
  }
  
  extension [Self <: VerifiedDomain](x: Self) {
    
    inline def setCapabilities(value: NullableOption[String]): Self = StObject.set(x, "capabilities", value.asInstanceOf[js.Any])
    
    inline def setCapabilitiesNull: Self = StObject.set(x, "capabilities", null)
    
    inline def setCapabilitiesUndefined: Self = StObject.set(x, "capabilities", js.undefined)
    
    inline def setIsDefault(value: NullableOption[Boolean]): Self = StObject.set(x, "isDefault", value.asInstanceOf[js.Any])
    
    inline def setIsDefaultNull: Self = StObject.set(x, "isDefault", null)
    
    inline def setIsDefaultUndefined: Self = StObject.set(x, "isDefault", js.undefined)
    
    inline def setIsInitial(value: NullableOption[Boolean]): Self = StObject.set(x, "isInitial", value.asInstanceOf[js.Any])
    
    inline def setIsInitialNull: Self = StObject.set(x, "isInitial", null)
    
    inline def setIsInitialUndefined: Self = StObject.set(x, "isInitial", js.undefined)
    
    inline def setName(value: NullableOption[String]): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameNull: Self = StObject.set(x, "name", null)
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    inline def setType(value: NullableOption[String]): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    inline def setTypeNull: Self = StObject.set(x, "type", null)
    
    inline def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
  }
}
