package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `200Content440Headers` extends StObject {
  
  /** Response */
  var `200`: Content440Headers
  
  var `422`: Content397
}
object `200Content440Headers` {
  
  inline def apply(`200`: Content440Headers, `422`: Content397): `200Content440Headers` = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("200")(`200`.asInstanceOf[js.Any])
    __obj.updateDynamic("422")(`422`.asInstanceOf[js.Any])
    __obj.asInstanceOf[`200Content440Headers`]
  }
  
  extension [Self <: `200Content440Headers`](x: Self) {
    
    inline def set200(value: Content440Headers): Self = StObject.set(x, "200", value.asInstanceOf[js.Any])
    
    inline def set422(value: Content397): Self = StObject.set(x, "422", value.asInstanceOf[js.Any])
  }
}
