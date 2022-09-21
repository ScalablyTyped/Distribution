package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ContentApplicationjsonMarketplacepurchase extends StObject {
  
  var content: ApplicationjsonMarketplacepurchase
}
object ContentApplicationjsonMarketplacepurchase {
  
  inline def apply(content: ApplicationjsonMarketplacepurchase): ContentApplicationjsonMarketplacepurchase = {
    val __obj = js.Dynamic.literal(content = content.asInstanceOf[js.Any])
    __obj.asInstanceOf[ContentApplicationjsonMarketplacepurchase]
  }
  
  extension [Self <: ContentApplicationjsonMarketplacepurchase](x: Self) {
    
    inline def setContent(value: ApplicationjsonMarketplacepurchase): Self = StObject.set(x, "content", value.asInstanceOf[js.Any])
  }
}
