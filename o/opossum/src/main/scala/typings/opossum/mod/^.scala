package typings.opossum.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("opossum", JSImport.Namespace)
@js.native
class ^[TI /* <: js.Array[_] */, TR] protected () extends CircuitBreaker[TI, TR] {
  def this(action: js.Function1[/* args */ TI, js.Promise[TR]]) = this()
  def this(action: js.Function1[/* args */ TI, js.Promise[TR]], options: Options) = this()
}

@JSImport("opossum", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  def isOurError(error: js.Any): Boolean = js.native
}

