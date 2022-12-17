package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `200Content501` extends StObject {
  
  /** Response */
  var `200`: Content501
  
  var `422`: Content397
}
object `200Content501` {
  
  inline def apply(`200`: Content501, `422`: Content397): `200Content501` = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("200")(`200`.asInstanceOf[js.Any])
    __obj.updateDynamic("422")(`422`.asInstanceOf[js.Any])
    __obj.asInstanceOf[`200Content501`]
  }
  
  extension [Self <: `200Content501`](x: Self) {
    
    inline def set200(value: Content501): Self = StObject.set(x, "200", value.asInstanceOf[js.Any])
    
    inline def set422(value: Content397): Self = StObject.set(x, "422", value.asInstanceOf[js.Any])
  }
}
