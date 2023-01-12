package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ContentApplicationvndgithubobject extends StObject {
  
  var content: Applicationvndgithubobject
}
object ContentApplicationvndgithubobject {
  
  inline def apply(content: Applicationvndgithubobject): ContentApplicationvndgithubobject = {
    val __obj = js.Dynamic.literal(content = content.asInstanceOf[js.Any])
    __obj.asInstanceOf[ContentApplicationvndgithubobject]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ContentApplicationvndgithubobject] (val x: Self) extends AnyVal {
    
    inline def setContent(value: Applicationvndgithubobject): Self = StObject.set(x, "content", value.asInstanceOf[js.Any])
  }
}
