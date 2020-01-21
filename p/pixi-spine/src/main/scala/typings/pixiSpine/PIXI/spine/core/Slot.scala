package typings.pixiSpine.PIXI.spine.core

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("PIXI.spine.core.Slot")
@js.native
class Slot protected () extends js.Object {
  def this(data: SlotData, bone: Bone) = this()
  var attachment: js.Any = js.native
  var attachmentTime: js.Any = js.native
  var blendMode: Double = js.native
  var bone: Bone = js.native
  var clippingContainer: js.Any = js.native
  var color: Color = js.native
  var currentGraphics: js.Any = js.native
  var currentMesh: js.Any = js.native
  var currentMeshName: String = js.native
  var currentSprite: js.Any = js.native
  var currentSpriteName: String = js.native
  var darkColor: Color = js.native
  var data: SlotData = js.native
  var deform: js.Array[Double] = js.native
  var hackAttachment: Attachment = js.native
  var hackRegion: TextureRegion = js.native
  var meshes: js.Any = js.native
  var sprites: js.Any = js.native
  def getAttachment(): Attachment = js.native
  def getAttachmentTime(): Double = js.native
  def setAttachment(attachment: Attachment): Unit = js.native
  def setAttachmentTime(time: Double): Unit = js.native
  def setToSetupPose(): Unit = js.native
}

