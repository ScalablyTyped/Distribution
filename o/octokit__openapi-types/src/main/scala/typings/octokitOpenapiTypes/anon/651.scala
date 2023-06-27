package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `651` extends StObject {
  
  /** @description Response */
  var `200`: ContentApplicationjsonJobsTotalcount
}
object `651` {
  
  inline def apply(`200`: ContentApplicationjsonJobsTotalcount): `651` = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("200")(`200`.asInstanceOf[js.Any])
    __obj.asInstanceOf[`651`]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: `651`] (val x: Self) extends AnyVal {
    
    inline def set200(value: ContentApplicationjsonJobsTotalcount): Self = StObject.set(x, "200", value.asInstanceOf[js.Any])
  }
}
