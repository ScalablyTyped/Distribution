package typings
package phaserLib.spineNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("spine.PointAttachment")
@js.native
class PointAttachment protected () extends VertexAttachment {
  def this(name: java.lang.String) = this()
  var color: Color = js.native
  var rotation: scala.Double = js.native
  var x: scala.Double = js.native
  var y: scala.Double = js.native
  def computeWorldPosition(bone: Bone, point: Vector2): Vector2 = js.native
  def computeWorldRotation(bone: Bone): scala.Double = js.native
}

