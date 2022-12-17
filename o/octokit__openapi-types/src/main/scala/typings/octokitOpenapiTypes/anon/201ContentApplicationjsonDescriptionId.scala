package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `201ContentApplicationjsonDescriptionId` extends StObject {
  
  /** Response */
  var `201`: ContentApplicationjsonDescriptionId
  
  var `404`: Content48
  
  var `422`: Content397
}
object `201ContentApplicationjsonDescriptionId` {
  
  inline def apply(`201`: ContentApplicationjsonDescriptionId, `404`: Content48, `422`: Content397): `201ContentApplicationjsonDescriptionId` = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("201")(`201`.asInstanceOf[js.Any])
    __obj.updateDynamic("404")(`404`.asInstanceOf[js.Any])
    __obj.updateDynamic("422")(`422`.asInstanceOf[js.Any])
    __obj.asInstanceOf[`201ContentApplicationjsonDescriptionId`]
  }
  
  extension [Self <: `201ContentApplicationjsonDescriptionId`](x: Self) {
    
    inline def set201(value: ContentApplicationjsonDescriptionId): Self = StObject.set(x, "201", value.asInstanceOf[js.Any])
    
    inline def set404(value: Content48): Self = StObject.set(x, "404", value.asInstanceOf[js.Any])
    
    inline def set422(value: Content397): Self = StObject.set(x, "422", value.asInstanceOf[js.Any])
  }
}
