package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ContentApplicationjsonPermissionsRepositories extends StObject {
  
  var content: ApplicationjsonPermissionsRepositories
}
object ContentApplicationjsonPermissionsRepositories {
  
  inline def apply(content: ApplicationjsonPermissionsRepositories): ContentApplicationjsonPermissionsRepositories = {
    val __obj = js.Dynamic.literal(content = content.asInstanceOf[js.Any])
    __obj.asInstanceOf[ContentApplicationjsonPermissionsRepositories]
  }
  
  extension [Self <: ContentApplicationjsonPermissionsRepositories](x: Self) {
    
    inline def setContent(value: ApplicationjsonPermissionsRepositories): Self = StObject.set(x, "content", value.asInstanceOf[js.Any])
  }
}
