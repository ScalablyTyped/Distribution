package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `201Content417` extends StObject {
  
  /** Response */
  var `201`: Content417
  
  var `404`: Content55
  
  var `422`: Content418
}
object `201Content417` {
  
  inline def apply(`201`: Content417, `404`: Content55, `422`: Content418): `201Content417` = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("201")(`201`.asInstanceOf[js.Any])
    __obj.updateDynamic("404")(`404`.asInstanceOf[js.Any])
    __obj.updateDynamic("422")(`422`.asInstanceOf[js.Any])
    __obj.asInstanceOf[`201Content417`]
  }
  
  extension [Self <: `201Content417`](x: Self) {
    
    inline def set201(value: Content417): Self = StObject.set(x, "201", value.asInstanceOf[js.Any])
    
    inline def set404(value: Content55): Self = StObject.set(x, "404", value.asInstanceOf[js.Any])
    
    inline def set422(value: Content418): Self = StObject.set(x, "422", value.asInstanceOf[js.Any])
  }
}
