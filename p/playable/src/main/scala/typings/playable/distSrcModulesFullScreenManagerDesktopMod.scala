package typings.playable

import typings.playable.distSrcModulesFullScreenManagerTypesMod.IFullScreenHelper
import typings.std.EventListener
import typings.std.HTMLElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distSrcModulesFullScreenManagerDesktopMod {
  
  @JSImport("playable/dist/src/modules/full-screen-manager/desktop", JSImport.Default)
  @js.native
  open class default protected ()
    extends StObject
       with DesktopFullScreen {
    def this(elem: HTMLElement, callback: EventListener) = this()
    
    /* CompleteClass */
    override def destroy(): Unit = js.native
    
    /* CompleteClass */
    override def exit(): Unit = js.native
    
    /* CompleteClass */
    var isAPIExist: Boolean = js.native
    
    /* CompleteClass */
    var isEnabled: Boolean = js.native
    
    /* CompleteClass */
    var isInFullScreen: Boolean = js.native
    
    /* CompleteClass */
    override def request(): Unit = js.native
  }
  
  @js.native
  trait DesktopFullScreen
    extends StObject
       with IFullScreenHelper {
    
    /* private */ @JSName("_$elem")
    var _$elem: Any = js.native
    
    /* private */ var _bindEvents: Any = js.native
    
    /* private */ var _callback: Any = js.native
    
    /* private */ var _fullscreenFn: Any = js.native
    
    /* private */ var _unbindEvents: Any = js.native
    
    @JSName("isAPIExist")
    def isAPIExist_MDesktopFullScreen: Boolean = js.native
    
    @JSName("isEnabled")
    def isEnabled_MDesktopFullScreen: Any = js.native
    
    @JSName("isInFullScreen")
    def isInFullScreen_MDesktopFullScreen: Boolean = js.native
  }
}
