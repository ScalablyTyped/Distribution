package typings.opentelemetryPropagatorJaeger

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object typesMod {
  
  trait JaegerPropagatorConfig extends StObject {
    
    var customBaggageHeaderPrefix: js.UndefOr[String] = js.undefined
    
    var customTraceHeader: js.UndefOr[String] = js.undefined
  }
  object JaegerPropagatorConfig {
    
    inline def apply(): JaegerPropagatorConfig = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[JaegerPropagatorConfig]
    }
    
    extension [Self <: JaegerPropagatorConfig](x: Self) {
      
      inline def setCustomBaggageHeaderPrefix(value: String): Self = StObject.set(x, "customBaggageHeaderPrefix", value.asInstanceOf[js.Any])
      
      inline def setCustomBaggageHeaderPrefixUndefined: Self = StObject.set(x, "customBaggageHeaderPrefix", js.undefined)
      
      inline def setCustomTraceHeader(value: String): Self = StObject.set(x, "customTraceHeader", value.asInstanceOf[js.Any])
      
      inline def setCustomTraceHeaderUndefined: Self = StObject.set(x, "customTraceHeader", js.undefined)
    }
  }
}
