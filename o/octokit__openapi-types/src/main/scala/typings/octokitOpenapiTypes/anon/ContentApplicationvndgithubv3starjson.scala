package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ContentApplicationvndgithubv3starjson extends StObject {
  
  var content: Applicationvndgithubv3starjson
}
object ContentApplicationvndgithubv3starjson {
  
  inline def apply(content: Applicationvndgithubv3starjson): ContentApplicationvndgithubv3starjson = {
    val __obj = js.Dynamic.literal(content = content.asInstanceOf[js.Any])
    __obj.asInstanceOf[ContentApplicationvndgithubv3starjson]
  }
  
  extension [Self <: ContentApplicationvndgithubv3starjson](x: Self) {
    
    inline def setContent(value: Applicationvndgithubv3starjson): Self = StObject.set(x, "content", value.asInstanceOf[js.Any])
  }
}
