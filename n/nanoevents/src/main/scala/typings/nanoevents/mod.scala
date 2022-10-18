package typings.nanoevents

import org.scalablytyped.runtime.StringDictionary
import typings.std.Parameters
import typings.std.Partial
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("nanoevents", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("nanoevents", "Emitter")
  @js.native
  open class Emitter[Events /* <: EventsMap */] () extends StObject {
    
    /**
      * Calls each of the listeners registered for a given event.
      *
      * ```js
      * ee.emit('tick', tickType, tickDuration)
      * ```
      *
      * @param event The event name.
      * @param args The arguments for listeners.
      */
    def emit[K /* <: /* keyof Events */ String */](
      event: K,
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Parameters<Events[K]> is not an array type */ args: Parameters[
          /* import warning: importer.ImportType#apply Failed type conversion: Events[K] */ js.Any
        ]
    ): Unit = js.native
    
    /**
      * Event names in keys and arrays with listeners in values.
      *
      * ```js
      * emitter1.events = emitter2.events
      * emitter2.events = { }
      * ```
      */
    var events: Partial[
        /* import warning: importer.ImportType#apply Failed type conversion: {[ E in keyof Events ]: std.Array<Events[E]>} */ js.Any
      ] = js.native
    
    /**
      * Add a listener for a given event.
      *
      * ```js
      * const unbind = ee.on('tick', (tickType, tickDuration) => {
      *   count += 1
      * })
      *
      * disable () {
      *   unbind()
      * }
      * ```
      *
      * @param event The event name.
      * @param cb The listener function.
      * @returns Unbind listener from event.
      */
    def on[K /* <: /* keyof Events */ String */](
      event: K,
      cb: /* import warning: importer.ImportType#apply Failed type conversion: Events[K] */ js.Any
    ): Unsubscribe = js.native
  }
  
  inline def createNanoEvents[Events /* <: EventsMap */](): Emitter[Events] = ^.asInstanceOf[js.Dynamic].applyDynamic("createNanoEvents")().asInstanceOf[Emitter[Events]]
  
  /* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
  - org.scalablytyped.runtime.StObject because Already inherited
  - org.scalablytyped.runtime.StringDictionary because Already inherited */ trait DefaultEvents
    extends StObject
       with EventsMap
  object DefaultEvents {
    
    inline def apply(): DefaultEvents = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[DefaultEvents]
    }
  }
  
  type EventsMap = StringDictionary[Any]
  
  type Unsubscribe = js.Function0[Unit]
}
