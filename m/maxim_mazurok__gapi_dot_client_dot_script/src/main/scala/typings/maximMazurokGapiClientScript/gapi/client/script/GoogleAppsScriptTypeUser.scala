package typings.maximMazurokGapiClientScript.gapi.client.script

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GoogleAppsScriptTypeUser extends StObject {
  
  /** The user's domain. */
  var domain: js.UndefOr[String] = js.undefined
  
  /** The user's identifying email address. */
  var email: js.UndefOr[String] = js.undefined
  
  /** The user's display name. */
  var name: js.UndefOr[String] = js.undefined
  
  /** The user's photo. */
  var photoUrl: js.UndefOr[String] = js.undefined
}
object GoogleAppsScriptTypeUser {
  
  inline def apply(): GoogleAppsScriptTypeUser = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GoogleAppsScriptTypeUser]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: GoogleAppsScriptTypeUser] (val x: Self) extends AnyVal {
    
    inline def setDomain(value: String): Self = StObject.set(x, "domain", value.asInstanceOf[js.Any])
    
    inline def setDomainUndefined: Self = StObject.set(x, "domain", js.undefined)
    
    inline def setEmail(value: String): Self = StObject.set(x, "email", value.asInstanceOf[js.Any])
    
    inline def setEmailUndefined: Self = StObject.set(x, "email", js.undefined)
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    inline def setPhotoUrl(value: String): Self = StObject.set(x, "photoUrl", value.asInstanceOf[js.Any])
    
    inline def setPhotoUrlUndefined: Self = StObject.set(x, "photoUrl", js.undefined)
  }
}
