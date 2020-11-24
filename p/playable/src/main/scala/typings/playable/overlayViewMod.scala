package typings.playable

import typings.playable.overlayTypesMod.IOverlayViewConfig
import typings.playable.overlayTypesMod.IOverlayViewStyles
import typings.std.HTMLElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("playable/dist/src/modules/ui/overlay/overlay.view", JSImport.Namespace)
@js.native
object overlayViewMod extends js.Object {
  
  @js.native
  trait OverlayView
    extends typings.playable.stylableMod.default[IOverlayViewStyles] {
    
    @JSName("_$content")
    var _$content: js.Any = js.native
    
    @JSName("_$playButton")
    var _$playButton: js.Any = js.native
    
    @JSName("_$rootElement")
    var _$rootElement: js.Any = js.native
    
    var _bindEvents: js.Any = js.native
    
    var _callbacks: js.Any = js.native
    
    var _initDOM: js.Any = js.native
    
    var _unbindEvents: js.Any = js.native
    
    def destroy(): Unit = js.native
    
    def getElement(): HTMLElement = js.native
    
    def hide(): Unit = js.native
    
    def hideContent(): Unit = js.native
    
    def setPoster(src: String): Unit = js.native
    
    def show(): Unit = js.native
    
    def showContent(): Unit = js.native
    
    def turnOffOverlayTransparency(): Unit = js.native
    
    def turnOnOverlayTransparency(): Unit = js.native
  }
  
  @js.native
  class default protected () extends OverlayView {
    def this(config: IOverlayViewConfig) = this()
  }
}
