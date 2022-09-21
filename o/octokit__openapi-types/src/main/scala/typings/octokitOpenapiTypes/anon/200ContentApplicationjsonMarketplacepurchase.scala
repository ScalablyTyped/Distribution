package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `200ContentApplicationjsonMarketplacepurchase` extends StObject {
  
  /** Response */
  var `200`: ContentApplicationjsonMarketplacepurchase
  
  var `401`: Content55
  
  /** Not Found when the account has not purchased the listing */
  var `404`: ContentApplicationjsonDocumentationurlMessage
}
object `200ContentApplicationjsonMarketplacepurchase` {
  
  inline def apply(
    `200`: ContentApplicationjsonMarketplacepurchase,
    `401`: Content55,
    `404`: ContentApplicationjsonDocumentationurlMessage
  ): `200ContentApplicationjsonMarketplacepurchase` = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("200")(`200`.asInstanceOf[js.Any])
    __obj.updateDynamic("401")(`401`.asInstanceOf[js.Any])
    __obj.updateDynamic("404")(`404`.asInstanceOf[js.Any])
    __obj.asInstanceOf[`200ContentApplicationjsonMarketplacepurchase`]
  }
  
  extension [Self <: `200ContentApplicationjsonMarketplacepurchase`](x: Self) {
    
    inline def set200(value: ContentApplicationjsonMarketplacepurchase): Self = StObject.set(x, "200", value.asInstanceOf[js.Any])
    
    inline def set401(value: Content55): Self = StObject.set(x, "401", value.asInstanceOf[js.Any])
    
    inline def set404(value: ContentApplicationjsonDocumentationurlMessage): Self = StObject.set(x, "404", value.asInstanceOf[js.Any])
  }
}
