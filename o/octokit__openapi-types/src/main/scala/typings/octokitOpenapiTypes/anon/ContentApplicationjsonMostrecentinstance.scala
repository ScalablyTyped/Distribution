package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ContentApplicationjsonMostrecentinstance extends StObject {
  
  var content: ApplicationjsonMostrecentinstance
}
object ContentApplicationjsonMostrecentinstance {
  
  inline def apply(content: ApplicationjsonMostrecentinstance): ContentApplicationjsonMostrecentinstance = {
    val __obj = js.Dynamic.literal(content = content.asInstanceOf[js.Any])
    __obj.asInstanceOf[ContentApplicationjsonMostrecentinstance]
  }
  
  extension [Self <: ContentApplicationjsonMostrecentinstance](x: Self) {
    
    inline def setContent(value: ApplicationjsonMostrecentinstance): Self = StObject.set(x, "content", value.asInstanceOf[js.Any])
  }
}
