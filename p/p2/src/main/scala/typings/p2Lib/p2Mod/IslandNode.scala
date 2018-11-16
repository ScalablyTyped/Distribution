package typings
package p2Lib.p2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("p2", "IslandNode")
@js.native
class IslandNode protected ()
  extends p2Lib.p2Mod.p2Ns.IslandNode {
  def this(body: p2Lib.p2Mod.p2Ns.Body) = this()
  /* CompleteClass */
  override var body: p2Lib.p2Mod.p2Ns.Body = js.native
  /* CompleteClass */
  override var equations: js.Array[p2Lib.p2Mod.p2Ns.Equation] = js.native
  /* CompleteClass */
  override var neighbors: js.Array[p2Lib.p2Mod.p2Ns.IslandNode] = js.native
  /* CompleteClass */
  override var visited: scala.Boolean = js.native
  /* CompleteClass */
  override def reset(): scala.Unit = js.native
}

