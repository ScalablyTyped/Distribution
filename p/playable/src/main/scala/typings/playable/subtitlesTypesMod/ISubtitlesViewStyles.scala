package typings.playable.subtitlesTypesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ISubtitlesViewStyles extends js.Object {
  
  var container: String = js.native
  
  var controlsShown: String = js.native
  
  var hidden: String = js.native
  
  var subtitle: String = js.native
  
  var subtitlesContainer: String = js.native
}
object ISubtitlesViewStyles {
  
  @scala.inline
  def apply(
    container: String,
    controlsShown: String,
    hidden: String,
    subtitle: String,
    subtitlesContainer: String
  ): ISubtitlesViewStyles = {
    val __obj = js.Dynamic.literal(container = container.asInstanceOf[js.Any], controlsShown = controlsShown.asInstanceOf[js.Any], hidden = hidden.asInstanceOf[js.Any], subtitle = subtitle.asInstanceOf[js.Any], subtitlesContainer = subtitlesContainer.asInstanceOf[js.Any])
    __obj.asInstanceOf[ISubtitlesViewStyles]
  }
  
  @scala.inline
  implicit class ISubtitlesViewStylesOps[Self <: ISubtitlesViewStyles] (val x: Self) extends AnyVal {
    
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
    def setControlsShown(value: String): Self = this.set("controlsShown", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHidden(value: String): Self = this.set("hidden", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSubtitle(value: String): Self = this.set("subtitle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSubtitlesContainer(value: String): Self = this.set("subtitlesContainer", value.asInstanceOf[js.Any])
  }
}
