package typings.plottable

import typings.plottable.dispatcherMod.Dispatcher
import typings.std.KeyboardEvent
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object keyDispatcherMod {
  
  @JSImport("plottable/build/src/dispatchers/keyDispatcher", "Key")
  @js.native
  /**
    * This constructor should not be invoked directly.
    *
    * @constructor
    */
  open class Key () extends Dispatcher {
    
    /* private */ var _processKeydown: Any = js.native
    
    /* private */ var _processKeyup: Any = js.native
    
    /**
      * Removes the callback to be called whenever a key is pressed.
      *
      * @param {KeyCallback} callback
      * @return {Dispatchers.Key} The calling Key Dispatcher.
      */
    def offKeyDown(callback: KeyCallback): this.type = js.native
    
    /**
      * Removes the callback to be called whenever a key is released.
      *
      * @param {KeyCallback} callback
      * @return {Dispatchers.Key} The calling Key Dispatcher.
      */
    def offKeyUp(callback: KeyCallback): this.type = js.native
    
    /**
      * Registers a callback to be called whenever a key is pressed.
      *
      * @param {KeyCallback} callback
      * @return {Dispatchers.Key} The calling Key Dispatcher.
      */
    def onKeyDown(callback: KeyCallback): this.type = js.native
    
    /** Registers a callback to be called whenever a key is released.
      *
      * @param {KeyCallback} callback
      * @return {Dispatchers.Key} The calling Key Dispatcher.
      */
    def onKeyUp(callback: KeyCallback): this.type = js.native
  }
  /* static members */
  object Key {
    
    @JSImport("plottable/build/src/dispatchers/keyDispatcher", "Key")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("plottable/build/src/dispatchers/keyDispatcher", "Key._DISPATCHER_KEY")
    @js.native
    def _DISPATCHER_KEY: Any = js.native
    inline def _DISPATCHER_KEY_=(x: Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("_DISPATCHER_KEY")(x.asInstanceOf[js.Any])
    
    @JSImport("plottable/build/src/dispatchers/keyDispatcher", "Key._KEYDOWN_EVENT_NAME")
    @js.native
    def _KEYDOWN_EVENT_NAME: Any = js.native
    inline def _KEYDOWN_EVENT_NAME_=(x: Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("_KEYDOWN_EVENT_NAME")(x.asInstanceOf[js.Any])
    
    @JSImport("plottable/build/src/dispatchers/keyDispatcher", "Key._KEYUP_EVENT_NAME")
    @js.native
    def _KEYUP_EVENT_NAME: Any = js.native
    inline def _KEYUP_EVENT_NAME_=(x: Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("_KEYUP_EVENT_NAME")(x.asInstanceOf[js.Any])
    
    /**
      * Gets a Key Dispatcher. If one already exists it will be returned;
      * otherwise, a new one will be created.
      *
      * @return {Dispatchers.Key}
      */
    inline def getDispatcher(): typings.plottable.dispatchersMod.Key = ^.asInstanceOf[js.Dynamic].applyDynamic("getDispatcher")().asInstanceOf[typings.plottable.dispatchersMod.Key]
  }
  
  type KeyCallback = js.Function2[/* keyCode */ Double, /* event */ KeyboardEvent, Unit]
}
