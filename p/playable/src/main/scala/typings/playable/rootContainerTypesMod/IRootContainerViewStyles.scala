package typings.playable.rootContainerTypesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IRootContainerViewStyles extends js.Object {
  
  var container: String = js.native
  
  var fillAllSpace: String = js.native
  
  var fullScreen: String = js.native
  
  var hidden: String = js.native
  
  var rtl: Boolean = js.native
}
object IRootContainerViewStyles {
  
  @scala.inline
  def apply(container: String, fillAllSpace: String, fullScreen: String, hidden: String, rtl: Boolean): IRootContainerViewStyles = {
    val __obj = js.Dynamic.literal(container = container.asInstanceOf[js.Any], fillAllSpace = fillAllSpace.asInstanceOf[js.Any], fullScreen = fullScreen.asInstanceOf[js.Any], hidden = hidden.asInstanceOf[js.Any], rtl = rtl.asInstanceOf[js.Any])
    __obj.asInstanceOf[IRootContainerViewStyles]
  }
  
  @scala.inline
  implicit class IRootContainerViewStylesOps[Self <: IRootContainerViewStyles] (val x: Self) extends AnyVal {
    
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
    def setContainer(value: String): Self = this.set("container", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFillAllSpace(value: String): Self = this.set("fillAllSpace", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFullScreen(value: String): Self = this.set("fullScreen", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHidden(value: String): Self = this.set("hidden", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRtl(value: Boolean): Self = this.set("rtl", value.asInstanceOf[js.Any])
  }
}
