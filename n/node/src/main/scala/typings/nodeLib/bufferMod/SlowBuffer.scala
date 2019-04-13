package typings
package nodeLib.bufferMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("buffer", "SlowBuffer")
@js.native
class SlowBuffer protected ()
  extends nodeLib.Buffer {
  /** @deprecated since v6.0.0, use Buffer.allocUnsafeSlow() */
  def this(size: scala.Double) = this()
}

@JSImport("buffer", "SlowBuffer")
@js.native
object SlowBuffer
  extends /** @deprecated since v6.0.0, use Buffer.allocUnsafeSlow() */
org.scalablytyped.runtime.Instantiable1[/* size */ scala.Double, nodeLib.Buffer]

