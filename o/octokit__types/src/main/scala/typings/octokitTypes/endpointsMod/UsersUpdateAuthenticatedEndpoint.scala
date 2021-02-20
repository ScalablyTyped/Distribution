package typings.octokitTypes.endpointsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait UsersUpdateAuthenticatedEndpoint extends StObject {
  
  /**
    * The new short biography of the user.
    */
  var bio: js.UndefOr[String] = js.native
  
  /**
    * The new blog URL of the user.
    */
  var blog: js.UndefOr[String] = js.native
  
  /**
    * The new company of the user.
    */
  var company: js.UndefOr[String] = js.native
  
  /**
    * The publicly visible email address of the user.
    */
  var email: js.UndefOr[String] = js.native
  
  /**
    * The new hiring availability of the user.
    */
  var hireable: js.UndefOr[Boolean] = js.native
  
  /**
    * The new location of the user.
    */
  var location: js.UndefOr[String] = js.native
  
  /**
    * The new name of the user.
    */
  var name: js.UndefOr[String] = js.native
  
  /**
    * The new Twitter username of the user.
    */
  var twitter_username: js.UndefOr[String] = js.native
}
object UsersUpdateAuthenticatedEndpoint {
  
  @scala.inline
  def apply(): UsersUpdateAuthenticatedEndpoint = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[UsersUpdateAuthenticatedEndpoint]
  }
  
  @scala.inline
  implicit class UsersUpdateAuthenticatedEndpointMutableBuilder[Self <: UsersUpdateAuthenticatedEndpoint] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setBio(value: String): Self = StObject.set(x, "bio", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBioUndefined: Self = StObject.set(x, "bio", js.undefined)
    
    @scala.inline
    def setBlog(value: String): Self = StObject.set(x, "blog", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBlogUndefined: Self = StObject.set(x, "blog", js.undefined)
    
    @scala.inline
    def setCompany(value: String): Self = StObject.set(x, "company", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCompanyUndefined: Self = StObject.set(x, "company", js.undefined)
    
    @scala.inline
    def setEmail(value: String): Self = StObject.set(x, "email", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEmailUndefined: Self = StObject.set(x, "email", js.undefined)
    
    @scala.inline
    def setHireable(value: Boolean): Self = StObject.set(x, "hireable", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHireableUndefined: Self = StObject.set(x, "hireable", js.undefined)
    
    @scala.inline
    def setLocation(value: String): Self = StObject.set(x, "location", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLocationUndefined: Self = StObject.set(x, "location", js.undefined)
    
    @scala.inline
    def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    @scala.inline
    def setTwitter_username(value: String): Self = StObject.set(x, "twitter_username", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTwitter_usernameUndefined: Self = StObject.set(x, "twitter_username", js.undefined)
  }
}
