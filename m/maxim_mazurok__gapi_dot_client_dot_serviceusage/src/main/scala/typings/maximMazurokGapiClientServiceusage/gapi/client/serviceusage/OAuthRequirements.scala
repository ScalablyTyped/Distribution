package typings.maximMazurokGapiClientServiceusage.gapi.client.serviceusage

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait OAuthRequirements extends StObject {
  
  /**
    * The list of publicly documented OAuth scopes that are allowed access. An OAuth token containing any of these scopes will be accepted. Example: canonical_scopes:
    * https://www.googleapis.com/auth/calendar, https://www.googleapis.com/auth/calendar.read
    */
  var canonicalScopes: js.UndefOr[String] = js.undefined
}
object OAuthRequirements {
  
  inline def apply(): OAuthRequirements = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[OAuthRequirements]
  }
  
  extension [Self <: OAuthRequirements](x: Self) {
    
    inline def setCanonicalScopes(value: String): Self = StObject.set(x, "canonicalScopes", value.asInstanceOf[js.Any])
    
    inline def setCanonicalScopesUndefined: Self = StObject.set(x, "canonicalScopes", js.undefined)
  }
}
