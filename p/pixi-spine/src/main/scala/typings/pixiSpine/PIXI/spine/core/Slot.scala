package typings.pixiSpine.PIXI.spine.core

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Slot extends js.Object {
  var attachment: js.Any
  var attachmentTime: js.Any
  var blendMode: Double
  var bone: Bone
  var clippingContainer: js.Any
  var color: Color
  var currentGraphics: js.Any
  var currentMesh: js.Any
  var currentMeshName: String
  var currentSprite: js.Any
  var currentSpriteName: String
  var darkColor: Color
  var data: SlotData
  var deform: js.Array[Double]
  var hackAttachment: Attachment
  var hackRegion: TextureRegion
  var meshes: js.Any
  var sprites: js.Any
  def getAttachment(): Attachment
  def getAttachmentTime(): Double
  def setAttachment(attachment: Attachment): Unit
  def setAttachmentTime(time: Double): Unit
  def setToSetupPose(): Unit
}

object Slot {
  @scala.inline
  def apply(
    attachment: js.Any,
    attachmentTime: js.Any,
    blendMode: Double,
    bone: Bone,
    clippingContainer: js.Any,
    color: Color,
    currentGraphics: js.Any,
    currentMesh: js.Any,
    currentMeshName: String,
    currentSprite: js.Any,
    currentSpriteName: String,
    darkColor: Color,
    data: SlotData,
    deform: js.Array[Double],
    getAttachment: () => Attachment,
    getAttachmentTime: () => Double,
    hackAttachment: Attachment,
    hackRegion: TextureRegion,
    meshes: js.Any,
    setAttachment: Attachment => Unit,
    setAttachmentTime: Double => Unit,
    setToSetupPose: () => Unit,
    sprites: js.Any
  ): Slot = {
    val __obj = js.Dynamic.literal(attachment = attachment.asInstanceOf[js.Any], attachmentTime = attachmentTime.asInstanceOf[js.Any], blendMode = blendMode.asInstanceOf[js.Any], bone = bone.asInstanceOf[js.Any], clippingContainer = clippingContainer.asInstanceOf[js.Any], color = color.asInstanceOf[js.Any], currentGraphics = currentGraphics.asInstanceOf[js.Any], currentMesh = currentMesh.asInstanceOf[js.Any], currentMeshName = currentMeshName.asInstanceOf[js.Any], currentSprite = currentSprite.asInstanceOf[js.Any], currentSpriteName = currentSpriteName.asInstanceOf[js.Any], darkColor = darkColor.asInstanceOf[js.Any], data = data.asInstanceOf[js.Any], deform = deform.asInstanceOf[js.Any], getAttachment = js.Any.fromFunction0(getAttachment), getAttachmentTime = js.Any.fromFunction0(getAttachmentTime), hackAttachment = hackAttachment.asInstanceOf[js.Any], hackRegion = hackRegion.asInstanceOf[js.Any], meshes = meshes.asInstanceOf[js.Any], setAttachment = js.Any.fromFunction1(setAttachment), setAttachmentTime = js.Any.fromFunction1(setAttachmentTime), setToSetupPose = js.Any.fromFunction0(setToSetupPose), sprites = sprites.asInstanceOf[js.Any])
    __obj.asInstanceOf[Slot]
  }
}

