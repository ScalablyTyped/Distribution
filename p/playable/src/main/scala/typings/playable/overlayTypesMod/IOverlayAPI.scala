package typings.playable.overlayTypesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IOverlayAPI extends js.Object {
  
  var hideOverlay: js.UndefOr[js.Function0[Unit]] = js.native
  
  var setPoster: js.UndefOr[js.Function1[/* src */ String, Unit]] = js.native
  
  var showOverlay: js.UndefOr[js.Function0[Unit]] = js.native
}
object IOverlayAPI {
  
  @scala.inline
  def apply(): IOverlayAPI = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IOverlayAPI]
  }
  
  @scala.inline
  implicit class IOverlayAPIOps[Self <: IOverlayAPI] (val x: Self) extends AnyVal {
    
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
    def setHideOverlay(value: () => Unit): Self = this.set("hideOverlay", js.Any.fromFunction0(value))
    
    @scala.inline
    def deleteHideOverlay: Self = this.set("hideOverlay", js.undefined)
    
    @scala.inline
    def setSetPoster(value: /* src */ String => Unit): Self = this.set("setPoster", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteSetPoster: Self = this.set("setPoster", js.undefined)
    
    @scala.inline
    def setShowOverlay(value: () => Unit): Self = this.set("showOverlay", js.Any.fromFunction0(value))
    
    @scala.inline
    def deleteShowOverlay: Self = this.set("showOverlay", js.undefined)
  }
}
