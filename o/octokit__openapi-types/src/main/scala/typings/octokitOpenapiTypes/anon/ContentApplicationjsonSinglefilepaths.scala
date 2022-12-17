package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ContentApplicationjsonSinglefilepaths extends StObject {
  
  var content: ApplicationjsonSinglefilepaths
}
object ContentApplicationjsonSinglefilepaths {
  
  inline def apply(content: ApplicationjsonSinglefilepaths): ContentApplicationjsonSinglefilepaths = {
    val __obj = js.Dynamic.literal(content = content.asInstanceOf[js.Any])
    __obj.asInstanceOf[ContentApplicationjsonSinglefilepaths]
  }
  
  extension [Self <: ContentApplicationjsonSinglefilepaths](x: Self) {
    
    inline def setContent(value: ApplicationjsonSinglefilepaths): Self = StObject.set(x, "content", value.asInstanceOf[js.Any])
  }
}
