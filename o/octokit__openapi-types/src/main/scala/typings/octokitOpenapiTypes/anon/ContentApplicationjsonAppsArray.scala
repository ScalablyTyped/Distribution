package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ContentApplicationjsonAppsArray extends StObject {
  
  var content: ApplicationjsonAppsArray
}
object ContentApplicationjsonAppsArray {
  
  inline def apply(content: ApplicationjsonAppsArray): ContentApplicationjsonAppsArray = {
    val __obj = js.Dynamic.literal(content = content.asInstanceOf[js.Any])
    __obj.asInstanceOf[ContentApplicationjsonAppsArray]
  }
  
  extension [Self <: ContentApplicationjsonAppsArray](x: Self) {
    
    inline def setContent(value: ApplicationjsonAppsArray): Self = StObject.set(x, "content", value.asInstanceOf[js.Any])
  }
}
