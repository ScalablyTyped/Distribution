package typings.maximMazurokGapiClientIap.gapi.client.iap

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AccessDeniedPageSettings extends StObject {
  
  /** The URI to be redirected to when access is denied. */
  var accessDeniedPageUri: js.UndefOr[String] = js.undefined
  
  /** Whether to generate a troubleshooting URL on access denied events to this application. */
  var generateTroubleshootingUri: js.UndefOr[Boolean] = js.undefined
  
  /** Whether to generate remediation token on access denied events to this application. */
  var remediationTokenGenerationEnabled: js.UndefOr[Boolean] = js.undefined
}
object AccessDeniedPageSettings {
  
  inline def apply(): AccessDeniedPageSettings = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AccessDeniedPageSettings]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: AccessDeniedPageSettings] (val x: Self) extends AnyVal {
    
    inline def setAccessDeniedPageUri(value: String): Self = StObject.set(x, "accessDeniedPageUri", value.asInstanceOf[js.Any])
    
    inline def setAccessDeniedPageUriUndefined: Self = StObject.set(x, "accessDeniedPageUri", js.undefined)
    
    inline def setGenerateTroubleshootingUri(value: Boolean): Self = StObject.set(x, "generateTroubleshootingUri", value.asInstanceOf[js.Any])
    
    inline def setGenerateTroubleshootingUriUndefined: Self = StObject.set(x, "generateTroubleshootingUri", js.undefined)
    
    inline def setRemediationTokenGenerationEnabled(value: Boolean): Self = StObject.set(x, "remediationTokenGenerationEnabled", value.asInstanceOf[js.Any])
    
    inline def setRemediationTokenGenerationEnabledUndefined: Self = StObject.set(x, "remediationTokenGenerationEnabled", js.undefined)
  }
}
