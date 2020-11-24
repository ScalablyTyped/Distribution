package typings.playable.controlsPictureInPictureTypesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IPictureInPictureViewStyles extends js.Object {
  
  var hidden: String = js.native
  
  var icon: String = js.native
  
  var inPictureInPicture: String = js.native
  
  var pictureInPictureControl: String = js.native
  
  var pictureInPictureToggle: String = js.native
}
object IPictureInPictureViewStyles {
  
  @scala.inline
  def apply(
    hidden: String,
    icon: String,
    inPictureInPicture: String,
    pictureInPictureControl: String,
    pictureInPictureToggle: String
  ): IPictureInPictureViewStyles = {
    val __obj = js.Dynamic.literal(hidden = hidden.asInstanceOf[js.Any], icon = icon.asInstanceOf[js.Any], inPictureInPicture = inPictureInPicture.asInstanceOf[js.Any], pictureInPictureControl = pictureInPictureControl.asInstanceOf[js.Any], pictureInPictureToggle = pictureInPictureToggle.asInstanceOf[js.Any])
    __obj.asInstanceOf[IPictureInPictureViewStyles]
  }
  
  @scala.inline
  implicit class IPictureInPictureViewStylesOps[Self <: IPictureInPictureViewStyles] (val x: Self) extends AnyVal {
    
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
    def setHidden(value: String): Self = this.set("hidden", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIcon(value: String): Self = this.set("icon", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInPictureInPicture(value: String): Self = this.set("inPictureInPicture", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPictureInPictureControl(value: String): Self = this.set("pictureInPictureControl", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPictureInPictureToggle(value: String): Self = this.set("pictureInPictureToggle", value.asInstanceOf[js.Any])
  }
}
