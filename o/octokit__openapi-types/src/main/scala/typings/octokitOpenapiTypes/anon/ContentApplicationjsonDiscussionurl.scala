package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ContentApplicationjsonDiscussionurl extends StObject {
  
  var content: ApplicationjsonDiscussionurl
}
object ContentApplicationjsonDiscussionurl {
  
  inline def apply(content: ApplicationjsonDiscussionurl): ContentApplicationjsonDiscussionurl = {
    val __obj = js.Dynamic.literal(content = content.asInstanceOf[js.Any])
    __obj.asInstanceOf[ContentApplicationjsonDiscussionurl]
  }
  
  extension [Self <: ContentApplicationjsonDiscussionurl](x: Self) {
    
    inline def setContent(value: ApplicationjsonDiscussionurl): Self = StObject.set(x, "content", value.asInstanceOf[js.Any])
  }
}
