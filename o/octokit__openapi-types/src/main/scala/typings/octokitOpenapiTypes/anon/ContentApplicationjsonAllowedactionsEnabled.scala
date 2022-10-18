package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ContentApplicationjsonAllowedactionsEnabled extends StObject {
  
  var content: ApplicationjsonAllowedactionsEnabled
}
object ContentApplicationjsonAllowedactionsEnabled {
  
  inline def apply(content: ApplicationjsonAllowedactionsEnabled): ContentApplicationjsonAllowedactionsEnabled = {
    val __obj = js.Dynamic.literal(content = content.asInstanceOf[js.Any])
    __obj.asInstanceOf[ContentApplicationjsonAllowedactionsEnabled]
  }
  
  extension [Self <: ContentApplicationjsonAllowedactionsEnabled](x: Self) {
    
    inline def setContent(value: ApplicationjsonAllowedactionsEnabled): Self = StObject.set(x, "content", value.asInstanceOf[js.Any])
  }
}
