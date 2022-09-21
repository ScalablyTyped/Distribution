package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ContentApplicationjsonCanencryptcomms extends StObject {
  
  var content: ApplicationjsonCanencryptcomms
}
object ContentApplicationjsonCanencryptcomms {
  
  inline def apply(content: ApplicationjsonCanencryptcomms): ContentApplicationjsonCanencryptcomms = {
    val __obj = js.Dynamic.literal(content = content.asInstanceOf[js.Any])
    __obj.asInstanceOf[ContentApplicationjsonCanencryptcomms]
  }
  
  extension [Self <: ContentApplicationjsonCanencryptcomms](x: Self) {
    
    inline def setContent(value: ApplicationjsonCanencryptcomms): Self = StObject.set(x, "content", value.asInstanceOf[js.Any])
  }
}
