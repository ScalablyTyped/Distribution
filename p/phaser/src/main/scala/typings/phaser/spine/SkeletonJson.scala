package typings.phaser.spine

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SkeletonJson extends js.Object {
  var attachmentLoader: AttachmentLoader = js.native
  var linkedMeshes: js.Any = js.native
  var scale: Double = js.native
  def getValue(map: js.Any, prop: String, defaultValue: js.Any): js.Any = js.native
  def readAnimation(map: js.Any, name: String, skeletonData: SkeletonData): Unit = js.native
  def readAttachment(map: js.Any, skin: Skin, slotIndex: Double, name: String, skeletonData: SkeletonData): Attachment = js.native
  def readCurve(map: js.Any, timeline: CurveTimeline, frameIndex: Double): Unit = js.native
  def readSkeletonData(json: String): SkeletonData = js.native
  def readSkeletonData(json: js.Any): SkeletonData = js.native
  def readVertices(map: js.Any, attachment: VertexAttachment, verticesLength: Double): Unit = js.native
}

