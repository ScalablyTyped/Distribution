package typings.nginstackEngine.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait END extends StObject {
  
  var END: Double
  
  var START: Double
}
object END {
  
  inline def apply(END: Double, START: Double): END = {
    val __obj = js.Dynamic.literal(END = END.asInstanceOf[js.Any], START = START.asInstanceOf[js.Any])
    __obj.asInstanceOf[END]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: END] (val x: Self) extends AnyVal {
    
    inline def setEND(value: Double): Self = StObject.set(x, "END", value.asInstanceOf[js.Any])
    
    inline def setSTART(value: Double): Self = StObject.set(x, "START", value.asInstanceOf[js.Any])
  }
}
