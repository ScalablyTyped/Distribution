package typings.next.anon

import typings.next.nextBooleans.`true`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Value[T /* <: js.typedarray.ArrayBufferView */] extends StObject {
  
  var done: `true`
  
  var value: js.UndefOr[T] = js.undefined
}
object Value {
  
  inline def apply[T /* <: js.typedarray.ArrayBufferView */](): Value[T] = {
    val __obj = js.Dynamic.literal(done = true)
    __obj.asInstanceOf[Value[T]]
  }
  
  extension [Self <: Value[?], T /* <: js.typedarray.ArrayBufferView */](x: Self & Value[T]) {
    
    inline def setDone(value: `true`): Self = StObject.set(x, "done", value.asInstanceOf[js.Any])
    
    inline def setValue(value: T): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    
    inline def setValueUndefined: Self = StObject.set(x, "value", js.undefined)
  }
}
