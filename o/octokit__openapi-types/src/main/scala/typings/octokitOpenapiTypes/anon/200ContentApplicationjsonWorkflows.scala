package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `200ContentApplicationjsonWorkflows` extends StObject {
  
  /** Response */
  var `200`: ContentApplicationjsonWorkflows
}
object `200ContentApplicationjsonWorkflows` {
  
  inline def apply(`200`: ContentApplicationjsonWorkflows): `200ContentApplicationjsonWorkflows` = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("200")(`200`.asInstanceOf[js.Any])
    __obj.asInstanceOf[`200ContentApplicationjsonWorkflows`]
  }
  
  extension [Self <: `200ContentApplicationjsonWorkflows`](x: Self) {
    
    inline def set200(value: ContentApplicationjsonWorkflows): Self = StObject.set(x, "200", value.asInstanceOf[js.Any])
  }
}
