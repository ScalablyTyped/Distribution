package typings.node

import typings.node.traceEventsMod.CreateTracingOptions
import typings.node.traceEventsMod.Tracing
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object nodeColontraceEventsMod {
  
  @JSImport("node:trace_events", JSImport.Namespace)
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
}
