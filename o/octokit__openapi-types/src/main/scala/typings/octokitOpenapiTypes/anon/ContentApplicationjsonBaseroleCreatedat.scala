package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ContentApplicationjsonBaseroleCreatedat extends StObject {
  
  var content: ApplicationjsonBaseroleCreatedat
}
object ContentApplicationjsonBaseroleCreatedat {
  
  inline def apply(content: ApplicationjsonBaseroleCreatedat): ContentApplicationjsonBaseroleCreatedat = {
    val __obj = js.Dynamic.literal(content = content.asInstanceOf[js.Any])
    __obj.asInstanceOf[ContentApplicationjsonBaseroleCreatedat]
  }
  
  extension [Self <: ContentApplicationjsonBaseroleCreatedat](x: Self) {
    
    inline def setContent(value: ApplicationjsonBaseroleCreatedat): Self = StObject.set(x, "content", value.asInstanceOf[js.Any])
  }
}
