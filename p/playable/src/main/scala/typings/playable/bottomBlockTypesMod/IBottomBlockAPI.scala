package typings.playable.bottomBlockTypesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IBottomBlockAPI extends js.Object {
  
  var hideDownloadButton: js.UndefOr[js.Function0[Unit]] = js.native
  
  var hideFullScreenControl: js.UndefOr[js.Function0[Unit]] = js.native
  
  var hideLogo: js.UndefOr[js.Function0[Unit]] = js.native
  
  var hidePlayControl: js.UndefOr[js.Function0[Unit]] = js.native
  
  var hideProgressControl: js.UndefOr[js.Function0[Unit]] = js.native
  
  var hideTimeControl: js.UndefOr[js.Function0[Unit]] = js.native
  
  var hideVolumeControl: js.UndefOr[js.Function0[Unit]] = js.native
  
  var setAlwaysShowLogo: js.UndefOr[js.Function1[/* flag */ Boolean, Unit]] = js.native
  
  var showDownloadButton: js.UndefOr[js.Function0[Unit]] = js.native
  
  var showFullScreenControl: js.UndefOr[js.Function0[Unit]] = js.native
  
  var showLogo: js.UndefOr[js.Function0[Unit]] = js.native
  
  var showPlayControl: js.UndefOr[js.Function0[Unit]] = js.native
  
  var showProgressControl: js.UndefOr[js.Function0[Unit]] = js.native
  
  var showTimeControl: js.UndefOr[js.Function0[Unit]] = js.native
  
  var showVolumeControl: js.UndefOr[js.Function0[Unit]] = js.native
}
object IBottomBlockAPI {
  
  @scala.inline
  def apply(): IBottomBlockAPI = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IBottomBlockAPI]
  }
  
  @scala.inline
  implicit class IBottomBlockAPIOps[Self <: IBottomBlockAPI] (val x: Self) extends AnyVal {
    
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
    def setHideDownloadButton(value: () => Unit): Self = this.set("hideDownloadButton", js.Any.fromFunction0(value))
    
    @scala.inline
    def deleteHideDownloadButton: Self = this.set("hideDownloadButton", js.undefined)
    
    @scala.inline
    def setHideFullScreenControl(value: () => Unit): Self = this.set("hideFullScreenControl", js.Any.fromFunction0(value))
    
    @scala.inline
    def deleteHideFullScreenControl: Self = this.set("hideFullScreenControl", js.undefined)
    
    @scala.inline
    def setHideLogo(value: () => Unit): Self = this.set("hideLogo", js.Any.fromFunction0(value))
    
    @scala.inline
    def deleteHideLogo: Self = this.set("hideLogo", js.undefined)
    
    @scala.inline
    def setHidePlayControl(value: () => Unit): Self = this.set("hidePlayControl", js.Any.fromFunction0(value))
    
    @scala.inline
    def deleteHidePlayControl: Self = this.set("hidePlayControl", js.undefined)
    
    @scala.inline
    def setHideProgressControl(value: () => Unit): Self = this.set("hideProgressControl", js.Any.fromFunction0(value))
    
    @scala.inline
    def deleteHideProgressControl: Self = this.set("hideProgressControl", js.undefined)
    
    @scala.inline
    def setHideTimeControl(value: () => Unit): Self = this.set("hideTimeControl", js.Any.fromFunction0(value))
    
    @scala.inline
    def deleteHideTimeControl: Self = this.set("hideTimeControl", js.undefined)
    
    @scala.inline
    def setHideVolumeControl(value: () => Unit): Self = this.set("hideVolumeControl", js.Any.fromFunction0(value))
    
    @scala.inline
    def deleteHideVolumeControl: Self = this.set("hideVolumeControl", js.undefined)
    
    @scala.inline
    def setSetAlwaysShowLogo(value: /* flag */ Boolean => Unit): Self = this.set("setAlwaysShowLogo", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteSetAlwaysShowLogo: Self = this.set("setAlwaysShowLogo", js.undefined)
    
    @scala.inline
    def setShowDownloadButton(value: () => Unit): Self = this.set("showDownloadButton", js.Any.fromFunction0(value))
    
    @scala.inline
    def deleteShowDownloadButton: Self = this.set("showDownloadButton", js.undefined)
    
    @scala.inline
    def setShowFullScreenControl(value: () => Unit): Self = this.set("showFullScreenControl", js.Any.fromFunction0(value))
    
    @scala.inline
    def deleteShowFullScreenControl: Self = this.set("showFullScreenControl", js.undefined)
    
    @scala.inline
    def setShowLogo(value: () => Unit): Self = this.set("showLogo", js.Any.fromFunction0(value))
    
    @scala.inline
    def deleteShowLogo: Self = this.set("showLogo", js.undefined)
    
    @scala.inline
    def setShowPlayControl(value: () => Unit): Self = this.set("showPlayControl", js.Any.fromFunction0(value))
    
    @scala.inline
    def deleteShowPlayControl: Self = this.set("showPlayControl", js.undefined)
    
    @scala.inline
    def setShowProgressControl(value: () => Unit): Self = this.set("showProgressControl", js.Any.fromFunction0(value))
    
    @scala.inline
    def deleteShowProgressControl: Self = this.set("showProgressControl", js.undefined)
    
    @scala.inline
    def setShowTimeControl(value: () => Unit): Self = this.set("showTimeControl", js.Any.fromFunction0(value))
    
    @scala.inline
    def deleteShowTimeControl: Self = this.set("showTimeControl", js.undefined)
    
    @scala.inline
    def setShowVolumeControl(value: () => Unit): Self = this.set("showVolumeControl", js.Any.fromFunction0(value))
    
    @scala.inline
    def deleteShowVolumeControl: Self = this.set("showVolumeControl", js.undefined)
  }
}
