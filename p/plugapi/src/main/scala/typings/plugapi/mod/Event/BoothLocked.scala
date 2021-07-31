package typings.plugapi.mod.Event

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait BoothLocked extends StObject {
  
  var c: Boolean
  
  var f: Boolean
  
  var m: String
  
  var ml: String
}
object BoothLocked {
  
  @scala.inline
  def apply(c: Boolean, f: Boolean, m: String, ml: String): BoothLocked = {
    val __obj = js.Dynamic.literal(c = c.asInstanceOf[js.Any], f = f.asInstanceOf[js.Any], m = m.asInstanceOf[js.Any], ml = ml.asInstanceOf[js.Any])
    __obj.asInstanceOf[BoothLocked]
  }
  
  @scala.inline
  implicit class BoothLockedMutableBuilder[Self <: BoothLocked] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setC(value: Boolean): Self = StObject.set(x, "c", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setF(value: Boolean): Self = StObject.set(x, "f", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setM(value: String): Self = StObject.set(x, "m", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMl(value: String): Self = StObject.set(x, "ml", value.asInstanceOf[js.Any])
  }
}
