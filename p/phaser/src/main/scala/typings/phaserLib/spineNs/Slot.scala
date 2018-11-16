package typings
package phaserLib.spineNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("spine.Slot")
@js.native
class Slot protected () extends js.Object {
  def this(data: SlotData, bone: Bone) = this()
  var attachment: js.Any = js.native
  var attachmentTime: js.Any = js.native
  var attachmentVertices: js.Array[scala.Double] = js.native
  var bone: Bone = js.native
  var color: Color = js.native
  var darkColor: Color = js.native
  var data: SlotData = js.native
  def getAttachment(): Attachment = js.native
  def getAttachmentTime(): scala.Double = js.native
  def setAttachment(attachment: Attachment): scala.Unit = js.native
  def setAttachmentTime(time: scala.Double): scala.Unit = js.native
  def setToSetupPose(): scala.Unit = js.native
}

