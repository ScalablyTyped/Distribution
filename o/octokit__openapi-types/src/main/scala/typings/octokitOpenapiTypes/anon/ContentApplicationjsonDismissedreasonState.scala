package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ContentApplicationjsonDismissedreasonState extends StObject {
  
  var content: ApplicationjsonDismissedreasonState
}
object ContentApplicationjsonDismissedreasonState {
  
  inline def apply(content: ApplicationjsonDismissedreasonState): ContentApplicationjsonDismissedreasonState = {
    val __obj = js.Dynamic.literal(content = content.asInstanceOf[js.Any])
    __obj.asInstanceOf[ContentApplicationjsonDismissedreasonState]
  }
  
  extension [Self <: ContentApplicationjsonDismissedreasonState](x: Self) {
    
    inline def setContent(value: ApplicationjsonDismissedreasonState): Self = StObject.set(x, "content", value.asInstanceOf[js.Any])
  }
}
