package typings.playable

import typings.playable.anon.EventEmitter
import typings.playable.keyboardControlTypesMod.IKeyboardControl
import typings.std.EventListener
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object keyboardControlMod {
  
  @JSImport("playable/dist/src/modules/keyboard-control/keyboard-control", JSImport.Default)
  @js.native
  class default protected ()
    extends StObject
       with KeyboardControl {
    def this(hasConfigEventEmitterRootContainerEngine: EventEmitter) = this()
    
    /* private */ /* CompleteClass */
    var _attachDefaultControls: js.Any = js.native
    
    /* private */ /* CompleteClass */
    var _destroyInterceptor: js.Any = js.native
    
    /* private */ /* CompleteClass */
    var _engine: js.Any = js.native
    
    /* private */ /* CompleteClass */
    var _eventEmitter: js.Any = js.native
    
    /* private */ /* CompleteClass */
    var _initInterceptor: js.Any = js.native
    
    /* private */ /* CompleteClass */
    var _isEnabled: js.Any = js.native
    
    /* private */ /* CompleteClass */
    var _keyboardInterceptor: js.Any = js.native
    
    /* CompleteClass */
    override def addKeyControl(key: Double, callback: EventListener): Unit = js.native
    
    /* CompleteClass */
    override def destroy(): Unit = js.native
  }
  /* static members */
  object default {
    
    @JSImport("playable/dist/src/modules/keyboard-control/keyboard-control", JSImport.Default)
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("playable/dist/src/modules/keyboard-control/keyboard-control", "default.dependencies")
    @js.native
    def dependencies: js.Array[String] = js.native
    inline def dependencies_=(x: js.Array[String]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("dependencies")(x.asInstanceOf[js.Any])
    
    @JSImport("playable/dist/src/modules/keyboard-control/keyboard-control", "default.moduleName")
    @js.native
    def moduleName: String = js.native
    inline def moduleName_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("moduleName")(x.asInstanceOf[js.Any])
  }
  
  @JSImport("playable/dist/src/modules/keyboard-control/keyboard-control", "AMOUNT_TO_CHANGE_VOLUME")
  @js.native
  val AMOUNT_TO_CHANGE_VOLUME: /* 10 */ Double = js.native
  
  @JSImport("playable/dist/src/modules/keyboard-control/keyboard-control", "AMOUNT_TO_SKIP_SECONDS")
  @js.native
  val AMOUNT_TO_SKIP_SECONDS: /* 5 */ Double = js.native
  
  trait KeyboardControl
    extends StObject
       with IKeyboardControl {
    
    /* private */ var _attachDefaultControls: js.Any
    
    /* private */ var _destroyInterceptor: js.Any
    
    /* private */ var _engine: js.Any
    
    /* private */ var _eventEmitter: js.Any
    
    /* private */ var _initInterceptor: js.Any
    
    /* private */ var _isEnabled: js.Any
    
    /* private */ var _keyboardInterceptor: js.Any
  }
  object KeyboardControl {
    
    inline def apply(
      _attachDefaultControls: js.Any,
      _destroyInterceptor: js.Any,
      _engine: js.Any,
      _eventEmitter: js.Any,
      _initInterceptor: js.Any,
      _isEnabled: js.Any,
      _keyboardInterceptor: js.Any,
      addKeyControl: (Double, EventListener) => Unit,
      destroy: () => Unit
    ): KeyboardControl = {
      val __obj = js.Dynamic.literal(_attachDefaultControls = _attachDefaultControls.asInstanceOf[js.Any], _destroyInterceptor = _destroyInterceptor.asInstanceOf[js.Any], _engine = _engine.asInstanceOf[js.Any], _eventEmitter = _eventEmitter.asInstanceOf[js.Any], _initInterceptor = _initInterceptor.asInstanceOf[js.Any], _isEnabled = _isEnabled.asInstanceOf[js.Any], _keyboardInterceptor = _keyboardInterceptor.asInstanceOf[js.Any], addKeyControl = js.Any.fromFunction2(addKeyControl), destroy = js.Any.fromFunction0(destroy))
      __obj.asInstanceOf[KeyboardControl]
    }
    
    extension [Self <: KeyboardControl](x: Self) {
      
      inline def set_attachDefaultControls(value: js.Any): Self = StObject.set(x, "_attachDefaultControls", value.asInstanceOf[js.Any])
      
      inline def set_destroyInterceptor(value: js.Any): Self = StObject.set(x, "_destroyInterceptor", value.asInstanceOf[js.Any])
      
      inline def set_engine(value: js.Any): Self = StObject.set(x, "_engine", value.asInstanceOf[js.Any])
      
      inline def set_eventEmitter(value: js.Any): Self = StObject.set(x, "_eventEmitter", value.asInstanceOf[js.Any])
      
      inline def set_initInterceptor(value: js.Any): Self = StObject.set(x, "_initInterceptor", value.asInstanceOf[js.Any])
      
      inline def set_isEnabled(value: js.Any): Self = StObject.set(x, "_isEnabled", value.asInstanceOf[js.Any])
      
      inline def set_keyboardInterceptor(value: js.Any): Self = StObject.set(x, "_keyboardInterceptor", value.asInstanceOf[js.Any])
    }
  }
}
