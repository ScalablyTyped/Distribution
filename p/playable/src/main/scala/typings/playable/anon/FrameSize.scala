package typings.playable.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait FrameSize extends StObject {
  
  var frameSize: Height
  
  var framesInSprite: Horz
  
  var spriteUrlMask: String
}
object FrameSize {
  
  @scala.inline
  def apply(frameSize: Height, framesInSprite: Horz, spriteUrlMask: String): FrameSize = {
    val __obj = js.Dynamic.literal(frameSize = frameSize.asInstanceOf[js.Any], framesInSprite = framesInSprite.asInstanceOf[js.Any], spriteUrlMask = spriteUrlMask.asInstanceOf[js.Any])
    __obj.asInstanceOf[FrameSize]
  }
  
  @scala.inline
  implicit class FrameSizeMutableBuilder[Self <: FrameSize] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setFrameSize(value: Height): Self = StObject.set(x, "frameSize", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFramesInSprite(value: Horz): Self = StObject.set(x, "framesInSprite", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSpriteUrlMask(value: String): Self = StObject.set(x, "spriteUrlMask", value.asInstanceOf[js.Any])
  }
}
