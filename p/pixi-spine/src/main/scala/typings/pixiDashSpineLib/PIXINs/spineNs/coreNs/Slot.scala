package typings
package pixiDashSpineLib.PIXINs.spineNs.coreNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("PIXI.spine.core.Slot")
@js.native
class Slot protected () extends js.Object {
  def this(data: SlotData, bone: Bone) = this()
  var attachment: Attachment = js.native
  var attachmentTime: js.Any = js.native
  var attachmentVertices: js.Array[scala.Double] = js.native
  var blendMode: scala.Double = js.native
  var bone: Bone = js.native
  var clippingContainer: js.Any = js.native
  var color: Color = js.native
  var currentGraphics: js.Any = js.native
  var currentMesh: js.Any = js.native
  var currentMeshName: java.lang.String = js.native
  var currentSprite: js.Any = js.native
  var currentSpriteName: java.lang.String = js.native
  var darkColor: Color = js.native
  var data: SlotData = js.native
  var meshes: js.Any = js.native
  var sprites: js.Any = js.native
  var tempAttachment: Attachment = js.native
  var tempRegion: TextureRegion = js.native
  def getAttachment(): Attachment = js.native
  def getAttachmentTime(): scala.Double = js.native
  def setAttachment(attachment: Attachment): scala.Unit = js.native
  def setAttachmentTime(time: scala.Double): scala.Unit = js.native
  def setToSetupPose(): scala.Unit = js.native
}

