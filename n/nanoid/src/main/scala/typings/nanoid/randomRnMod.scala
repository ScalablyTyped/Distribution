package typings.nanoid

import typings.node.Buffer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("nanoid/async/random-rn", JSImport.Namespace)
@js.native
object randomRnMod extends js.Object {
  def apply(bytes: Double): js.Promise[Buffer] = js.native
}

