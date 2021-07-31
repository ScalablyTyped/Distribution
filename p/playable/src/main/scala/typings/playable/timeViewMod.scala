package typings.playable

import typings.playable.timeTypesMod.ITimeViewConfig
import typings.playable.timeTypesMod.ITimeViewStyles
import typings.std.HTMLElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object timeViewMod {
  
  @JSImport("playable/dist/src/modules/ui/controls/time/time.view", JSImport.Default)
  @js.native
  class default protected () extends TimeView {
    def this(config: ITimeViewConfig) = this()
  }
  
  @js.native
  trait TimeView
    extends typings.playable.viewMod.default[ITimeViewStyles] {
    
    @JSName("_$currentTime")
    var _$currentTime: js.Any = js.native
    
    @JSName("_$durationTime")
    var _$durationTime: js.Any = js.native
    
    @JSName("_$rootElement")
    var _$rootElement: js.Any = js.native
    
    var _current: js.Any = js.native
    
    var _duration: js.Any = js.native
    
    var _initDOM: js.Any = js.native
    
    var _isBackward: js.Any = js.native
    
    var _updateCurrentTime: js.Any = js.native
    
    var _updateDurationTime: js.Any = js.native
    
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
