package typings.openfin

import typings.node.eventsMod.EventEmitter
import typings.openfin.emitterMapMod.EmitterAccessor
import typings.openfin.eventsBaseMod.BaseEventMap
import typings.openfin.identityMod.Identity
import typings.openfin.transportMod.default
import typings.std.Extract
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object baseMod {
  
  @JSImport("openfin/_v2/api/base", "Base")
  @js.native
  open class Base protected () extends StObject {
    def this(wire: default) = this()
    
    /* private */ var _topic: Any = js.native
    
    /* protected */ def isNodeEnvironment(): Boolean = js.native
    
    /* protected */ def isOpenFinEnvironment(): Boolean = js.native
    
    def me: Identity = js.native
    
    /* protected */ def topic: String = js.native
    /* protected */ def topic_=(t: String): Unit = js.native
    
    var wire: default = js.native
  }
  
  @JSImport("openfin/_v2/api/base", "EmitterBase")
  @js.native
  open class EmitterBase[EventTypes /* <: BaseEventMap */] protected () extends Base {
    def this(wire: default, emitterAccessor: EmitterAccessor) = this()
    
    def addListener(
      eventType: String,
      listener: js.Function2[
          /* import warning: importer.ImportType#apply Failed type conversion: EventTypes[string] */ /* payload */ js.Any, 
          /* repeated */ Any, 
          Unit
        ]
    ): js.Promise[this.type] = js.native
    def addListener(
      eventType: String,
      listener: js.Function2[
          /* import warning: importer.ImportType#apply Failed type conversion: EventTypes[string] */ /* payload */ js.Any, 
          /* repeated */ Any, 
          Unit
        ],
      options: SubOptions
    ): js.Promise[this.type] = js.native
    def addListener(
      eventType: js.Symbol,
      listener: js.Function2[
          /* import warning: importer.ImportType#apply Failed type conversion: EventTypes[symbol] */ /* payload */ js.Any, 
          /* repeated */ Any, 
          Unit
        ]
    ): js.Promise[this.type] = js.native
    def addListener(
      eventType: js.Symbol,
      listener: js.Function2[
          /* import warning: importer.ImportType#apply Failed type conversion: EventTypes[symbol] */ /* payload */ js.Any, 
          /* repeated */ Any, 
          Unit
        ],
      options: SubOptions
    ): js.Promise[this.type] = js.native
    def addListener[E /* <: /* keyof EventTypes */ String */](
      eventType: E,
      listener: js.Function2[
          /* import warning: importer.ImportType#apply Failed type conversion: EventTypes[E] */ /* payload */ js.Any, 
          /* repeated */ Any, 
          Unit
        ]
    ): js.Promise[this.type] = js.native
    def addListener[E /* <: /* keyof EventTypes */ String */](
      eventType: E,
      listener: js.Function2[
          /* import warning: importer.ImportType#apply Failed type conversion: EventTypes[E] */ /* payload */ js.Any, 
          /* repeated */ Any, 
          Unit
        ],
      options: SubOptions
    ): js.Promise[this.type] = js.native
    
    /* private */ var deleteEmitterIfNothingRegistered: Any = js.native
    
    /* protected */ def deregisterAllListeners(eventType: (Extract[/* keyof EventTypes */ String, String]) | String): js.Promise[EventEmitter | Unit] = js.native
    /* protected */ def deregisterAllListeners(eventType: js.Symbol): js.Promise[EventEmitter | Unit] = js.native
    
    /* protected */ def deregisterEventListener(eventType: (Extract[/* keyof EventTypes */ String, String]) | String): js.Promise[Unit | EventEmitter] = js.native
    /* protected */ def deregisterEventListener(eventType: (Extract[/* keyof EventTypes */ String, String]) | String, options: SubOptions): js.Promise[Unit | EventEmitter] = js.native
    /* protected */ def deregisterEventListener(eventType: js.Symbol): js.Promise[Unit | EventEmitter] = js.native
    /* protected */ def deregisterEventListener(eventType: js.Symbol, options: SubOptions): js.Promise[Unit | EventEmitter] = js.native
    
    def emit(
      eventName: String,
      payload: /* import warning: importer.ImportType#apply Failed type conversion: EventTypes[string] */ js.Any,
      args: Any*
    ): Boolean = js.native
    def emit(
      eventName: js.Symbol,
      payload: /* import warning: importer.ImportType#apply Failed type conversion: EventTypes[symbol] */ js.Any,
      args: Any*
    ): Boolean = js.native
    def emit[E /* <: /* keyof EventTypes */ String */](
      eventName: E,
      payload: /* import warning: importer.ImportType#apply Failed type conversion: EventTypes[E] */ js.Any,
      args: Any*
    ): Boolean = js.native
    
    /* private */ var emitterAccessor: Any = js.native
    
    def eventNames(): js.Array[String | js.Symbol] = js.native
    
    /* private */ var getEmitter: Any = js.native
    
    /* private */ var hasEmitter: Any = js.native
    
    /* protected */ var identity: Identity = js.native
    
    def listenerCount(`type`: String): Double = js.native
    def listenerCount(`type`: js.Symbol): Double = js.native
    
    def listeners(`type`: String): js.Array[js.Function] = js.native
    def listeners(`type`: js.Symbol): js.Array[js.Function] = js.native
    
    def on(
      eventType: String,
      listener: js.Function2[
          /* import warning: importer.ImportType#apply Failed type conversion: EventTypes[string] */ /* payload */ js.Any, 
          /* repeated */ Any, 
          Unit
        ]
    ): js.Promise[this.type] = js.native
    def on(
      eventType: String,
      listener: js.Function2[
          /* import warning: importer.ImportType#apply Failed type conversion: EventTypes[string] */ /* payload */ js.Any, 
          /* repeated */ Any, 
          Unit
        ],
      options: SubOptions
    ): js.Promise[this.type] = js.native
    def on(
      eventType: js.Symbol,
      listener: js.Function2[
          /* import warning: importer.ImportType#apply Failed type conversion: EventTypes[symbol] */ /* payload */ js.Any, 
          /* repeated */ Any, 
          Unit
        ]
    ): js.Promise[this.type] = js.native
    def on(
      eventType: js.Symbol,
      listener: js.Function2[
          /* import warning: importer.ImportType#apply Failed type conversion: EventTypes[symbol] */ /* payload */ js.Any, 
          /* repeated */ Any, 
          Unit
        ],
      options: SubOptions
    ): js.Promise[this.type] = js.native
    def on[E /* <: /* keyof EventTypes */ String */](
      eventType: E,
      listener: js.Function2[
          /* import warning: importer.ImportType#apply Failed type conversion: EventTypes[E] */ /* payload */ js.Any, 
          /* repeated */ Any, 
          Unit
        ]
    ): js.Promise[this.type] = js.native
    def on[E /* <: /* keyof EventTypes */ String */](
      eventType: E,
      listener: js.Function2[
          /* import warning: importer.ImportType#apply Failed type conversion: EventTypes[E] */ /* payload */ js.Any, 
          /* repeated */ Any, 
          Unit
        ],
      options: SubOptions
    ): js.Promise[this.type] = js.native
    
    def once(
      eventType: String,
      listener: js.Function2[
          /* import warning: importer.ImportType#apply Failed type conversion: EventTypes[string] */ /* payload */ js.Any, 
          /* repeated */ Any, 
          Unit
        ]
    ): js.Promise[this.type] = js.native
    def once(
      eventType: String,
      listener: js.Function2[
          /* import warning: importer.ImportType#apply Failed type conversion: EventTypes[string] */ /* payload */ js.Any, 
          /* repeated */ Any, 
          Unit
        ],
      options: SubOptions
    ): js.Promise[this.type] = js.native
    def once(
      eventType: js.Symbol,
      listener: js.Function2[
          /* import warning: importer.ImportType#apply Failed type conversion: EventTypes[symbol] */ /* payload */ js.Any, 
          /* repeated */ Any, 
          Unit
        ]
    ): js.Promise[this.type] = js.native
    def once(
      eventType: js.Symbol,
      listener: js.Function2[
          /* import warning: importer.ImportType#apply Failed type conversion: EventTypes[symbol] */ /* payload */ js.Any, 
          /* repeated */ Any, 
          Unit
        ],
      options: SubOptions
    ): js.Promise[this.type] = js.native
    def once[E /* <: /* keyof EventTypes */ String */](
      eventType: E,
      listener: js.Function2[
          /* import warning: importer.ImportType#apply Failed type conversion: EventTypes[E] */ /* payload */ js.Any, 
          /* repeated */ Any, 
          Unit
        ]
    ): js.Promise[this.type] = js.native
    def once[E /* <: /* keyof EventTypes */ String */](
      eventType: E,
      listener: js.Function2[
          /* import warning: importer.ImportType#apply Failed type conversion: EventTypes[E] */ /* payload */ js.Any, 
          /* repeated */ Any, 
          Unit
        ],
      options: SubOptions
    ): js.Promise[this.type] = js.native
    
    def prependListener(
      eventType: String,
      listener: js.Function2[
          /* import warning: importer.ImportType#apply Failed type conversion: EventTypes[string] */ /* payload */ js.Any, 
          /* repeated */ Any, 
          Unit
        ]
    ): js.Promise[this.type] = js.native
    def prependListener(
      eventType: String,
      listener: js.Function2[
          /* import warning: importer.ImportType#apply Failed type conversion: EventTypes[string] */ /* payload */ js.Any, 
          /* repeated */ Any, 
          Unit
        ],
      options: SubOptions
    ): js.Promise[this.type] = js.native
    def prependListener(
      eventType: js.Symbol,
      listener: js.Function2[
          /* import warning: importer.ImportType#apply Failed type conversion: EventTypes[symbol] */ /* payload */ js.Any, 
          /* repeated */ Any, 
          Unit
        ]
    ): js.Promise[this.type] = js.native
    def prependListener(
      eventType: js.Symbol,
      listener: js.Function2[
          /* import warning: importer.ImportType#apply Failed type conversion: EventTypes[symbol] */ /* payload */ js.Any, 
          /* repeated */ Any, 
          Unit
        ],
      options: SubOptions
    ): js.Promise[this.type] = js.native
    def prependListener[E /* <: /* keyof EventTypes */ String */](
      eventType: E,
      listener: js.Function2[
          /* import warning: importer.ImportType#apply Failed type conversion: EventTypes[E] */ /* payload */ js.Any, 
          /* repeated */ Any, 
          Unit
        ]
    ): js.Promise[this.type] = js.native
    def prependListener[E /* <: /* keyof EventTypes */ String */](
      eventType: E,
      listener: js.Function2[
          /* import warning: importer.ImportType#apply Failed type conversion: EventTypes[E] */ /* payload */ js.Any, 
          /* repeated */ Any, 
          Unit
        ],
      options: SubOptions
    ): js.Promise[this.type] = js.native
    
    def prependOnceListener(
      eventType: String,
      listener: js.Function2[
          /* import warning: importer.ImportType#apply Failed type conversion: EventTypes[string] */ /* payload */ js.Any, 
          /* repeated */ Any, 
          Unit
        ]
    ): js.Promise[this.type] = js.native
    def prependOnceListener(
      eventType: String,
      listener: js.Function2[
          /* import warning: importer.ImportType#apply Failed type conversion: EventTypes[string] */ /* payload */ js.Any, 
          /* repeated */ Any, 
          Unit
        ],
      options: SubOptions
    ): js.Promise[this.type] = js.native
    def prependOnceListener(
      eventType: js.Symbol,
      listener: js.Function2[
          /* import warning: importer.ImportType#apply Failed type conversion: EventTypes[symbol] */ /* payload */ js.Any, 
          /* repeated */ Any, 
          Unit
        ]
    ): js.Promise[this.type] = js.native
    def prependOnceListener(
      eventType: js.Symbol,
      listener: js.Function2[
          /* import warning: importer.ImportType#apply Failed type conversion: EventTypes[symbol] */ /* payload */ js.Any, 
          /* repeated */ Any, 
          Unit
        ],
      options: SubOptions
    ): js.Promise[this.type] = js.native
    def prependOnceListener[E /* <: /* keyof EventTypes */ String */](
      eventType: E,
      listener: js.Function2[
          /* import warning: importer.ImportType#apply Failed type conversion: EventTypes[E] */ /* payload */ js.Any, 
          /* repeated */ Any, 
          Unit
        ]
    ): js.Promise[this.type] = js.native
    def prependOnceListener[E /* <: /* keyof EventTypes */ String */](
      eventType: E,
      listener: js.Function2[
          /* import warning: importer.ImportType#apply Failed type conversion: EventTypes[E] */ /* payload */ js.Any, 
          /* repeated */ Any, 
          Unit
        ],
      options: SubOptions
    ): js.Promise[this.type] = js.native
    
    /* protected */ def registerEventListener(eventType: (Extract[/* keyof EventTypes */ String, String]) | String): js.Promise[EventEmitter] = js.native
    /* protected */ def registerEventListener(eventType: (Extract[/* keyof EventTypes */ String, String]) | String, options: SubOptions): js.Promise[EventEmitter] = js.native
    /* protected */ def registerEventListener(eventType: js.Symbol): js.Promise[EventEmitter] = js.native
    /* protected */ def registerEventListener(eventType: js.Symbol, options: SubOptions): js.Promise[EventEmitter] = js.native
    
    def removeAllListeners(): js.Promise[this.type] = js.native
    def removeAllListeners(eventType: (Extract[/* keyof EventTypes */ String, String]) | String): js.Promise[this.type] = js.native
    def removeAllListeners(eventType: js.Symbol): js.Promise[this.type] = js.native
    
    def removeListener(
      eventType: String,
      listener: js.Function2[
          /* import warning: importer.ImportType#apply Failed type conversion: EventTypes[string] */ /* payload */ js.Any, 
          /* repeated */ Any, 
          Unit
        ]
    ): js.Promise[this.type] = js.native
    def removeListener(
      eventType: String,
      listener: js.Function2[
          /* import warning: importer.ImportType#apply Failed type conversion: EventTypes[string] */ /* payload */ js.Any, 
          /* repeated */ Any, 
          Unit
        ],
      options: SubOptions
    ): js.Promise[this.type] = js.native
    def removeListener(
      eventType: js.Symbol,
      listener: js.Function2[
          /* import warning: importer.ImportType#apply Failed type conversion: EventTypes[symbol] */ /* payload */ js.Any, 
          /* repeated */ Any, 
          Unit
        ]
    ): js.Promise[this.type] = js.native
    def removeListener(
      eventType: js.Symbol,
      listener: js.Function2[
          /* import warning: importer.ImportType#apply Failed type conversion: EventTypes[symbol] */ /* payload */ js.Any, 
          /* repeated */ Any, 
          Unit
        ],
      options: SubOptions
    ): js.Promise[this.type] = js.native
    def removeListener[E /* <: /* keyof EventTypes */ String */](
      eventType: E,
      listener: js.Function2[
          /* import warning: importer.ImportType#apply Failed type conversion: EventTypes[E] */ /* payload */ js.Any, 
          /* repeated */ Any, 
          Unit
        ]
    ): js.Promise[this.type] = js.native
    def removeListener[E /* <: /* keyof EventTypes */ String */](
      eventType: E,
      listener: js.Function2[
          /* import warning: importer.ImportType#apply Failed type conversion: EventTypes[E] */ /* payload */ js.Any, 
          /* repeated */ Any, 
          Unit
        ],
      options: SubOptions
    ): js.Promise[this.type] = js.native
  }
  
  @JSImport("openfin/_v2/api/base", "Reply")
  @js.native
  open class Reply[TOPIC /* <: String */, TYPE /* <: String | Unit */] ()
    extends StObject
       with Identity {
    
    var topic: TOPIC = js.native
    
    var `type`: TYPE = js.native
    
    /* CompleteClass */
    var uuid: String = js.native
  }
  
  trait SubOptions extends StObject {
    
    var timestamp: js.UndefOr[Double] = js.undefined
  }
  object SubOptions {
    
    inline def apply(): SubOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[SubOptions]
    }
    
    extension [Self <: SubOptions](x: Self) {
      
      inline def setTimestamp(value: Double): Self = StObject.set(x, "timestamp", value.asInstanceOf[js.Any])
      
      inline def setTimestampUndefined: Self = StObject.set(x, "timestamp", js.undefined)
    }
  }
}
