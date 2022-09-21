package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ContentApplicationjsonBranchString extends StObject {
  
  var content: ApplicationjsonBranchString
}
object ContentApplicationjsonBranchString {
  
  inline def apply(content: ApplicationjsonBranchString): ContentApplicationjsonBranchString = {
    val __obj = js.Dynamic.literal(content = content.asInstanceOf[js.Any])
    __obj.asInstanceOf[ContentApplicationjsonBranchString]
  }
  
  extension [Self <: ContentApplicationjsonBranchString](x: Self) {
    
    inline def setContent(value: ApplicationjsonBranchString): Self = StObject.set(x, "content", value.asInstanceOf[js.Any])
  }
}
