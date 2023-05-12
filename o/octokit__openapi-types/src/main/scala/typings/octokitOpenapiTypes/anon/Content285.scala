package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Content285 extends StObject {
  
  var content: `285`
  
  var headers: Link
}
object Content285 {
  
  inline def apply(content: `285`, headers: Link): Content285 = {
    val __obj = js.Dynamic.literal(content = content.asInstanceOf[js.Any], headers = headers.asInstanceOf[js.Any])
    __obj.asInstanceOf[Content285]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Content285] (val x: Self) extends AnyVal {
    
    inline def setContent(value: `285`): Self = StObject.set(x, "content", value.asInstanceOf[js.Any])
    
    inline def setHeaders(value: Link): Self = StObject.set(x, "headers", value.asInstanceOf[js.Any])
  }
}
