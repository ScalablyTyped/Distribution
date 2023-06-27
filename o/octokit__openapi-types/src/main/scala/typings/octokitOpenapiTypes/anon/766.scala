package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `766` extends StObject {
  
  /** @description Response */
  var `200`: ContentApplicationjsonCreatedatIgnored
}
object `766` {
  
  inline def apply(`200`: ContentApplicationjsonCreatedatIgnored): `766` = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("200")(`200`.asInstanceOf[js.Any])
    __obj.asInstanceOf[`766`]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: `766`] (val x: Self) extends AnyVal {
    
    inline def set200(value: ContentApplicationjsonCreatedatIgnored): Self = StObject.set(x, "200", value.asInstanceOf[js.Any])
  }
}
