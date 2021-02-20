package typings.playable

import typings.playable.topBlockTypesMod.ITopBlockViewConfig
import typings.playable.topBlockTypesMod.ITopBlockViewStyles
import typings.std.HTMLElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object topBlockViewMod {
  
  @JSImport("playable/dist/src/modules/ui/top-block/top-block.view", JSImport.Default)
  @js.native
  class default protected () extends TopBlockView {
    def this(config: ITopBlockViewConfig) = this()
  }
  
  @js.native
  trait TopBlockView
    extends typings.playable.viewMod.default[ITopBlockViewStyles] {
    
    @JSName("_$liveIndicatorContainer")
    var _$liveIndicatorContainer: js.Any = js.native
    
    @JSName("_$rootElement")
    var _$rootElement: js.Any = js.native
    
    @JSName("_$titleContainer")
    var _$titleContainer: js.Any = js.native
    
    var _bindEvents: js.Any = js.native
    
    var _callbacks: js.Any = js.native
    
    var _initDOM: js.Any = js.native
    
    var _preventClickPropagation: js.Any = js.native
    
    var _unbindEvents: js.Any = js.native
    
    def destroy(): Unit = js.native
    
    def getElement(): HTMLElement = js.native
    
    def hide(): Unit = js.native
    
    def hideContent(): Unit = js.native
    
    def hideLiveIndicator(): Unit = js.native
    
    def hideTitle(): Unit = js.native
    
    def show(): Unit = js.native
    
    def showContent(): Unit = js.native
    
    def showLiveIndicator(): Unit = js.native
    
    def showTitle(): Unit = js.native
  }
}
