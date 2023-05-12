package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ContentApplicationjsonInvitationteamsurl extends StObject {
  
  var content: ApplicationjsonInvitationteamsurl
}
object ContentApplicationjsonInvitationteamsurl {
  
  inline def apply(content: ApplicationjsonInvitationteamsurl): ContentApplicationjsonInvitationteamsurl = {
    val __obj = js.Dynamic.literal(content = content.asInstanceOf[js.Any])
    __obj.asInstanceOf[ContentApplicationjsonInvitationteamsurl]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ContentApplicationjsonInvitationteamsurl] (val x: Self) extends AnyVal {
    
    inline def setContent(value: ApplicationjsonInvitationteamsurl): Self = StObject.set(x, "content", value.asInstanceOf[js.Any])
  }
}
