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
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ContentApplicationjsonParentteamid] (val x: Self) extends AnyVal {
    
    inline def setContent(value: ApplicationjsonParentteamid): Self = StObject.set(x, "content", value.asInstanceOf[js.Any])
  }
}
