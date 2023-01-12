package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `200ContentApplicationjsonCommentscount` extends StObject {
  
  /** Response */
  var `200`: ContentApplicationjsonCommentscount
}
object `200ContentApplicationjsonCommentscount` {
  
  inline def apply(`200`: ContentApplicationjsonCommentscount): `200ContentApplicationjsonCommentscount` = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("200")(`200`.asInstanceOf[js.Any])
    __obj.asInstanceOf[`200ContentApplicationjsonCommentscount`]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: `200ContentApplicationjsonCommentscount`] (val x: Self) extends AnyVal {
    
    inline def set200(value: ContentApplicationjsonCommentscount): Self = StObject.set(x, "200", value.asInstanceOf[js.Any])
  }
}
