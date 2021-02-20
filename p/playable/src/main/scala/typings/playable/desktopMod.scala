package typings.playable

import typings.playable.fullScreenManagerTypesMod.IFullScreenHelper
import typings.std.EventListener
import typings.std.HTMLElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object desktopMod {
  
  @JSImport("playable/dist/src/modules/full-screen-manager/desktop", JSImport.Default)
  @js.native
  class default protected () extends DesktopFullScreen {
    def this(elem: HTMLElement, callback: EventListener) = this()
  }
  
  @js.native
  trait DesktopFullScreen extends IFullScreenHelper {
    
    @JSName("_$elem")
    var _$elem: js.Any = js.native
    
    var _bindEvents: js.Any = js.native
    
    var _callback: js.Any = js.native
    
    var _fullscreenFn: js.Any = js.native
    
    var _unbindEvents: js.Any = js.native
    
    @JSName("isAPIExist")
    def isAPIExist_MDesktopFullScreen: Boolean = js.native
    
    @JSName("isEnabled")
    def isEnabled_MDesktopFullScreen: js.Any = js.native
    
    @JSName("isInFullScreen")
    def isInFullScreen_MDesktopFullScreen: Boolean = js.native
  }
}
