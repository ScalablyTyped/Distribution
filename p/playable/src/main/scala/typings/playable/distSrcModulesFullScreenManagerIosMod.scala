package typings.playable

import typings.playable.distSrcModulesFullScreenManagerTypesMod.IFullScreenHelper
import typings.std.EventListener
import typings.std.HTMLVideoElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distSrcModulesFullScreenManagerIosMod {
  
  @JSImport("playable/dist/src/modules/full-screen-manager/ios", JSImport.Default)
  @js.native
  open class default protected ()
    extends StObject
       with IOSFullScreen {
    def this(elem: HTMLVideoElement, callback: EventListener) = this()
    
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
  trait IOSFullScreen
    extends StObject
       with IFullScreenHelper {
    
    /* private */ @JSName("_$elem")
    var _$elem: Any = js.native
    
    /* private */ var _bindEvents: Any = js.native
    
    /* private */ var _callback: Any = js.native
    
    /* private */ var _enterWhenHasMetaData: Any = js.native
    
    /* private */ var _unbindEvents: Any = js.native
    
    @JSName("isAPIExist")
    def isAPIExist_MIOSFullScreen: Boolean = js.native
    
    @JSName("isEnabled")
    def isEnabled_MIOSFullScreen: Boolean = js.native
    
    @JSName("isInFullScreen")
    def isInFullScreen_MIOSFullScreen: Boolean = js.native
  }
}
