package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `200ContentApplicationjsonNameNodeid` extends StObject {
  
  /** @description Response */
  var `200`: ContentApplicationjsonNameNodeid
}
object `200ContentApplicationjsonNameNodeid` {
  
  inline def apply(`200`: ContentApplicationjsonNameNodeid): `200ContentApplicationjsonNameNodeid` = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("200")(`200`.asInstanceOf[js.Any])
    __obj.asInstanceOf[`200ContentApplicationjsonNameNodeid`]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: `200ContentApplicationjsonNameNodeid`] (val x: Self) extends AnyVal {
    
    inline def set200(value: ContentApplicationjsonNameNodeid): Self = StObject.set(x, "200", value.asInstanceOf[js.Any])
  }
}
