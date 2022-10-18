package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ContentApplicationjsonRepositoriesArrayRepositoryselection extends StObject {
  
  var content: ApplicationjsonRepositoriesArrayRepositoryselection
}
object ContentApplicationjsonRepositoriesArrayRepositoryselection {
  
  inline def apply(content: ApplicationjsonRepositoriesArrayRepositoryselection): ContentApplicationjsonRepositoriesArrayRepositoryselection = {
    val __obj = js.Dynamic.literal(content = content.asInstanceOf[js.Any])
    __obj.asInstanceOf[ContentApplicationjsonRepositoriesArrayRepositoryselection]
  }
  
  extension [Self <: ContentApplicationjsonRepositoriesArrayRepositoryselection](x: Self) {
    
    inline def setContent(value: ApplicationjsonRepositoriesArrayRepositoryselection): Self = StObject.set(x, "content", value.asInstanceOf[js.Any])
  }
}
