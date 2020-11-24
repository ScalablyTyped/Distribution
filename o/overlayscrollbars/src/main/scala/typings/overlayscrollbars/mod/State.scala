package typings.overlayscrollbars.mod

import typings.overlayscrollbars.anon.B
import typings.overlayscrollbars.anon.Height
import typings.overlayscrollbars.anon.XBoolean
import typings.overlayscrollbars.anon.XNumber
import typings.overlayscrollbars.anon.Xs
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait State extends js.Object {
  
  var autoUpdate: Boolean = js.native
  
  var contentScrollSize: Height = js.native
  
  var destroyed: Boolean = js.native
  
  var documentMixed: Boolean = js.native
  
  var hasOverflow: XBoolean = js.native
  
  var heightAuto: Boolean = js.native
  
  var hideOverflow: Xs = js.native
  
  var hostSize: Height = js.native
  
  var overflowAmount: XNumber = js.native
  
  var padding: B = js.native
  
  var sleeping: Boolean = js.native
  
  var viewportSize: Height = js.native
  
  var widthAuto: Boolean = js.native
}
object State {
  
  @scala.inline
  def apply(
    autoUpdate: Boolean,
    contentScrollSize: Height,
    destroyed: Boolean,
    documentMixed: Boolean,
    hasOverflow: XBoolean,
    heightAuto: Boolean,
    hideOverflow: Xs,
    hostSize: Height,
    overflowAmount: XNumber,
    padding: B,
    sleeping: Boolean,
    viewportSize: Height,
    widthAuto: Boolean
  ): State = {
    val __obj = js.Dynamic.literal(autoUpdate = autoUpdate.asInstanceOf[js.Any], contentScrollSize = contentScrollSize.asInstanceOf[js.Any], destroyed = destroyed.asInstanceOf[js.Any], documentMixed = documentMixed.asInstanceOf[js.Any], hasOverflow = hasOverflow.asInstanceOf[js.Any], heightAuto = heightAuto.asInstanceOf[js.Any], hideOverflow = hideOverflow.asInstanceOf[js.Any], hostSize = hostSize.asInstanceOf[js.Any], overflowAmount = overflowAmount.asInstanceOf[js.Any], padding = padding.asInstanceOf[js.Any], sleeping = sleeping.asInstanceOf[js.Any], viewportSize = viewportSize.asInstanceOf[js.Any], widthAuto = widthAuto.asInstanceOf[js.Any])
    __obj.asInstanceOf[State]
  }
  
  @scala.inline
  implicit class StateOps[Self <: State] (val x: Self) extends AnyVal {
    
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
    def setAutoUpdate(value: Boolean): Self = this.set("autoUpdate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setContentScrollSize(value: Height): Self = this.set("contentScrollSize", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDestroyed(value: Boolean): Self = this.set("destroyed", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDocumentMixed(value: Boolean): Self = this.set("documentMixed", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHasOverflow(value: XBoolean): Self = this.set("hasOverflow", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHeightAuto(value: Boolean): Self = this.set("heightAuto", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHideOverflow(value: Xs): Self = this.set("hideOverflow", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHostSize(value: Height): Self = this.set("hostSize", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOverflowAmount(value: XNumber): Self = this.set("overflowAmount", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPadding(value: B): Self = this.set("padding", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSleeping(value: Boolean): Self = this.set("sleeping", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setViewportSize(value: Height): Self = this.set("viewportSize", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWidthAuto(value: Boolean): Self = this.set("widthAuto", value.asInstanceOf[js.Any])
  }
}
