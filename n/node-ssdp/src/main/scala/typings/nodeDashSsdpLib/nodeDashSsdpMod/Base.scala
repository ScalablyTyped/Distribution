package typings
package nodeDashSsdpLib.nodeDashSsdpMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("node-ssdp", "Base")
@js.native
abstract class Base ()
  extends nodeLib.eventsMod.EventEmitter {
  def this(opts: SsdpOptions) = this()
  def addUSN(device: java.lang.String): scala.Unit = js.native
}

