package typings.phaser

import typings.phaser.Phaser.Types.GameObjects.GameObjectConfig
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SpineGameObjectConfig
  extends StObject
     with GameObjectConfig {
  
  var animationName: js.UndefOr[String] = js.undefined
  
  var attachmentName: js.UndefOr[String] = js.undefined
  
  var key: js.UndefOr[String] = js.undefined
  
  var loop: js.UndefOr[Boolean] = js.undefined
  
  var skinName: js.UndefOr[String] = js.undefined
  
  var slotName: js.UndefOr[String] = js.undefined
}
object SpineGameObjectConfig {
  
  @scala.inline
  def apply(): SpineGameObjectConfig = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SpineGameObjectConfig]
  }
  
  @scala.inline
  implicit class SpineGameObjectConfigMutableBuilder[Self <: SpineGameObjectConfig] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAnimationName(value: String): Self = StObject.set(x, "animationName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAnimationNameUndefined: Self = StObject.set(x, "animationName", js.undefined)
    
    @scala.inline
    def setAttachmentName(value: String): Self = StObject.set(x, "attachmentName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAttachmentNameUndefined: Self = StObject.set(x, "attachmentName", js.undefined)
    
    @scala.inline
    def setKey(value: String): Self = StObject.set(x, "key", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setKeyUndefined: Self = StObject.set(x, "key", js.undefined)
    
    @scala.inline
    def setLoop(value: Boolean): Self = StObject.set(x, "loop", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLoopUndefined: Self = StObject.set(x, "loop", js.undefined)
    
    @scala.inline
    def setSkinName(value: String): Self = StObject.set(x, "skinName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSkinNameUndefined: Self = StObject.set(x, "skinName", js.undefined)
    
    @scala.inline
    def setSlotName(value: String): Self = StObject.set(x, "slotName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSlotNameUndefined: Self = StObject.set(x, "slotName", js.undefined)
  }
}
