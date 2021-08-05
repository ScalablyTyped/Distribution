package typings.playable

import typings.playable.volumeTypesMod.IVolumeViewConfig
import typings.playable.volumeTypesMod.IVolumeViewStyles
import typings.std.HTMLElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object volumeViewMod {
  
  @JSImport("playable/dist/src/modules/ui/controls/volume/volume.view", JSImport.Default)
  @js.native
  class default protected () extends VolumeView {
    def this(config: IVolumeViewConfig) = this()
  }
  
  @js.native
  trait VolumeView
    extends typings.playable.viewMod.default[IVolumeViewStyles] {
    
    /* private */ @JSName("_$hitbox")
    var _$hitbox: js.Any = js.native
    
    /* private */ @JSName("_$muteToggle")
    var _$muteToggle: js.Any = js.native
    
    /* private */ @JSName("_$rootElement")
    var _$rootElement: js.Any = js.native
    
    /* private */ @JSName("_$volume")
    var _$volume: js.Any = js.native
    
    /* private */ @JSName("_$volumeContainer")
    var _$volumeContainer: js.Any = js.native
    
    /* private */ var _bindCallbacks: js.Any = js.native
    
    /* private */ var _bindEvents: js.Any = js.native
    
    /* private */ var _callbacks: js.Any = js.native
    
    /* private */ var _initDOM: js.Any = js.native
    
    /* private */ var _isDragging: js.Any = js.native
    
    /* private */ var _muteToggleTooltipReference: js.Any = js.native
    
    /* private */ var _onButtonClick: js.Any = js.native
    
    /* private */ var _setMuteDOMAttributes: js.Any = js.native
    
    /* private */ var _setVolumeByClick: js.Any = js.native
    
    /* private */ var _setVolumeByDrag: js.Any = js.native
    
    /* private */ var _setVolumeByWheel: js.Any = js.native
    
    /* private */ var _setVolumeDOMAttributes: js.Any = js.native
    
    /* private */ var _startDrag: js.Any = js.native
    
    /* private */ var _startDragOnMouseDown: js.Any = js.native
    
    /* private */ var _stopDrag: js.Any = js.native
    
    /* private */ var _stopDragOnMouseUp: js.Any = js.native
    
    /* private */ var _textMap: js.Any = js.native
    
    /* private */ var _tooltipService: js.Any = js.native
    
    /* private */ var _unbindEvents: js.Any = js.native
    
    def destroy(): Unit = js.native
    
    def getButtonElement(): HTMLElement = js.native
    
    def getElement(): HTMLElement = js.native
    
    def getInputElement(): HTMLElement = js.native
    
    def hide(): Unit = js.native
    
    def setMute(isMuted: Boolean): Unit = js.native
    
    def setVolume(volume: Double): Unit = js.native
    
    def show(): Unit = js.native
  }
}
