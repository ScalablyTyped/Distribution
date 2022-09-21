package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ContentApplicationjsonNameNodeid extends StObject {
  
  var content: ApplicationjsonNameNodeid
}
object ContentApplicationjsonNameNodeid {
  
  inline def apply(content: ApplicationjsonNameNodeid): ContentApplicationjsonNameNodeid = {
    val __obj = js.Dynamic.literal(content = content.asInstanceOf[js.Any])
    __obj.asInstanceOf[ContentApplicationjsonNameNodeid]
  }
  
  extension [Self <: ContentApplicationjsonNameNodeid](x: Self) {
    
    inline def setContent(value: ApplicationjsonNameNodeid): Self = StObject.set(x, "content", value.asInstanceOf[js.Any])
  }
}
