package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ContentApplicationjsonInviteeid extends StObject {
  
  var content: ApplicationjsonInviteeid
}
object ContentApplicationjsonInviteeid {
  
  inline def apply(content: ApplicationjsonInviteeid): ContentApplicationjsonInviteeid = {
    val __obj = js.Dynamic.literal(content = content.asInstanceOf[js.Any])
    __obj.asInstanceOf[ContentApplicationjsonInviteeid]
  }
  
  extension [Self <: ContentApplicationjsonInviteeid](x: Self) {
    
    inline def setContent(value: ApplicationjsonInviteeid): Self = StObject.set(x, "content", value.asInstanceOf[js.Any])
  }
}
