package typings.minecraftScriptingTypesShared

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Int64 extends StObject {
  
  var `64bit_high`: Double
  
  var `64bit_low`: Double
}
object Int64 {
  
  inline def apply(`64bit_high`: Double, `64bit_low`: Double): Int64 = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("64bit_high")(`64bit_high`.asInstanceOf[js.Any])
    __obj.updateDynamic("64bit_low")(`64bit_low`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Int64]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Int64] (val x: Self) extends AnyVal {
    
    inline def set64bit_high(value: Double): Self = StObject.set(x, "64bit_high", value.asInstanceOf[js.Any])
    
    inline def set64bit_low(value: Double): Self = StObject.set(x, "64bit_low", value.asInstanceOf[js.Any])
  }
}
