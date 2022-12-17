package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `200548` extends StObject {
  
  /** Response */
  var `200`: `548`
  
  var `403`: Content48
  
  var `422`: Content397
}
object `200548` {
  
  inline def apply(`200`: `548`, `403`: Content48, `422`: Content397): `200548` = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("200")(`200`.asInstanceOf[js.Any])
    __obj.updateDynamic("403")(`403`.asInstanceOf[js.Any])
    __obj.updateDynamic("422")(`422`.asInstanceOf[js.Any])
    __obj.asInstanceOf[`200548`]
  }
  
  extension [Self <: `200548`](x: Self) {
    
    inline def set200(value: `548`): Self = StObject.set(x, "200", value.asInstanceOf[js.Any])
    
    inline def set403(value: Content48): Self = StObject.set(x, "403", value.asInstanceOf[js.Any])
    
    inline def set422(value: Content397): Self = StObject.set(x, "422", value.asInstanceOf[js.Any])
  }
}
