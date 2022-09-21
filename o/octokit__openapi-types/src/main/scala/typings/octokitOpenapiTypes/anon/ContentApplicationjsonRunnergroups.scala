package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ContentApplicationjsonRunnergroups extends StObject {
  
  var content: ApplicationjsonRunnergroups
}
object ContentApplicationjsonRunnergroups {
  
  inline def apply(content: ApplicationjsonRunnergroups): ContentApplicationjsonRunnergroups = {
    val __obj = js.Dynamic.literal(content = content.asInstanceOf[js.Any])
    __obj.asInstanceOf[ContentApplicationjsonRunnergroups]
  }
  
  extension [Self <: ContentApplicationjsonRunnergroups](x: Self) {
    
    inline def setContent(value: ApplicationjsonRunnergroups): Self = StObject.set(x, "content", value.asInstanceOf[js.Any])
  }
}
