package typings.node.streamWebMod

import typings.node.nodeBooleans.`true`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ReadableStreamDefaultReadDoneResult
  extends StObject
     with ReadableStreamDefaultReadResult[Any] {
  
  var done: `true`
  
  var value: Unit
}
object ReadableStreamDefaultReadDoneResult {
  
  inline def apply(value: Unit): ReadableStreamDefaultReadDoneResult = {
    val __obj = js.Dynamic.literal(done = true, value = value.asInstanceOf[js.Any])
    __obj.asInstanceOf[ReadableStreamDefaultReadDoneResult]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ReadableStreamDefaultReadDoneResult] (val x: Self) extends AnyVal {
    
    inline def setDone(value: `true`): Self = StObject.set(x, "done", value.asInstanceOf[js.Any])
    
    inline def setValue(value: Unit): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
  }
}
