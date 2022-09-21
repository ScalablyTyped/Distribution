package typings.peekReadable

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object deferredMod {
  
  @JSImport("peek-readable/lib/Deferred", "Deferred")
  @js.native
  open class Deferred[T] () extends StObject {
    
    var promise: js.Promise[T] = js.native
    
    def reject(reason: Any): Unit = js.native
    
    def resolve(value: T): Unit = js.native
  }
}
