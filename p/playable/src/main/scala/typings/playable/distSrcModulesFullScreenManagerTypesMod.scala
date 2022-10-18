package typings.playable

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distSrcModulesFullScreenManagerTypesMod {
  
  trait IFullScreenAPI extends StObject {
    
    var disableEnterFullScreenOnPlay: js.UndefOr[js.Function0[Unit]] = js.undefined
    
    var disableExitFullScreenOnEnd: js.UndefOr[js.Function0[Unit]] = js.undefined
    
    var disableExitFullScreenOnPause: js.UndefOr[js.Function0[Unit]] = js.undefined
    
    var disablePauseVideoOnFullScreenExit: js.UndefOr[js.Function0[Unit]] = js.undefined
    
    var enableEnterFullScreenOnPlay: js.UndefOr[js.Function0[Unit]] = js.undefined
    
    var enableExitFullScreenOnEnd: js.UndefOr[js.Function0[Unit]] = js.undefined
    
    var enableExitFullScreenOnPause: js.UndefOr[js.Function0[Unit]] = js.undefined
    
    var enablePauseVideoOnFullScreenExit: js.UndefOr[js.Function0[Unit]] = js.undefined
    
    var enterFullScreen: js.UndefOr[js.Function0[Unit]] = js.undefined
    
    var exitFullScreen: js.UndefOr[js.Function0[Unit]] = js.undefined
    
    var isInFullScreen: js.UndefOr[Boolean] = js.undefined
  }
  object IFullScreenAPI {
    
    inline def apply(): IFullScreenAPI = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[IFullScreenAPI]
    }
    
    extension [Self <: IFullScreenAPI](x: Self) {
      
      inline def setDisableEnterFullScreenOnPlay(value: () => Unit): Self = StObject.set(x, "disableEnterFullScreenOnPlay", js.Any.fromFunction0(value))
      
      inline def setDisableEnterFullScreenOnPlayUndefined: Self = StObject.set(x, "disableEnterFullScreenOnPlay", js.undefined)
      
      inline def setDisableExitFullScreenOnEnd(value: () => Unit): Self = StObject.set(x, "disableExitFullScreenOnEnd", js.Any.fromFunction0(value))
      
      inline def setDisableExitFullScreenOnEndUndefined: Self = StObject.set(x, "disableExitFullScreenOnEnd", js.undefined)
      
      inline def setDisableExitFullScreenOnPause(value: () => Unit): Self = StObject.set(x, "disableExitFullScreenOnPause", js.Any.fromFunction0(value))
      
      inline def setDisableExitFullScreenOnPauseUndefined: Self = StObject.set(x, "disableExitFullScreenOnPause", js.undefined)
      
      inline def setDisablePauseVideoOnFullScreenExit(value: () => Unit): Self = StObject.set(x, "disablePauseVideoOnFullScreenExit", js.Any.fromFunction0(value))
      
      inline def setDisablePauseVideoOnFullScreenExitUndefined: Self = StObject.set(x, "disablePauseVideoOnFullScreenExit", js.undefined)
      
      inline def setEnableEnterFullScreenOnPlay(value: () => Unit): Self = StObject.set(x, "enableEnterFullScreenOnPlay", js.Any.fromFunction0(value))
      
      inline def setEnableEnterFullScreenOnPlayUndefined: Self = StObject.set(x, "enableEnterFullScreenOnPlay", js.undefined)
      
      inline def setEnableExitFullScreenOnEnd(value: () => Unit): Self = StObject.set(x, "enableExitFullScreenOnEnd", js.Any.fromFunction0(value))
      
      inline def setEnableExitFullScreenOnEndUndefined: Self = StObject.set(x, "enableExitFullScreenOnEnd", js.undefined)
      
      inline def setEnableExitFullScreenOnPause(value: () => Unit): Self = StObject.set(x, "enableExitFullScreenOnPause", js.Any.fromFunction0(value))
      
      inline def setEnableExitFullScreenOnPauseUndefined: Self = StObject.set(x, "enableExitFullScreenOnPause", js.undefined)
      
      inline def setEnablePauseVideoOnFullScreenExit(value: () => Unit): Self = StObject.set(x, "enablePauseVideoOnFullScreenExit", js.Any.fromFunction0(value))
      
      inline def setEnablePauseVideoOnFullScreenExitUndefined: Self = StObject.set(x, "enablePauseVideoOnFullScreenExit", js.undefined)
      
      inline def setEnterFullScreen(value: () => Unit): Self = StObject.set(x, "enterFullScreen", js.Any.fromFunction0(value))
      
      inline def setEnterFullScreenUndefined: Self = StObject.set(x, "enterFullScreen", js.undefined)
      
      inline def setExitFullScreen(value: () => Unit): Self = StObject.set(x, "exitFullScreen", js.Any.fromFunction0(value))
      
      inline def setExitFullScreenUndefined: Self = StObject.set(x, "exitFullScreen", js.undefined)
      
      inline def setIsInFullScreen(value: Boolean): Self = StObject.set(x, "isInFullScreen", value.asInstanceOf[js.Any])
      
      inline def setIsInFullScreenUndefined: Self = StObject.set(x, "isInFullScreen", js.undefined)
    }
  }
  
  trait IFullScreenConfig extends StObject {
    
    var enterFullScreenOnPlay: js.UndefOr[Boolean] = js.undefined
    
    var exitFullScreenOnEnd: js.UndefOr[Boolean] = js.undefined
    
    var exitFullScreenOnPause: js.UndefOr[Boolean] = js.undefined
    
    var pauseVideoOnFullScreenExit: js.UndefOr[Boolean] = js.undefined
  }
  object IFullScreenConfig {
    
    inline def apply(): IFullScreenConfig = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[IFullScreenConfig]
    }
    
    extension [Self <: IFullScreenConfig](x: Self) {
      
      inline def setEnterFullScreenOnPlay(value: Boolean): Self = StObject.set(x, "enterFullScreenOnPlay", value.asInstanceOf[js.Any])
      
      inline def setEnterFullScreenOnPlayUndefined: Self = StObject.set(x, "enterFullScreenOnPlay", js.undefined)
      
      inline def setExitFullScreenOnEnd(value: Boolean): Self = StObject.set(x, "exitFullScreenOnEnd", value.asInstanceOf[js.Any])
      
      inline def setExitFullScreenOnEndUndefined: Self = StObject.set(x, "exitFullScreenOnEnd", js.undefined)
      
      inline def setExitFullScreenOnPause(value: Boolean): Self = StObject.set(x, "exitFullScreenOnPause", value.asInstanceOf[js.Any])
      
      inline def setExitFullScreenOnPauseUndefined: Self = StObject.set(x, "exitFullScreenOnPause", js.undefined)
      
      inline def setPauseVideoOnFullScreenExit(value: Boolean): Self = StObject.set(x, "pauseVideoOnFullScreenExit", value.asInstanceOf[js.Any])
      
      inline def setPauseVideoOnFullScreenExitUndefined: Self = StObject.set(x, "pauseVideoOnFullScreenExit", js.undefined)
    }
  }
  
  trait IFullScreenHelper extends StObject {
    
    def destroy(): Unit
    
    def exit(): Unit
    
    var isAPIExist: Boolean
    
    var isEnabled: Boolean
    
    var isInFullScreen: Boolean
    
    def request(): Unit
  }
  object IFullScreenHelper {
    
    inline def apply(
      destroy: () => Unit,
      exit: () => Unit,
      isAPIExist: Boolean,
      isEnabled: Boolean,
      isInFullScreen: Boolean,
      request: () => Unit
    ): IFullScreenHelper = {
      val __obj = js.Dynamic.literal(destroy = js.Any.fromFunction0(destroy), exit = js.Any.fromFunction0(exit), isAPIExist = isAPIExist.asInstanceOf[js.Any], isEnabled = isEnabled.asInstanceOf[js.Any], isInFullScreen = isInFullScreen.asInstanceOf[js.Any], request = js.Any.fromFunction0(request))
      __obj.asInstanceOf[IFullScreenHelper]
    }
    
    extension [Self <: IFullScreenHelper](x: Self) {
      
      inline def setDestroy(value: () => Unit): Self = StObject.set(x, "destroy", js.Any.fromFunction0(value))
      
      inline def setExit(value: () => Unit): Self = StObject.set(x, "exit", js.Any.fromFunction0(value))
      
      inline def setIsAPIExist(value: Boolean): Self = StObject.set(x, "isAPIExist", value.asInstanceOf[js.Any])
      
      inline def setIsEnabled(value: Boolean): Self = StObject.set(x, "isEnabled", value.asInstanceOf[js.Any])
      
      inline def setIsInFullScreen(value: Boolean): Self = StObject.set(x, "isInFullScreen", value.asInstanceOf[js.Any])
      
      inline def setRequest(value: () => Unit): Self = StObject.set(x, "request", js.Any.fromFunction0(value))
    }
  }
  
  trait IFullScreenManager extends StObject {
    
    def destroy(): Unit
    
    def disableEnterFullScreenOnPlay(): Unit
    
    def disableExitFullScreenOnEnd(): Unit
    
    def disableExitFullScreenOnPause(): Unit
    
    def disablePauseVideoOnFullScreenExit(): Unit
    
    def enableEnterFullScreenOnPlay(): Unit
    
    def enableExitFullScreenOnEnd(): Unit
    
    def enableExitFullScreenOnPause(): Unit
    
    def enablePauseVideoOnFullScreenExit(): Unit
    
    def enterFullScreen(): Unit
    
    def exitFullScreen(): Unit
    
    var isEnabled: Boolean
    
    var isInFullScreen: Boolean
  }
  object IFullScreenManager {
    
    inline def apply(
      destroy: () => Unit,
      disableEnterFullScreenOnPlay: () => Unit,
      disableExitFullScreenOnEnd: () => Unit,
      disableExitFullScreenOnPause: () => Unit,
      disablePauseVideoOnFullScreenExit: () => Unit,
      enableEnterFullScreenOnPlay: () => Unit,
      enableExitFullScreenOnEnd: () => Unit,
      enableExitFullScreenOnPause: () => Unit,
      enablePauseVideoOnFullScreenExit: () => Unit,
      enterFullScreen: () => Unit,
      exitFullScreen: () => Unit,
      isEnabled: Boolean,
      isInFullScreen: Boolean
    ): IFullScreenManager = {
      val __obj = js.Dynamic.literal(destroy = js.Any.fromFunction0(destroy), disableEnterFullScreenOnPlay = js.Any.fromFunction0(disableEnterFullScreenOnPlay), disableExitFullScreenOnEnd = js.Any.fromFunction0(disableExitFullScreenOnEnd), disableExitFullScreenOnPause = js.Any.fromFunction0(disableExitFullScreenOnPause), disablePauseVideoOnFullScreenExit = js.Any.fromFunction0(disablePauseVideoOnFullScreenExit), enableEnterFullScreenOnPlay = js.Any.fromFunction0(enableEnterFullScreenOnPlay), enableExitFullScreenOnEnd = js.Any.fromFunction0(enableExitFullScreenOnEnd), enableExitFullScreenOnPause = js.Any.fromFunction0(enableExitFullScreenOnPause), enablePauseVideoOnFullScreenExit = js.Any.fromFunction0(enablePauseVideoOnFullScreenExit), enterFullScreen = js.Any.fromFunction0(enterFullScreen), exitFullScreen = js.Any.fromFunction0(exitFullScreen), isEnabled = isEnabled.asInstanceOf[js.Any], isInFullScreen = isInFullScreen.asInstanceOf[js.Any])
      __obj.asInstanceOf[IFullScreenManager]
    }
    
    extension [Self <: IFullScreenManager](x: Self) {
      
      inline def setDestroy(value: () => Unit): Self = StObject.set(x, "destroy", js.Any.fromFunction0(value))
      
      inline def setDisableEnterFullScreenOnPlay(value: () => Unit): Self = StObject.set(x, "disableEnterFullScreenOnPlay", js.Any.fromFunction0(value))
      
      inline def setDisableExitFullScreenOnEnd(value: () => Unit): Self = StObject.set(x, "disableExitFullScreenOnEnd", js.Any.fromFunction0(value))
      
      inline def setDisableExitFullScreenOnPause(value: () => Unit): Self = StObject.set(x, "disableExitFullScreenOnPause", js.Any.fromFunction0(value))
      
      inline def setDisablePauseVideoOnFullScreenExit(value: () => Unit): Self = StObject.set(x, "disablePauseVideoOnFullScreenExit", js.Any.fromFunction0(value))
      
      inline def setEnableEnterFullScreenOnPlay(value: () => Unit): Self = StObject.set(x, "enableEnterFullScreenOnPlay", js.Any.fromFunction0(value))
      
      inline def setEnableExitFullScreenOnEnd(value: () => Unit): Self = StObject.set(x, "enableExitFullScreenOnEnd", js.Any.fromFunction0(value))
      
      inline def setEnableExitFullScreenOnPause(value: () => Unit): Self = StObject.set(x, "enableExitFullScreenOnPause", js.Any.fromFunction0(value))
      
      inline def setEnablePauseVideoOnFullScreenExit(value: () => Unit): Self = StObject.set(x, "enablePauseVideoOnFullScreenExit", js.Any.fromFunction0(value))
      
      inline def setEnterFullScreen(value: () => Unit): Self = StObject.set(x, "enterFullScreen", js.Any.fromFunction0(value))
      
      inline def setExitFullScreen(value: () => Unit): Self = StObject.set(x, "exitFullScreen", js.Any.fromFunction0(value))
      
      inline def setIsEnabled(value: Boolean): Self = StObject.set(x, "isEnabled", value.asInstanceOf[js.Any])
      
      inline def setIsInFullScreen(value: Boolean): Self = StObject.set(x, "isInFullScreen", value.asInstanceOf[js.Any])
    }
  }
}
