package typings.playable.screenTypesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IScreenAPI extends js.Object {
  
  var setVideoViewMode: js.UndefOr[js.Function1[/* viewMode */ VideoViewMode, Unit]] = js.native
}
object IScreenAPI {
  
  @scala.inline
  def apply(): IScreenAPI = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IScreenAPI]
  }
  
  @scala.inline
  implicit class IScreenAPIOps[Self <: IScreenAPI] (val x: Self) extends AnyVal {
    
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
    def setSetVideoViewMode(value: /* viewMode */ VideoViewMode => Unit): Self = this.set("setVideoViewMode", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteSetVideoViewMode: Self = this.set("setVideoViewMode", js.undefined)
  }
}
