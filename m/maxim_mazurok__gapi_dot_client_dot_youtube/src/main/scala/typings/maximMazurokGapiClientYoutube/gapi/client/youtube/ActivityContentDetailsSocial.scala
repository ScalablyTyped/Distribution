package typings.maximMazurokGapiClientYoutube.gapi.client.youtube

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ActivityContentDetailsSocial extends StObject {
  
  /** The author of the social network post. */
  var author: js.UndefOr[String] = js.undefined
  
  /** An image of the post's author. */
  var imageUrl: js.UndefOr[String] = js.undefined
  
  /** The URL of the social network post. */
  var referenceUrl: js.UndefOr[String] = js.undefined
  
  /** The resourceId object encapsulates information that identifies the resource associated with a social network post. */
  var resourceId: js.UndefOr[ResourceId] = js.undefined
  
  /** The name of the social network. */
  var `type`: js.UndefOr[String] = js.undefined
}
object ActivityContentDetailsSocial {
  
  inline def apply(): ActivityContentDetailsSocial = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ActivityContentDetailsSocial]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ActivityContentDetailsSocial] (val x: Self) extends AnyVal {
    
    inline def setAuthor(value: String): Self = StObject.set(x, "author", value.asInstanceOf[js.Any])
    
    inline def setAuthorUndefined: Self = StObject.set(x, "author", js.undefined)
    
    inline def setImageUrl(value: String): Self = StObject.set(x, "imageUrl", value.asInstanceOf[js.Any])
    
    inline def setImageUrlUndefined: Self = StObject.set(x, "imageUrl", js.undefined)
    
    inline def setReferenceUrl(value: String): Self = StObject.set(x, "referenceUrl", value.asInstanceOf[js.Any])
    
    inline def setReferenceUrlUndefined: Self = StObject.set(x, "referenceUrl", js.undefined)
    
    inline def setResourceId(value: ResourceId): Self = StObject.set(x, "resourceId", value.asInstanceOf[js.Any])
    
    inline def setResourceIdUndefined: Self = StObject.set(x, "resourceId", js.undefined)
    
    inline def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    inline def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
  }
}
