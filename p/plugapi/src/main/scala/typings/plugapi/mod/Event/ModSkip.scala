package typings.plugapi.mod.Event

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ModSkip extends StObject {
  
  var m: String
  
  var mi: Double
}
object ModSkip {
  
  inline def apply(m: String, mi: Double): ModSkip = {
    val __obj = js.Dynamic.literal(m = m.asInstanceOf[js.Any], mi = mi.asInstanceOf[js.Any])
    __obj.asInstanceOf[ModSkip]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ModSkip] (val x: Self) extends AnyVal {
    
    inline def setM(value: String): Self = StObject.set(x, "m", value.asInstanceOf[js.Any])
    
    inline def setMi(value: Double): Self = StObject.set(x, "mi", value.asInstanceOf[js.Any])
  }
}
