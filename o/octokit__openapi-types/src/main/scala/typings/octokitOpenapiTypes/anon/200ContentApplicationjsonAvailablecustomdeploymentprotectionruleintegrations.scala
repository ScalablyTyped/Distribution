package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `200ContentApplicationjsonAvailablecustomdeploymentprotectionruleintegrations` extends StObject {
  
  /** @description A list of custom deployment rule integrations available for this environment. */
  var `200`: ContentApplicationjsonAvailablecustomdeploymentprotectionruleintegrations
}
object `200ContentApplicationjsonAvailablecustomdeploymentprotectionruleintegrations` {
  
  inline def apply(`200`: ContentApplicationjsonAvailablecustomdeploymentprotectionruleintegrations): `200ContentApplicationjsonAvailablecustomdeploymentprotectionruleintegrations` = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("200")(`200`.asInstanceOf[js.Any])
    __obj.asInstanceOf[`200ContentApplicationjsonAvailablecustomdeploymentprotectionruleintegrations`]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: `200ContentApplicationjsonAvailablecustomdeploymentprotectionruleintegrations`] (val x: Self) extends AnyVal {
    
    inline def set200(value: ContentApplicationjsonAvailablecustomdeploymentprotectionruleintegrations): Self = StObject.set(x, "200", value.asInstanceOf[js.Any])
  }
}
