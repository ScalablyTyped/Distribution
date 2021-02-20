package typings.maximMazurokGapiClientYoutube.gapi.client.youtube

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ActivityContentDetailsSocial extends StObject {
  
  /** The author of the social network post. */
  var author: js.UndefOr[String] = js.native
  
  /** An image of the post's author. */
  var imageUrl: js.UndefOr[String] = js.native
  
  /** The URL of the social network post. */
  var referenceUrl: js.UndefOr[String] = js.native
  
  /** The resourceId object encapsulates information that identifies the resource associated with a social network post. */
  var resourceId: js.UndefOr[ResourceId] = js.native
  
  /** The name of the social network. */
  var `type`: js.UndefOr[String] = js.native
}
object ActivityContentDetailsSocial {
  
  @scala.inline
  def apply(): ActivityContentDetailsSocial = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ActivityContentDetailsSocial]
  }
  
  @scala.inline
  implicit class ActivityContentDetailsSocialMutableBuilder[Self <: ActivityContentDetailsSocial] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAuthor(value: String): Self = StObject.set(x, "author", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAuthorUndefined: Self = StObject.set(x, "author", js.undefined)
    
    @scala.inline
    def setImageUrl(value: String): Self = StObject.set(x, "imageUrl", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setImageUrlUndefined: Self = StObject.set(x, "imageUrl", js.undefined)
    
    @scala.inline
    def setReferenceUrl(value: String): Self = StObject.set(x, "referenceUrl", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setReferenceUrlUndefined: Self = StObject.set(x, "referenceUrl", js.undefined)
    
    @scala.inline
    def setResourceId(value: ResourceId): Self = StObject.set(x, "resourceId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResourceIdUndefined: Self = StObject.set(x, "resourceId", js.undefined)
    
    @scala.inline
    def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
  }
}
