package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `201ContentApplicationjsonMentionscount` extends StObject {
  
  /** @description Response */
  var `201`: ContentApplicationjsonMentionscount
  
  /** @description Not Found if the discussion category name is invalid */
  var `404`: ContentApplicationjsonDocumentationurlMessage
  
  var `422`: Content414
}
object `201ContentApplicationjsonMentionscount` {
  
  inline def apply(
    `201`: ContentApplicationjsonMentionscount,
    `404`: ContentApplicationjsonDocumentationurlMessage,
    `422`: Content414
  ): `201ContentApplicationjsonMentionscount` = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("201")(`201`.asInstanceOf[js.Any])
    __obj.updateDynamic("404")(`404`.asInstanceOf[js.Any])
    __obj.updateDynamic("422")(`422`.asInstanceOf[js.Any])
    __obj.asInstanceOf[`201ContentApplicationjsonMentionscount`]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: `201ContentApplicationjsonMentionscount`] (val x: Self) extends AnyVal {
    
    inline def set201(value: ContentApplicationjsonMentionscount): Self = StObject.set(x, "201", value.asInstanceOf[js.Any])
    
    inline def set404(value: ContentApplicationjsonDocumentationurlMessage): Self = StObject.set(x, "404", value.asInstanceOf[js.Any])
    
    inline def set422(value: Content414): Self = StObject.set(x, "422", value.asInstanceOf[js.Any])
  }
}
