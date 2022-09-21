package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ContentApplicationjsonInvitee extends StObject {
  
  var content: ApplicationjsonInvitee
}
object ContentApplicationjsonInvitee {
  
  inline def apply(content: ApplicationjsonInvitee): ContentApplicationjsonInvitee = {
    val __obj = js.Dynamic.literal(content = content.asInstanceOf[js.Any])
    __obj.asInstanceOf[ContentApplicationjsonInvitee]
  }
  
  extension [Self <: ContentApplicationjsonInvitee](x: Self) {
    
    inline def setContent(value: ApplicationjsonInvitee): Self = StObject.set(x, "content", value.asInstanceOf[js.Any])
  }
}
