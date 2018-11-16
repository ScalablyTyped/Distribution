package typings
package p2Lib.p2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("p2", "OverlapKeeper")
@js.native
class OverlapKeeper protected ()
  extends p2Lib.p2Mod.p2Ns.OverlapKeeper {
  def this(bodyA: p2Lib.p2Mod.p2Ns.Body, shapeA: p2Lib.p2Mod.p2Ns.Shape, bodyB: p2Lib.p2Mod.p2Ns.Body, shapeB: p2Lib.p2Mod.p2Ns.Shape) = this()
  /* CompleteClass */
  override var bodyA: p2Lib.p2Mod.p2Ns.Body = js.native
  /* CompleteClass */
  override var bodyB: p2Lib.p2Mod.p2Ns.Body = js.native
  /* CompleteClass */
  override var shapeA: p2Lib.p2Mod.p2Ns.Shape = js.native
  /* CompleteClass */
  override var shapeB: p2Lib.p2Mod.p2Ns.Shape = js.native
  /* CompleteClass */
  override def bodiesAreOverlapping(bodyA: p2Lib.p2Mod.p2Ns.Body, bodyB: p2Lib.p2Mod.p2Ns.Body): scala.Boolean = js.native
  /* CompleteClass */
  override def set(
    bodyA: p2Lib.p2Mod.p2Ns.Body,
    shapeA: p2Lib.p2Mod.p2Ns.Shape,
    bodyB: p2Lib.p2Mod.p2Ns.Body,
    shapeB: p2Lib.p2Mod.p2Ns.Shape
  ): scala.Unit = js.native
  /* CompleteClass */
  override def setOverlapping(
    bodyA: p2Lib.p2Mod.p2Ns.Body,
    shapeA: p2Lib.p2Mod.p2Ns.Shape,
    bodyB: p2Lib.p2Mod.p2Ns.Body,
    shapeB: p2Lib.p2Mod.p2Ns.Body
  ): scala.Unit = js.native
  /* CompleteClass */
  override def tick(): scala.Unit = js.native
}

