package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ContentApplicationjsonSarif_ extends StObject {
  
  var content: ApplicationjsonSarif_
}
object ContentApplicationjsonSarif_ {
  
  inline def apply(content: ApplicationjsonSarif_): ContentApplicationjsonSarif_ = {
    val __obj = js.Dynamic.literal(content = content.asInstanceOf[js.Any])
    __obj.asInstanceOf[ContentApplicationjsonSarif_]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ContentApplicationjsonSarif_] (val x: Self) extends AnyVal {
    
    inline def setContent(value: ApplicationjsonSarif_): Self = StObject.set(x, "content", value.asInstanceOf[js.Any])
  }
}
