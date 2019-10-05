package typings.pixiDashSpine.PIXI.spine.core

import typings.std.Uint8Array
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("PIXI.spine.core.SkeletonBinary")
@js.native
class SkeletonBinary protected () extends js.Object {
  def this(attachmentLoader: AttachmentLoader) = this()
  var attachmentLoader: AttachmentLoader = js.native
  var linkedMeshes: js.Any = js.native
  var readAnimation: js.Any = js.native
  var readAttachment: js.Any = js.native
  var readCurve: js.Any = js.native
  var readFloatArray: js.Any = js.native
  var readShortArray: js.Any = js.native
  var readSkin: js.Any = js.native
  var readVertices: js.Any = js.native
  var scale: Double = js.native
  def readSkeletonData(binary: Uint8Array): SkeletonData = js.native
  def setCurve(timeline: CurveTimeline, frameIndex: Double, cx1: Double, cy1: Double, cx2: Double, cy2: Double): Unit = js.native
}

/* static members */
@JSGlobal("PIXI.spine.core.SkeletonBinary")
@js.native
object SkeletonBinary extends js.Object {
  var AttachmentTypeValues: js.Array[Double] = js.native
  var BONE_ROTATE: Double = js.native
  var BONE_SCALE: Double = js.native
  var BONE_SHEAR: Double = js.native
  var BONE_TRANSLATE: Double = js.native
  var BlendModeValues: js.Array[BlendMode] = js.native
  var CURVE_BEZIER: Double = js.native
  var CURVE_LINEAR: Double = js.native
  var CURVE_STEPPED: Double = js.native
  var PATH_MIX: Double = js.native
  var PATH_POSITION: Double = js.native
  var PATH_SPACING: Double = js.native
  var PositionModeValues: js.Array[PositionMode] = js.native
  var RotateModeValues: js.Array[RotateMode] = js.native
  var SLOT_ATTACHMENT: Double = js.native
  var SLOT_COLOR: Double = js.native
  var SLOT_TWO_COLOR: Double = js.native
  var SpacingModeValues: js.Array[SpacingMode] = js.native
  var TransformModeValues: js.Array[TransformMode] = js.native
}

