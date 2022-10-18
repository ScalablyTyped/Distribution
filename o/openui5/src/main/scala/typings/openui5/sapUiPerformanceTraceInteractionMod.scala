package typings.openui5

import org.scalablytyped.runtime.Shortcut
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object sapUiPerformanceTraceInteractionMod extends Shortcut {
  
  @JSImport("sap/ui/performance/trace/Interaction", JSImport.Default)
  @js.native
  val default: Interaction = js.native
  
  /**
    * @SINCE 1.76
    *
    * Provides base functionality for interaction detection heuristics & API. Interaction detection works through
    * the detection of relevant events and tracking of rendering activities.
    *  An example:
    *  The user clicks on a button
    *
    * 	 - "click" event gets detected via notification (`var notifyEventStart`)
    * 	 - a click handler is registered on the button, so this is an interaction start (`var notifyStepStart`)
    *
    * 	 - some requests are made and rendering has finished (`var notifyStepEnd`)  All measurement takes
    * 			place in {@link module:sap/ui/performance/Measurement}.
    */
  trait Interaction extends StObject {
    
    /**
      * @SINCE 1.76
      *
      * Gets all interaction measurements for which a provided filter function returns a truthy value.
      *
      * To filter for certain categories of measurements a fnFilter can be implemented like this ` function(InteractionMeasurement)
      * { return InteractionMeasurement.duration > 0 }`
      *
      * @returns all interaction measurements passing the filter function successfully
      */
    def filter(
      /**
      * a filter function that returns true if the passed measurement should be added to the result
      */
    fnFilter: js.Function
    ): js.Array[js.Object]
    
    /**
      * @SINCE 1.76
      *
      * Returns true if the interaction detection was enabled explicitly, or implicitly along with fesr.
      *
      * @returns bActive State of the interaction detection
      */
    def getActive(): Boolean
    
    /**
      * @SINCE 1.76
      *
      * Gets all interaction measurements.
      *
      * @returns all interaction measurements
      */
    def getAll(
      /**
      * finalize the current pending interaction so that it is contained in the returned array
      */
    bFinalize: Boolean
    ): js.Array[js.Object]
    
    /**
      * @SINCE 1.76
      *
      * Enables the interaction tracking.
      */
    def setActive(/**
      * State of the interaction detection
      */
    bActive: Boolean): Unit
  }
  object Interaction {
    
    inline def apply(
      filter: js.Function => js.Array[js.Object],
      getActive: () => Boolean,
      getAll: Boolean => js.Array[js.Object],
      setActive: Boolean => Unit
    ): Interaction = {
      val __obj = js.Dynamic.literal(filter = js.Any.fromFunction1(filter), getActive = js.Any.fromFunction0(getActive), getAll = js.Any.fromFunction1(getAll), setActive = js.Any.fromFunction1(setActive))
      __obj.asInstanceOf[Interaction]
    }
    
    extension [Self <: Interaction](x: Self) {
      
      inline def setFilter(value: js.Function => js.Array[js.Object]): Self = StObject.set(x, "filter", js.Any.fromFunction1(value))
      
      inline def setGetActive(value: () => Boolean): Self = StObject.set(x, "getActive", js.Any.fromFunction0(value))
      
      inline def setGetAll(value: Boolean => js.Array[js.Object]): Self = StObject.set(x, "getAll", js.Any.fromFunction1(value))
      
      inline def setSetActive(value: Boolean => Unit): Self = StObject.set(x, "setActive", js.Any.fromFunction1(value))
    }
  }
  
  type _To = Interaction
  
  /* This means you don't have to write `default`, but can instead just say `sapUiPerformanceTraceInteractionMod.foo` */
  override def _to: Interaction = default
}
