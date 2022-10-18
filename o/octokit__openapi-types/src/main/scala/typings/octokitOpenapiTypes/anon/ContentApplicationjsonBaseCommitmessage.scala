package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ContentApplicationjsonBaseCommitmessage extends StObject {
  
  var content: ApplicationjsonBaseCommitmessage
}
object ContentApplicationjsonBaseCommitmessage {
  
  inline def apply(content: ApplicationjsonBaseCommitmessage): ContentApplicationjsonBaseCommitmessage = {
    val __obj = js.Dynamic.literal(content = content.asInstanceOf[js.Any])
    __obj.asInstanceOf[ContentApplicationjsonBaseCommitmessage]
  }
  
  extension [Self <: ContentApplicationjsonBaseCommitmessage](x: Self) {
    
    inline def setContent(value: ApplicationjsonBaseCommitmessage): Self = StObject.set(x, "content", value.asInstanceOf[js.Any])
  }
}
