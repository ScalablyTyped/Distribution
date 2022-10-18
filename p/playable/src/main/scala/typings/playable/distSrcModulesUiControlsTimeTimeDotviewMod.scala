package typings.playable

import typings.playable.distSrcModulesUiControlsTimeTypesMod.ITimeViewConfig
import typings.playable.distSrcModulesUiControlsTimeTypesMod.ITimeViewStyles
import typings.std.HTMLElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distSrcModulesUiControlsTimeTimeDotviewMod {
  
  @JSImport("playable/dist/src/modules/ui/controls/time/time.view", JSImport.Default)
  @js.native
  open class default protected () extends TimeView {
    def this(config: ITimeViewConfig) = this()
  }
  
  @js.native
  trait TimeView
    extends typings.playable.distSrcModulesUiCoreViewMod.default[ITimeViewStyles] {
    
    /* private */ @JSName("_$currentTime")
    var _$currentTime: Any = js.native
    
    /* private */ @JSName("_$durationTime")
    var _$durationTime: Any = js.native
    
    /* private */ @JSName("_$rootElement")
    var _$rootElement: Any = js.native
    
    /* private */ var _current: Any = js.native
    
    /* private */ var _duration: Any = js.native
    
    /* private */ var _initDOM: Any = js.native
    
    /* private */ var _isBackward: Any = js.native
    
    /* private */ var _updateCurrentTime: Any = js.native
    
    /* private */ var _updateDurationTime: Any = js.native
    
    def destroy(): Unit = js.native
    
    def getElement(): HTMLElement = js.native
    
    def hide(): Unit = js.native
    
    def hideDuration(): Unit = js.native
    
    def setCurrentTime(current: Double): Unit = js.native
    
    def setCurrentTimeBackward(_isBackward: Boolean): Unit = js.native
    
    def setDurationTime(duration: Double): Unit = js.native
    
    def show(): Unit = js.native
    
    def showDuration(): Unit = js.native
  }
}
