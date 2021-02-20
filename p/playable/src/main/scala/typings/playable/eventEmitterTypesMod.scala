package typings.playable

import typings.eventemitter3.mod.ListenerFn
import typings.std.Array
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object eventEmitterTypesMod {
  
  @js.native
  trait IEventEmitter extends StObject {
    
    def bindEvents(eventsMap: js.Array[IEventMap]): js.Function0[Unit] = js.native
    def bindEvents(eventsMap: js.Array[IEventMap], defaultFnContext: js.Any): js.Function0[Unit] = js.native
    
    def destroy(): Unit = js.native
    
    def emitAsync(event: String, args: js.Any*): js.Promise[Boolean] | Unit = js.native
    def emitAsync(event: js.Symbol, args: js.Any*): js.Promise[Boolean] | Unit = js.native
    
    def off(event: String): this.type = js.native
    def off(event: String, fn: js.UndefOr[scala.Nothing], context: js.UndefOr[scala.Nothing], once: Boolean): this.type = js.native
    def off(event: String, fn: js.UndefOr[scala.Nothing], context: js.Any): this.type = js.native
    def off(event: String, fn: js.UndefOr[scala.Nothing], context: js.Any, once: Boolean): this.type = js.native
    def off(event: String, fn: ListenerFn[js.Array[_]]): this.type = js.native
    def off(event: String, fn: ListenerFn[js.Array[_]], context: js.UndefOr[scala.Nothing], once: Boolean): this.type = js.native
    def off(event: String, fn: ListenerFn[js.Array[_]], context: js.Any): this.type = js.native
    def off(event: String, fn: ListenerFn[js.Array[_]], context: js.Any, once: Boolean): this.type = js.native
    
    def on(event: String, fn: ListenerFn[js.Array[_]]): this.type = js.native
    def on(event: String, fn: ListenerFn[js.Array[_]], context: js.Any): this.type = js.native
  }
  
  @js.native
  trait IEventEmitterAPI extends StObject {
    
    var off: js.UndefOr[
        js.Function4[
          /* event */ String, 
          /* fn */ js.UndefOr[ListenerFn[js.Array[_]]], 
          /* context */ js.UndefOr[js.Any], 
          /* once */ js.UndefOr[Boolean], 
          this.type
        ]
      ] = js.native
    
    var on: js.UndefOr[
        js.Function3[
          /* event */ String, 
          /* fn */ ListenerFn[js.Array[_]], 
          /* context */ js.UndefOr[js.Any], 
          this.type
        ]
      ] = js.native
  }
  object IEventEmitterAPI {
    
    @scala.inline
    def apply(): IEventEmitterAPI = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[IEventEmitterAPI]
    }
    
    @scala.inline
    implicit class IEventEmitterAPIMutableBuilder[Self <: IEventEmitterAPI] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setOff(
        value: (/* event */ String, /* fn */ js.UndefOr[ListenerFn[js.Array[_]]], /* context */ js.UndefOr[js.Any], /* once */ js.UndefOr[Boolean]) => IEventEmitterAPI
      ): Self = StObject.set(x, "off", js.Any.fromFunction4(value))
      
      @scala.inline
      def setOffUndefined: Self = StObject.set(x, "off", js.undefined)
      
      @scala.inline
      def setOn(
        value: (/* event */ String, /* fn */ ListenerFn[js.Array[_]], /* context */ js.UndefOr[js.Any]) => IEventEmitterAPI
      ): Self = StObject.set(x, "on", js.Any.fromFunction3(value))
      
      @scala.inline
      def setOnUndefined: Self = StObject.set(x, "on", js.undefined)
    }
  }
  
  @js.native
  trait IEventMap
    extends Array[js.Any]
}
