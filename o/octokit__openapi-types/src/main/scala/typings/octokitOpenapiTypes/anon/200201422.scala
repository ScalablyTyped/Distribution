package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `200201422` extends StObject {
  
  /** Reaction exists */
  var `200`: ContentApplicationjsonNodeidUser
  
  /** Reaction created */
  var `201`: ContentApplicationjsonNodeidUser
  
  var `422`: Content8
}
object `200201422` {
  
  inline def apply(`200`: ContentApplicationjsonNodeidUser, `201`: ContentApplicationjsonNodeidUser, `422`: Content8): `200201422` = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("200")(`200`.asInstanceOf[js.Any])
    __obj.updateDynamic("201")(`201`.asInstanceOf[js.Any])
    __obj.updateDynamic("422")(`422`.asInstanceOf[js.Any])
    __obj.asInstanceOf[`200201422`]
  }
  
  extension [Self <: `200201422`](x: Self) {
    
    inline def set200(value: ContentApplicationjsonNodeidUser): Self = StObject.set(x, "200", value.asInstanceOf[js.Any])
    
    inline def set201(value: ContentApplicationjsonNodeidUser): Self = StObject.set(x, "201", value.asInstanceOf[js.Any])
    
    inline def set422(value: Content8): Self = StObject.set(x, "422", value.asInstanceOf[js.Any])
  }
}
