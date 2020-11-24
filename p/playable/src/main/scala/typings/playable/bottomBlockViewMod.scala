package typings.playable

import typings.playable.bottomBlockTypesMod.IBottomBlockViewConfig
import typings.playable.bottomBlockTypesMod.IBottomBlockViewStyles
import typings.playable.playableStrings.left
import typings.playable.playableStrings.right
import typings.std.HTMLElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("playable/dist/src/modules/ui/bottom-block/bottom-block.view", JSImport.Namespace)
@js.native
object bottomBlockViewMod extends js.Object {
  
  @js.native
  trait BottomBlockView
    extends typings.playable.stylableMod.default[IBottomBlockViewStyles] {
    
    @JSName("_$leftControllsContainer")
    var _$leftControllsContainer: js.Any = js.native
    
    @JSName("_$rightControllsContainer")
    var _$rightControllsContainer: js.Any = js.native
    
    @JSName("_$rootElement")
    var _$rootElement: js.Any = js.native
    
    var _bindEvents: js.Any = js.native
    
    var _callbacks: js.Any = js.native
    
    var _initDOM: js.Any = js.native
    
    var _preventClickPropagation: js.Any = js.native
    
    var _unbindEvents: js.Any = js.native
    
    def addControl(key: String, element: HTMLElement): Unit = js.native
    @JSName("addControl")
    def addControl_left(key: String, element: HTMLElement, position: left): Unit = js.native
    @JSName("addControl")
    def addControl_right(key: String, element: HTMLElement, position: right): Unit = js.native
    
    def destroy(): Unit = js.native
    
    def getElement(): HTMLElement = js.native
    
    def hide(): Unit = js.native
    
    def hideContent(): Unit = js.native
    
    def hideDownloadButton(): Unit = js.native
    
    def hideFullScreenControl(): Unit = js.native
    
    def hideLogo(): Unit = js.native
    
    def hidePictureInPictureControl(): Unit = js.native
    
    def hidePlayControl(): Unit = js.native
    
    def hideProgressControl(): Unit = js.native
    
    def hideTimeControl(): Unit = js.native
    
    def hideVolumeControl(): Unit = js.native
    
    def setShouldLogoShowAlwaysFlag(isShowAlways: Boolean): Unit = js.native
    
    def show(): Unit = js.native
    
    def showContent(): Unit = js.native
    
    def showDownloadButton(): Unit = js.native
    
    def showFullScreenControl(): Unit = js.native
    
    def showLogo(): Unit = js.native
    
    def showPictureInPictureControl(): Unit = js.native
    
    def showPlayControl(): Unit = js.native
    
    def showProgressControl(): Unit = js.native
    
    def showTimeControl(): Unit = js.native
    
    def showVolumeControl(): Unit = js.native
  }
  
  @js.native
  class default protected () extends BottomBlockView {
    def this(config: IBottomBlockViewConfig) = this()
  }
}
