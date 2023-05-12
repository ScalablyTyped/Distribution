package typings.node

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object traceEventsMod {
  
  @JSImport("trace_events", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  /**
    * Creates and returns a `Tracing` object for the given set of `categories`.
    *
    * ```js
    * const trace_events = require('node:trace_events');
    * const categories = ['node.perf', 'node.async_hooks'];
    * const tracing = trace_events.createTracing({ categories });
    * tracing.enable();
    * // do stuff
    * tracing.disable();
    * ```
    * @since v10.0.0
    * @return .
    */
  inline def createTracing(options: CreateTracingOptions): Tracing = ^.asInstanceOf[js.Dynamic].applyDynamic("createTracing")(options.asInstanceOf[js.Any]).asInstanceOf[Tracing]
  
  /**
    * Returns a comma-separated list of all currently-enabled trace event
    * categories. The current set of enabled trace event categories is determined
    * by the _union_ of all currently-enabled `Tracing` objects and any categories
    * enabled using the `--trace-event-categories` flag.
    *
    * Given the file `test.js` below, the command`node --trace-event-categories node.perf test.js` will print`'node.async_hooks,node.perf'` to the console.
    *
    * ```js
    * const trace_events = require('node:trace_events');
    * const t1 = trace_events.createTracing({ categories: ['node.async_hooks'] });
    * const t2 = trace_events.createTracing({ categories: ['node.perf'] });
    * const t3 = trace_events.createTracing({ categories: ['v8'] });
    *
    * t1.enable();
    * t2.enable();
    *
    * console.log(trace_events.getEnabledCategories());
    * ```
    * @since v10.0.0
    */
  inline def getEnabledCategories(): js.UndefOr[String] = ^.asInstanceOf[js.Dynamic].applyDynamic("getEnabledCategories")().asInstanceOf[js.UndefOr[String]]
  
  trait CreateTracingOptions extends StObject {
    
    /**
      * An array of trace category names. Values included in the array are
      * coerced to a string when possible. An error will be thrown if the
      * value cannot be coerced.
      */
    var categories: js.Array[String]
  }
  object CreateTracingOptions {
    
    inline def apply(categories: js.Array[String]): CreateTracingOptions = {
      val __obj = js.Dynamic.literal(categories = categories.asInstanceOf[js.Any])
      __obj.asInstanceOf[CreateTracingOptions]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: CreateTracingOptions] (val x: Self) extends AnyVal {
      
      inline def setCategories(value: js.Array[String]): Self = StObject.set(x, "categories", value.asInstanceOf[js.Any])
      
      inline def setCategoriesVarargs(value: String*): Self = StObject.set(x, "categories", js.Array(value*))
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
    val categories: String
    
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
    
    inline def apply(categories: String, disable: () => Unit, enable: () => Unit, enabled: Boolean): Tracing = {
      val __obj = js.Dynamic.literal(categories = categories.asInstanceOf[js.Any], disable = js.Any.fromFunction0(disable), enable = js.Any.fromFunction0(enable), enabled = enabled.asInstanceOf[js.Any])
      __obj.asInstanceOf[Tracing]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Tracing] (val x: Self) extends AnyVal {
      
      inline def setCategories(value: String): Self = StObject.set(x, "categories", value.asInstanceOf[js.Any])
      
      inline def setDisable(value: () => Unit): Self = StObject.set(x, "disable", js.Any.fromFunction0(value))
      
      inline def setEnable(value: () => Unit): Self = StObject.set(x, "enable", js.Any.fromFunction0(value))
      
      inline def setEnabled(value: Boolean): Self = StObject.set(x, "enabled", value.asInstanceOf[js.Any])
    }
  }
}
