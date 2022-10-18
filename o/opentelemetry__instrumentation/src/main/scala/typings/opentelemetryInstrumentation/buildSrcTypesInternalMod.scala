package typings.opentelemetryInstrumentation

import org.scalablytyped.runtime.Instantiable3
import typings.opentelemetryApi.buildSrcTraceTracerProviderMod.TracerProvider
import typings.opentelemetryApiMetrics.buildSrcTypesMeterProviderMod.MeterProvider
import typings.opentelemetryInstrumentation.buildSrcPlatformMod.InstrumentationBase
import typings.opentelemetryInstrumentation.buildSrcTypesMod.Instrumentation
import typings.opentelemetryInstrumentation.buildSrcTypesMod.InstrumentationConfig
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object buildSrcTypesInternalMod {
  
  trait AutoLoaderOptions extends StObject {
    
    var instrumentations: js.UndefOr[js.Array[InstrumentationOption]] = js.undefined
    
    var meterProvider: js.UndefOr[MeterProvider] = js.undefined
    
    var tracerProvider: js.UndefOr[TracerProvider] = js.undefined
  }
  object AutoLoaderOptions {
    
    inline def apply(): AutoLoaderOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[AutoLoaderOptions]
    }
    
    extension [Self <: AutoLoaderOptions](x: Self) {
      
      inline def setInstrumentations(value: js.Array[InstrumentationOption]): Self = StObject.set(x, "instrumentations", value.asInstanceOf[js.Any])
      
      inline def setInstrumentationsUndefined: Self = StObject.set(x, "instrumentations", js.undefined)
      
      inline def setInstrumentationsVarargs(value: InstrumentationOption*): Self = StObject.set(x, "instrumentations", js.Array(value*))
      
      inline def setMeterProvider(value: MeterProvider): Self = StObject.set(x, "meterProvider", value.asInstanceOf[js.Any])
      
      inline def setMeterProviderUndefined: Self = StObject.set(x, "meterProvider", js.undefined)
      
      inline def setTracerProvider(value: TracerProvider): Self = StObject.set(x, "tracerProvider", value.asInstanceOf[js.Any])
      
      inline def setTracerProviderUndefined: Self = StObject.set(x, "tracerProvider", js.undefined)
    }
  }
  
  trait AutoLoaderResult extends StObject {
    
    var instrumentations: js.Array[Instrumentation]
  }
  object AutoLoaderResult {
    
    inline def apply(instrumentations: js.Array[Instrumentation]): AutoLoaderResult = {
      val __obj = js.Dynamic.literal(instrumentations = instrumentations.asInstanceOf[js.Any])
      __obj.asInstanceOf[AutoLoaderResult]
    }
    
    extension [Self <: AutoLoaderResult](x: Self) {
      
      inline def setInstrumentations(value: js.Array[Instrumentation]): Self = StObject.set(x, "instrumentations", value.asInstanceOf[js.Any])
      
      inline def setInstrumentationsVarargs(value: Instrumentation*): Self = StObject.set(x, "instrumentations", js.Array(value*))
    }
  }
  
  type InstrumentationOption = (Instantiable3[
    /* instrumentationName */ String, 
    /* instrumentationVersion */ String, 
    /* config */ js.UndefOr[InstrumentationConfig], 
    InstrumentationBase[js.Object]
  ]) | (js.Array[
    (Instantiable3[
      /* instrumentationName */ String, 
      /* instrumentationVersion */ String, 
      /* config */ js.UndefOr[InstrumentationConfig], 
      InstrumentationBase[js.Object]
    ]) | Instrumentation
  ]) | Instrumentation
}
