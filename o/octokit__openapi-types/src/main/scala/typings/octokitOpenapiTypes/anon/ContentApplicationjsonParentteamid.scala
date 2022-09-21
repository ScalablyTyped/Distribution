package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ContentApplicationjsonParentteamid extends StObject {
  
  var content: ApplicationjsonParentteamid
}
object ContentApplicationjsonParentteamid {
  
  inline def apply(content: ApplicationjsonParentteamid): ContentApplicationjsonParentteamid = {
    val __obj = js.Dynamic.literal(content = content.asInstanceOf[js.Any])
    __obj.asInstanceOf[ContentApplicationjsonParentteamid]
  }
  
  extension [Self <: ContentApplicationjsonParentteamid](x: Self) {
    
    inline def setContent(value: ApplicationjsonParentteamid): Self = StObject.set(x, "content", value.asInstanceOf[js.Any])
  }
}
