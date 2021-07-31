package typings.playable

import typings.playable.downloadTypesMod.IDownloadViewConfig
import typings.playable.downloadTypesMod.IDownloadViewStyles
import typings.std.HTMLElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object downloadViewMod {
  
  @JSImport("playable/dist/src/modules/ui/controls/download/download.view", JSImport.Default)
  @js.native
  class default protected () extends DownloadView {
    def this(config: IDownloadViewConfig) = this()
  }
  
  @js.native
  trait DownloadView
    extends typings.playable.viewMod.default[IDownloadViewStyles] {
    
    @JSName("_$downloadButton")
    var _$downloadButton: js.Any = js.native
    
    @JSName("_$rootElement")
    var _$rootElement: js.Any = js.native
    
    var _bindEvents: js.Any = js.native
    
    var _callbacks: js.Any = js.native
    
    var _onButtonClick: js.Any = js.native
    
    var _textMap: js.Any = js.native
    
    var _tooltipReference: js.Any = js.native
    
    var _unbindEvents: js.Any = js.native
    
    def destroy(): Unit = js.native
    
    def getElement(): HTMLElement = js.native
    
    def hide(): Unit = js.native
    
    def show(): Unit = js.native
  }
}
