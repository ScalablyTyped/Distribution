package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ContentApplicationjsonInstallations extends StObject {
  
  var content: ApplicationjsonInstallations
}
object ContentApplicationjsonInstallations {
  
  inline def apply(content: ApplicationjsonInstallations): ContentApplicationjsonInstallations = {
    val __obj = js.Dynamic.literal(content = content.asInstanceOf[js.Any])
    __obj.asInstanceOf[ContentApplicationjsonInstallations]
  }
  
  extension [Self <: ContentApplicationjsonInstallations](x: Self) {
    
    inline def setContent(value: ApplicationjsonInstallations): Self = StObject.set(x, "content", value.asInstanceOf[js.Any])
  }
}
