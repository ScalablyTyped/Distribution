package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ContentApplicationjsonApplicationvndgithubv3starjson extends StObject {
  
  var content: ApplicationjsonApplicationvndgithubv3starjson
  
  var headers: LinkString
}
object ContentApplicationjsonApplicationvndgithubv3starjson {
  
  inline def apply(content: ApplicationjsonApplicationvndgithubv3starjson, headers: LinkString): ContentApplicationjsonApplicationvndgithubv3starjson = {
    val __obj = js.Dynamic.literal(content = content.asInstanceOf[js.Any], headers = headers.asInstanceOf[js.Any])
    __obj.asInstanceOf[ContentApplicationjsonApplicationvndgithubv3starjson]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ContentApplicationjsonApplicationvndgithubv3starjson] (val x: Self) extends AnyVal {
    
    inline def setContent(value: ApplicationjsonApplicationvndgithubv3starjson): Self = StObject.set(x, "content", value.asInstanceOf[js.Any])
    
    inline def setHeaders(value: LinkString): Self = StObject.set(x, "headers", value.asInstanceOf[js.Any])
  }
}
