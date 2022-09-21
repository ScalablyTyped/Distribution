package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ContentApplicationjsonSelectedrepositoryids extends StObject {
  
  var content: ApplicationjsonSelectedrepositoryids
}
object ContentApplicationjsonSelectedrepositoryids {
  
  inline def apply(content: ApplicationjsonSelectedrepositoryids): ContentApplicationjsonSelectedrepositoryids = {
    val __obj = js.Dynamic.literal(content = content.asInstanceOf[js.Any])
    __obj.asInstanceOf[ContentApplicationjsonSelectedrepositoryids]
  }
  
  extension [Self <: ContentApplicationjsonSelectedrepositoryids](x: Self) {
    
    inline def setContent(value: ApplicationjsonSelectedrepositoryids): Self = StObject.set(x, "content", value.asInstanceOf[js.Any])
  }
}
