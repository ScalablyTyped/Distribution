package typings.phaser.Phaser.Types.Core

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TouchInputConfig extends js.Object {
  
  /**
    * Whether touch input events have preventDefault() called on them.
    */
  var capture: js.UndefOr[Boolean] = js.native
  
  /**
    * Where the Touch Manager listens for touch input events. The default is the game canvas.
    */
  var target: js.UndefOr[js.Any] = js.native
}
object TouchInputConfig {
  
  @scala.inline
  def apply(): TouchInputConfig = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TouchInputConfig]
  }
  
  @scala.inline
  implicit class TouchInputConfigOps[Self <: TouchInputConfig] (val x: Self) extends AnyVal {
    
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
    def setCapture(value: Boolean): Self = this.set("capture", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCapture: Self = this.set("capture", js.undefined)
    
    @scala.inline
    def setTarget(value: js.Any): Self = this.set("target", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTarget: Self = this.set("target", js.undefined)
  }
}
