package typings.playable

import typings.std.HTMLElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distSrcModulesUiInteractionIndicatorTypesMod {
  
  trait IInteractionIndicator extends StObject {
    
    def destroy(): Unit
    
    def getElement(): HTMLElement
    
    def hide(): Unit
    
    def hideIcons(): Unit
    
    def show(): Unit
    
    def showDecreaseVolume(): Unit
    
    def showForward(): Unit
    
    def showIncreaseVolume(): Unit
    
    def showMute(): Unit
    
    def showPause(): Unit
    
    def showPlay(): Unit
    
    def showRewind(): Unit
  }
  object IInteractionIndicator {
    
    inline def apply(
      destroy: () => Unit,
      getElement: () => HTMLElement,
      hide: () => Unit,
      hideIcons: () => Unit,
      show: () => Unit,
      showDecreaseVolume: () => Unit,
      showForward: () => Unit,
      showIncreaseVolume: () => Unit,
      showMute: () => Unit,
      showPause: () => Unit,
      showPlay: () => Unit,
      showRewind: () => Unit
    ): IInteractionIndicator = {
      val __obj = js.Dynamic.literal(destroy = js.Any.fromFunction0(destroy), getElement = js.Any.fromFunction0(getElement), hide = js.Any.fromFunction0(hide), hideIcons = js.Any.fromFunction0(hideIcons), show = js.Any.fromFunction0(show), showDecreaseVolume = js.Any.fromFunction0(showDecreaseVolume), showForward = js.Any.fromFunction0(showForward), showIncreaseVolume = js.Any.fromFunction0(showIncreaseVolume), showMute = js.Any.fromFunction0(showMute), showPause = js.Any.fromFunction0(showPause), showPlay = js.Any.fromFunction0(showPlay), showRewind = js.Any.fromFunction0(showRewind))
      __obj.asInstanceOf[IInteractionIndicator]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: IInteractionIndicator] (val x: Self) extends AnyVal {
      
      inline def setDestroy(value: () => Unit): Self = StObject.set(x, "destroy", js.Any.fromFunction0(value))
      
      inline def setGetElement(value: () => HTMLElement): Self = StObject.set(x, "getElement", js.Any.fromFunction0(value))
      
      inline def setHide(value: () => Unit): Self = StObject.set(x, "hide", js.Any.fromFunction0(value))
      
      inline def setHideIcons(value: () => Unit): Self = StObject.set(x, "hideIcons", js.Any.fromFunction0(value))
      
      inline def setShow(value: () => Unit): Self = StObject.set(x, "show", js.Any.fromFunction0(value))
      
      inline def setShowDecreaseVolume(value: () => Unit): Self = StObject.set(x, "showDecreaseVolume", js.Any.fromFunction0(value))
      
      inline def setShowForward(value: () => Unit): Self = StObject.set(x, "showForward", js.Any.fromFunction0(value))
      
      inline def setShowIncreaseVolume(value: () => Unit): Self = StObject.set(x, "showIncreaseVolume", js.Any.fromFunction0(value))
      
      inline def setShowMute(value: () => Unit): Self = StObject.set(x, "showMute", js.Any.fromFunction0(value))
      
      inline def setShowPause(value: () => Unit): Self = StObject.set(x, "showPause", js.Any.fromFunction0(value))
      
      inline def setShowPlay(value: () => Unit): Self = StObject.set(x, "showPlay", js.Any.fromFunction0(value))
      
      inline def setShowRewind(value: () => Unit): Self = StObject.set(x, "showRewind", js.Any.fromFunction0(value))
    }
  }
  
  trait IInteractionIndicatorViewStyles extends StObject {
    
    var animatedIcon: String
    
    var hidden: String
    
    var icon: String
    
    var iconContainer: String
    
    var pauseIcon: String
    
    var playIcon: String
    
    var seconds: String
  }
  object IInteractionIndicatorViewStyles {
    
    inline def apply(
      animatedIcon: String,
      hidden: String,
      icon: String,
      iconContainer: String,
      pauseIcon: String,
      playIcon: String,
      seconds: String
    ): IInteractionIndicatorViewStyles = {
      val __obj = js.Dynamic.literal(animatedIcon = animatedIcon.asInstanceOf[js.Any], hidden = hidden.asInstanceOf[js.Any], icon = icon.asInstanceOf[js.Any], iconContainer = iconContainer.asInstanceOf[js.Any], pauseIcon = pauseIcon.asInstanceOf[js.Any], playIcon = playIcon.asInstanceOf[js.Any], seconds = seconds.asInstanceOf[js.Any])
      __obj.asInstanceOf[IInteractionIndicatorViewStyles]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: IInteractionIndicatorViewStyles] (val x: Self) extends AnyVal {
      
      inline def setAnimatedIcon(value: String): Self = StObject.set(x, "animatedIcon", value.asInstanceOf[js.Any])
      
      inline def setHidden(value: String): Self = StObject.set(x, "hidden", value.asInstanceOf[js.Any])
      
      inline def setIcon(value: String): Self = StObject.set(x, "icon", value.asInstanceOf[js.Any])
      
      inline def setIconContainer(value: String): Self = StObject.set(x, "iconContainer", value.asInstanceOf[js.Any])
      
      inline def setPauseIcon(value: String): Self = StObject.set(x, "pauseIcon", value.asInstanceOf[js.Any])
      
      inline def setPlayIcon(value: String): Self = StObject.set(x, "playIcon", value.asInstanceOf[js.Any])
      
      inline def setSeconds(value: String): Self = StObject.set(x, "seconds", value.asInstanceOf[js.Any])
    }
  }
}
