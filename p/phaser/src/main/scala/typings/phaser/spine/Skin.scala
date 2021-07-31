package typings.phaser.spine

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Skin extends StObject {
  
  def addSkin(skin: Skin): Unit
  
  def attachAll(skeleton: Skeleton, oldSkin: Skin): Unit
  
  var attachments: js.Array[Map[Attachment]]
  
  var bones: js.Array[BoneData]
  
  def clear(): Unit
  
  var constraints: js.Array[ConstraintData]
  
  def copySkin(skin: Skin): Unit
  
  def getAttachment(slotIndex: Double, name: String): Attachment
  
  def getAttachments(): js.Array[SkinEntry]
  
  def getAttachmentsForSlot(slotIndex: Double, attachments: js.Array[SkinEntry]): Unit
  
  var name: String
  
  def removeAttachment(slotIndex: Double, name: String): Unit
  
  def setAttachment(slotIndex: Double, name: String, attachment: Attachment): Unit
}
object Skin {
  
  @scala.inline
  def apply(
    addSkin: Skin => Unit,
    attachAll: (Skeleton, Skin) => Unit,
    attachments: js.Array[Map[Attachment]],
    bones: js.Array[BoneData],
    clear: () => Unit,
    constraints: js.Array[ConstraintData],
    copySkin: Skin => Unit,
    getAttachment: (Double, String) => Attachment,
    getAttachments: () => js.Array[SkinEntry],
    getAttachmentsForSlot: (Double, js.Array[SkinEntry]) => Unit,
    name: String,
    removeAttachment: (Double, String) => Unit,
    setAttachment: (Double, String, Attachment) => Unit
  ): Skin = {
    val __obj = js.Dynamic.literal(addSkin = js.Any.fromFunction1(addSkin), attachAll = js.Any.fromFunction2(attachAll), attachments = attachments.asInstanceOf[js.Any], bones = bones.asInstanceOf[js.Any], clear = js.Any.fromFunction0(clear), constraints = constraints.asInstanceOf[js.Any], copySkin = js.Any.fromFunction1(copySkin), getAttachment = js.Any.fromFunction2(getAttachment), getAttachments = js.Any.fromFunction0(getAttachments), getAttachmentsForSlot = js.Any.fromFunction2(getAttachmentsForSlot), name = name.asInstanceOf[js.Any], removeAttachment = js.Any.fromFunction2(removeAttachment), setAttachment = js.Any.fromFunction3(setAttachment))
    __obj.asInstanceOf[Skin]
  }
  
  @scala.inline
  implicit class SkinMutableBuilder[Self <: Skin] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAddSkin(value: Skin => Unit): Self = StObject.set(x, "addSkin", js.Any.fromFunction1(value))
    
    @scala.inline
    def setAttachAll(value: (Skeleton, Skin) => Unit): Self = StObject.set(x, "attachAll", js.Any.fromFunction2(value))
    
    @scala.inline
    def setAttachments(value: js.Array[Map[Attachment]]): Self = StObject.set(x, "attachments", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAttachmentsVarargs(value: Map[Attachment]*): Self = StObject.set(x, "attachments", js.Array(value :_*))
    
    @scala.inline
    def setBones(value: js.Array[BoneData]): Self = StObject.set(x, "bones", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBonesVarargs(value: BoneData*): Self = StObject.set(x, "bones", js.Array(value :_*))
    
    @scala.inline
    def setClear(value: () => Unit): Self = StObject.set(x, "clear", js.Any.fromFunction0(value))
    
    @scala.inline
    def setConstraints(value: js.Array[ConstraintData]): Self = StObject.set(x, "constraints", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setConstraintsVarargs(value: ConstraintData*): Self = StObject.set(x, "constraints", js.Array(value :_*))
    
    @scala.inline
    def setCopySkin(value: Skin => Unit): Self = StObject.set(x, "copySkin", js.Any.fromFunction1(value))
    
    @scala.inline
    def setGetAttachment(value: (Double, String) => Attachment): Self = StObject.set(x, "getAttachment", js.Any.fromFunction2(value))
    
    @scala.inline
    def setGetAttachments(value: () => js.Array[SkinEntry]): Self = StObject.set(x, "getAttachments", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGetAttachmentsForSlot(value: (Double, js.Array[SkinEntry]) => Unit): Self = StObject.set(x, "getAttachmentsForSlot", js.Any.fromFunction2(value))
    
    @scala.inline
    def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRemoveAttachment(value: (Double, String) => Unit): Self = StObject.set(x, "removeAttachment", js.Any.fromFunction2(value))
    
    @scala.inline
    def setSetAttachment(value: (Double, String, Attachment) => Unit): Self = StObject.set(x, "setAttachment", js.Any.fromFunction3(value))
  }
}
