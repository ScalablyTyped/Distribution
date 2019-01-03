package typings
package opossumLib.opossumMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("opossum", "HystrixStats")
@js.native
class HystrixStats protected () extends js.Object {
  def this(circuit: CircuitBreaker) = this()
  def getHystrixStream(): nodeLib.streamMod.Transform = js.native
}

