package typings.pixiJs.PIXI.AnimatedSprite

import typings.pixiJs.PIXI.Texture
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * @memberof PIXI.AnimatedSprite
  * @typedef {object} FrameObject
  * @type {object}
  * @property {PIXI.Texture} texture - The {@link PIXI.Texture} of the frame
  * @property {number} time - the duration of the frame in ms
  */
@js.native
trait FrameObject extends js.Object {
  
  var texture: Texture = js.native
  
  var time: Double = js.native
}
object FrameObject {
  
  @scala.inline
  def apply(texture: Texture, time: Double): FrameObject = {
    val __obj = js.Dynamic.literal(texture = texture.asInstanceOf[js.Any], time = time.asInstanceOf[js.Any])
    __obj.asInstanceOf[FrameObject]
  }
  
  @scala.inline
  implicit class FrameObjectOps[Self <: FrameObject] (val x: Self) extends AnyVal {
    
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
    def setTexture(value: Texture): Self = this.set("texture", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTime(value: Double): Self = this.set("time", value.asInstanceOf[js.Any])
  }
}
