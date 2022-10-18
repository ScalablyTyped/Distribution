package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `201422` extends StObject {
  
  /** response */
  var `201`: ContentApplicationjsonIsalphanumeric
  
  var `422`: Content8
}
object `201422` {
  
  inline def apply(`201`: ContentApplicationjsonIsalphanumeric, `422`: Content8): `201422` = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("201")(`201`.asInstanceOf[js.Any])
    __obj.updateDynamic("422")(`422`.asInstanceOf[js.Any])
    __obj.asInstanceOf[`201422`]
  }
  
  extension [Self <: `201422`](x: Self) {
    
    inline def set201(value: ContentApplicationjsonIsalphanumeric): Self = StObject.set(x, "201", value.asInstanceOf[js.Any])
    
    inline def set422(value: Content8): Self = StObject.set(x, "422", value.asInstanceOf[js.Any])
  }
}
