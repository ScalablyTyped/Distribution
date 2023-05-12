package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `200ContentApplicationjsonBasebranch` extends StObject {
  
  /** @description The branch has been successfully synced with the upstream repository */
  var `200`: ContentApplicationjsonBasebranch
}
object `200ContentApplicationjsonBasebranch` {
  
  inline def apply(`200`: ContentApplicationjsonBasebranch): `200ContentApplicationjsonBasebranch` = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("200")(`200`.asInstanceOf[js.Any])
    __obj.asInstanceOf[`200ContentApplicationjsonBasebranch`]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: `200ContentApplicationjsonBasebranch`] (val x: Self) extends AnyVal {
    
    inline def set200(value: ContentApplicationjsonBasebranch): Self = StObject.set(x, "200", value.asInstanceOf[js.Any])
  }
}
