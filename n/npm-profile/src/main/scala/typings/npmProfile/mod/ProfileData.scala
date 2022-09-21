package typings.npmProfile.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ProfileData extends StObject {
  
  var cidr_whitelist: Null | js.Array[String]
  
  var created: js.Date | String
  
  var email: String
  
  var email_verified: Boolean
  
  var freenode: js.UndefOr[String] = js.undefined
  
  var fullname: js.UndefOr[String] = js.undefined
  
  var github: js.UndefOr[String] = js.undefined
  
  var homepage: js.UndefOr[String] = js.undefined
  
  var name: String
  
  /**
    * two-factor authentication status
    */
  var tfa: TFAStatus
  
  var twitter: js.UndefOr[String] = js.undefined
  
  var updated: js.Date | String
}
object ProfileData {
  
  inline def apply(
    created: js.Date | String,
    email: String,
    email_verified: Boolean,
    name: String,
    updated: js.Date | String
  ): ProfileData = {
    val __obj = js.Dynamic.literal(created = created.asInstanceOf[js.Any], email = email.asInstanceOf[js.Any], email_verified = email_verified.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], updated = updated.asInstanceOf[js.Any], cidr_whitelist = null, tfa = null)
    __obj.asInstanceOf[ProfileData]
  }
  
  extension [Self <: ProfileData](x: Self) {
    
    inline def setCidr_whitelist(value: js.Array[String]): Self = StObject.set(x, "cidr_whitelist", value.asInstanceOf[js.Any])
    
    inline def setCidr_whitelistNull: Self = StObject.set(x, "cidr_whitelist", null)
    
    inline def setCidr_whitelistVarargs(value: String*): Self = StObject.set(x, "cidr_whitelist", js.Array(value*))
    
    inline def setCreated(value: js.Date | String): Self = StObject.set(x, "created", value.asInstanceOf[js.Any])
    
    inline def setEmail(value: String): Self = StObject.set(x, "email", value.asInstanceOf[js.Any])
    
    inline def setEmail_verified(value: Boolean): Self = StObject.set(x, "email_verified", value.asInstanceOf[js.Any])
    
    inline def setFreenode(value: String): Self = StObject.set(x, "freenode", value.asInstanceOf[js.Any])
    
    inline def setFreenodeUndefined: Self = StObject.set(x, "freenode", js.undefined)
    
    inline def setFullname(value: String): Self = StObject.set(x, "fullname", value.asInstanceOf[js.Any])
    
    inline def setFullnameUndefined: Self = StObject.set(x, "fullname", js.undefined)
    
    inline def setGithub(value: String): Self = StObject.set(x, "github", value.asInstanceOf[js.Any])
    
    inline def setGithubUndefined: Self = StObject.set(x, "github", js.undefined)
    
    inline def setHomepage(value: String): Self = StObject.set(x, "homepage", value.asInstanceOf[js.Any])
    
    inline def setHomepageUndefined: Self = StObject.set(x, "homepage", js.undefined)
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setTfa(value: TFAStatus): Self = StObject.set(x, "tfa", value.asInstanceOf[js.Any])
    
    inline def setTfaNull: Self = StObject.set(x, "tfa", null)
    
    inline def setTwitter(value: String): Self = StObject.set(x, "twitter", value.asInstanceOf[js.Any])
    
    inline def setTwitterUndefined: Self = StObject.set(x, "twitter", js.undefined)
    
    inline def setUpdated(value: js.Date | String): Self = StObject.set(x, "updated", value.asInstanceOf[js.Any])
  }
}
