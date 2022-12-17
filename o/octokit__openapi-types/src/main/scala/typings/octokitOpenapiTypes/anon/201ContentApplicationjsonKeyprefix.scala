package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `201ContentApplicationjsonKeyprefix` extends StObject {
  
  /** response */
  var `201`: ContentApplicationjsonKeyprefix
  
  var `422`: Content397
}
object `201ContentApplicationjsonKeyprefix` {
  
  inline def apply(`201`: ContentApplicationjsonKeyprefix, `422`: Content397): `201ContentApplicationjsonKeyprefix` = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("201")(`201`.asInstanceOf[js.Any])
    __obj.updateDynamic("422")(`422`.asInstanceOf[js.Any])
    __obj.asInstanceOf[`201ContentApplicationjsonKeyprefix`]
  }
  
  extension [Self <: `201ContentApplicationjsonKeyprefix`](x: Self) {
    
    inline def set201(value: ContentApplicationjsonKeyprefix): Self = StObject.set(x, "201", value.asInstanceOf[js.Any])
    
    inline def set422(value: Content397): Self = StObject.set(x, "422", value.asInstanceOf[js.Any])
  }
}
