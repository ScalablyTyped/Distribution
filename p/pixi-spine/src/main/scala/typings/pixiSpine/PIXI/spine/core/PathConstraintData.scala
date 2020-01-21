package typings.pixiSpine.PIXI.spine.core

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("PIXI.spine.core.PathConstraintData")
@js.native
class PathConstraintData protected () extends ConstraintData {
  def this(name: String) = this()
  var bones: js.Array[BoneData] = js.native
  var offsetRotation: Double = js.native
  var position: Double = js.native
  var positionMode: PositionMode = js.native
  var rotateMix: Double = js.native
  var rotateMode: RotateMode = js.native
  var spacing: Double = js.native
  var spacingMode: SpacingMode = js.native
  var target: SlotData = js.native
  var translateMix: Double = js.native
}

