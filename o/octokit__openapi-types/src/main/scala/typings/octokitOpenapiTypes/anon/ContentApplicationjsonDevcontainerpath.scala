package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ContentApplicationjsonDevcontainerpath extends StObject {
  
  var content: ApplicationjsonDevcontainerpath
}
object ContentApplicationjsonDevcontainerpath {
  
  inline def apply(content: ApplicationjsonDevcontainerpath): ContentApplicationjsonDevcontainerpath = {
    val __obj = js.Dynamic.literal(content = content.asInstanceOf[js.Any])
    __obj.asInstanceOf[ContentApplicationjsonDevcontainerpath]
  }
  
  extension [Self <: ContentApplicationjsonDevcontainerpath](x: Self) {
    
    inline def setContent(value: ApplicationjsonDevcontainerpath): Self = StObject.set(x, "content", value.asInstanceOf[js.Any])
  }
}
