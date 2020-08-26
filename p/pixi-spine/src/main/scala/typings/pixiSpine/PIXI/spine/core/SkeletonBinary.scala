package typings.pixiSpine.PIXI.spine.core

import typings.std.Uint8Array
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SkeletonBinary extends js.Object {
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

object SkeletonBinary {
  @scala.inline
  def apply(
    attachmentLoader: AttachmentLoader,
    linkedMeshes: js.Any,
    readAnimation: js.Any,
    readAttachment: js.Any,
    readCurve: js.Any,
    readFloatArray: js.Any,
    readShortArray: js.Any,
    readSkeletonData: Uint8Array => SkeletonData,
    readSkin: js.Any,
    readVertices: js.Any,
    scale: Double,
    setCurve: (CurveTimeline, Double, Double, Double, Double, Double) => Unit
  ): SkeletonBinary = {
    val __obj = js.Dynamic.literal(attachmentLoader = attachmentLoader.asInstanceOf[js.Any], linkedMeshes = linkedMeshes.asInstanceOf[js.Any], readAnimation = readAnimation.asInstanceOf[js.Any], readAttachment = readAttachment.asInstanceOf[js.Any], readCurve = readCurve.asInstanceOf[js.Any], readFloatArray = readFloatArray.asInstanceOf[js.Any], readShortArray = readShortArray.asInstanceOf[js.Any], readSkeletonData = js.Any.fromFunction1(readSkeletonData), readSkin = readSkin.asInstanceOf[js.Any], readVertices = readVertices.asInstanceOf[js.Any], scale = scale.asInstanceOf[js.Any], setCurve = js.Any.fromFunction6(setCurve))
    __obj.asInstanceOf[SkeletonBinary]
  }
  @scala.inline
  implicit class SkeletonBinaryOps[Self <: SkeletonBinary] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setAttachmentLoader(value: AttachmentLoader): Self = this.set("attachmentLoader", value.asInstanceOf[js.Any])
    @scala.inline
    def setLinkedMeshes(value: js.Any): Self = this.set("linkedMeshes", value.asInstanceOf[js.Any])
    @scala.inline
    def setReadAnimation(value: js.Any): Self = this.set("readAnimation", value.asInstanceOf[js.Any])
    @scala.inline
    def setReadAttachment(value: js.Any): Self = this.set("readAttachment", value.asInstanceOf[js.Any])
    @scala.inline
    def setReadCurve(value: js.Any): Self = this.set("readCurve", value.asInstanceOf[js.Any])
    @scala.inline
    def setReadFloatArray(value: js.Any): Self = this.set("readFloatArray", value.asInstanceOf[js.Any])
    @scala.inline
    def setReadShortArray(value: js.Any): Self = this.set("readShortArray", value.asInstanceOf[js.Any])
    @scala.inline
    def setReadSkeletonData(value: Uint8Array => SkeletonData): Self = this.set("readSkeletonData", js.Any.fromFunction1(value))
    @scala.inline
    def setReadSkin(value: js.Any): Self = this.set("readSkin", value.asInstanceOf[js.Any])
    @scala.inline
    def setReadVertices(value: js.Any): Self = this.set("readVertices", value.asInstanceOf[js.Any])
    @scala.inline
    def setScale(value: Double): Self = this.set("scale", value.asInstanceOf[js.Any])
    @scala.inline
    def setSetCurve(value: (CurveTimeline, Double, Double, Double, Double, Double) => Unit): Self = this.set("setCurve", js.Any.fromFunction6(value))
  }
  
}

