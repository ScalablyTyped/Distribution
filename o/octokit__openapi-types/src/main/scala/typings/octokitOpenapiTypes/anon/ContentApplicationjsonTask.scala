package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ContentApplicationjsonTask extends StObject {
  
  var content: ApplicationjsonTask
}
object ContentApplicationjsonTask {
  
  inline def apply(content: ApplicationjsonTask): ContentApplicationjsonTask = {
    val __obj = js.Dynamic.literal(content = content.asInstanceOf[js.Any])
    __obj.asInstanceOf[ContentApplicationjsonTask]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ContentApplicationjsonTask] (val x: Self) extends AnyVal {
    
    inline def setContent(value: ApplicationjsonTask): Self = StObject.set(x, "content", value.asInstanceOf[js.Any])
  }
}
