package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `200ContentApplicationjsonCompareurl` extends StObject {
  
  /** Alternative response with extra repository information */
  var `200`: ContentApplicationjsonCompareurl
  
  /** Not Found if repository is not managed by this team */
  var `404`: Any
}
object `200ContentApplicationjsonCompareurl` {
  
  inline def apply(`200`: ContentApplicationjsonCompareurl, `404`: Any): `200ContentApplicationjsonCompareurl` = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("200")(`200`.asInstanceOf[js.Any])
    __obj.updateDynamic("404")(`404`.asInstanceOf[js.Any])
    __obj.asInstanceOf[`200ContentApplicationjsonCompareurl`]
  }
  
  extension [Self <: `200ContentApplicationjsonCompareurl`](x: Self) {
    
    inline def set200(value: ContentApplicationjsonCompareurl): Self = StObject.set(x, "200", value.asInstanceOf[js.Any])
    
    inline def set404(value: Any): Self = StObject.set(x, "404", value.asInstanceOf[js.Any])
  }
}
