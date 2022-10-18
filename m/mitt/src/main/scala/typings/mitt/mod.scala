package typings.mitt

import typings.mitt.mittStrings.Asterisk
import typings.std.Map
import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("mitt", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def default[Events /* <: Record[EventType, Any] */](): Emitter[Events] = ^.asInstanceOf[js.Dynamic].applyDynamic("default")().asInstanceOf[Emitter[Events]]
  inline def default[Events /* <: Record[EventType, Any] */](all: EventHandlerMap[Events]): Emitter[Events] = ^.asInstanceOf[js.Dynamic].applyDynamic("default")(all.asInstanceOf[js.Any]).asInstanceOf[Emitter[Events]]
  
  @js.native
  trait Emitter[Events /* <: Record[EventType, Any] */] extends StObject {
    
    var all: EventHandlerMap[Events] = js.native
    
    def emit[Key /* <: /* keyof Events */ String */](
      `type`: Key,
      event: /* import warning: importer.ImportType#apply Failed type conversion: Events[Key] */ js.Any
    ): Unit = js.native
    def emit[Key /* <: /* keyof Events */ String */](
      `type`: /* import warning: importer.ImportType#apply Failed type conversion: undefined extends Events[Key] ? Key : never */ js.Any
    ): Unit = js.native
    
    def off(`type`: Asterisk, handler: WildcardHandler[Events]): Unit = js.native
    def off[Key /* <: /* keyof Events */ String */](`type`: Key): Unit = js.native
    def off[Key /* <: /* keyof Events */ String */](
      `type`: Key,
      handler: Handler[
          /* import warning: importer.ImportType#apply Failed type conversion: Events[Key] */ js.Any
        ]
    ): Unit = js.native
    
    def on(`type`: Asterisk, handler: WildcardHandler[Events]): Unit = js.native
    def on[Key /* <: /* keyof Events */ String */](
      `type`: Key,
      handler: Handler[
          /* import warning: importer.ImportType#apply Failed type conversion: Events[Key] */ js.Any
        ]
    ): Unit = js.native
  }
  
  type EventHandlerList[T] = js.Array[Handler[T]]
  
  type EventHandlerMap[Events /* <: Record[EventType, Any] */] = Map[
    (/* keyof Events */ String) | Asterisk, 
    (EventHandlerList[
      /* import warning: importer.ImportType#apply Failed type conversion: Events[keyof Events] */ js.Any
    ]) | WildCardEventHandlerList[Events]
  ]
  
  type EventType = String | js.Symbol
  
  type Handler[T] = js.Function1[/* event */ T, Unit]
  
  type WildCardEventHandlerList[T] = js.Array[WildcardHandler[T]]
  
  type WildcardHandler[T] = js.Function2[
    /* keyof T */ /* type */ String, 
    /* import warning: importer.ImportType#apply Failed type conversion: T[keyof T] */ /* event */ js.Any, 
    Unit
  ]
}
