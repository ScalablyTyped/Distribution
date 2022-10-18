package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Hireable extends StObject {
  
  /** @description The new short biography of the user. */
  var bio: js.UndefOr[String] = js.undefined
  
  /**
    * @description The new blog URL of the user.
    * @example blog.example.com
    */
  var blog: js.UndefOr[String] = js.undefined
  
  /**
    * @description The new company of the user.
    * @example Acme corporation
    */
  var company: js.UndefOr[String] = js.undefined
  
  /**
    * @description The publicly visible email address of the user.
    * @example omar@example.com
    */
  var email: js.UndefOr[String] = js.undefined
  
  /** @description The new hiring availability of the user. */
  var hireable: js.UndefOr[Boolean] = js.undefined
  
  /**
    * @description The new location of the user.
    * @example Berlin, Germany
    */
  var location: js.UndefOr[String] = js.undefined
  
  /**
    * @description The new name of the user.
    * @example Omar Jahandar
    */
  var name: js.UndefOr[String] = js.undefined
  
  /**
    * @description The new Twitter username of the user.
    * @example therealomarj
    */
  var twitter_username: js.UndefOr[String | Null] = js.undefined
}
object Hireable {
  
  inline def apply(): Hireable = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Hireable]
  }
  
  extension [Self <: Hireable](x: Self) {
    
    inline def setBio(value: String): Self = StObject.set(x, "bio", value.asInstanceOf[js.Any])
    
    inline def setBioUndefined: Self = StObject.set(x, "bio", js.undefined)
    
    inline def setBlog(value: String): Self = StObject.set(x, "blog", value.asInstanceOf[js.Any])
    
    inline def setBlogUndefined: Self = StObject.set(x, "blog", js.undefined)
    
    inline def setCompany(value: String): Self = StObject.set(x, "company", value.asInstanceOf[js.Any])
    
    inline def setCompanyUndefined: Self = StObject.set(x, "company", js.undefined)
    
    inline def setEmail(value: String): Self = StObject.set(x, "email", value.asInstanceOf[js.Any])
    
    inline def setEmailUndefined: Self = StObject.set(x, "email", js.undefined)
    
    inline def setHireable(value: Boolean): Self = StObject.set(x, "hireable", value.asInstanceOf[js.Any])
    
    inline def setHireableUndefined: Self = StObject.set(x, "hireable", js.undefined)
    
    inline def setLocation(value: String): Self = StObject.set(x, "location", value.asInstanceOf[js.Any])
    
    inline def setLocationUndefined: Self = StObject.set(x, "location", js.undefined)
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    inline def setTwitter_username(value: String): Self = StObject.set(x, "twitter_username", value.asInstanceOf[js.Any])
    
    inline def setTwitter_usernameNull: Self = StObject.set(x, "twitter_username", null)
    
    inline def setTwitter_usernameUndefined: Self = StObject.set(x, "twitter_username", js.undefined)
  }
}
