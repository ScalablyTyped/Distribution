package typings.playable

import typings.playable.anon.Position
import typings.std.Event
import typings.std.EventListenerOrEventListenerObject
import typings.std.HTMLElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object bottomBlockTypesMod {
  
  @js.native
  trait IBottomBlock extends StObject {
    
    def addControl(key: String, element: HTMLElement): Unit = js.native
    def addControl(key: String, element: HTMLElement, options: Position): Unit = js.native
    
    def destroy(): Unit = js.native
    
    def getElement(): HTMLElement = js.native
    
    def hide(): Unit = js.native
    
    def hideContent(): Unit = js.native
    
    def hideDownloadButton(): Unit = js.native
    
    def hideFullScreenControl(): Unit = js.native
    
    def hideLogo(): Unit = js.native
    
    def hidePlayControl(): Unit = js.native
    
    def hideProgressControl(): Unit = js.native
    
    def hideTimeControl(): Unit = js.native
    
    def hideVolumeControl(): Unit = js.native
    
    var isFocused: Boolean = js.native
    
    def setAlwaysShowLogo(flag: Boolean): Unit = js.native
    
    def show(): Unit = js.native
    
    def showContent(): Unit = js.native
    
    def showDownloadButton(): Unit = js.native
    
    def showFullScreenControl(): Unit = js.native
    
    def showLogo(): Unit = js.native
    
    def showPlayControl(): Unit = js.native
    
    def showProgressControl(): Unit = js.native
    
    def showTimeControl(): Unit = js.native
    
    def showVolumeControl(): Unit = js.native
  }
  
  trait IBottomBlockAPI extends StObject {
    
    var hideDownloadButton: js.UndefOr[js.Function0[Unit]] = js.undefined
    
    var hideFullScreenControl: js.UndefOr[js.Function0[Unit]] = js.undefined
    
    var hideLogo: js.UndefOr[js.Function0[Unit]] = js.undefined
    
    var hidePlayControl: js.UndefOr[js.Function0[Unit]] = js.undefined
    
    var hideProgressControl: js.UndefOr[js.Function0[Unit]] = js.undefined
    
    var hideTimeControl: js.UndefOr[js.Function0[Unit]] = js.undefined
    
    var hideVolumeControl: js.UndefOr[js.Function0[Unit]] = js.undefined
    
    var setAlwaysShowLogo: js.UndefOr[js.Function1[/* flag */ Boolean, Unit]] = js.undefined
    
    var showDownloadButton: js.UndefOr[js.Function0[Unit]] = js.undefined
    
    var showFullScreenControl: js.UndefOr[js.Function0[Unit]] = js.undefined
    
    var showLogo: js.UndefOr[js.Function0[Unit]] = js.undefined
    
    var showPlayControl: js.UndefOr[js.Function0[Unit]] = js.undefined
    
    var showProgressControl: js.UndefOr[js.Function0[Unit]] = js.undefined
    
    var showTimeControl: js.UndefOr[js.Function0[Unit]] = js.undefined
    
    var showVolumeControl: js.UndefOr[js.Function0[Unit]] = js.undefined
  }
  object IBottomBlockAPI {
    
    inline def apply(): IBottomBlockAPI = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[IBottomBlockAPI]
    }
    
    extension [Self <: IBottomBlockAPI](x: Self) {
      
      inline def setHideDownloadButton(value: () => Unit): Self = StObject.set(x, "hideDownloadButton", js.Any.fromFunction0(value))
      
      inline def setHideDownloadButtonUndefined: Self = StObject.set(x, "hideDownloadButton", js.undefined)
      
      inline def setHideFullScreenControl(value: () => Unit): Self = StObject.set(x, "hideFullScreenControl", js.Any.fromFunction0(value))
      
      inline def setHideFullScreenControlUndefined: Self = StObject.set(x, "hideFullScreenControl", js.undefined)
      
      inline def setHideLogo(value: () => Unit): Self = StObject.set(x, "hideLogo", js.Any.fromFunction0(value))
      
      inline def setHideLogoUndefined: Self = StObject.set(x, "hideLogo", js.undefined)
      
      inline def setHidePlayControl(value: () => Unit): Self = StObject.set(x, "hidePlayControl", js.Any.fromFunction0(value))
      
      inline def setHidePlayControlUndefined: Self = StObject.set(x, "hidePlayControl", js.undefined)
      
      inline def setHideProgressControl(value: () => Unit): Self = StObject.set(x, "hideProgressControl", js.Any.fromFunction0(value))
      
      inline def setHideProgressControlUndefined: Self = StObject.set(x, "hideProgressControl", js.undefined)
      
      inline def setHideTimeControl(value: () => Unit): Self = StObject.set(x, "hideTimeControl", js.Any.fromFunction0(value))
      
      inline def setHideTimeControlUndefined: Self = StObject.set(x, "hideTimeControl", js.undefined)
      
      inline def setHideVolumeControl(value: () => Unit): Self = StObject.set(x, "hideVolumeControl", js.Any.fromFunction0(value))
      
      inline def setHideVolumeControlUndefined: Self = StObject.set(x, "hideVolumeControl", js.undefined)
      
      inline def setSetAlwaysShowLogo(value: /* flag */ Boolean => Unit): Self = StObject.set(x, "setAlwaysShowLogo", js.Any.fromFunction1(value))
      
      inline def setSetAlwaysShowLogoUndefined: Self = StObject.set(x, "setAlwaysShowLogo", js.undefined)
      
      inline def setShowDownloadButton(value: () => Unit): Self = StObject.set(x, "showDownloadButton", js.Any.fromFunction0(value))
      
      inline def setShowDownloadButtonUndefined: Self = StObject.set(x, "showDownloadButton", js.undefined)
      
      inline def setShowFullScreenControl(value: () => Unit): Self = StObject.set(x, "showFullScreenControl", js.Any.fromFunction0(value))
      
      inline def setShowFullScreenControlUndefined: Self = StObject.set(x, "showFullScreenControl", js.undefined)
      
      inline def setShowLogo(value: () => Unit): Self = StObject.set(x, "showLogo", js.Any.fromFunction0(value))
      
      inline def setShowLogoUndefined: Self = StObject.set(x, "showLogo", js.undefined)
      
      inline def setShowPlayControl(value: () => Unit): Self = StObject.set(x, "showPlayControl", js.Any.fromFunction0(value))
      
      inline def setShowPlayControlUndefined: Self = StObject.set(x, "showPlayControl", js.undefined)
      
      inline def setShowProgressControl(value: () => Unit): Self = StObject.set(x, "showProgressControl", js.Any.fromFunction0(value))
      
      inline def setShowProgressControlUndefined: Self = StObject.set(x, "showProgressControl", js.undefined)
      
      inline def setShowTimeControl(value: () => Unit): Self = StObject.set(x, "showTimeControl", js.Any.fromFunction0(value))
      
      inline def setShowTimeControlUndefined: Self = StObject.set(x, "showTimeControl", js.undefined)
      
      inline def setShowVolumeControl(value: () => Unit): Self = StObject.set(x, "showVolumeControl", js.Any.fromFunction0(value))
      
      inline def setShowVolumeControlUndefined: Self = StObject.set(x, "showVolumeControl", js.undefined)
    }
  }
  
  trait IBottomBlockViewCallbacks extends StObject {
    
    var onBlockMouseMove: EventListenerOrEventListenerObject
    
    var onBlockMouseOut: EventListenerOrEventListenerObject
  }
  object IBottomBlockViewCallbacks {
    
    inline def apply(
      onBlockMouseMove: EventListenerOrEventListenerObject,
      onBlockMouseOut: EventListenerOrEventListenerObject
    ): IBottomBlockViewCallbacks = {
      val __obj = js.Dynamic.literal(onBlockMouseMove = onBlockMouseMove.asInstanceOf[js.Any], onBlockMouseOut = onBlockMouseOut.asInstanceOf[js.Any])
      __obj.asInstanceOf[IBottomBlockViewCallbacks]
    }
    
    extension [Self <: IBottomBlockViewCallbacks](x: Self) {
      
      inline def setOnBlockMouseMove(value: EventListenerOrEventListenerObject): Self = StObject.set(x, "onBlockMouseMove", value.asInstanceOf[js.Any])
      
      inline def setOnBlockMouseMoveFunction1(value: /* evt */ Event => Unit): Self = StObject.set(x, "onBlockMouseMove", js.Any.fromFunction1(value))
      
      inline def setOnBlockMouseOut(value: EventListenerOrEventListenerObject): Self = StObject.set(x, "onBlockMouseOut", value.asInstanceOf[js.Any])
      
      inline def setOnBlockMouseOutFunction1(value: /* evt */ Event => Unit): Self = StObject.set(x, "onBlockMouseOut", js.Any.fromFunction1(value))
    }
  }
  
  trait IBottomBlockViewConfig extends StObject {
    
    var callbacks: IBottomBlockViewCallbacks
    
    var elements: IBottomBlockViewElements
  }
  object IBottomBlockViewConfig {
    
    inline def apply(callbacks: IBottomBlockViewCallbacks, elements: IBottomBlockViewElements): IBottomBlockViewConfig = {
      val __obj = js.Dynamic.literal(callbacks = callbacks.asInstanceOf[js.Any], elements = elements.asInstanceOf[js.Any])
      __obj.asInstanceOf[IBottomBlockViewConfig]
    }
    
    extension [Self <: IBottomBlockViewConfig](x: Self) {
      
      inline def setCallbacks(value: IBottomBlockViewCallbacks): Self = StObject.set(x, "callbacks", value.asInstanceOf[js.Any])
      
      inline def setElements(value: IBottomBlockViewElements): Self = StObject.set(x, "elements", value.asInstanceOf[js.Any])
    }
  }
  
  trait IBottomBlockViewElements extends StObject {
    
    var download: HTMLElement
    
    var fullScreen: HTMLElement
    
    var logo: HTMLElement
    
    var pictureInPicture: HTMLElement
    
    var play: HTMLElement
    
    var progress: HTMLElement
    
    var time: HTMLElement
    
    var volume: HTMLElement
  }
  object IBottomBlockViewElements {
    
    inline def apply(
      download: HTMLElement,
      fullScreen: HTMLElement,
      logo: HTMLElement,
      pictureInPicture: HTMLElement,
      play: HTMLElement,
      progress: HTMLElement,
      time: HTMLElement,
      volume: HTMLElement
    ): IBottomBlockViewElements = {
      val __obj = js.Dynamic.literal(download = download.asInstanceOf[js.Any], fullScreen = fullScreen.asInstanceOf[js.Any], logo = logo.asInstanceOf[js.Any], pictureInPicture = pictureInPicture.asInstanceOf[js.Any], play = play.asInstanceOf[js.Any], progress = progress.asInstanceOf[js.Any], time = time.asInstanceOf[js.Any], volume = volume.asInstanceOf[js.Any])
      __obj.asInstanceOf[IBottomBlockViewElements]
    }
    
    extension [Self <: IBottomBlockViewElements](x: Self) {
      
      inline def setDownload(value: HTMLElement): Self = StObject.set(x, "download", value.asInstanceOf[js.Any])
      
      inline def setFullScreen(value: HTMLElement): Self = StObject.set(x, "fullScreen", value.asInstanceOf[js.Any])
      
      inline def setLogo(value: HTMLElement): Self = StObject.set(x, "logo", value.asInstanceOf[js.Any])
      
      inline def setPictureInPicture(value: HTMLElement): Self = StObject.set(x, "pictureInPicture", value.asInstanceOf[js.Any])
      
      inline def setPlay(value: HTMLElement): Self = StObject.set(x, "play", value.asInstanceOf[js.Any])
      
      inline def setProgress(value: HTMLElement): Self = StObject.set(x, "progress", value.asInstanceOf[js.Any])
      
      inline def setTime(value: HTMLElement): Self = StObject.set(x, "time", value.asInstanceOf[js.Any])
      
      inline def setVolume(value: HTMLElement): Self = StObject.set(x, "volume", value.asInstanceOf[js.Any])
    }
  }
  
  trait IBottomBlockViewStyles extends StObject {
    
    var activated: String
    
    var additionalButton: String
    
    var bottomBlock: String
    
    var controlsContainerLeft: String
    
    var controlsContainerRight: String
    
    var downloadButtonHidden: String
    
    var elementsContainer: String
    
    var fullScreenContainer: String
    
    var fullScreenControlHidden: String
    
    var hidden: String
    
    var logoContainer: String
    
    var logoHidden: String
    
    var pictureInPictureButtonHidden: String
    
    var playContainer: String
    
    var playControlHidden: String
    
    var progressBarContainer: String
    
    var progressControlHidden: String
    
    var showLogoAlways: String
    
    var timeContainer: String
    
    var timeControlHidden: String
    
    var volumeContainer: String
    
    var volumeControlHidden: String
  }
  object IBottomBlockViewStyles {
    
    inline def apply(
      activated: String,
      additionalButton: String,
      bottomBlock: String,
      controlsContainerLeft: String,
      controlsContainerRight: String,
      downloadButtonHidden: String,
      elementsContainer: String,
      fullScreenContainer: String,
      fullScreenControlHidden: String,
      hidden: String,
      logoContainer: String,
      logoHidden: String,
      pictureInPictureButtonHidden: String,
      playContainer: String,
      playControlHidden: String,
      progressBarContainer: String,
      progressControlHidden: String,
      showLogoAlways: String,
      timeContainer: String,
      timeControlHidden: String,
      volumeContainer: String,
      volumeControlHidden: String
    ): IBottomBlockViewStyles = {
      val __obj = js.Dynamic.literal(activated = activated.asInstanceOf[js.Any], additionalButton = additionalButton.asInstanceOf[js.Any], bottomBlock = bottomBlock.asInstanceOf[js.Any], controlsContainerLeft = controlsContainerLeft.asInstanceOf[js.Any], controlsContainerRight = controlsContainerRight.asInstanceOf[js.Any], downloadButtonHidden = downloadButtonHidden.asInstanceOf[js.Any], elementsContainer = elementsContainer.asInstanceOf[js.Any], fullScreenContainer = fullScreenContainer.asInstanceOf[js.Any], fullScreenControlHidden = fullScreenControlHidden.asInstanceOf[js.Any], hidden = hidden.asInstanceOf[js.Any], logoContainer = logoContainer.asInstanceOf[js.Any], logoHidden = logoHidden.asInstanceOf[js.Any], pictureInPictureButtonHidden = pictureInPictureButtonHidden.asInstanceOf[js.Any], playContainer = playContainer.asInstanceOf[js.Any], playControlHidden = playControlHidden.asInstanceOf[js.Any], progressBarContainer = progressBarContainer.asInstanceOf[js.Any], progressControlHidden = progressControlHidden.asInstanceOf[js.Any], showLogoAlways = showLogoAlways.asInstanceOf[js.Any], timeContainer = timeContainer.asInstanceOf[js.Any], timeControlHidden = timeControlHidden.asInstanceOf[js.Any], volumeContainer = volumeContainer.asInstanceOf[js.Any], volumeControlHidden = volumeControlHidden.asInstanceOf[js.Any])
      __obj.asInstanceOf[IBottomBlockViewStyles]
    }
    
    extension [Self <: IBottomBlockViewStyles](x: Self) {
      
      inline def setActivated(value: String): Self = StObject.set(x, "activated", value.asInstanceOf[js.Any])
      
      inline def setAdditionalButton(value: String): Self = StObject.set(x, "additionalButton", value.asInstanceOf[js.Any])
      
      inline def setBottomBlock(value: String): Self = StObject.set(x, "bottomBlock", value.asInstanceOf[js.Any])
      
      inline def setControlsContainerLeft(value: String): Self = StObject.set(x, "controlsContainerLeft", value.asInstanceOf[js.Any])
      
      inline def setControlsContainerRight(value: String): Self = StObject.set(x, "controlsContainerRight", value.asInstanceOf[js.Any])
      
      inline def setDownloadButtonHidden(value: String): Self = StObject.set(x, "downloadButtonHidden", value.asInstanceOf[js.Any])
      
      inline def setElementsContainer(value: String): Self = StObject.set(x, "elementsContainer", value.asInstanceOf[js.Any])
      
      inline def setFullScreenContainer(value: String): Self = StObject.set(x, "fullScreenContainer", value.asInstanceOf[js.Any])
      
      inline def setFullScreenControlHidden(value: String): Self = StObject.set(x, "fullScreenControlHidden", value.asInstanceOf[js.Any])
      
      inline def setHidden(value: String): Self = StObject.set(x, "hidden", value.asInstanceOf[js.Any])
      
      inline def setLogoContainer(value: String): Self = StObject.set(x, "logoContainer", value.asInstanceOf[js.Any])
      
      inline def setLogoHidden(value: String): Self = StObject.set(x, "logoHidden", value.asInstanceOf[js.Any])
      
      inline def setPictureInPictureButtonHidden(value: String): Self = StObject.set(x, "pictureInPictureButtonHidden", value.asInstanceOf[js.Any])
      
      inline def setPlayContainer(value: String): Self = StObject.set(x, "playContainer", value.asInstanceOf[js.Any])
      
      inline def setPlayControlHidden(value: String): Self = StObject.set(x, "playControlHidden", value.asInstanceOf[js.Any])
      
      inline def setProgressBarContainer(value: String): Self = StObject.set(x, "progressBarContainer", value.asInstanceOf[js.Any])
      
      inline def setProgressControlHidden(value: String): Self = StObject.set(x, "progressControlHidden", value.asInstanceOf[js.Any])
      
      inline def setShowLogoAlways(value: String): Self = StObject.set(x, "showLogoAlways", value.asInstanceOf[js.Any])
      
      inline def setTimeContainer(value: String): Self = StObject.set(x, "timeContainer", value.asInstanceOf[js.Any])
      
      inline def setTimeControlHidden(value: String): Self = StObject.set(x, "timeControlHidden", value.asInstanceOf[js.Any])
      
      inline def setVolumeContainer(value: String): Self = StObject.set(x, "volumeContainer", value.asInstanceOf[js.Any])
      
      inline def setVolumeControlHidden(value: String): Self = StObject.set(x, "volumeControlHidden", value.asInstanceOf[js.Any])
    }
  }
}
