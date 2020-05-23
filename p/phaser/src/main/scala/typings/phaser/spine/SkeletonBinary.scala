package typings.phaser.spine

import typings.std.Uint8Array
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SkeletonBinary extends js.Object {
  var attachmentLoader: AttachmentLoader
  var linkedMeshes: js.Any
  var readAnimation: js.Any
  var readAttachment: js.Any
  var readCurve: js.Any
  var readFloatArray: js.Any
  var readShortArray: js.Any
  var readSkin: js.Any
  var readVertices: js.Any
  var scale: Double
  def readSkeletonData(binary: Uint8Array): SkeletonData
  def setCurve(timeline: CurveTimeline, frameIndex: Double, cx1: Double, cy1: Double, cx2: Double, cy2: Double): Unit
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
}

