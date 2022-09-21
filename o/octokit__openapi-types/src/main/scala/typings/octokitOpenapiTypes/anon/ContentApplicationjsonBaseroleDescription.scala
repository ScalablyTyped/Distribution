package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ContentApplicationjsonBaseroleDescription extends StObject {
  
  var content: ApplicationjsonBaseroleDescription
}
object ContentApplicationjsonBaseroleDescription {
  
  inline def apply(content: ApplicationjsonBaseroleDescription): ContentApplicationjsonBaseroleDescription = {
    val __obj = js.Dynamic.literal(content = content.asInstanceOf[js.Any])
    __obj.asInstanceOf[ContentApplicationjsonBaseroleDescription]
  }
  
  extension [Self <: ContentApplicationjsonBaseroleDescription](x: Self) {
    
    inline def setContent(value: ApplicationjsonBaseroleDescription): Self = StObject.set(x, "content", value.asInstanceOf[js.Any])
  }
}
