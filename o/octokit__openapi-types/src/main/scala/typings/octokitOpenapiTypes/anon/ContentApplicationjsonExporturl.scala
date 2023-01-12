package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ContentApplicationjsonExporturl extends StObject {
  
  var content: ApplicationjsonExporturl
}
object ContentApplicationjsonExporturl {
  
  inline def apply(content: ApplicationjsonExporturl): ContentApplicationjsonExporturl = {
    val __obj = js.Dynamic.literal(content = content.asInstanceOf[js.Any])
    __obj.asInstanceOf[ContentApplicationjsonExporturl]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ContentApplicationjsonExporturl] (val x: Self) extends AnyVal {
    
    inline def setContent(value: ApplicationjsonExporturl): Self = StObject.set(x, "content", value.asInstanceOf[js.Any])
  }
}
