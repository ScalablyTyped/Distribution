package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `200409` extends StObject {
  
  /** Response */
  var `200`: ContentApplicationjsonAdvancedsecurityenabledfornewrepositories
  
  var `409`: Content6
  
  /** Validation failed */
  var `422`: Content38
}
object `200409` {
  
  inline def apply(
    `200`: ContentApplicationjsonAdvancedsecurityenabledfornewrepositories,
    `409`: Content6,
    `422`: Content38
  ): `200409` = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("200")(`200`.asInstanceOf[js.Any])
    __obj.updateDynamic("409")(`409`.asInstanceOf[js.Any])
    __obj.updateDynamic("422")(`422`.asInstanceOf[js.Any])
    __obj.asInstanceOf[`200409`]
  }
  
  extension [Self <: `200409`](x: Self) {
    
    inline def set200(value: ContentApplicationjsonAdvancedsecurityenabledfornewrepositories): Self = StObject.set(x, "200", value.asInstanceOf[js.Any])
    
    inline def set409(value: Content6): Self = StObject.set(x, "409", value.asInstanceOf[js.Any])
    
    inline def set422(value: Content38): Self = StObject.set(x, "422", value.asInstanceOf[js.Any])
  }
}
