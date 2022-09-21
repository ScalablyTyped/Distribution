package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ContentApplicationjsonServerinstances extends StObject {
  
  var content: ApplicationjsonServerinstances
}
object ContentApplicationjsonServerinstances {
  
  inline def apply(content: ApplicationjsonServerinstances): ContentApplicationjsonServerinstances = {
    val __obj = js.Dynamic.literal(content = content.asInstanceOf[js.Any])
    __obj.asInstanceOf[ContentApplicationjsonServerinstances]
  }
  
  extension [Self <: ContentApplicationjsonServerinstances](x: Self) {
    
    inline def setContent(value: ApplicationjsonServerinstances): Self = StObject.set(x, "content", value.asInstanceOf[js.Any])
  }
}
