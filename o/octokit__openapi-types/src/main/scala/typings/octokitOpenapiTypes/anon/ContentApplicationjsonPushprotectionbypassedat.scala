package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ContentApplicationjsonPushprotectionbypassedat extends StObject {
  
  var content: ApplicationjsonPushprotectionbypassedat
}
object ContentApplicationjsonPushprotectionbypassedat {
  
  inline def apply(content: ApplicationjsonPushprotectionbypassedat): ContentApplicationjsonPushprotectionbypassedat = {
    val __obj = js.Dynamic.literal(content = content.asInstanceOf[js.Any])
    __obj.asInstanceOf[ContentApplicationjsonPushprotectionbypassedat]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ContentApplicationjsonPushprotectionbypassedat] (val x: Self) extends AnyVal {
    
    inline def setContent(value: ApplicationjsonPushprotectionbypassedat): Self = StObject.set(x, "content", value.asInstanceOf[js.Any])
  }
}
