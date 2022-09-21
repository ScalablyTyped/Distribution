package typings.npmProfile.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Partial<std.Omit<npm-profile.npm-profile.ProfileData, 'tfa' | 'created' | 'updated' | 'email_verified'>> & npm-profile.npm-profile.UpdateOptions */
trait UpdateProfileData extends StObject {
  
  var cidr_whitelist: js.UndefOr[Null | js.Array[String]] = js.undefined
  
  var email: js.UndefOr[String] = js.undefined
  
  var freenode: js.UndefOr[String] = js.undefined
  
  var fullname: js.UndefOr[String] = js.undefined
  
  var github: js.UndefOr[String] = js.undefined
  
  var homepage: js.UndefOr[String] = js.undefined
  
  var name: js.UndefOr[String] = js.undefined
  
  /**
    * This is used to change your password and is not visible (for obvious reasons) through the get() API.
    * The value should be an object with old and new properties, where the former has the user's current password and the latter has the desired new password.
    */
  var password: js.UndefOr[PasswordUpdate] = js.undefined
  
  var tfa: js.UndefOr[TFAStatusUpdate] = js.undefined
  
  var twitter: js.UndefOr[String] = js.undefined
}
object UpdateProfileData {
  
  inline def apply(): UpdateProfileData = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[UpdateProfileData]
  }
  
  extension [Self <: UpdateProfileData](x: Self) {
    
    inline def setCidr_whitelist(value: js.Array[String]): Self = StObject.set(x, "cidr_whitelist", value.asInstanceOf[js.Any])
    
    inline def setCidr_whitelistNull: Self = StObject.set(x, "cidr_whitelist", null)
    
    inline def setCidr_whitelistUndefined: Self = StObject.set(x, "cidr_whitelist", js.undefined)
    
    inline def setCidr_whitelistVarargs(value: String*): Self = StObject.set(x, "cidr_whitelist", js.Array(value*))
    
    inline def setEmail(value: String): Self = StObject.set(x, "email", value.asInstanceOf[js.Any])
    
    inline def setEmailUndefined: Self = StObject.set(x, "email", js.undefined)
    
    inline def setFreenode(value: String): Self = StObject.set(x, "freenode", value.asInstanceOf[js.Any])
    
    inline def setFreenodeUndefined: Self = StObject.set(x, "freenode", js.undefined)
    
    inline def setFullname(value: String): Self = StObject.set(x, "fullname", value.asInstanceOf[js.Any])
    
    inline def setFullnameUndefined: Self = StObject.set(x, "fullname", js.undefined)
    
    inline def setGithub(value: String): Self = StObject.set(x, "github", value.asInstanceOf[js.Any])
    
    inline def setGithubUndefined: Self = StObject.set(x, "github", js.undefined)
    
    inline def setHomepage(value: String): Self = StObject.set(x, "homepage", value.asInstanceOf[js.Any])
    
    inline def setHomepageUndefined: Self = StObject.set(x, "homepage", js.undefined)
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    inline def setPassword(value: PasswordUpdate): Self = StObject.set(x, "password", value.asInstanceOf[js.Any])
    
    inline def setPasswordUndefined: Self = StObject.set(x, "password", js.undefined)
    
    inline def setTfa(value: TFAStatusUpdate): Self = StObject.set(x, "tfa", value.asInstanceOf[js.Any])
    
    inline def setTfaUndefined: Self = StObject.set(x, "tfa", js.undefined)
    
    inline def setTwitter(value: String): Self = StObject.set(x, "twitter", value.asInstanceOf[js.Any])
    
    inline def setTwitterUndefined: Self = StObject.set(x, "twitter", js.undefined)
  }
}
