package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ContentApplicationjsonRepositoryselection extends StObject {
  
  var content: ApplicationjsonRepositoryselection
}
object ContentApplicationjsonRepositoryselection {
  
  inline def apply(content: ApplicationjsonRepositoryselection): ContentApplicationjsonRepositoryselection = {
    val __obj = js.Dynamic.literal(content = content.asInstanceOf[js.Any])
    __obj.asInstanceOf[ContentApplicationjsonRepositoryselection]
  }
  
  extension [Self <: ContentApplicationjsonRepositoryselection](x: Self) {
    
    inline def setContent(value: ApplicationjsonRepositoryselection): Self = StObject.set(x, "content", value.asInstanceOf[js.Any])
  }
}
