package typings.mendixmodelsdk

import typings.std.Extract
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("mendixmodelsdk/dist/sdk/internal/EventEmitter", JSImport.Namespace)
@js.native
object eventEmitterMod extends js.Object {
  
  @js.native
  class EventEmitter[T] () extends js.Object {
    
    def emit[E /* <: Extract[/* keyof T */ String, String] */](
      eventType: E,
      value: /* import warning: importer.ImportType#apply Failed type conversion: T[E] */ js.Any
    ): Unit = js.native
    
    var eventEmitter: js.Any = js.native
    
    def on[E /* <: Extract[/* keyof T */ String, String] */](
      eventType: E,
      callback: js.Function1[
          /* import warning: importer.ImportType#apply Failed type conversion: T[E] */ /* data */ js.Any, 
          Unit
        ]
    ): Unit = js.native
  }
}
