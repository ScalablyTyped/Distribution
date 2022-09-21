package typings.pixiSpineBase.mod

import typings.pixiConstants.mod.BLEND_MODES
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ISlotData extends StObject {
  
  var attachmentName: String
  
  var blendMode: BLEND_MODES
  
  var boneData: IBoneData
  
  var color: Color
  
  var darkColor: Color
  
  var index: Double
  
  var name: String
}
object ISlotData {
  
  inline def apply(
    attachmentName: String,
    blendMode: BLEND_MODES,
    boneData: IBoneData,
    color: Color,
    darkColor: Color,
    index: Double,
    name: String
  ): ISlotData = {
    val __obj = js.Dynamic.literal(attachmentName = attachmentName.asInstanceOf[js.Any], blendMode = blendMode.asInstanceOf[js.Any], boneData = boneData.asInstanceOf[js.Any], color = color.asInstanceOf[js.Any], darkColor = darkColor.asInstanceOf[js.Any], index = index.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[ISlotData]
  }
  
  extension [Self <: ISlotData](x: Self) {
    
    inline def setAttachmentName(value: String): Self = StObject.set(x, "attachmentName", value.asInstanceOf[js.Any])
    
    inline def setBlendMode(value: BLEND_MODES): Self = StObject.set(x, "blendMode", value.asInstanceOf[js.Any])
    
    inline def setBoneData(value: IBoneData): Self = StObject.set(x, "boneData", value.asInstanceOf[js.Any])
    
    inline def setColor(value: Color): Self = StObject.set(x, "color", value.asInstanceOf[js.Any])
    
    inline def setDarkColor(value: Color): Self = StObject.set(x, "darkColor", value.asInstanceOf[js.Any])
    
    inline def setIndex(value: Double): Self = StObject.set(x, "index", value.asInstanceOf[js.Any])
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
  }
}
