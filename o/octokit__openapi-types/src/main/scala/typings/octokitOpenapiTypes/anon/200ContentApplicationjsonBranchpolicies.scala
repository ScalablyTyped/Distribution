package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `200ContentApplicationjsonBranchpolicies` extends StObject {
  
  /** Response */
  var `200`: ContentApplicationjsonBranchpolicies
}
object `200ContentApplicationjsonBranchpolicies` {
  
  inline def apply(`200`: ContentApplicationjsonBranchpolicies): `200ContentApplicationjsonBranchpolicies` = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("200")(`200`.asInstanceOf[js.Any])
    __obj.asInstanceOf[`200ContentApplicationjsonBranchpolicies`]
  }
  
  extension [Self <: `200ContentApplicationjsonBranchpolicies`](x: Self) {
    
    inline def set200(value: ContentApplicationjsonBranchpolicies): Self = StObject.set(x, "200", value.asInstanceOf[js.Any])
  }
}
