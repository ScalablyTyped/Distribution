package typings.pixiSpine.PIXI.spine.core

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("PIXI.spine.core.PointAttachment")
@js.native
class PointAttachment protected () extends VertexAttachment {
  def this(name: String) = this()
  var color: Color = js.native
  var rotation: Double = js.native
  var x: Double = js.native
  var y: Double = js.native
  def computeWorldPosition(bone: Bone, point: Vector2): Vector2 = js.native
  def computeWorldRotation(bone: Bone): Double = js.native
}

