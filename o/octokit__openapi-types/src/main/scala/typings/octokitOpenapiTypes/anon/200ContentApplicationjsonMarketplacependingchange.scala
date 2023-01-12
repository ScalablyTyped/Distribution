package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `200ContentApplicationjsonMarketplacependingchange` extends StObject {
  
  /** Response */
  var `200`: ContentApplicationjsonMarketplacependingchange
  
  var `401`: Content48
  
  /** Not Found when the account has not purchased the listing */
  var `404`: ContentApplicationjsonDocumentationurlMessage
}
object `200ContentApplicationjsonMarketplacependingchange` {
  
  inline def apply(
    `200`: ContentApplicationjsonMarketplacependingchange,
    `401`: Content48,
    `404`: ContentApplicationjsonDocumentationurlMessage
  ): `200ContentApplicationjsonMarketplacependingchange` = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("200")(`200`.asInstanceOf[js.Any])
    __obj.updateDynamic("401")(`401`.asInstanceOf[js.Any])
    __obj.updateDynamic("404")(`404`.asInstanceOf[js.Any])
    __obj.asInstanceOf[`200ContentApplicationjsonMarketplacependingchange`]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: `200ContentApplicationjsonMarketplacependingchange`] (val x: Self) extends AnyVal {
    
    inline def set200(value: ContentApplicationjsonMarketplacependingchange): Self = StObject.set(x, "200", value.asInstanceOf[js.Any])
    
    inline def set401(value: Content48): Self = StObject.set(x, "401", value.asInstanceOf[js.Any])
    
    inline def set404(value: ContentApplicationjsonDocumentationurlMessage): Self = StObject.set(x, "404", value.asInstanceOf[js.Any])
  }
}
