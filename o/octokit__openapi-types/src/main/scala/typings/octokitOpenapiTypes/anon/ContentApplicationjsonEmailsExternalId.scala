package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ContentApplicationjsonEmailsExternalId extends StObject {
  
  var content: ApplicationjsonEmailsExternalId
}
object ContentApplicationjsonEmailsExternalId {
  
  inline def apply(content: ApplicationjsonEmailsExternalId): ContentApplicationjsonEmailsExternalId = {
    val __obj = js.Dynamic.literal(content = content.asInstanceOf[js.Any])
    __obj.asInstanceOf[ContentApplicationjsonEmailsExternalId]
  }
  
  extension [Self <: ContentApplicationjsonEmailsExternalId](x: Self) {
    
    inline def setContent(value: ApplicationjsonEmailsExternalId): Self = StObject.set(x, "content", value.asInstanceOf[js.Any])
  }
}
