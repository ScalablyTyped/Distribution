package typings.node.bufferMod

import org.scalablytyped.runtime.Instantiable1
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("buffer", "SlowBuffer")
@js.native
class SlowBuffer protected ()
  extends typings.node.Buffer {
  /** @deprecated since v6.0.0, use Buffer.allocUnsafeSlow() */
  def this(size: Double) = this()
}

@JSImport("buffer", "SlowBuffer")
@js.native
object SlowBuffer
  extends /** @deprecated since v6.0.0, use Buffer.allocUnsafeSlow() */
Instantiable1[/* size */ Double, typings.node.Buffer]

