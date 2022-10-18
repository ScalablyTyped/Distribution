package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ContentApplicationjsonUsersArray extends StObject {
  
  var content: ApplicationjsonUsersArray
}
object ContentApplicationjsonUsersArray {
  
  inline def apply(content: ApplicationjsonUsersArray): ContentApplicationjsonUsersArray = {
    val __obj = js.Dynamic.literal(content = content.asInstanceOf[js.Any])
    __obj.asInstanceOf[ContentApplicationjsonUsersArray]
  }
  
  extension [Self <: ContentApplicationjsonUsersArray](x: Self) {
    
    inline def setContent(value: ApplicationjsonUsersArray): Self = StObject.set(x, "content", value.asInstanceOf[js.Any])
  }
}
