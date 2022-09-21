package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ContentApplicationjsonRoleState extends StObject {
  
  var content: ApplicationjsonRoleState
}
object ContentApplicationjsonRoleState {
  
  inline def apply(content: ApplicationjsonRoleState): ContentApplicationjsonRoleState = {
    val __obj = js.Dynamic.literal(content = content.asInstanceOf[js.Any])
    __obj.asInstanceOf[ContentApplicationjsonRoleState]
  }
  
  extension [Self <: ContentApplicationjsonRoleState](x: Self) {
    
    inline def setContent(value: ApplicationjsonRoleState): Self = StObject.set(x, "content", value.asInstanceOf[js.Any])
  }
}
