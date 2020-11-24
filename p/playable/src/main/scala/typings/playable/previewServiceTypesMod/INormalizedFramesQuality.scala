package typings.playable.previewServiceTypesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait INormalizedFramesQuality extends js.Object {
  
  var framePositionInSprite: IFramePositionInSprite = js.native
  
  var frameSize: IFrameSize = js.native
  
  var framesInSprite: ITotalFramesInSprite = js.native
  
  var spriteUrl: String = js.native
}
object INormalizedFramesQuality {
  
  @scala.inline
  def apply(
    framePositionInSprite: IFramePositionInSprite,
    frameSize: IFrameSize,
    framesInSprite: ITotalFramesInSprite,
    spriteUrl: String
  ): INormalizedFramesQuality = {
    val __obj = js.Dynamic.literal(framePositionInSprite = framePositionInSprite.asInstanceOf[js.Any], frameSize = frameSize.asInstanceOf[js.Any], framesInSprite = framesInSprite.asInstanceOf[js.Any], spriteUrl = spriteUrl.asInstanceOf[js.Any])
    __obj.asInstanceOf[INormalizedFramesQuality]
  }
  
  @scala.inline
  implicit class INormalizedFramesQualityOps[Self <: INormalizedFramesQuality] (val x: Self) extends AnyVal {
    
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
    def setFramePositionInSprite(value: IFramePositionInSprite): Self = this.set("framePositionInSprite", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFrameSize(value: IFrameSize): Self = this.set("frameSize", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFramesInSprite(value: ITotalFramesInSprite): Self = this.set("framesInSprite", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSpriteUrl(value: String): Self = this.set("spriteUrl", value.asInstanceOf[js.Any])
  }
}
