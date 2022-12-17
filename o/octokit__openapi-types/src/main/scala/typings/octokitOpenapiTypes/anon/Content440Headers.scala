package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Content440Headers extends StObject {
  
  var content: `440`
}
object Content440Headers {
  
  inline def apply(content: `440`): Content440Headers = {
    val __obj = js.Dynamic.literal(content = content.asInstanceOf[js.Any])
    __obj.asInstanceOf[Content440Headers]
  }
  
  extension [Self <: Content440Headers](x: Self) {
    
    inline def setContent(value: `440`): Self = StObject.set(x, "content", value.asInstanceOf[js.Any])
  }
}
