package typings.paypalCheckoutComponents.buttonMod

import typings.paypalCheckoutComponents.anon.AccessToken
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ButtonRenderer extends js.Object {
  
  def render(options: AccessToken, selector: String): Unit = js.native
}
object ButtonRenderer {
  
  @scala.inline
  def apply(render: (AccessToken, String) => Unit): ButtonRenderer = {
    val __obj = js.Dynamic.literal(render = js.Any.fromFunction2(render))
    __obj.asInstanceOf[ButtonRenderer]
  }
  
  @scala.inline
  implicit class ButtonRendererOps[Self <: ButtonRenderer] (val x: Self) extends AnyVal {
    
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
    def setRender(value: (AccessToken, String) => Unit): Self = this.set("render", js.Any.fromFunction2(value))
  }
}
