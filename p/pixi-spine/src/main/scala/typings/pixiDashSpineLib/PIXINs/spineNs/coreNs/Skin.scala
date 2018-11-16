package typings
package pixiDashSpineLib.PIXINs.spineNs.coreNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("PIXI.spine.core.Skin")
@js.native
class Skin protected () extends js.Object {
  def this(name: java.lang.String) = this()
  var attachments: js.Array[Map[Attachment]] = js.native
  var name: java.lang.String = js.native
  def addAttachment(slotIndex: scala.Double, name: java.lang.String, attachment: Attachment): scala.Unit = js.native
  def attachAll(skeleton: Skeleton, oldSkin: Skin): scala.Unit = js.native
  def getAttachment(slotIndex: scala.Double, name: java.lang.String): Attachment = js.native
}

