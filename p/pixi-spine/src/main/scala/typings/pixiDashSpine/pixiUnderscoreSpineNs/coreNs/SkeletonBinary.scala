package typings.pixiDashSpine.pixiUnderscoreSpineNs.coreNs

import typings.std.Uint8Array
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("pixi_spine.core.SkeletonBinary")
@js.native
class SkeletonBinary protected () extends js.Object {
  def this(attachmentLoader: /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify AttachmentLoader */ js.Any) = this()
  var attachmentLoader: /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify AttachmentLoader */ js.Any = js.native
  var linkedMeshes: js.Any = js.native
  var readAnimation: js.Any = js.native
  var readAttachment: js.Any = js.native
  var readCurve: js.Any = js.native
  var readFloatArray: js.Any = js.native
  var readShortArray: js.Any = js.native
  var readSkin: js.Any = js.native
  var readVertices: js.Any = js.native
  var scale: Double = js.native
  def readSkeletonData(binary: Uint8Array): js.Any = js.native
  def setCurve(
    timeline: /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify CurveTimeline */ js.Any,
    frameIndex: Double,
    cx1: Double,
    cy1: Double,
    cx2: Double,
    cy2: Double
  ): Unit = js.native
}

/* static members */
@JSGlobal("pixi_spine.core.SkeletonBinary")
@js.native
object SkeletonBinary extends js.Object {
  var AttachmentTypeValues: js.Array[Double] = js.native
  var BONE_ROTATE: Double = js.native
  var BONE_SCALE: Double = js.native
  var BONE_SHEAR: Double = js.native
  var BONE_TRANSLATE: Double = js.native
  var BlendModeValues: js.Array[
    /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify BlendMode */ _
  ] = js.native
  var CURVE_BEZIER: Double = js.native
  var CURVE_LINEAR: Double = js.native
  var CURVE_STEPPED: Double = js.native
  var PATH_MIX: Double = js.native
  var PATH_POSITION: Double = js.native
  var PATH_SPACING: Double = js.native
  var PositionModeValues: js.Array[
    /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify PositionMode */ _
  ] = js.native
  var RotateModeValues: js.Array[
    /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify RotateMode */ _
  ] = js.native
  var SLOT_ATTACHMENT: Double = js.native
  var SLOT_COLOR: Double = js.native
  var SLOT_TWO_COLOR: Double = js.native
  var SpacingModeValues: js.Array[
    /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify SpacingMode */ _
  ] = js.native
  var TransformModeValues: js.Array[
    /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify TransformMode */ _
  ] = js.native
}

