package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ContentTextplainString extends StObject {
  
  var content: TextplainString
}
object ContentTextplainString {
  
  inline def apply(content: TextplainString): ContentTextplainString = {
    val __obj = js.Dynamic.literal(content = content.asInstanceOf[js.Any])
    __obj.asInstanceOf[ContentTextplainString]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ContentTextplainString] (val x: Self) extends AnyVal {
    
    inline def setContent(value: TextplainString): Self = StObject.set(x, "content", value.asInstanceOf[js.Any])
  }
}
