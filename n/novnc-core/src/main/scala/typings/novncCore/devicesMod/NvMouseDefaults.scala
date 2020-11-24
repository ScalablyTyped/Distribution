package typings.novncCore.devicesMod

import typings.std.Element
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait NvMouseDefaults extends js.Object {
  
  var focused: js.UndefOr[Boolean] = js.native
  
  var onMouseButton: js.UndefOr[
    js.Function4[/* x */ Double, /* y */ Double, /* down */ Boolean, /* bmask */ Double, Unit]
  ] = js.native
  
  var onMouseMove: js.UndefOr[js.Function2[/* x */ Double, /* y */ Double, Unit]] = js.native
  
  var target: js.UndefOr[Element] = js.native
  
  var touchButton: js.UndefOr[Double] = js.native
}
object NvMouseDefaults {
  
  @scala.inline
  def apply(): NvMouseDefaults = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[NvMouseDefaults]
  }
  
  @scala.inline
  implicit class NvMouseDefaultsOps[Self <: NvMouseDefaults] (val x: Self) extends AnyVal {
    
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
    def setFocused(value: Boolean): Self = this.set("focused", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFocused: Self = this.set("focused", js.undefined)
    
    @scala.inline
    def setOnMouseButton(value: (/* x */ Double, /* y */ Double, /* down */ Boolean, /* bmask */ Double) => Unit): Self = this.set("onMouseButton", js.Any.fromFunction4(value))
    
    @scala.inline
    def deleteOnMouseButton: Self = this.set("onMouseButton", js.undefined)
    
    @scala.inline
    def setOnMouseMove(value: (/* x */ Double, /* y */ Double) => Unit): Self = this.set("onMouseMove", js.Any.fromFunction2(value))
    
    @scala.inline
    def deleteOnMouseMove: Self = this.set("onMouseMove", js.undefined)
    
    @scala.inline
    def setTarget(value: Element): Self = this.set("target", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTarget: Self = this.set("target", js.undefined)
    
    @scala.inline
    def setTouchButton(value: Double): Self = this.set("touchButton", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTouchButton: Self = this.set("touchButton", js.undefined)
  }
}
