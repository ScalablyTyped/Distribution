package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `201Content4` extends StObject {
  
  /** Response when creating a secret */
  var `201`: Content4
}
object `201Content4` {
  
  inline def apply(`201`: Content4): `201Content4` = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("201")(`201`.asInstanceOf[js.Any])
    __obj.asInstanceOf[`201Content4`]
  }
  
  extension [Self <: `201Content4`](x: Self) {
    
    inline def set201(value: Content4): Self = StObject.set(x, "201", value.asInstanceOf[js.Any])
  }
}
