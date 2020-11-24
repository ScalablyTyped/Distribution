package typings.playable.subtitlesTypesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ISubtitlesAPI extends js.Object {
  
  var hideSubtitles: js.UndefOr[js.Function0[Unit]] = js.native
  
  var removeSubtitles: js.UndefOr[js.Function0[Unit]] = js.native
  
  var setActiveSubtitle: js.UndefOr[js.Function1[/* index */ Double, Unit]] = js.native
  
  var setSubtitles: js.UndefOr[
    js.Function1[/* subtitles */ String | ISubtitleConfig | js.Array[ISubtitleConfig], Unit]
  ] = js.native
  
  var showSubtitles: js.UndefOr[js.Function0[Unit]] = js.native
}
object ISubtitlesAPI {
  
  @scala.inline
  def apply(): ISubtitlesAPI = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ISubtitlesAPI]
  }
  
  @scala.inline
  implicit class ISubtitlesAPIOps[Self <: ISubtitlesAPI] (val x: Self) extends AnyVal {
    
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
    def setHideSubtitles(value: () => Unit): Self = this.set("hideSubtitles", js.Any.fromFunction0(value))
    
    @scala.inline
    def deleteHideSubtitles: Self = this.set("hideSubtitles", js.undefined)
    
    @scala.inline
    def setRemoveSubtitles(value: () => Unit): Self = this.set("removeSubtitles", js.Any.fromFunction0(value))
    
    @scala.inline
    def deleteRemoveSubtitles: Self = this.set("removeSubtitles", js.undefined)
    
    @scala.inline
    def setSetActiveSubtitle(value: /* index */ Double => Unit): Self = this.set("setActiveSubtitle", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteSetActiveSubtitle: Self = this.set("setActiveSubtitle", js.undefined)
    
    @scala.inline
    def setSetSubtitles(value: /* subtitles */ String | ISubtitleConfig | js.Array[ISubtitleConfig] => Unit): Self = this.set("setSubtitles", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteSetSubtitles: Self = this.set("setSubtitles", js.undefined)
    
    @scala.inline
    def setShowSubtitles(value: () => Unit): Self = this.set("showSubtitles", js.Any.fromFunction0(value))
    
    @scala.inline
    def deleteShowSubtitles: Self = this.set("showSubtitles", js.undefined)
  }
}
