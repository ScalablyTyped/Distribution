package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `200ContentApplicationjsonCustomrolesTotalcount` extends StObject {
  
  /** Response - list of custom role names */
  var `200`: ContentApplicationjsonCustomrolesTotalcount
}
object `200ContentApplicationjsonCustomrolesTotalcount` {
  
  inline def apply(`200`: ContentApplicationjsonCustomrolesTotalcount): `200ContentApplicationjsonCustomrolesTotalcount` = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("200")(`200`.asInstanceOf[js.Any])
    __obj.asInstanceOf[`200ContentApplicationjsonCustomrolesTotalcount`]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: `200ContentApplicationjsonCustomrolesTotalcount`] (val x: Self) extends AnyVal {
    
    inline def set200(value: ContentApplicationjsonCustomrolesTotalcount): Self = StObject.set(x, "200", value.asInstanceOf[js.Any])
  }
}
