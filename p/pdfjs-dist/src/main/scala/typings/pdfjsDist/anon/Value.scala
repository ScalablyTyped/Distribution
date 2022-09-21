package typings.pdfjsDist.anon

import typings.std.ArrayBufferLike
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Value extends StObject {
  
  var done: Boolean
  
  var value: ArrayBufferLike
}
object Value {
  
  inline def apply(done: Boolean, value: ArrayBufferLike): Value = {
    val __obj = js.Dynamic.literal(done = done.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.asInstanceOf[Value]
  }
  
  extension [Self <: Value](x: Self) {
    
    inline def setDone(value: Boolean): Self = StObject.set(x, "done", value.asInstanceOf[js.Any])
    
    inline def setValue(value: ArrayBufferLike): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
  }
}
