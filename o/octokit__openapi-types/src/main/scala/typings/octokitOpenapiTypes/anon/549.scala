package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `549` extends StObject {
  
  /** @description Response */
  var `200`: ContentApplicationjsonJobsTotalcount
}
object `549` {
  
  inline def apply(`200`: ContentApplicationjsonJobsTotalcount): `549` = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("200")(`200`.asInstanceOf[js.Any])
    __obj.asInstanceOf[`549`]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: `549`] (val x: Self) extends AnyVal {
    
    inline def set200(value: ContentApplicationjsonJobsTotalcount): Self = StObject.set(x, "200", value.asInstanceOf[js.Any])
  }
}
