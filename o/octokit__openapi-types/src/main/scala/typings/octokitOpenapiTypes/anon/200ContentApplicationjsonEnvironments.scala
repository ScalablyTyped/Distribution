package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `200ContentApplicationjsonEnvironments` extends StObject {
  
  /** @description Response */
  var `200`: ContentApplicationjsonEnvironments
}
object `200ContentApplicationjsonEnvironments` {
  
  inline def apply(`200`: ContentApplicationjsonEnvironments): `200ContentApplicationjsonEnvironments` = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("200")(`200`.asInstanceOf[js.Any])
    __obj.asInstanceOf[`200ContentApplicationjsonEnvironments`]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: `200ContentApplicationjsonEnvironments`] (val x: Self) extends AnyVal {
    
    inline def set200(value: ContentApplicationjsonEnvironments): Self = StObject.set(x, "200", value.asInstanceOf[js.Any])
  }
}
