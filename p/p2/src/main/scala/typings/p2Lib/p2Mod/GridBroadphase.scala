package typings
package p2Lib.p2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("p2", "GridBroadphase")
@js.native
class GridBroadphase ()
  extends p2Lib.p2Mod.p2Ns.GridBroadphase {
  def this(options: p2Lib.Anon_Nx) = this()
  /* CompleteClass */
  override var binsizeX: scala.Double = js.native
  /* CompleteClass */
  override var binsizeY: scala.Double = js.native
  /* CompleteClass */
  override var boundingVolumeType: scala.Double = js.native
  /* CompleteClass */
  override var nx: scala.Double = js.native
  /* CompleteClass */
  override var ny: scala.Double = js.native
  /* CompleteClass */
  override var result: js.Array[p2Lib.p2Mod.p2Ns.Body] = js.native
  /* CompleteClass */
  override var `type`: scala.Double = js.native
  /* CompleteClass */
  override var world: p2Lib.p2Mod.p2Ns.World = js.native
  /* CompleteClass */
  override var xmax: scala.Double = js.native
  /* CompleteClass */
  override var xmin: scala.Double = js.native
  /* CompleteClass */
  override var ymax: scala.Double = js.native
  /* CompleteClass */
  override var ymin: scala.Double = js.native
  /* CompleteClass */
  override def boundingVolumeCheck(bodyA: p2Lib.p2Mod.p2Ns.Body, bodyB: p2Lib.p2Mod.p2Ns.Body): scala.Boolean = js.native
  /* CompleteClass */
  override def getCollisionPairs(world: p2Lib.p2Mod.p2Ns.World): js.Array[p2Lib.p2Mod.p2Ns.Body] = js.native
  /* CompleteClass */
  override def setWorld(world: p2Lib.p2Mod.p2Ns.World): scala.Unit = js.native
}

