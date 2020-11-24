package typings.modernizr

import typings.std.Boolean
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait WebpBoolean extends Boolean {
  
  var alpha: scala.Boolean = js.native
  
  var animation: scala.Boolean = js.native
  
  var lossless: scala.Boolean = js.native
}
object WebpBoolean {
  
  @scala.inline
  def apply(alpha: scala.Boolean, animation: scala.Boolean, lossless: scala.Boolean): WebpBoolean = {
    val __obj = js.Dynamic.literal(alpha = alpha.asInstanceOf[js.Any], animation = animation.asInstanceOf[js.Any], lossless = lossless.asInstanceOf[js.Any])
    __obj.asInstanceOf[WebpBoolean]
  }
  
  @scala.inline
  implicit class WebpBooleanOps[Self <: WebpBoolean] (val x: Self) extends AnyVal {
    
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
    def setAlpha(value: scala.Boolean): Self = this.set("alpha", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAnimation(value: scala.Boolean): Self = this.set("animation", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLossless(value: scala.Boolean): Self = this.set("lossless", value.asInstanceOf[js.Any])
  }
}
