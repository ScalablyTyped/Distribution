package typings.playable.topBlockTypesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ITopBlockAPI extends js.Object {
  
  var hideLiveIndicator: js.UndefOr[js.Function0[Unit]] = js.native
  
  var hideTitle: js.UndefOr[js.Function0[Unit]] = js.native
  
  var showLiveIndicator: js.UndefOr[js.Function0[Unit]] = js.native
  
  var showTitle: js.UndefOr[js.Function0[Unit]] = js.native
}
object ITopBlockAPI {
  
  @scala.inline
  def apply(): ITopBlockAPI = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ITopBlockAPI]
  }
  
  @scala.inline
  implicit class ITopBlockAPIOps[Self <: ITopBlockAPI] (val x: Self) extends AnyVal {
    
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
    def setHideLiveIndicator(value: () => Unit): Self = this.set("hideLiveIndicator", js.Any.fromFunction0(value))
    
    @scala.inline
    def deleteHideLiveIndicator: Self = this.set("hideLiveIndicator", js.undefined)
    
    @scala.inline
    def setHideTitle(value: () => Unit): Self = this.set("hideTitle", js.Any.fromFunction0(value))
    
    @scala.inline
    def deleteHideTitle: Self = this.set("hideTitle", js.undefined)
    
    @scala.inline
    def setShowLiveIndicator(value: () => Unit): Self = this.set("showLiveIndicator", js.Any.fromFunction0(value))
    
    @scala.inline
    def deleteShowLiveIndicator: Self = this.set("showLiveIndicator", js.undefined)
    
    @scala.inline
    def setShowTitle(value: () => Unit): Self = this.set("showTitle", js.Any.fromFunction0(value))
    
    @scala.inline
    def deleteShowTitle: Self = this.set("showTitle", js.undefined)
  }
}
