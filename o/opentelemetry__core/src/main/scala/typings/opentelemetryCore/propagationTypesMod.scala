package typings.opentelemetryCore

import typings.opentelemetryApi.loggerMod.Logger
import typings.opentelemetryApi.textMapPropagatorMod.TextMapPropagator
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object propagationTypesMod {
  
  trait CompositePropagatorConfig extends StObject {
    
    /** Instance of logger */
    var logger: js.UndefOr[Logger] = js.undefined
    
    /**
      * List of propagators to run. Propagators run in the
      * list order. If a propagator later in the list writes the same context
      * key as a propagator earlier in the list, the later on will "win".
      */
    var propagators: js.UndefOr[js.Array[TextMapPropagator]] = js.undefined
  }
  object CompositePropagatorConfig {
    
    inline def apply(): CompositePropagatorConfig = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[CompositePropagatorConfig]
    }
    
    extension [Self <: CompositePropagatorConfig](x: Self) {
      
      inline def setLogger(value: Logger): Self = StObject.set(x, "logger", value.asInstanceOf[js.Any])
      
      inline def setLoggerUndefined: Self = StObject.set(x, "logger", js.undefined)
      
      inline def setPropagators(value: js.Array[TextMapPropagator]): Self = StObject.set(x, "propagators", value.asInstanceOf[js.Any])
      
      inline def setPropagatorsUndefined: Self = StObject.set(x, "propagators", js.undefined)
      
      inline def setPropagatorsVarargs(value: TextMapPropagator*): Self = StObject.set(x, "propagators", js.Array(value :_*))
    }
  }
}
