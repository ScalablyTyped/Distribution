package typings
package p2Lib.p2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("p2", "Ray")
@js.native
class Ray () extends js.Object {
  def this(options: RayOptions) = this()
  var checkCollisionResponse: scala.Boolean = js.native
  var collisionGroup: scala.Double = js.native
  var collisionMask: scala.Double = js.native
  var direction: js.Tuple2[scala.Double, scala.Double] = js.native
  var from: js.Tuple2[scala.Double, scala.Double] = js.native
  var length: scala.Double = js.native
  var mode: scala.Double = js.native
  var skipBackfaces: scala.Boolean = js.native
  var to: js.Tuple2[scala.Double, scala.Double] = js.native
  def callback(result: RaycastResult): scala.Unit = js.native
  def getAABB(): AABB = js.native
  def intersectBodies(result: RaycastResult, bodies: js.Array[Body]): scala.Unit = js.native
  def update(): scala.Unit = js.native
}

/* static members */
@JSImport("p2", "Ray")
@js.native
object Ray extends js.Object {
  var ALL: scala.Double = js.native
  var ANY: scala.Double = js.native
  var CLOSEST: scala.Double = js.native
}

