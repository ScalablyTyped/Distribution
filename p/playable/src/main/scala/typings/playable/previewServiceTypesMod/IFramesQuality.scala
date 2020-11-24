package typings.playable.previewServiceTypesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IFramesQuality extends js.Object {
  
  var frameSize: IFrameSize = js.native
  
  var framesInSprite: IMaxFramesInSprite = js.native
  
  var spriteUrlMask: String = js.native
}
object IFramesQuality {
  
  @scala.inline
  def apply(frameSize: IFrameSize, framesInSprite: IMaxFramesInSprite, spriteUrlMask: String): IFramesQuality = {
    val __obj = js.Dynamic.literal(frameSize = frameSize.asInstanceOf[js.Any], framesInSprite = framesInSprite.asInstanceOf[js.Any], spriteUrlMask = spriteUrlMask.asInstanceOf[js.Any])
    __obj.asInstanceOf[IFramesQuality]
  }
  
  @scala.inline
  implicit class IFramesQualityOps[Self <: IFramesQuality] (val x: Self) extends AnyVal {
    
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
    def setFrameSize(value: IFrameSize): Self = this.set("frameSize", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFramesInSprite(value: IMaxFramesInSprite): Self = this.set("framesInSprite", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSpriteUrlMask(value: String): Self = this.set("spriteUrlMask", value.asInstanceOf[js.Any])
  }
}
