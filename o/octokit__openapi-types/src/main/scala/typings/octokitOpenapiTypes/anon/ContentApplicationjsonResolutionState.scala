package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ContentApplicationjsonResolutionState extends StObject {
  
  var content: ApplicationjsonResolutionState
}
object ContentApplicationjsonResolutionState {
  
  inline def apply(content: ApplicationjsonResolutionState): ContentApplicationjsonResolutionState = {
    val __obj = js.Dynamic.literal(content = content.asInstanceOf[js.Any])
    __obj.asInstanceOf[ContentApplicationjsonResolutionState]
  }
  
  extension [Self <: ContentApplicationjsonResolutionState](x: Self) {
    
    inline def setContent(value: ApplicationjsonResolutionState): Self = StObject.set(x, "content", value.asInstanceOf[js.Any])
  }
}
