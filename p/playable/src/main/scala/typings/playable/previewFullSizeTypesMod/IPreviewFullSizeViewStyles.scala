package typings.playable.previewFullSizeTypesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IPreviewFullSizeViewStyles extends js.Object {
  
  var container: String = js.native
  
  var frame: String = js.native
  
  var hidden: String = js.native
}
object IPreviewFullSizeViewStyles {
  
  @scala.inline
  def apply(container: String, frame: String, hidden: String): IPreviewFullSizeViewStyles = {
    val __obj = js.Dynamic.literal(container = container.asInstanceOf[js.Any], frame = frame.asInstanceOf[js.Any], hidden = hidden.asInstanceOf[js.Any])
    __obj.asInstanceOf[IPreviewFullSizeViewStyles]
  }
  
  @scala.inline
  implicit class IPreviewFullSizeViewStylesOps[Self <: IPreviewFullSizeViewStyles] (val x: Self) extends AnyVal {
    
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
    def setFrame(value: String): Self = this.set("frame", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHidden(value: String): Self = this.set("hidden", value.asInstanceOf[js.Any])
  }
}
