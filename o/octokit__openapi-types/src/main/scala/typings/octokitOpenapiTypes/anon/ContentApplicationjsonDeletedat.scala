package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ContentApplicationjsonDeletedat extends StObject {
  
  var content: ApplicationjsonDeletedat
}
object ContentApplicationjsonDeletedat {
  
  inline def apply(content: ApplicationjsonDeletedat): ContentApplicationjsonDeletedat = {
    val __obj = js.Dynamic.literal(content = content.asInstanceOf[js.Any])
    __obj.asInstanceOf[ContentApplicationjsonDeletedat]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ContentApplicationjsonDeletedat] (val x: Self) extends AnyVal {
    
    inline def setContent(value: ApplicationjsonDeletedat): Self = StObject.set(x, "content", value.asInstanceOf[js.Any])
  }
}
