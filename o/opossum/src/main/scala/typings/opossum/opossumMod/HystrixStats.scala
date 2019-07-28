package typings.opossum.opossumMod

import typings.node.streamMod.Transform
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("opossum", "HystrixStats")
@js.native
class HystrixStats protected () extends js.Object {
  def this(circuit: CircuitBreaker) = this()
  def getHystrixStream(): Transform = js.native
}

