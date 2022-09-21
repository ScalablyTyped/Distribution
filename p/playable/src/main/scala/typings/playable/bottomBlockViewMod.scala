package typings.playable

import typings.playable.bottomBlockTypesMod.IBottomBlockViewConfig
import typings.playable.bottomBlockTypesMod.IBottomBlockViewStyles
import typings.playable.playableStrings.left
import typings.playable.playableStrings.right
import typings.std.HTMLElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object bottomBlockViewMod {
  
  @JSImport("playable/dist/src/modules/ui/bottom-block/bottom-block.view", JSImport.Default)
  @js.native
  open class default protected () extends BottomBlockView {
    def this(config: IBottomBlockViewConfig) = this()
  }
  
  @js.native
  trait BottomBlockView
    extends typings.playable.viewMod.default[IBottomBlockViewStyles] {
    
    /* private */ @JSName("_$leftControllsContainer")
    var _$leftControllsContainer: Any = js.native
    
    /* private */ @JSName("_$rightControllsContainer")
    var _$rightControllsContainer: Any = js.native
    
    /* private */ @JSName("_$rootElement")
    var _$rootElement: Any = js.native
    
    /* private */ var _bindEvents: Any = js.native
    
    /* private */ var _callbacks: Any = js.native
    
    /* private */ var _initDOM: Any = js.native
    
    /* private */ var _preventClickPropagation: Any = js.native
    
    /* private */ var _unbindEvents: Any = js.native
    
    def addControl(key: String, element: HTMLElement): Unit = js.native
    def addControl(key: String, element: HTMLElement, position: left | right): Unit = js.native
    
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
}
