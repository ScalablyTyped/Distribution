package typings.playable

import typings.playable.interactionIndicatorTypesMod.IInteractionIndicatorViewStyles
import typings.std.HTMLElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object interactionIndicatorViewMod {
  
  @JSImport("playable/dist/src/modules/ui/interaction-indicator/interaction-indicator.view", JSImport.Default)
  @js.native
  open class default () extends InteractionIndicatorView
  
  @js.native
  trait InteractionIndicatorView
    extends typings.playable.viewMod.default[IInteractionIndicatorViewStyles] {
    
    /* private */ @JSName("_$rootElement")
    var _$rootElement: Any = js.native
    
    /* private */ var _decreaseVolumeIcon: Any = js.native
    
    /* private */ var _forwardIcon: Any = js.native
    
    /* private */ var _increaseVolumeIcon: Any = js.native
    
    /* private */ var _muteIcon: Any = js.native
    
    /* private */ var _pauseIcon: Any = js.native
    
    /* private */ var _playIcon: Any = js.native
    
    /* private */ var _rewindIcon: Any = js.native
    
    def activateDecreaseVolumeIcon(): Unit = js.native
    
    def activateForwardIcon(): Unit = js.native
    
    def activateIncreaseVolumeIcon(): Unit = js.native
    
    def activateMuteVolumeIcon(): Unit = js.native
    
    def activatePauseIcon(): Unit = js.native
    
    def activatePlayIcon(): Unit = js.native
    
    def activateRewindIcon(): Unit = js.native
    
    def deactivateIcon(): Unit = js.native
    
    def destroy(): Unit = js.native
    
    def getElement(): HTMLElement = js.native
    
    def hide(): Unit = js.native
    
    def show(): Unit = js.native
  }
}
