package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ContentApplicationjsonTeamsArrayUsersArray extends StObject {
  
  var content: ApplicationjsonTeamsArrayUsersArray
}
object ContentApplicationjsonTeamsArrayUsersArray {
  
  inline def apply(content: ApplicationjsonTeamsArrayUsersArray): ContentApplicationjsonTeamsArrayUsersArray = {
    val __obj = js.Dynamic.literal(content = content.asInstanceOf[js.Any])
    __obj.asInstanceOf[ContentApplicationjsonTeamsArrayUsersArray]
  }
  
  extension [Self <: ContentApplicationjsonTeamsArrayUsersArray](x: Self) {
    
    inline def setContent(value: ApplicationjsonTeamsArrayUsersArray): Self = StObject.set(x, "content", value.asInstanceOf[js.Any])
  }
}
