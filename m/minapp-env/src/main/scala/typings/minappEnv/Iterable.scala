package typings.minappEnv

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Iterable[T] extends js.Object {
  @JSName(js.Symbol.iterator)
  var iterator: js.Function0[Iterator[T]] = js.native
}

