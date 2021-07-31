package typings.phaser.spine

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SlotData extends StObject {
  
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
  
  @scala.inline
  implicit class SlotDataMutableBuilder[Self <: SlotData] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAttachmentName(value: String): Self = StObject.set(x, "attachmentName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBlendMode(value: BlendMode): Self = StObject.set(x, "blendMode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBoneData(value: BoneData): Self = StObject.set(x, "boneData", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setColor(value: Color): Self = StObject.set(x, "color", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDarkColor(value: Color): Self = StObject.set(x, "darkColor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIndex(value: Double): Self = StObject.set(x, "index", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
  }
}
