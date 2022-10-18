package typings.opentelemetryPropagatorB3

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object buildSrcTypesMod {
  
  @js.native
  sealed trait B3InjectEncoding extends StObject
  @JSImport("@opentelemetry/propagator-b3/build/src/types", "B3InjectEncoding")
  @js.native
  object B3InjectEncoding extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[B3InjectEncoding & Double] = js.native
    
    @js.native
    sealed trait MULTI_HEADER
      extends StObject
         with B3InjectEncoding
    /* 1 */ val MULTI_HEADER: typings.opentelemetryPropagatorB3.buildSrcTypesMod.B3InjectEncoding.MULTI_HEADER & Double = js.native
    
    @js.native
    sealed trait SINGLE_HEADER
      extends StObject
         with B3InjectEncoding
    /* 0 */ val SINGLE_HEADER: typings.opentelemetryPropagatorB3.buildSrcTypesMod.B3InjectEncoding.SINGLE_HEADER & Double = js.native
  }
  
  trait B3PropagatorConfig extends StObject {
    
    var injectEncoding: js.UndefOr[B3InjectEncoding] = js.undefined
  }
  object B3PropagatorConfig {
    
    inline def apply(): B3PropagatorConfig = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[B3PropagatorConfig]
    }
    
    extension [Self <: B3PropagatorConfig](x: Self) {
      
      inline def setInjectEncoding(value: B3InjectEncoding): Self = StObject.set(x, "injectEncoding", value.asInstanceOf[js.Any])
      
      inline def setInjectEncodingUndefined: Self = StObject.set(x, "injectEncoding", js.undefined)
    }
  }
}
