package typings.playable

import typings.playable.rootContainerTypesMod.IRootContainerViewConfig
import typings.playable.rootContainerTypesMod.IRootContainerViewStyles
import typings.std.HTMLElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("playable/dist/src/modules/root-container/root-container.view", JSImport.Namespace)
@js.native
object rootContainerViewMod extends js.Object {
  
  @js.native
  trait RootContainerView
    extends typings.playable.stylableMod.default[IRootContainerViewStyles] {
    
    @JSName("_$rootElement")
    var _$rootElement: js.Any = js.native
    
    var _bindEvents: js.Any = js.native
    
    var _callbacks: js.Any = js.native
    
    var _unbindEvents: js.Any = js.native
    
    def appendComponentElement(element: HTMLElement): Unit = js.native
    
    def destroy(): Unit = js.native
    
    def getElement(): HTMLElement = js.native
    
    def getHeight(): Double = js.native
    
    def getWidth(): Double = js.native
    
    def hide(): Unit = js.native
    
    def setFillAllSpaceFlag(): Unit = js.native
    def setFillAllSpaceFlag(isFillAllSpace: Boolean): Unit = js.native
    
    def setFullScreenState(isFullScreen: Boolean): Unit = js.native
    
    def setHeight(height: Double): Unit = js.native
    
    def setRtl(rtl: Boolean): Unit = js.native
    
    def setWidth(width: Double): Unit = js.native
    
    def show(): Unit = js.native
  }
  
  @js.native
  class default protected () extends RootContainerView {
    def this(config: IRootContainerViewConfig) = this()
  }
}
