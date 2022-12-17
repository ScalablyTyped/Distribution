package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `200ContentApplicationjsonBodytextCommitid422Content395` extends StObject {
  
  /** Response */
  var `200`: ContentApplicationjsonBodytextCommitid
  
  var `422`: Content395
}
object `200ContentApplicationjsonBodytextCommitid422Content395` {
  
  inline def apply(`200`: ContentApplicationjsonBodytextCommitid, `422`: Content395): `200ContentApplicationjsonBodytextCommitid422Content395` = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("200")(`200`.asInstanceOf[js.Any])
    __obj.updateDynamic("422")(`422`.asInstanceOf[js.Any])
    __obj.asInstanceOf[`200ContentApplicationjsonBodytextCommitid422Content395`]
  }
  
  extension [Self <: `200ContentApplicationjsonBodytextCommitid422Content395`](x: Self) {
    
    inline def set200(value: ContentApplicationjsonBodytextCommitid): Self = StObject.set(x, "200", value.asInstanceOf[js.Any])
    
    inline def set422(value: Content395): Self = StObject.set(x, "422", value.asInstanceOf[js.Any])
  }
}
