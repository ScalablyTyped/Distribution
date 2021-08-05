package typings.phaser.spine

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Slot extends StObject {
  
  /* private */ var attachment: js.Any
  
  /* private */ var attachmentTime: js.Any
  
  var bone: Bone
  
  var color: Color
  
  var darkColor: Color
  
  var data: SlotData
  
  var deform: js.Array[Double]
  
  def getAttachment(): Attachment
  
  def getAttachmentTime(): Double
  
  def setAttachment(attachment: Attachment): Unit
  
  def setAttachmentTime(time: Double): Unit
  
  def setToSetupPose(): Unit
}
object Slot {
  
  inline def apply(
    attachment: js.Any,
    attachmentTime: js.Any,
    bone: Bone,
    color: Color,
    darkColor: Color,
    data: SlotData,
    deform: js.Array[Double],
    getAttachment: () => Attachment,
    getAttachmentTime: () => Double,
    setAttachment: Attachment => Unit,
    setAttachmentTime: Double => Unit,
    setToSetupPose: () => Unit
  ): Slot = {
    val __obj = js.Dynamic.literal(attachment = attachment.asInstanceOf[js.Any], attachmentTime = attachmentTime.asInstanceOf[js.Any], bone = bone.asInstanceOf[js.Any], color = color.asInstanceOf[js.Any], darkColor = darkColor.asInstanceOf[js.Any], data = data.asInstanceOf[js.Any], deform = deform.asInstanceOf[js.Any], getAttachment = js.Any.fromFunction0(getAttachment), getAttachmentTime = js.Any.fromFunction0(getAttachmentTime), setAttachment = js.Any.fromFunction1(setAttachment), setAttachmentTime = js.Any.fromFunction1(setAttachmentTime), setToSetupPose = js.Any.fromFunction0(setToSetupPose))
    __obj.asInstanceOf[Slot]
  }
  
  extension [Self <: Slot](x: Self) {
    
    inline def setAttachment(value: js.Any): Self = StObject.set(x, "attachment", value.asInstanceOf[js.Any])
    
    inline def setAttachmentTime(value: js.Any): Self = StObject.set(x, "attachmentTime", value.asInstanceOf[js.Any])
    
    inline def setBone(value: Bone): Self = StObject.set(x, "bone", value.asInstanceOf[js.Any])
    
    inline def setColor(value: Color): Self = StObject.set(x, "color", value.asInstanceOf[js.Any])
    
    inline def setDarkColor(value: Color): Self = StObject.set(x, "darkColor", value.asInstanceOf[js.Any])
    
    inline def setData(value: SlotData): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
    
    inline def setDeform(value: js.Array[Double]): Self = StObject.set(x, "deform", value.asInstanceOf[js.Any])
    
    inline def setDeformVarargs(value: Double*): Self = StObject.set(x, "deform", js.Array(value :_*))
    
    inline def setGetAttachment(value: () => Attachment): Self = StObject.set(x, "getAttachment", js.Any.fromFunction0(value))
    
    inline def setGetAttachmentTime(value: () => Double): Self = StObject.set(x, "getAttachmentTime", js.Any.fromFunction0(value))
    
    inline def setSetAttachment(value: Attachment => Unit): Self = StObject.set(x, "setAttachment", js.Any.fromFunction1(value))
    
    inline def setSetAttachmentTime(value: Double => Unit): Self = StObject.set(x, "setAttachmentTime", js.Any.fromFunction1(value))
    
    inline def setSetToSetupPose(value: () => Unit): Self = StObject.set(x, "setToSetupPose", js.Any.fromFunction0(value))
  }
}
