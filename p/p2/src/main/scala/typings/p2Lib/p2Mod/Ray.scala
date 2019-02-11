package typings
package p2Lib.p2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("p2", "Ray")
@js.native
class Ray ()
  extends p2Lib.p2Mod.p2Ns.Ray {
  def this(options: p2Lib.p2Mod.p2Ns.RayOptions) = this()
  /* CompleteClass */
  override var checkCollisionResponse: scala.Boolean = js.native
  /* CompleteClass */
  override var collisionGroup: scala.Double = js.native
  /* CompleteClass */
  override var collisionMask: scala.Double = js.native
  /* CompleteClass */
  override var direction: js.Tuple2[scala.Double, scala.Double] = js.native
  /* CompleteClass */
  override var from: js.Tuple2[scala.Double, scala.Double] = js.native
  /* CompleteClass */
  override var length: scala.Double = js.native
  /* CompleteClass */
  override var mode: scala.Double = js.native
  /* CompleteClass */
  override var skipBackfaces: scala.Boolean = js.native
  /* CompleteClass */
  override var to: js.Tuple2[scala.Double, scala.Double] = js.native
  /* CompleteClass */
  override def callback(result: p2Lib.p2Mod.p2Ns.RaycastResult): scala.Unit = js.native
  /* CompleteClass */
  override def getAABB(): p2Lib.p2Mod.p2Ns.AABB = js.native
  /* CompleteClass */
  override def intersectBodies(result: p2Lib.p2Mod.p2Ns.RaycastResult, bodies: js.Array[p2Lib.p2Mod.p2Ns.Body]): scala.Unit = js.native
  /* CompleteClass */
  override def update(): scala.Unit = js.native
}

/* static members */
@JSImport("p2", "Ray")
@js.native
object Ray extends js.Object {
  var ALL: scala.Double = js.native
  var ANY: scala.Double = js.native
  var CLOSEST: scala.Double = js.native
}

