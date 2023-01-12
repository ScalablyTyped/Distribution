package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ContentTexthtmlHeaders extends StObject {
  
  var content: Texthtml
}
object ContentTexthtmlHeaders {
  
  inline def apply(content: Texthtml): ContentTexthtmlHeaders = {
    val __obj = js.Dynamic.literal(content = content.asInstanceOf[js.Any])
    __obj.asInstanceOf[ContentTexthtmlHeaders]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ContentTexthtmlHeaders] (val x: Self) extends AnyVal {
    
    inline def setContent(value: Texthtml): Self = StObject.set(x, "content", value.asInstanceOf[js.Any])
  }
}
