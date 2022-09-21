package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ContentApplicationjsonMerged extends StObject {
  
  var content: ApplicationjsonMerged
}
object ContentApplicationjsonMerged {
  
  inline def apply(content: ApplicationjsonMerged): ContentApplicationjsonMerged = {
    val __obj = js.Dynamic.literal(content = content.asInstanceOf[js.Any])
    __obj.asInstanceOf[ContentApplicationjsonMerged]
  }
  
  extension [Self <: ContentApplicationjsonMerged](x: Self) {
    
    inline def setContent(value: ApplicationjsonMerged): Self = StObject.set(x, "content", value.asInstanceOf[js.Any])
  }
}
