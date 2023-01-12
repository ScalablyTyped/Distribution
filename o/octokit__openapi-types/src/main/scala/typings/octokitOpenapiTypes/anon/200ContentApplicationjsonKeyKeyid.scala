package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `200ContentApplicationjsonKeyKeyid` extends StObject {
  
  /** Response */
  var `200`: ContentApplicationjsonKeyKeyid
}
object `200ContentApplicationjsonKeyKeyid` {
  
  inline def apply(`200`: ContentApplicationjsonKeyKeyid): `200ContentApplicationjsonKeyKeyid` = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("200")(`200`.asInstanceOf[js.Any])
    __obj.asInstanceOf[`200ContentApplicationjsonKeyKeyid`]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: `200ContentApplicationjsonKeyKeyid`] (val x: Self) extends AnyVal {
    
    inline def set200(value: ContentApplicationjsonKeyKeyid): Self = StObject.set(x, "200", value.asInstanceOf[js.Any])
  }
}
