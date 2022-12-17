package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `201ContentApplicationjsonAddedby` extends StObject {
  
  /** Response */
  var `201`: ContentApplicationjsonAddedby
  
  var `422`: Content397
}
object `201ContentApplicationjsonAddedby` {
  
  inline def apply(`201`: ContentApplicationjsonAddedby, `422`: Content397): `201ContentApplicationjsonAddedby` = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("201")(`201`.asInstanceOf[js.Any])
    __obj.updateDynamic("422")(`422`.asInstanceOf[js.Any])
    __obj.asInstanceOf[`201ContentApplicationjsonAddedby`]
  }
  
  extension [Self <: `201ContentApplicationjsonAddedby`](x: Self) {
    
    inline def set201(value: ContentApplicationjsonAddedby): Self = StObject.set(x, "201", value.asInstanceOf[js.Any])
    
    inline def set422(value: Content397): Self = StObject.set(x, "422", value.asInstanceOf[js.Any])
  }
}
