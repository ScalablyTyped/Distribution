package typings.pixiSpine.PIXI.spine.core

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("PIXI.spine.core.TransformConstraintData")
@js.native
class TransformConstraintData protected () extends ConstraintData {
  def this(name: String) = this()
  var bones: js.Array[BoneData] = js.native
  var local: Boolean = js.native
  var offsetRotation: Double = js.native
  var offsetScaleX: Double = js.native
  var offsetScaleY: Double = js.native
  var offsetShearY: Double = js.native
  var offsetX: Double = js.native
  var offsetY: Double = js.native
  var relative: Boolean = js.native
  var rotateMix: Double = js.native
  var scaleMix: Double = js.native
  var shearMix: Double = js.native
  var target: BoneData = js.native
  var translateMix: Double = js.native
}

