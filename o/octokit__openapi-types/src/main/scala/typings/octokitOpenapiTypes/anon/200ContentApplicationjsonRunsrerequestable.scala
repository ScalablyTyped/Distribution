package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `200ContentApplicationjsonRunsrerequestable` extends StObject {
  
  /** @description Response when the suite already exists */
  var `200`: ContentApplicationjsonRunsrerequestable
  
  /** @description Response when the suite was created */
  var `201`: ContentApplicationjsonRunsrerequestable
}
object `200ContentApplicationjsonRunsrerequestable` {
  
  inline def apply(`200`: ContentApplicationjsonRunsrerequestable, `201`: ContentApplicationjsonRunsrerequestable): `200ContentApplicationjsonRunsrerequestable` = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("200")(`200`.asInstanceOf[js.Any])
    __obj.updateDynamic("201")(`201`.asInstanceOf[js.Any])
    __obj.asInstanceOf[`200ContentApplicationjsonRunsrerequestable`]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: `200ContentApplicationjsonRunsrerequestable`] (val x: Self) extends AnyVal {
    
    inline def set200(value: ContentApplicationjsonRunsrerequestable): Self = StObject.set(x, "200", value.asInstanceOf[js.Any])
    
    inline def set201(value: ContentApplicationjsonRunsrerequestable): Self = StObject.set(x, "201", value.asInstanceOf[js.Any])
  }
}
