package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `201Content64` extends StObject {
  
  /** Response */
  var `201`: Content64
}
object `201Content64` {
  
  inline def apply(`201`: Content64): `201Content64` = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("201")(`201`.asInstanceOf[js.Any])
    __obj.asInstanceOf[`201Content64`]
  }
  
  extension [Self <: `201Content64`](x: Self) {
    
    inline def set201(value: Content64): Self = StObject.set(x, "201", value.asInstanceOf[js.Any])
  }
}
