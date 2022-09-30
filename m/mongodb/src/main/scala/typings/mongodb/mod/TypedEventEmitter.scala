package typings.mongodb.mod

import typings.node.eventsMod.EventEmitter
import typings.node.eventsMod.EventEmitterOptions
import typings.std.Parameters
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("mongodb", "TypedEventEmitter")
@js.native
open class TypedEventEmitter[Events /* <: EventsDescription */] () extends EventEmitter {
  def this(options: EventEmitterOptions) = this()
  
  def addListener(event: String, listener: GenericListener): this.type = js.native
  def addListener(event: js.Symbol, listener: GenericListener): this.type = js.native
  def addListener(
    event: CommonEvents,
    listener: js.Function2[/* eventName */ String | js.Symbol, /* listener */ GenericListener, Unit]
  ): this.type = js.native
  def addListener[EventKey /* <: /* keyof Events */ String */](
    event: EventKey,
    listener: /* import warning: importer.ImportType#apply Failed type conversion: Events[EventKey] */ js.Any
  ): this.type = js.native
  
  def emit[EventKey /* <: /* keyof Events */ String */](
    event: EventKey,
    /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Parameters<Events[EventKey]> is not an array type */ args: Parameters[
      /* import warning: importer.ImportType#apply Failed type conversion: Events[EventKey] */ js.Any
    ]
  ): Boolean = js.native
  def emit[EventKey /* <: /* keyof Events */ String */](
    event: js.Symbol,
    /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Parameters<Events[EventKey]> is not an array type */ args: Parameters[
      /* import warning: importer.ImportType#apply Failed type conversion: Events[EventKey] */ js.Any
    ]
  ): Boolean = js.native
  
  def listenerCount[EventKey /* <: /* keyof Events */ String */](`type`: EventKey): scala.Double = js.native
  def listenerCount[EventKey /* <: /* keyof Events */ String */](`type`: CommonEvents): scala.Double = js.native
  
  def listeners[EventKey /* <: /* keyof Events */ String */](event: EventKey): js.Array[
    /* import warning: importer.ImportType#apply Failed type conversion: Events[EventKey] */ js.Any
  ] = js.native
  def listeners[EventKey /* <: /* keyof Events */ String */](event: CommonEvents): js.Array[
    /* import warning: importer.ImportType#apply Failed type conversion: Events[EventKey] */ js.Any
  ] = js.native
  
  def off(event: String, listener: GenericListener): this.type = js.native
  def off(event: js.Symbol, listener: GenericListener): this.type = js.native
  def off(
    event: CommonEvents,
    listener: js.Function2[/* eventName */ String | js.Symbol, /* listener */ GenericListener, Unit]
  ): this.type = js.native
  def off[EventKey /* <: /* keyof Events */ String */](
    event: EventKey,
    listener: /* import warning: importer.ImportType#apply Failed type conversion: Events[EventKey] */ js.Any
  ): this.type = js.native
  
  def on(event: String, listener: GenericListener): this.type = js.native
  def on(event: js.Symbol, listener: GenericListener): this.type = js.native
  def on(
    event: CommonEvents,
    listener: js.Function2[/* eventName */ String | js.Symbol, /* listener */ GenericListener, Unit]
  ): this.type = js.native
  def on[EventKey /* <: /* keyof Events */ String */](
    event: EventKey,
    listener: /* import warning: importer.ImportType#apply Failed type conversion: Events[EventKey] */ js.Any
  ): this.type = js.native
  
  def once(event: String, listener: GenericListener): this.type = js.native
  def once(event: js.Symbol, listener: GenericListener): this.type = js.native
  def once(
    event: CommonEvents,
    listener: js.Function2[/* eventName */ String | js.Symbol, /* listener */ GenericListener, Unit]
  ): this.type = js.native
  def once[EventKey /* <: /* keyof Events */ String */](
    event: EventKey,
    listener: /* import warning: importer.ImportType#apply Failed type conversion: Events[EventKey] */ js.Any
  ): this.type = js.native
  
  def prependListener(event: String, listener: GenericListener): this.type = js.native
  def prependListener(event: js.Symbol, listener: GenericListener): this.type = js.native
  def prependListener(
    event: CommonEvents,
    listener: js.Function2[/* eventName */ String | js.Symbol, /* listener */ GenericListener, Unit]
  ): this.type = js.native
  def prependListener[EventKey /* <: /* keyof Events */ String */](
    event: EventKey,
    listener: /* import warning: importer.ImportType#apply Failed type conversion: Events[EventKey] */ js.Any
  ): this.type = js.native
  
  def prependOnceListener(event: String, listener: GenericListener): this.type = js.native
  def prependOnceListener(event: js.Symbol, listener: GenericListener): this.type = js.native
  def prependOnceListener(
    event: CommonEvents,
    listener: js.Function2[/* eventName */ String | js.Symbol, /* listener */ GenericListener, Unit]
  ): this.type = js.native
  def prependOnceListener[EventKey /* <: /* keyof Events */ String */](
    event: EventKey,
    listener: /* import warning: importer.ImportType#apply Failed type conversion: Events[EventKey] */ js.Any
  ): this.type = js.native
  
  def rawListeners[EventKey /* <: /* keyof Events */ String */](event: EventKey): js.Array[
    /* import warning: importer.ImportType#apply Failed type conversion: Events[EventKey] */ js.Any
  ] = js.native
  def rawListeners[EventKey /* <: /* keyof Events */ String */](event: CommonEvents): js.Array[
    /* import warning: importer.ImportType#apply Failed type conversion: Events[EventKey] */ js.Any
  ] = js.native
  
  def removeAllListeners[EventKey /* <: /* keyof Events */ String */](event: EventKey): this.type = js.native
  def removeAllListeners[EventKey /* <: /* keyof Events */ String */](event: CommonEvents): this.type = js.native
  
  def removeListener(event: String, listener: GenericListener): this.type = js.native
  def removeListener(event: js.Symbol, listener: GenericListener): this.type = js.native
  def removeListener(
    event: CommonEvents,
    listener: js.Function2[/* eventName */ String | js.Symbol, /* listener */ GenericListener, Unit]
  ): this.type = js.native
  def removeListener[EventKey /* <: /* keyof Events */ String */](
    event: EventKey,
    listener: /* import warning: importer.ImportType#apply Failed type conversion: Events[EventKey] */ js.Any
  ): this.type = js.native
}
