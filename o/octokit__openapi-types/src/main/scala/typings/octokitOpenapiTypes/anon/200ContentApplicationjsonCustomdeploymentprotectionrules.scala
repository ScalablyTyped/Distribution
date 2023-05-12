package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `200ContentApplicationjsonCustomdeploymentprotectionrules` extends StObject {
  
  /** @description List of deployment protection rules */
  var `200`: ContentApplicationjsonCustomdeploymentprotectionrules
}
object `200ContentApplicationjsonCustomdeploymentprotectionrules` {
  
  inline def apply(`200`: ContentApplicationjsonCustomdeploymentprotectionrules): `200ContentApplicationjsonCustomdeploymentprotectionrules` = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("200")(`200`.asInstanceOf[js.Any])
    __obj.asInstanceOf[`200ContentApplicationjsonCustomdeploymentprotectionrules`]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: `200ContentApplicationjsonCustomdeploymentprotectionrules`] (val x: Self) extends AnyVal {
    
    inline def set200(value: ContentApplicationjsonCustomdeploymentprotectionrules): Self = StObject.set(x, "200", value.asInstanceOf[js.Any])
  }
}
