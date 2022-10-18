package typings.micromarkUtilTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `4` extends StObject {
  
  var `null`: js.Array[PickConstructresolveAll]
}
object `4` {
  
  inline def apply(`null`: js.Array[PickConstructresolveAll]): `4` = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("null")(`null`.asInstanceOf[js.Any])
    __obj.asInstanceOf[`4`]
  }
  
  extension [Self <: `4`](x: Self) {
    
    inline def setNull(value: js.Array[PickConstructresolveAll]): Self = StObject.set(x, "null", value.asInstanceOf[js.Any])
    
    inline def setNullVarargs(value: PickConstructresolveAll*): Self = StObject.set(x, "null", js.Array(value*))
  }
}
