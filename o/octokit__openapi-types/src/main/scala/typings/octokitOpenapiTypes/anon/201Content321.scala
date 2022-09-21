package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `201Content321` extends StObject {
  
  /** Response for successful upload */
  var `201`: Content321
  
  /** Response if you upload an asset with the same filename as another uploaded asset */
  var `422`: Any
}
object `201Content321` {
  
  inline def apply(`201`: Content321, `422`: Any): `201Content321` = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("201")(`201`.asInstanceOf[js.Any])
    __obj.updateDynamic("422")(`422`.asInstanceOf[js.Any])
    __obj.asInstanceOf[`201Content321`]
  }
  
  extension [Self <: `201Content321`](x: Self) {
    
    inline def set201(value: Content321): Self = StObject.set(x, "201", value.asInstanceOf[js.Any])
    
    inline def set422(value: Any): Self = StObject.set(x, "422", value.asInstanceOf[js.Any])
  }
}
