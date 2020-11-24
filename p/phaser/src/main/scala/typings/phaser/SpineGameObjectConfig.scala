package typings.phaser

import typings.phaser.Phaser.Types.GameObjects.GameObjectConfig
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SpineGameObjectConfig extends GameObjectConfig {
  
  var animationName: js.UndefOr[String] = js.native
  
  var attachmentName: js.UndefOr[String] = js.native
  
  var key: js.UndefOr[String] = js.native
  
  var loop: js.UndefOr[Boolean] = js.native
  
  var skinName: js.UndefOr[String] = js.native
  
  var slotName: js.UndefOr[String] = js.native
}
object SpineGameObjectConfig {
  
  @scala.inline
  def apply(): SpineGameObjectConfig = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SpineGameObjectConfig]
  }
  
  @scala.inline
  implicit class SpineGameObjectConfigOps[Self <: SpineGameObjectConfig] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setAnimationName(value: String): Self = this.set("animationName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAnimationName: Self = this.set("animationName", js.undefined)
    
    @scala.inline
    def setAttachmentName(value: String): Self = this.set("attachmentName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAttachmentName: Self = this.set("attachmentName", js.undefined)
    
    @scala.inline
    def setKey(value: String): Self = this.set("key", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteKey: Self = this.set("key", js.undefined)
    
    @scala.inline
    def setLoop(value: Boolean): Self = this.set("loop", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLoop: Self = this.set("loop", js.undefined)
    
    @scala.inline
    def setSkinName(value: String): Self = this.set("skinName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSkinName: Self = this.set("skinName", js.undefined)
    
    @scala.inline
    def setSlotName(value: String): Self = this.set("slotName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSlotName: Self = this.set("slotName", js.undefined)
  }
}
