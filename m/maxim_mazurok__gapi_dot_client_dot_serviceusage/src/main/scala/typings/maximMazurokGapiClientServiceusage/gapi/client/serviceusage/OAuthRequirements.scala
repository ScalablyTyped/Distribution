package typings.maximMazurokGapiClientServiceusage.gapi.client.serviceusage

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait OAuthRequirements extends StObject {
  
  /**
    * The list of publicly documented OAuth scopes that are allowed access. An OAuth token containing any of these scopes will be accepted. Example: canonical_scopes:
    * https://www.googleapis.com/auth/calendar, https://www.googleapis.com/auth/calendar.read
    */
  var canonicalScopes: js.UndefOr[String] = js.native
}
object OAuthRequirements {
  
  @scala.inline
  def apply(): OAuthRequirements = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[OAuthRequirements]
  }
  
  @scala.inline
  implicit class OAuthRequirementsMutableBuilder[Self <: OAuthRequirements] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCanonicalScopes(value: String): Self = StObject.set(x, "canonicalScopes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCanonicalScopesUndefined: Self = StObject.set(x, "canonicalScopes", js.undefined)
  }
}
