package typings.nanoevents.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("nanoevents", JSImport.Namespace)
@js.native
class ^[T /* <: js.Object */] () extends NanoEvents[T] {
  /* CompleteClass */
  override def emit[U /* <: String */](
    name: U,
    value: /* import warning: importer.ImportType#apply Failed type conversion: T[U] */ js.Any
  ): Unit = js.native
  /* CompleteClass */
  override def on[U /* <: String */](
    name: U,
    callBack: js.Function1[
      /* import warning: importer.ImportType#apply Failed type conversion: T[U] */ /* arg */ js.Any, 
      _
    ]
  ): js.Function0[Unit] = js.native
}

