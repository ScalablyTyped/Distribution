package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `200ContentApplicationjsonDeployment` extends StObject {
  
  /** Response */
  var `200`: ContentApplicationjsonDeployment
}
object `200ContentApplicationjsonDeployment` {
  
  inline def apply(`200`: ContentApplicationjsonDeployment): `200ContentApplicationjsonDeployment` = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("200")(`200`.asInstanceOf[js.Any])
    __obj.asInstanceOf[`200ContentApplicationjsonDeployment`]
  }
  
  extension [Self <: `200ContentApplicationjsonDeployment`](x: Self) {
    
    inline def set200(value: ContentApplicationjsonDeployment): Self = StObject.set(x, "200", value.asInstanceOf[js.Any])
  }
}
