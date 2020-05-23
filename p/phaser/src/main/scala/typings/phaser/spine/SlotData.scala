package typings.phaser.spine

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SlotData extends js.Object {
  var attachmentName: String
  var blendMode: BlendMode
  var boneData: BoneData
  var color: Color
  var darkColor: Color
  var index: Double
  var name: String
}

object SlotData {
  @scala.inline
  def apply(
    attachmentName: String,
    blendMode: BlendMode,
    boneData: BoneData,
    color: Color,
    darkColor: Color,
    index: Double,
    name: String
  ): SlotData = {
    val __obj = js.Dynamic.literal(attachmentName = attachmentName.asInstanceOf[js.Any], blendMode = blendMode.asInstanceOf[js.Any], boneData = boneData.asInstanceOf[js.Any], color = color.asInstanceOf[js.Any], darkColor = darkColor.asInstanceOf[js.Any], index = index.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[SlotData]
  }
}

