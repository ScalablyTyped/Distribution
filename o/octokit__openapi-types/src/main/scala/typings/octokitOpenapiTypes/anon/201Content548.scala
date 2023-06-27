package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `201Content548` extends StObject {
  
  /** @description Response */
  var `201`: Content548
  
  var `404`: Content41
  
  var `422`: Content549
}
object `201Content548` {
  
  inline def apply(`201`: Content548, `404`: Content41, `422`: Content549): `201Content548` = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("201")(`201`.asInstanceOf[js.Any])
    __obj.updateDynamic("404")(`404`.asInstanceOf[js.Any])
    __obj.updateDynamic("422")(`422`.asInstanceOf[js.Any])
    __obj.asInstanceOf[`201Content548`]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: `201Content548`] (val x: Self) extends AnyVal {
    
    inline def set201(value: Content548): Self = StObject.set(x, "201", value.asInstanceOf[js.Any])
    
    inline def set404(value: Content41): Self = StObject.set(x, "404", value.asInstanceOf[js.Any])
    
    inline def set422(value: Content549): Self = StObject.set(x, "422", value.asInstanceOf[js.Any])
  }
}
