package typings.phaser.Phaser.Types.GameObjects.BitmapText

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait BitmapTextSize extends js.Object {
  
  /**
    * The position and size of the BitmapText, taking into account the position and scale of the Game Object.
    */
  var global: GlobalBitmapTextSize = js.native
  
  /**
    * The position and size of the BitmapText, taking just the font size into account.
    */
  var local: LocalBitmapTextSize = js.native
}
object BitmapTextSize {
  
  @scala.inline
  def apply(global: GlobalBitmapTextSize, local: LocalBitmapTextSize): BitmapTextSize = {
    val __obj = js.Dynamic.literal(global = global.asInstanceOf[js.Any], local = local.asInstanceOf[js.Any])
    __obj.asInstanceOf[BitmapTextSize]
  }
  
  @scala.inline
  implicit class BitmapTextSizeOps[Self <: BitmapTextSize] (val x: Self) extends AnyVal {
    
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
    def setGlobal(value: GlobalBitmapTextSize): Self = this.set("global", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLocal(value: LocalBitmapTextSize): Self = this.set("local", value.asInstanceOf[js.Any])
  }
}
