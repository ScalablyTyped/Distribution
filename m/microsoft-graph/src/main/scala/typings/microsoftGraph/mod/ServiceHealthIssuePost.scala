package typings.microsoftGraph.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ServiceHealthIssuePost extends StObject {
  
  // The published time of the post.
  var createdDateTime: js.UndefOr[String] = js.undefined
  
  // The content of the service issue post. The supported value for the contentType property is html.
  var description: js.UndefOr[NullableOption[ItemBody]] = js.undefined
  
  // The post type of the service issue historical post. Possible values are: regular, quick, strategic, unknownFutureValue.
  var postType: js.UndefOr[NullableOption[PostType]] = js.undefined
}
object ServiceHealthIssuePost {
  
  inline def apply(): ServiceHealthIssuePost = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ServiceHealthIssuePost]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ServiceHealthIssuePost] (val x: Self) extends AnyVal {
    
    inline def setCreatedDateTime(value: String): Self = StObject.set(x, "createdDateTime", value.asInstanceOf[js.Any])
    
    inline def setCreatedDateTimeUndefined: Self = StObject.set(x, "createdDateTime", js.undefined)
    
    inline def setDescription(value: NullableOption[ItemBody]): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
    
    inline def setDescriptionNull: Self = StObject.set(x, "description", null)
    
    inline def setDescriptionUndefined: Self = StObject.set(x, "description", js.undefined)
    
    inline def setPostType(value: NullableOption[PostType]): Self = StObject.set(x, "postType", value.asInstanceOf[js.Any])
    
    inline def setPostTypeNull: Self = StObject.set(x, "postType", null)
    
    inline def setPostTypeUndefined: Self = StObject.set(x, "postType", js.undefined)
  }
}
