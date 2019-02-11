package typings
package p2Lib.p2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("p2", "IslandManager")
@js.native
class IslandManager ()
  extends p2Lib.p2Mod.p2Ns.IslandManager {
  def this(options: p2Lib.p2Mod.p2Ns.IslandManagerOptions) = this()
}

/* static members */
@JSImport("p2", "IslandManager")
@js.native
object IslandManager extends js.Object {
  def getUnvisitedNode(nodes: js.Array[p2Lib.p2Mod.p2Ns.IslandNode]): p2Lib.p2Mod.p2Ns.IslandNode | scala.Boolean = js.native
}

