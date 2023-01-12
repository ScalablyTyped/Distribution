package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ContentHeaders extends StObject {
  
  var content: `14`
}
object ContentHeaders {
  
  inline def apply(content: `14`): ContentHeaders = {
    val __obj = js.Dynamic.literal(content = content.asInstanceOf[js.Any])
    __obj.asInstanceOf[ContentHeaders]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ContentHeaders] (val x: Self) extends AnyVal {
    
    inline def setContent(value: `14`): Self = StObject.set(x, "content", value.asInstanceOf[js.Any])
  }
}
