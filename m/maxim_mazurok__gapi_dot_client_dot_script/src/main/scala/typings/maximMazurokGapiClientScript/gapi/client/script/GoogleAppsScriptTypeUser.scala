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
  
  @scala.inline
  def apply(): GoogleAppsScriptTypeUser = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GoogleAppsScriptTypeUser]
  }
  
  @scala.inline
  implicit class GoogleAppsScriptTypeUserMutableBuilder[Self <: GoogleAppsScriptTypeUser] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDomain(value: String): Self = StObject.set(x, "domain", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDomainUndefined: Self = StObject.set(x, "domain", js.undefined)
    
    @scala.inline
    def setEmail(value: String): Self = StObject.set(x, "email", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEmailUndefined: Self = StObject.set(x, "email", js.undefined)
    
    @scala.inline
    def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    @scala.inline
    def setPhotoUrl(value: String): Self = StObject.set(x, "photoUrl", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPhotoUrlUndefined: Self = StObject.set(x, "photoUrl", js.undefined)
  }
}
