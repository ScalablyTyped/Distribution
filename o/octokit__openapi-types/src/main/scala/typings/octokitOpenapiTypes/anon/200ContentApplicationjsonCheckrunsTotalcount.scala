package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `200ContentApplicationjsonCheckrunsTotalcount` extends StObject {
  
  /** Response */
  var `200`: ContentApplicationjsonCheckrunsTotalcount
}
object `200ContentApplicationjsonCheckrunsTotalcount` {
  
  inline def apply(`200`: ContentApplicationjsonCheckrunsTotalcount): `200ContentApplicationjsonCheckrunsTotalcount` = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("200")(`200`.asInstanceOf[js.Any])
    __obj.asInstanceOf[`200ContentApplicationjsonCheckrunsTotalcount`]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: `200ContentApplicationjsonCheckrunsTotalcount`] (val x: Self) extends AnyVal {
    
    inline def set200(value: ContentApplicationjsonCheckrunsTotalcount): Self = StObject.set(x, "200", value.asInstanceOf[js.Any])
  }
}
