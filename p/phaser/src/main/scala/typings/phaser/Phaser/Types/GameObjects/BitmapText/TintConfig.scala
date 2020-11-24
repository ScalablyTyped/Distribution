package typings.phaser.Phaser.Types.GameObjects.BitmapText

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TintConfig extends js.Object {
  
  /**
    * The bottom left tint value. Always zero in canvas.
    */
  var bottomLeft: Double = js.native
  
  /**
    * The bottom right tint value. Always zero in canvas.
    */
  var bottomRight: Double = js.native
  
  /**
    * The top left tint value. Always zero in canvas.
    */
  var topLeft: Double = js.native
  
  /**
    * The top right tint value. Always zero in canvas.
    */
  var topRight: Double = js.native
}
object TintConfig {
  
  @scala.inline
  def apply(bottomLeft: Double, bottomRight: Double, topLeft: Double, topRight: Double): TintConfig = {
    val __obj = js.Dynamic.literal(bottomLeft = bottomLeft.asInstanceOf[js.Any], bottomRight = bottomRight.asInstanceOf[js.Any], topLeft = topLeft.asInstanceOf[js.Any], topRight = topRight.asInstanceOf[js.Any])
    __obj.asInstanceOf[TintConfig]
  }
  
  @scala.inline
  implicit class TintConfigOps[Self <: TintConfig] (val x: Self) extends AnyVal {
    
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
    def setBottomLeft(value: Double): Self = this.set("bottomLeft", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBottomRight(value: Double): Self = this.set("bottomRight", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTopLeft(value: Double): Self = this.set("topLeft", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTopRight(value: Double): Self = this.set("topRight", value.asInstanceOf[js.Any])
  }
}
