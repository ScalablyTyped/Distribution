package typings.micromarkUtilTypes.anon

import typings.micromarkUtilTypes.mod.Code
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `3` extends StObject {
  
  var `null`: js.Array[Code]
}
object `3` {
  
  inline def apply(`null`: js.Array[Code]): `3` = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("null")(`null`.asInstanceOf[js.Any])
    __obj.asInstanceOf[`3`]
  }
  
  extension [Self <: `3`](x: Self) {
    
    inline def setNull(value: js.Array[Code]): Self = StObject.set(x, "null", value.asInstanceOf[js.Any])
    
    inline def setNullVarargs(value: Code*): Self = StObject.set(x, "null", js.Array(value*))
  }
}
