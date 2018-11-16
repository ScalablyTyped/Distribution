package typings
package phaserLib.spineNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("spine.SkeletonJson")
@js.native
class SkeletonJson protected () extends js.Object {
  def this(attachmentLoader: AttachmentLoader) = this()
  var attachmentLoader: AttachmentLoader = js.native
  var linkedMeshes: js.Any = js.native
  var scale: scala.Double = js.native
  def getValue(map: js.Any, prop: java.lang.String, defaultValue: js.Any): js.Any = js.native
  def readAnimation(map: js.Any, name: java.lang.String, skeletonData: SkeletonData): scala.Unit = js.native
  def readAttachment(
    map: js.Any,
    skin: Skin,
    slotIndex: scala.Double,
    name: java.lang.String,
    skeletonData: SkeletonData
  ): Attachment = js.native
  def readCurve(map: js.Any, timeline: CurveTimeline, frameIndex: scala.Double): scala.Unit = js.native
  def readSkeletonData(json: java.lang.String): SkeletonData = js.native
  def readSkeletonData(json: js.Any): SkeletonData = js.native
  def readVertices(map: js.Any, attachment: VertexAttachment, verticesLength: scala.Double): scala.Unit = js.native
}

@JSGlobal("spine.SkeletonJson")
@js.native
object SkeletonJson extends js.Object {
  def blendModeFromString(str: java.lang.String): phaserLib.spineNs.BlendMode = js.native
  def positionModeFromString(str: java.lang.String): phaserLib.spineNs.PositionMode = js.native
  def rotateModeFromString(str: java.lang.String): phaserLib.spineNs.RotateMode = js.native
  def spacingModeFromString(str: java.lang.String): phaserLib.spineNs.SpacingMode = js.native
  def transformModeFromString(str: java.lang.String): phaserLib.spineNs.TransformMode = js.native
}

