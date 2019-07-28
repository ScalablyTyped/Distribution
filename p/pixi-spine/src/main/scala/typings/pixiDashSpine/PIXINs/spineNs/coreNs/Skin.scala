package typings.pixiDashSpine.PIXINs.spineNs.coreNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("PIXI.spine.core.Skin")
@js.native
class Skin protected () extends js.Object {
  def this(name: String) = this()
  var attachments: js.Array[Map[Attachment]] = js.native
  var name: String = js.native
  def addAttachment(slotIndex: Double, name: String, attachment: Attachment): Unit = js.native
  def attachAll(skeleton: Skeleton, oldSkin: Skin): Unit = js.native
  def getAttachment(slotIndex: Double, name: String): Attachment = js.native
}

