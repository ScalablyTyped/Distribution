package typings.micromarkUtilTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `2` extends StObject {
  
  var `null`: js.Array[PickConstructresolveAll]
}
object `2` {
  
  inline def apply(`null`: js.Array[PickConstructresolveAll]): `2` = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("null")(`null`.asInstanceOf[js.Any])
    __obj.asInstanceOf[`2`]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: `2`] (val x: Self) extends AnyVal {
    
    inline def setNull(value: js.Array[PickConstructresolveAll]): Self = StObject.set(x, "null", value.asInstanceOf[js.Any])
    
    inline def setNullVarargs(value: PickConstructresolveAll*): Self = StObject.set(x, "null", js.Array(value*))
  }
}
