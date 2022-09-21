package typings.miniprogram.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Indicate extends StObject {
  
  var indicate: Boolean
  
  @JSName("notify")
  var notify_FIndicate: Boolean
  
  var read: Boolean
  
  var write: Boolean
}
object Indicate {
  
  inline def apply(indicate: Boolean, notify_ : Boolean, read: Boolean, write: Boolean): Indicate = {
    val __obj = js.Dynamic.literal(indicate = indicate.asInstanceOf[js.Any], read = read.asInstanceOf[js.Any], write = write.asInstanceOf[js.Any])
    __obj.updateDynamic("notify")(notify_.asInstanceOf[js.Any])
    __obj.asInstanceOf[Indicate]
  }
  
  extension [Self <: Indicate](x: Self) {
    
    inline def setIndicate(value: Boolean): Self = StObject.set(x, "indicate", value.asInstanceOf[js.Any])
    
    inline def setNotify_(value: Boolean): Self = StObject.set(x, "notify", value.asInstanceOf[js.Any])
    
    inline def setRead(value: Boolean): Self = StObject.set(x, "read", value.asInstanceOf[js.Any])
    
    inline def setWrite(value: Boolean): Self = StObject.set(x, "write", value.asInstanceOf[js.Any])
  }
}
