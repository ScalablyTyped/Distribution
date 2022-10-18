package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ContentApplicationjsonCname extends StObject {
  
  var content: ApplicationjsonCname
}
object ContentApplicationjsonCname {
  
  inline def apply(content: ApplicationjsonCname): ContentApplicationjsonCname = {
    val __obj = js.Dynamic.literal(content = content.asInstanceOf[js.Any])
    __obj.asInstanceOf[ContentApplicationjsonCname]
  }
  
  extension [Self <: ContentApplicationjsonCname](x: Self) {
    
    inline def setContent(value: ApplicationjsonCname): Self = StObject.set(x, "content", value.asInstanceOf[js.Any])
  }
}
