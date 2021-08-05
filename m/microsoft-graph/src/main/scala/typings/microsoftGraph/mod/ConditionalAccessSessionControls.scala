package typings.microsoftGraph.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ConditionalAccessSessionControls extends StObject {
  
  /**
    * Session control to enforce application restrictions. Only Exchange Online and Sharepoint Online support this session
    * control.
    */
  var applicationEnforcedRestrictions: js.UndefOr[NullableOption[ApplicationEnforcedRestrictionsSessionControl]] = js.undefined
  
  // Session control to apply cloud app security.
  var cloudAppSecurity: js.UndefOr[NullableOption[CloudAppSecuritySessionControl]] = js.undefined
  
  /**
    * Session control to define whether to persist cookies or not. All apps should be selected for this session control to
    * work correctly.
    */
  var persistentBrowser: js.UndefOr[NullableOption[PersistentBrowserSessionControl]] = js.undefined
  
  // Session control to enforce signin frequency.
  var signInFrequency: js.UndefOr[NullableOption[SignInFrequencySessionControl]] = js.undefined
}
object ConditionalAccessSessionControls {
  
  inline def apply(): ConditionalAccessSessionControls = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ConditionalAccessSessionControls]
  }
  
  extension [Self <: ConditionalAccessSessionControls](x: Self) {
    
    inline def setApplicationEnforcedRestrictions(value: NullableOption[ApplicationEnforcedRestrictionsSessionControl]): Self = StObject.set(x, "applicationEnforcedRestrictions", value.asInstanceOf[js.Any])
    
    inline def setApplicationEnforcedRestrictionsNull: Self = StObject.set(x, "applicationEnforcedRestrictions", null)
    
    inline def setApplicationEnforcedRestrictionsUndefined: Self = StObject.set(x, "applicationEnforcedRestrictions", js.undefined)
    
    inline def setCloudAppSecurity(value: NullableOption[CloudAppSecuritySessionControl]): Self = StObject.set(x, "cloudAppSecurity", value.asInstanceOf[js.Any])
    
    inline def setCloudAppSecurityNull: Self = StObject.set(x, "cloudAppSecurity", null)
    
    inline def setCloudAppSecurityUndefined: Self = StObject.set(x, "cloudAppSecurity", js.undefined)
    
    inline def setPersistentBrowser(value: NullableOption[PersistentBrowserSessionControl]): Self = StObject.set(x, "persistentBrowser", value.asInstanceOf[js.Any])
    
    inline def setPersistentBrowserNull: Self = StObject.set(x, "persistentBrowser", null)
    
    inline def setPersistentBrowserUndefined: Self = StObject.set(x, "persistentBrowser", js.undefined)
    
    inline def setSignInFrequency(value: NullableOption[SignInFrequencySessionControl]): Self = StObject.set(x, "signInFrequency", value.asInstanceOf[js.Any])
    
    inline def setSignInFrequencyNull: Self = StObject.set(x, "signInFrequency", null)
    
    inline def setSignInFrequencyUndefined: Self = StObject.set(x, "signInFrequency", js.undefined)
  }
}
