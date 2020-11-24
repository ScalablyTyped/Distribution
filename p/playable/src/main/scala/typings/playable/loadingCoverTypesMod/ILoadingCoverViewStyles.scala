package typings.playable.loadingCoverTypesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ILoadingCoverViewStyles extends js.Object {
  
  var hidden: String = js.native
  
  var loadingCover: String = js.native
  
  var loadingCoverImage: String = js.native
}
object ILoadingCoverViewStyles {
  
  @scala.inline
  def apply(hidden: String, loadingCover: String, loadingCoverImage: String): ILoadingCoverViewStyles = {
    val __obj = js.Dynamic.literal(hidden = hidden.asInstanceOf[js.Any], loadingCover = loadingCover.asInstanceOf[js.Any], loadingCoverImage = loadingCoverImage.asInstanceOf[js.Any])
    __obj.asInstanceOf[ILoadingCoverViewStyles]
  }
  
  @scala.inline
  implicit class ILoadingCoverViewStylesOps[Self <: ILoadingCoverViewStyles] (val x: Self) extends AnyVal {
    
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
    def setLoadingCover(value: String): Self = this.set("loadingCover", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLoadingCoverImage(value: String): Self = this.set("loadingCoverImage", value.asInstanceOf[js.Any])
  }
}
