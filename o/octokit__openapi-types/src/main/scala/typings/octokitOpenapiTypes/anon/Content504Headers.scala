package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Content504Headers extends StObject {
  
  var content: `504`
}
object Content504Headers {
  
  inline def apply(content: `504`): Content504Headers = {
    val __obj = js.Dynamic.literal(content = content.asInstanceOf[js.Any])
    __obj.asInstanceOf[Content504Headers]
  }
  
  extension [Self <: Content504Headers](x: Self) {
    
    inline def setContent(value: `504`): Self = StObject.set(x, "content", value.asInstanceOf[js.Any])
  }
}
