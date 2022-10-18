package typings.next.anon

import typings.next.nextBooleans.`false`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Done[T /* <: js.typedarray.ArrayBufferView */] extends StObject {
  
  var done: `false`
  
  var value: T
}
object Done {
  
  inline def apply[T /* <: js.typedarray.ArrayBufferView */](value: T): Done[T] = {
    val __obj = js.Dynamic.literal(done = false, value = value.asInstanceOf[js.Any])
    __obj.asInstanceOf[Done[T]]
  }
  
  extension [Self <: Done[?], T /* <: js.typedarray.ArrayBufferView */](x: Self & Done[T]) {
    
    inline def setDone(value: `false`): Self = StObject.set(x, "done", value.asInstanceOf[js.Any])
    
    inline def setValue(value: T): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
  }
}
