package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Content465 extends StObject {
  
  var content: `465`
  
  var headers: Link
}
object Content465 {
  
  inline def apply(content: `465`, headers: Link): Content465 = {
    val __obj = js.Dynamic.literal(content = content.asInstanceOf[js.Any], headers = headers.asInstanceOf[js.Any])
    __obj.asInstanceOf[Content465]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Content465] (val x: Self) extends AnyVal {
    
    inline def setContent(value: `465`): Self = StObject.set(x, "content", value.asInstanceOf[js.Any])
    
    inline def setHeaders(value: Link): Self = StObject.set(x, "headers", value.asInstanceOf[js.Any])
  }
}
