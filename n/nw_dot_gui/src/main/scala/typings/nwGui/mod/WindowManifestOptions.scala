package typings.nwGui.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait WindowManifestOptions extends js.Object {
  
  var frame: js.UndefOr[Boolean] = js.native
  
  var height: js.UndefOr[Double] = js.native
  
  var icon: js.UndefOr[String] = js.native
  
  var max_height: js.UndefOr[Double] = js.native
  
  var max_width: js.UndefOr[Double] = js.native
  
  var min_height: js.UndefOr[Double] = js.native
  
  var min_width: js.UndefOr[Double] = js.native
  
  var position: js.UndefOr[String] = js.native
  
  var title: js.UndefOr[String] = js.native
  
  var toolbar: js.UndefOr[Boolean] = js.native
  
  var width: js.UndefOr[Double] = js.native
}
object WindowManifestOptions {
  
  @scala.inline
  def apply(): WindowManifestOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[WindowManifestOptions]
  }
  
  @scala.inline
  implicit class WindowManifestOptionsOps[Self <: WindowManifestOptions] (val x: Self) extends AnyVal {
    
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
    def setFrame(value: Boolean): Self = this.set("frame", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFrame: Self = this.set("frame", js.undefined)
    
    @scala.inline
    def setHeight(value: Double): Self = this.set("height", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteHeight: Self = this.set("height", js.undefined)
    
    @scala.inline
    def setIcon(value: String): Self = this.set("icon", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIcon: Self = this.set("icon", js.undefined)
    
    @scala.inline
    def setMax_height(value: Double): Self = this.set("max_height", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMax_height: Self = this.set("max_height", js.undefined)
    
    @scala.inline
    def setMax_width(value: Double): Self = this.set("max_width", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMax_width: Self = this.set("max_width", js.undefined)
    
    @scala.inline
    def setMin_height(value: Double): Self = this.set("min_height", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMin_height: Self = this.set("min_height", js.undefined)
    
    @scala.inline
    def setMin_width(value: Double): Self = this.set("min_width", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMin_width: Self = this.set("min_width", js.undefined)
    
    @scala.inline
    def setPosition(value: String): Self = this.set("position", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePosition: Self = this.set("position", js.undefined)
    
    @scala.inline
    def setTitle(value: String): Self = this.set("title", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTitle: Self = this.set("title", js.undefined)
    
    @scala.inline
    def setToolbar(value: Boolean): Self = this.set("toolbar", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteToolbar: Self = this.set("toolbar", js.undefined)
    
    @scala.inline
    def setWidth(value: Double): Self = this.set("width", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteWidth: Self = this.set("width", js.undefined)
  }
}
