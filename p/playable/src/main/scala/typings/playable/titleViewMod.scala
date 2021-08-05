package typings.playable

import typings.playable.titleTypesMod.ITitleViewConfig
import typings.playable.titleTypesMod.ITitleViewStyles
import typings.std.HTMLElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object titleViewMod {
  
  @JSImport("playable/dist/src/modules/ui/title/title.view", JSImport.Default)
  @js.native
  class default protected () extends TitleView {
    def this(config: ITitleViewConfig) = this()
  }
  
  @js.native
  trait TitleView
    extends typings.playable.viewMod.default[ITitleViewStyles] {
    
    /* private */ @JSName("_$rootElement")
    var _$rootElement: js.Any = js.native
    
    /* private */ var _bindEvents: js.Any = js.native
    
    /* private */ var _callbacks: js.Any = js.native
    
    /* private */ var _initDOM: js.Any = js.native
    
    /* private */ var _unbindEvents: js.Any = js.native
    
    def destroy(): Unit = js.native
    
    def getElement(): HTMLElement = js.native
    
    def hide(): Unit = js.native
    
    def setDisplayAsLink(flag: Boolean): Unit = js.native
    
    def setTitle(): Unit = js.native
    def setTitle(title: String): Unit = js.native
    
    def show(): Unit = js.native
  }
}
