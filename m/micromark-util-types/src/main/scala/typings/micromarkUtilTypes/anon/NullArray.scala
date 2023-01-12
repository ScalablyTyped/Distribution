package typings.micromarkUtilTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait NullArray extends StObject {
  
  var `null`: js.Array[String]
}
object NullArray {
  
  inline def apply(`null`: js.Array[String]): NullArray = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("null")(`null`.asInstanceOf[js.Any])
    __obj.asInstanceOf[NullArray]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: NullArray] (val x: Self) extends AnyVal {
    
    inline def setNull(value: js.Array[String]): Self = StObject.set(x, "null", value.asInstanceOf[js.Any])
    
    inline def setNullVarargs(value: String*): Self = StObject.set(x, "null", js.Array(value*))
  }
}
