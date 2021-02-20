package typings.mendixmodelsdk

import typings.std.Extract
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object eventEmitterMod {
  
  @JSImport("mendixmodelsdk/dist/sdk/internal/EventEmitter", "EventEmitter")
  @js.native
  class EventEmitter[T] () extends StObject {
    
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
