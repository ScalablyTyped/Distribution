package typings.playable.rootContainerTypesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IRootContainerViewConfig extends js.Object {
  
  var callbacks: IRootContainerViewCallbacks = js.native
  
  var fillAllSpace: Boolean = js.native
  
  var height: Double = js.native
  
  var rtl: Boolean = js.native
  
  var width: Double = js.native
}
object IRootContainerViewConfig {
  
  @scala.inline
  def apply(
    callbacks: IRootContainerViewCallbacks,
    fillAllSpace: Boolean,
    height: Double,
    rtl: Boolean,
    width: Double
  ): IRootContainerViewConfig = {
    val __obj = js.Dynamic.literal(callbacks = callbacks.asInstanceOf[js.Any], fillAllSpace = fillAllSpace.asInstanceOf[js.Any], height = height.asInstanceOf[js.Any], rtl = rtl.asInstanceOf[js.Any], width = width.asInstanceOf[js.Any])
    __obj.asInstanceOf[IRootContainerViewConfig]
  }
  
  @scala.inline
  implicit class IRootContainerViewConfigOps[Self <: IRootContainerViewConfig] (val x: Self) extends AnyVal {
    
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
    def setCallbacks(value: IRootContainerViewCallbacks): Self = this.set("callbacks", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFillAllSpace(value: Boolean): Self = this.set("fillAllSpace", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHeight(value: Double): Self = this.set("height", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRtl(value: Boolean): Self = this.set("rtl", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWidth(value: Double): Self = this.set("width", value.asInstanceOf[js.Any])
  }
}
