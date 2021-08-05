package typings.playable

import org.scalablytyped.runtime.StringDictionary
import typings.eventemitter3.mod.ListenerFn
import typings.std.HTMLElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object keyboardInterceptorMod {
  
  @JSImport("playable/dist/src/utils/keyboard-interceptor", JSImport.Default)
  @js.native
  class default protected ()
    extends StObject
       with KeyboardInterceptorCore {
    def this(element: HTMLElement) = this()
    def this(element: HTMLElement, callbacks: ICallbacks) = this()
  }
  
  object KEYCODES {
    
    @JSImport("playable/dist/src/utils/keyboard-interceptor", "KEYCODES")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("playable/dist/src/utils/keyboard-interceptor", "KEYCODES.DEBUG_KEY")
    @js.native
    def DEBUG_KEY: Double = js.native
    inline def DEBUG_KEY_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("DEBUG_KEY")(x.asInstanceOf[js.Any])
    
    @JSImport("playable/dist/src/utils/keyboard-interceptor", "KEYCODES.DOWN_ARROW")
    @js.native
    def DOWN_ARROW: Double = js.native
    inline def DOWN_ARROW_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("DOWN_ARROW")(x.asInstanceOf[js.Any])
    
    @JSImport("playable/dist/src/utils/keyboard-interceptor", "KEYCODES.ENTER")
    @js.native
    def ENTER: Double = js.native
    inline def ENTER_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("ENTER")(x.asInstanceOf[js.Any])
    
    @JSImport("playable/dist/src/utils/keyboard-interceptor", "KEYCODES.LEFT_ARROW")
    @js.native
    def LEFT_ARROW: Double = js.native
    inline def LEFT_ARROW_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("LEFT_ARROW")(x.asInstanceOf[js.Any])
    
    @JSImport("playable/dist/src/utils/keyboard-interceptor", "KEYCODES.RIGHT_ARROW")
    @js.native
    def RIGHT_ARROW: Double = js.native
    inline def RIGHT_ARROW_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("RIGHT_ARROW")(x.asInstanceOf[js.Any])
    
    @JSImport("playable/dist/src/utils/keyboard-interceptor", "KEYCODES.SPACE_BAR")
    @js.native
    def SPACE_BAR: Double = js.native
    inline def SPACE_BAR_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("SPACE_BAR")(x.asInstanceOf[js.Any])
    
    @JSImport("playable/dist/src/utils/keyboard-interceptor", "KEYCODES.TAB")
    @js.native
    def TAB: Double = js.native
    inline def TAB_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("TAB")(x.asInstanceOf[js.Any])
    
    @JSImport("playable/dist/src/utils/keyboard-interceptor", "KEYCODES.UP_ARROW")
    @js.native
    def UP_ARROW: Double = js.native
    inline def UP_ARROW_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("UP_ARROW")(x.asInstanceOf[js.Any])
  }
  
  type ICallbacks = StringDictionary[ListenerFn[js.Array[js.Any]]]
  
  @js.native
  trait KeyboardInterceptorCore extends StObject {
    
    /* private */ var _attachCallbacks: js.Any = js.native
    
    /* private */ var _bindCallbacks: js.Any = js.native
    
    /* private */ var _bindEvents: js.Any = js.native
    
    /* private */ var _element: js.Any = js.native
    
    /* private */ var _eventEmitter: js.Any = js.native
    
    /* private */ def _isDestroyed: js.Any = js.native
    
    /* private */ var _processKeyboardInput: js.Any = js.native
    
    /* private */ var _unattachCallbacks: js.Any = js.native
    
    /* private */ var _unbindEvents: js.Any = js.native
    
    def addCallbacks(callbacks: ICallbacks): Unit = js.native
    
    def destroy(): Unit = js.native
  }
}
