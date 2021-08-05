package typings.node

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object traceEventsMod {
  
  @JSImport("trace_events", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  /**
    * Creates and returns a Tracing object for the given set of categories.
    */
  inline def createTracing(options: CreateTracingOptions): Tracing = ^.asInstanceOf[js.Dynamic].applyDynamic("createTracing")(options.asInstanceOf[js.Any]).asInstanceOf[Tracing]
  
  /**
    * Returns a comma-separated list of all currently-enabled trace event
    * categories. The current set of enabled trace event categories is
    * determined by the union of all currently-enabled `Tracing` objects and
    * any categories enabled using the `--trace-event-categories` flag.
    */
  inline def getEnabledCategories(): js.UndefOr[java.lang.String] = ^.asInstanceOf[js.Dynamic].applyDynamic("getEnabledCategories")().asInstanceOf[js.UndefOr[java.lang.String]]
  
  trait CreateTracingOptions extends StObject {
    
    /**
      * An array of trace category names. Values included in the array are
      * coerced to a string when possible. An error will be thrown if the
      * value cannot be coerced.
      */
    var categories: js.Array[java.lang.String]
  }
  object CreateTracingOptions {
    
    inline def apply(categories: js.Array[java.lang.String]): CreateTracingOptions = {
      val __obj = js.Dynamic.literal(categories = categories.asInstanceOf[js.Any])
      __obj.asInstanceOf[CreateTracingOptions]
    }
    
    extension [Self <: CreateTracingOptions](x: Self) {
      
      inline def setCategories(value: js.Array[java.lang.String]): Self = StObject.set(x, "categories", value.asInstanceOf[js.Any])
      
      inline def setCategoriesVarargs(value: java.lang.String*): Self = StObject.set(x, "categories", js.Array(value :_*))
    }
  }
  
  /**
    * The `Tracing` object is used to enable or disable tracing for sets of
    * categories. Instances are created using the
    * `trace_events.createTracing()` method.
    *
    * When created, the `Tracing` object is disabled. Calling the
    * `tracing.enable()` method adds the categories to the set of enabled trace
    * event categories. Calling `tracing.disable()` will remove the categories
    * from the set of enabled trace event categories.
    */
  trait Tracing extends StObject {
    
    /**
      * A comma-separated list of the trace event categories covered by this
      * `Tracing` object.
      */
    val categories: java.lang.String
    
    /**
      * Disables this `Tracing` object.
      *
      * Only trace event categories _not_ covered by other enabled `Tracing`
      * objects and _not_ specified by the `--trace-event-categories` flag
      * will be disabled.
      */
    def disable(): Unit
    
    /**
      * Enables this `Tracing` object for the set of categories covered by
      * the `Tracing` object.
      */
    def enable(): Unit
    
    /**
      * `true` only if the `Tracing` object has been enabled.
      */
    val enabled: Boolean
  }
  object Tracing {
    
    inline def apply(categories: java.lang.String, disable: () => Unit, enable: () => Unit, enabled: Boolean): Tracing = {
      val __obj = js.Dynamic.literal(categories = categories.asInstanceOf[js.Any], disable = js.Any.fromFunction0(disable), enable = js.Any.fromFunction0(enable), enabled = enabled.asInstanceOf[js.Any])
      __obj.asInstanceOf[Tracing]
    }
    
    extension [Self <: Tracing](x: Self) {
      
      inline def setCategories(value: java.lang.String): Self = StObject.set(x, "categories", value.asInstanceOf[js.Any])
      
      inline def setDisable(value: () => Unit): Self = StObject.set(x, "disable", js.Any.fromFunction0(value))
      
      inline def setEnable(value: () => Unit): Self = StObject.set(x, "enable", js.Any.fromFunction0(value))
      
      inline def setEnabled(value: Boolean): Self = StObject.set(x, "enabled", value.asInstanceOf[js.Any])
    }
  }
}
