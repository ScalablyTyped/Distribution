package typings
package nodeLib.streamMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

// Note: Duplex extends both Readable and Writable.
@JSImport("stream", "Duplex")
@js.native
class Duplex ()
  extends nodeLib.streamMod.internalNs.Duplex {
  def this(opts: nodeLib.streamMod.internalNs.DuplexOptions) = this()
}

