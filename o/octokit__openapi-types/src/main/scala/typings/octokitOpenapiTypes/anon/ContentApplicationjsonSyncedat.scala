package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ContentApplicationjsonSyncedat extends StObject {
  
  var content: ApplicationjsonSyncedat
}
object ContentApplicationjsonSyncedat {
  
  inline def apply(content: ApplicationjsonSyncedat): ContentApplicationjsonSyncedat = {
    val __obj = js.Dynamic.literal(content = content.asInstanceOf[js.Any])
    __obj.asInstanceOf[ContentApplicationjsonSyncedat]
  }
  
  extension [Self <: ContentApplicationjsonSyncedat](x: Self) {
    
    inline def setContent(value: ApplicationjsonSyncedat): Self = StObject.set(x, "content", value.asInstanceOf[js.Any])
  }
}
