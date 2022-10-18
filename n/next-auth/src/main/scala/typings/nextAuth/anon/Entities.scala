package typings.nextAuth.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Entities extends StObject {
  
  var created_at: js.UndefOr[String] = js.undefined
  
  var description: js.UndefOr[String] = js.undefined
  
  var entities: js.UndefOr[DescriptionUrl] = js.undefined
  
  var id: String
  
  var location: js.UndefOr[String] = js.undefined
  
  var name: String
  
  var pinned_tweet_id: js.UndefOr[String] = js.undefined
  
  var profile_image_url: js.UndefOr[String] = js.undefined
  
  var `protected`: js.UndefOr[Boolean] = js.undefined
  
  var url: js.UndefOr[String] = js.undefined
  
  var username: String
  
  var verified: js.UndefOr[Boolean] = js.undefined
}
object Entities {
  
  inline def apply(id: String, name: String, username: String): Entities = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], username = username.asInstanceOf[js.Any])
    __obj.asInstanceOf[Entities]
  }
  
  extension [Self <: Entities](x: Self) {
    
    inline def setCreated_at(value: String): Self = StObject.set(x, "created_at", value.asInstanceOf[js.Any])
    
    inline def setCreated_atUndefined: Self = StObject.set(x, "created_at", js.undefined)
    
    inline def setDescription(value: String): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
    
    inline def setDescriptionUndefined: Self = StObject.set(x, "description", js.undefined)
    
    inline def setEntities(value: DescriptionUrl): Self = StObject.set(x, "entities", value.asInstanceOf[js.Any])
    
    inline def setEntitiesUndefined: Self = StObject.set(x, "entities", js.undefined)
    
    inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setLocation(value: String): Self = StObject.set(x, "location", value.asInstanceOf[js.Any])
    
    inline def setLocationUndefined: Self = StObject.set(x, "location", js.undefined)
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setPinned_tweet_id(value: String): Self = StObject.set(x, "pinned_tweet_id", value.asInstanceOf[js.Any])
    
    inline def setPinned_tweet_idUndefined: Self = StObject.set(x, "pinned_tweet_id", js.undefined)
    
    inline def setProfile_image_url(value: String): Self = StObject.set(x, "profile_image_url", value.asInstanceOf[js.Any])
    
    inline def setProfile_image_urlUndefined: Self = StObject.set(x, "profile_image_url", js.undefined)
    
    inline def setProtected(value: Boolean): Self = StObject.set(x, "protected", value.asInstanceOf[js.Any])
    
    inline def setProtectedUndefined: Self = StObject.set(x, "protected", js.undefined)
    
    inline def setUrl(value: String): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
    
    inline def setUrlUndefined: Self = StObject.set(x, "url", js.undefined)
    
    inline def setUsername(value: String): Self = StObject.set(x, "username", value.asInstanceOf[js.Any])
    
    inline def setVerified(value: Boolean): Self = StObject.set(x, "verified", value.asInstanceOf[js.Any])
    
    inline def setVerifiedUndefined: Self = StObject.set(x, "verified", js.undefined)
  }
}
