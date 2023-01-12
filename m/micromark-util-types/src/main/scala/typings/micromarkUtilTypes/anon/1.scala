package typings.micromarkUtilTypes.anon

import typings.micromarkUtilTypes.mod.Code
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `1` extends StObject {
  
  var `null`: js.UndefOr[js.Array[Code]] = js.undefined
}
object `1` {
  
  inline def apply(): `1` = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[`1`]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: `1`] (val x: Self) extends AnyVal {
    
    inline def setNull(value: js.Array[Code]): Self = StObject.set(x, "null", value.asInstanceOf[js.Any])
    
    inline def setNullUndefined: Self = StObject.set(x, "null", js.undefined)
    
    inline def setNullVarargs(value: Code*): Self = StObject.set(x, "null", js.Array(value*))
  }
}
