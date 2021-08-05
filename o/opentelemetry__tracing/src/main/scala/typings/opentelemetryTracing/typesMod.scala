package typings.opentelemetryTracing

import typings.opentelemetryApi.loggerMod.Logger
import typings.opentelemetryApi.samplerMod.Sampler
import typings.opentelemetryApi.textMapPropagatorMod.TextMapPropagator
import typings.opentelemetryContextBase.typesMod.ContextManager
import typings.opentelemetryCore.idGeneratorMod.IdGenerator
import typings.opentelemetryCore.typesMod.LogLevel
import typings.opentelemetryResources.mod.Resource
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object typesMod {
  
  trait BufferConfig extends StObject {
    
    /** Maximum size of a buffer. */
    var bufferSize: js.UndefOr[Double] = js.undefined
    
    /** Max time for a buffer can wait before being sent */
    var bufferTimeout: js.UndefOr[Double] = js.undefined
  }
  object BufferConfig {
    
    inline def apply(): BufferConfig = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[BufferConfig]
    }
    
    extension [Self <: BufferConfig](x: Self) {
      
      inline def setBufferSize(value: Double): Self = StObject.set(x, "bufferSize", value.asInstanceOf[js.Any])
      
      inline def setBufferSizeUndefined: Self = StObject.set(x, "bufferSize", js.undefined)
      
      inline def setBufferTimeout(value: Double): Self = StObject.set(x, "bufferTimeout", value.asInstanceOf[js.Any])
      
      inline def setBufferTimeoutUndefined: Self = StObject.set(x, "bufferTimeout", js.undefined)
    }
  }
  
  trait SDKRegistrationConfig extends StObject {
    
    /** Context manager to register as the global context manager */
    var contextManager: js.UndefOr[ContextManager | Null] = js.undefined
    
    /** Propagator to register as the global propagator */
    var propagator: js.UndefOr[TextMapPropagator | Null] = js.undefined
  }
  object SDKRegistrationConfig {
    
    inline def apply(): SDKRegistrationConfig = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[SDKRegistrationConfig]
    }
    
    extension [Self <: SDKRegistrationConfig](x: Self) {
      
      inline def setContextManager(value: ContextManager): Self = StObject.set(x, "contextManager", value.asInstanceOf[js.Any])
      
      inline def setContextManagerNull: Self = StObject.set(x, "contextManager", null)
      
      inline def setContextManagerUndefined: Self = StObject.set(x, "contextManager", js.undefined)
      
      inline def setPropagator(value: TextMapPropagator): Self = StObject.set(x, "propagator", value.asInstanceOf[js.Any])
      
      inline def setPropagatorNull: Self = StObject.set(x, "propagator", null)
      
      inline def setPropagatorUndefined: Self = StObject.set(x, "propagator", js.undefined)
    }
  }
  
  trait TraceParams extends StObject {
    
    /** numberOfAttributesPerSpan is number of attributes per span */
    var numberOfAttributesPerSpan: js.UndefOr[Double] = js.undefined
    
    /** numberOfEventsPerSpan is number of message events per span */
    var numberOfEventsPerSpan: js.UndefOr[Double] = js.undefined
    
    /** numberOfLinksPerSpan is number of links per span */
    var numberOfLinksPerSpan: js.UndefOr[Double] = js.undefined
  }
  object TraceParams {
    
    inline def apply(): TraceParams = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[TraceParams]
    }
    
    extension [Self <: TraceParams](x: Self) {
      
      inline def setNumberOfAttributesPerSpan(value: Double): Self = StObject.set(x, "numberOfAttributesPerSpan", value.asInstanceOf[js.Any])
      
      inline def setNumberOfAttributesPerSpanUndefined: Self = StObject.set(x, "numberOfAttributesPerSpan", js.undefined)
      
      inline def setNumberOfEventsPerSpan(value: Double): Self = StObject.set(x, "numberOfEventsPerSpan", value.asInstanceOf[js.Any])
      
      inline def setNumberOfEventsPerSpanUndefined: Self = StObject.set(x, "numberOfEventsPerSpan", js.undefined)
      
      inline def setNumberOfLinksPerSpan(value: Double): Self = StObject.set(x, "numberOfLinksPerSpan", value.asInstanceOf[js.Any])
      
      inline def setNumberOfLinksPerSpanUndefined: Self = StObject.set(x, "numberOfLinksPerSpan", js.undefined)
    }
  }
  
  trait TracerConfig extends StObject {
    
    /** Bool for whether or not graceful shutdown is enabled. If disabled spans will not be exported when SIGTERM is recieved */
    var gracefulShutdown: js.UndefOr[Boolean] = js.undefined
    
    /**
      * Generator of trace and span IDs
      * The default idGenerator generates random ids
      */
    var idGenerator: js.UndefOr[IdGenerator] = js.undefined
    
    /** level of logger.  */
    var logLevel: js.UndefOr[LogLevel] = js.undefined
    
    /**
      * User provided logger.
      */
    var logger: js.UndefOr[Logger] = js.undefined
    
    /** Resource associated with trace telemetry  */
    var resource: js.UndefOr[Resource] = js.undefined
    
    /**
      * Sampler determines if a span should be recorded or should be a NoopSpan.
      */
    var sampler: js.UndefOr[Sampler] = js.undefined
    
    /** Trace Parameters */
    var traceParams: js.UndefOr[TraceParams] = js.undefined
  }
  object TracerConfig {
    
    inline def apply(): TracerConfig = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[TracerConfig]
    }
    
    extension [Self <: TracerConfig](x: Self) {
      
      inline def setGracefulShutdown(value: Boolean): Self = StObject.set(x, "gracefulShutdown", value.asInstanceOf[js.Any])
      
      inline def setGracefulShutdownUndefined: Self = StObject.set(x, "gracefulShutdown", js.undefined)
      
      inline def setIdGenerator(value: IdGenerator): Self = StObject.set(x, "idGenerator", value.asInstanceOf[js.Any])
      
      inline def setIdGeneratorUndefined: Self = StObject.set(x, "idGenerator", js.undefined)
      
      inline def setLogLevel(value: LogLevel): Self = StObject.set(x, "logLevel", value.asInstanceOf[js.Any])
      
      inline def setLogLevelUndefined: Self = StObject.set(x, "logLevel", js.undefined)
      
      inline def setLogger(value: Logger): Self = StObject.set(x, "logger", value.asInstanceOf[js.Any])
      
      inline def setLoggerUndefined: Self = StObject.set(x, "logger", js.undefined)
      
      inline def setResource(value: Resource): Self = StObject.set(x, "resource", value.asInstanceOf[js.Any])
      
      inline def setResourceUndefined: Self = StObject.set(x, "resource", js.undefined)
      
      inline def setSampler(value: Sampler): Self = StObject.set(x, "sampler", value.asInstanceOf[js.Any])
      
      inline def setSamplerUndefined: Self = StObject.set(x, "sampler", js.undefined)
      
      inline def setTraceParams(value: TraceParams): Self = StObject.set(x, "traceParams", value.asInstanceOf[js.Any])
      
      inline def setTraceParamsUndefined: Self = StObject.set(x, "traceParams", js.undefined)
    }
  }
}
