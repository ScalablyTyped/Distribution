package typings.mendixmodelsdk

import typings.std.Extract
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("mendixmodelsdk/dist/sdk/internal/EventEmitter", JSImport.Namespace)
@js.native
object eventEmitterMod extends js.Object {
  @js.native
  class EventEmitter[T] () extends js.Object {
    var eventEmitter: js.Any = js.native
    def emit[E /* <: Extract[String, String] */](
      eventType: E,
      value: /* import warning: importer.ImportType#apply Failed type conversion: T[E] */ js.Any
    ): Unit = js.native
    def on[E /* <: Extract[String, String] */](
      eventType: E,
      callback: js.Function1[
          /* import warning: importer.ImportType#apply Failed type conversion: T[E] */ /* data */ js.Any, 
          Unit
        ]
    ): Unit = js.native
  }
  
}

