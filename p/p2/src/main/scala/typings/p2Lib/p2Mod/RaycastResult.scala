package typings
package p2Lib.p2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("p2", "RaycastResult")
@js.native
class RaycastResult ()
  extends p2Lib.p2Mod.p2Ns.RaycastResult {
  /* CompleteClass */
  override var body: p2Lib.p2Mod.p2Ns.Body = js.native
  /* CompleteClass */
  override var faceIndex: scala.Double = js.native
  /* CompleteClass */
  override var fraction: scala.Double = js.native
  /* CompleteClass */
  override var isStopped: scala.Boolean = js.native
  /* CompleteClass */
  override var normal: js.Tuple2[scala.Double, scala.Double] = js.native
  /* CompleteClass */
  override var shape: p2Lib.p2Mod.p2Ns.Shape = js.native
  /* CompleteClass */
  override def getHitDistance(ray: p2Lib.p2Mod.p2Ns.Ray): scala.Double = js.native
  /* CompleteClass */
  override def getHitPoint(out: js.Tuple2[scala.Double, scala.Double], ray: p2Lib.p2Mod.p2Ns.Ray): scala.Unit = js.native
  /* CompleteClass */
  override def hasHit(): scala.Boolean = js.native
  /* CompleteClass */
  override def reset(): scala.Unit = js.native
  /* CompleteClass */
  override def set(
    normal: js.Tuple2[scala.Double, scala.Double],
    shape: p2Lib.p2Mod.p2Ns.Shape,
    body: p2Lib.p2Mod.p2Ns.Body,
    friction: scala.Double,
    faceIndex: scala.Double
  ): scala.Unit = js.native
  /* CompleteClass */
  override def shouldStop(ray: p2Lib.p2Mod.p2Ns.Ray): scala.Boolean = js.native
  /* CompleteClass */
  override def stop(): scala.Unit = js.native
}

