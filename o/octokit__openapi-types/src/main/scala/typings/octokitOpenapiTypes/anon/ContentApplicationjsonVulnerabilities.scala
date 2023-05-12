package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ContentApplicationjsonVulnerabilities extends StObject {
  
  var content: ApplicationjsonVulnerabilities
}
object ContentApplicationjsonVulnerabilities {
  
  inline def apply(content: ApplicationjsonVulnerabilities): ContentApplicationjsonVulnerabilities = {
    val __obj = js.Dynamic.literal(content = content.asInstanceOf[js.Any])
    __obj.asInstanceOf[ContentApplicationjsonVulnerabilities]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ContentApplicationjsonVulnerabilities] (val x: Self) extends AnyVal {
    
    inline def setContent(value: ApplicationjsonVulnerabilities): Self = StObject.set(x, "content", value.asInstanceOf[js.Any])
  }
}
