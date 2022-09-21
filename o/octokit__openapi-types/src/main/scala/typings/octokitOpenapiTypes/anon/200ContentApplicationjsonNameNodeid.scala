package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `200ContentApplicationjsonNameNodeid` extends StObject {
  
  /** Response */
  var `200`: ContentApplicationjsonNameNodeid
  
  /** Not Found or `deployment_branch_policy.custom_branch_policies` property for the environment is set to false */
  var `404`: Any
}
object `200ContentApplicationjsonNameNodeid` {
  
  inline def apply(`200`: ContentApplicationjsonNameNodeid, `404`: Any): `200ContentApplicationjsonNameNodeid` = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("200")(`200`.asInstanceOf[js.Any])
    __obj.updateDynamic("404")(`404`.asInstanceOf[js.Any])
    __obj.asInstanceOf[`200ContentApplicationjsonNameNodeid`]
  }
  
  extension [Self <: `200ContentApplicationjsonNameNodeid`](x: Self) {
    
    inline def set200(value: ContentApplicationjsonNameNodeid): Self = StObject.set(x, "200", value.asInstanceOf[js.Any])
    
    inline def set404(value: Any): Self = StObject.set(x, "404", value.asInstanceOf[js.Any])
  }
}
