package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `200ContentApplicationjsonBodytextCommitid422Content549` extends StObject {
  
  /** @description Response */
  var `200`: ContentApplicationjsonBodytextCommitid
  
  var `422`: Content549
}
object `200ContentApplicationjsonBodytextCommitid422Content549` {
  
  inline def apply(`200`: ContentApplicationjsonBodytextCommitid, `422`: Content549): `200ContentApplicationjsonBodytextCommitid422Content549` = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("200")(`200`.asInstanceOf[js.Any])
    __obj.updateDynamic("422")(`422`.asInstanceOf[js.Any])
    __obj.asInstanceOf[`200ContentApplicationjsonBodytextCommitid422Content549`]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: `200ContentApplicationjsonBodytextCommitid422Content549`] (val x: Self) extends AnyVal {
    
    inline def set200(value: ContentApplicationjsonBodytextCommitid): Self = StObject.set(x, "200", value.asInstanceOf[js.Any])
    
    inline def set422(value: Content549): Self = StObject.set(x, "422", value.asInstanceOf[js.Any])
  }
}
