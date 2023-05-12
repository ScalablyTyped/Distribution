package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ContentApplicationvndgithubv3starjson extends StObject {
  
  var content: Applicationvndgithubv3starjson
  
  var headers: Link
}
object ContentApplicationvndgithubv3starjson {
  
  inline def apply(content: Applicationvndgithubv3starjson, headers: Link): ContentApplicationvndgithubv3starjson = {
    val __obj = js.Dynamic.literal(content = content.asInstanceOf[js.Any], headers = headers.asInstanceOf[js.Any])
    __obj.asInstanceOf[ContentApplicationvndgithubv3starjson]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ContentApplicationvndgithubv3starjson] (val x: Self) extends AnyVal {
    
    inline def setContent(value: Applicationvndgithubv3starjson): Self = StObject.set(x, "content", value.asInstanceOf[js.Any])
    
    inline def setHeaders(value: Link): Self = StObject.set(x, "headers", value.asInstanceOf[js.Any])
  }
}
