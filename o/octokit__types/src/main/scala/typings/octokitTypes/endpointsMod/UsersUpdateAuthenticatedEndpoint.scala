package typings.octokitTypes.endpointsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait UsersUpdateAuthenticatedEndpoint extends StObject {
  
  /**
    * The new short biography of the user.
    */
  var bio: js.UndefOr[String] = js.undefined
  
  /**
    * The new blog URL of the user.
    */
  var blog: js.UndefOr[String] = js.undefined
  
  /**
    * The new company of the user.
    */
  var company: js.UndefOr[String] = js.undefined
  
  /**
    * The publicly visible email address of the user.
    */
  var email: js.UndefOr[String] = js.undefined
  
  /**
    * The new hiring availability of the user.
    */
  var hireable: js.UndefOr[Boolean] = js.undefined
  
  /**
    * The new location of the user.
    */
  var location: js.UndefOr[String] = js.undefined
  
  /**
    * The new name of the user.
    */
  var name: js.UndefOr[String] = js.undefined
  
  /**
    * The new Twitter username of the user.
    */
  var twitter_username: js.UndefOr[String] = js.undefined
}
object UsersUpdateAuthenticatedEndpoint {
  
  inline def apply(): UsersUpdateAuthenticatedEndpoint = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[UsersUpdateAuthenticatedEndpoint]
  }
  
  extension [Self <: UsersUpdateAuthenticatedEndpoint](x: Self) {
    
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
    
    inline def setTwitter_usernameUndefined: Self = StObject.set(x, "twitter_username", js.undefined)
  }
}
