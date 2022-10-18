package typings.playable

import typings.playable.distSrcModulesRootContainerTypesMod.IRootContainerViewConfig
import typings.playable.distSrcModulesRootContainerTypesMod.IRootContainerViewStyles
import typings.std.HTMLElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distSrcModulesRootContainerRootContainerDotviewMod {
  
  @JSImport("playable/dist/src/modules/root-container/root-container.view", JSImport.Default)
  @js.native
  open class default protected () extends RootContainerView {
    def this(config: IRootContainerViewConfig) = this()
  }
  
  @js.native
  trait RootContainerView
    extends typings.playable.distSrcModulesUiCoreViewMod.default[IRootContainerViewStyles] {
    
    /* private */ @JSName("_$rootElement")
    var _$rootElement: Any = js.native
    
    /* private */ var _bindEvents: Any = js.native
    
    /* private */ var _callbacks: Any = js.native
    
    /* private */ var _unbindEvents: Any = js.native
    
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
}
