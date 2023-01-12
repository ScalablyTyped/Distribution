package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ContentApplicationjsonConfigurationfilepath extends StObject {
  
  var content: ApplicationjsonConfigurationfilepath
}
object ContentApplicationjsonConfigurationfilepath {
  
  inline def apply(content: ApplicationjsonConfigurationfilepath): ContentApplicationjsonConfigurationfilepath = {
    val __obj = js.Dynamic.literal(content = content.asInstanceOf[js.Any])
    __obj.asInstanceOf[ContentApplicationjsonConfigurationfilepath]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ContentApplicationjsonConfigurationfilepath] (val x: Self) extends AnyVal {
    
    inline def setContent(value: ApplicationjsonConfigurationfilepath): Self = StObject.set(x, "content", value.asInstanceOf[js.Any])
  }
}
