package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `201Content316` extends StObject {
  
  /** Response for successful upload */
  var `201`: Content316
  
  /** Response if you upload an asset with the same filename as another uploaded asset */
  var `422`: Any
}
object `201Content316` {
  
  inline def apply(`201`: Content316, `422`: Any): `201Content316` = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("201")(`201`.asInstanceOf[js.Any])
    __obj.updateDynamic("422")(`422`.asInstanceOf[js.Any])
    __obj.asInstanceOf[`201Content316`]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: `201Content316`] (val x: Self) extends AnyVal {
    
    inline def set201(value: Content316): Self = StObject.set(x, "201", value.asInstanceOf[js.Any])
    
    inline def set422(value: Any): Self = StObject.set(x, "422", value.asInstanceOf[js.Any])
  }
}
