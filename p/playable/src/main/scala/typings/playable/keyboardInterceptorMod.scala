package typings.playable

import org.scalablytyped.runtime.StringDictionary
import typings.eventemitter3.mod.ListenerFn
import typings.std.HTMLElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("playable/dist/src/utils/keyboard-interceptor", JSImport.Namespace)
@js.native
object keyboardInterceptorMod extends js.Object {
  
  @js.native
  object KEYCODES extends js.Object {
    
    var DEBUG_KEY: Double = js.native
    
    var DOWN_ARROW: Double = js.native
    
    var ENTER: Double = js.native
    
    var LEFT_ARROW: Double = js.native
    
    var RIGHT_ARROW: Double = js.native
    
    var SPACE_BAR: Double = js.native
    
    var TAB: Double = js.native
    
    var UP_ARROW: Double = js.native
  }
  
  @js.native
  trait KeyboardInterceptorCore extends js.Object {
    
    var _attachCallbacks: js.Any = js.native
    
    var _bindCallbacks: js.Any = js.native
    
    var _bindEvents: js.Any = js.native
    
    var _element: js.Any = js.native
    
    var _eventEmitter: js.Any = js.native
    
    /* private */ def _isDestroyed: js.Any = js.native
    
    var _processKeyboardInput: js.Any = js.native
    
    var _unattachCallbacks: js.Any = js.native
    
    var _unbindEvents: js.Any = js.native
    
    def addCallbacks(callbacks: ICallbacks): Unit = js.native
    
    def destroy(): Unit = js.native
  }
  
  @js.native
  class default protected () extends KeyboardInterceptorCore {
    def this(element: HTMLElement) = this()
    def this(element: HTMLElement, callbacks: ICallbacks) = this()
  }
  
  type ICallbacks = StringDictionary[ListenerFn[js.Array[js.Any]]]
}
