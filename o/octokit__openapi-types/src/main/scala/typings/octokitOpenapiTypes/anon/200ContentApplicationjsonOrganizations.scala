package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `200ContentApplicationjsonOrganizations` extends StObject {
  
  /** Response */
  var `200`: ContentApplicationjsonOrganizations
}
object `200ContentApplicationjsonOrganizations` {
  
  inline def apply(`200`: ContentApplicationjsonOrganizations): `200ContentApplicationjsonOrganizations` = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("200")(`200`.asInstanceOf[js.Any])
    __obj.asInstanceOf[`200ContentApplicationjsonOrganizations`]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: `200ContentApplicationjsonOrganizations`] (val x: Self) extends AnyVal {
    
    inline def set200(value: ContentApplicationjsonOrganizations): Self = StObject.set(x, "200", value.asInstanceOf[js.Any])
  }
}
