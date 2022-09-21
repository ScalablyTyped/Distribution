package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ContentApplicationjsonTargetid extends StObject {
  
  var content: ApplicationjsonTargetid
}
object ContentApplicationjsonTargetid {
  
  inline def apply(content: ApplicationjsonTargetid): ContentApplicationjsonTargetid = {
    val __obj = js.Dynamic.literal(content = content.asInstanceOf[js.Any])
    __obj.asInstanceOf[ContentApplicationjsonTargetid]
  }
  
  extension [Self <: ContentApplicationjsonTargetid](x: Self) {
    
    inline def setContent(value: ApplicationjsonTargetid): Self = StObject.set(x, "content", value.asInstanceOf[js.Any])
  }
}
