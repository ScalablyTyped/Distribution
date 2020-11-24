package typings.playable

import typings.eventemitter3.mod.EventEmitter
import typings.eventemitter3.mod.ListenerFn
import typings.playable.eventEmitterTypesMod.IEventEmitter
import typings.playable.eventEmitterTypesMod.IEventMap
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("playable/dist/src/modules/event-emitter/event-emitter", JSImport.Namespace)
@js.native
object eventEmitterMod extends js.Object {
  
  @js.native
  trait EventEmitterModule
    extends EventEmitter[String | js.Symbol, js.Any]
       with IEventEmitter {
    
    def bindEvents(eventsMap: js.Array[IEventMap], defaultFnContext: js.Object): js.Function0[Unit] = js.native
    
    /**
      * The `.once()` method is identical to `.on()`, except that the handler for a given element and event type is unbound after its first invocation.
      *
      * @param event - The Event name, such as `Playable.UI_EVENTS.PLAY_CLICK`
      * @param fn - A function callback to execute when the event is triggered.
      * @param context - Value to use as `this` (i.e the reference Object) when executing callback.
      *
      * @example
      * const Playable = require('playable');
      * const player = Playable.create();
      *
      * player.once(Playable.UI_EVENTS.PLAY_CLICK, () => {
      *   // Will be executed only one time
      * });
      */
    def once(event: String, fn: ListenerFn[js.Array[_]]): this.type = js.native
    def once(event: String, fn: ListenerFn[js.Array[_]], context: js.Any): this.type = js.native
  }
  
  @js.native
  class default () extends EventEmitterModule
  /* static members */
  @js.native
  object default extends js.Object {
    
    var moduleName: String = js.native
  }
}
