package typings
package pixiDashSpineLib.PIXINs.spineNs.coreNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("PIXI.spine.core.PointAttachment")
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

