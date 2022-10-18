package typings.micromarkUtilTypes.anon

import typings.micromarkUtilTypes.mod.Code
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `0` extends StObject {
  
  var `null`: js.UndefOr[js.Array[Code]] = js.undefined
}
object `0` {
  
  inline def apply(): `0` = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[`0`]
  }
  
  extension [Self <: `0`](x: Self) {
    
    inline def setNull(value: js.Array[Code]): Self = StObject.set(x, "null", value.asInstanceOf[js.Any])
    
    inline def setNullUndefined: Self = StObject.set(x, "null", js.undefined)
    
    inline def setNullVarargs(value: Code*): Self = StObject.set(x, "null", js.Array(value*))
  }
}
