package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `465` extends StObject {
  
  var from: js.UndefOr[js.Array[String] | Null] = js.undefined
}
object `465` {
  
  inline def apply(): `465` = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[`465`]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: `465`] (val x: Self) extends AnyVal {
    
    inline def setFrom(value: js.Array[String]): Self = StObject.set(x, "from", value.asInstanceOf[js.Any])
    
    inline def setFromNull: Self = StObject.set(x, "from", null)
    
    inline def setFromUndefined: Self = StObject.set(x, "from", js.undefined)
    
    inline def setFromVarargs(value: String*): Self = StObject.set(x, "from", js.Array(value*))
  }
}
