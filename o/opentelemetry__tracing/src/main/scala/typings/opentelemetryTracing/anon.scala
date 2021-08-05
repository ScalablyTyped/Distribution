package typings.opentelemetryTracing

import typings.opentelemetryApi.loggerMod.Logger
import typings.opentelemetryApi.samplerMod.Sampler
import typings.opentelemetryCore.idGeneratorMod.IdGenerator
import typings.opentelemetryCore.mod.AlwaysOnSampler
import typings.opentelemetryCore.mod.ParentOrElseSampler
import typings.opentelemetryCore.typesMod.LogLevel
import typings.opentelemetryResources.mod.Resource
import typings.opentelemetryTracing.typesMod.TraceParams
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  trait NumberOfAttributesPerSpan extends StObject {
    
    var numberOfAttributesPerSpan: Double
    
    var numberOfEventsPerSpan: Double
    
    var numberOfLinksPerSpan: Double
  }
  object NumberOfAttributesPerSpan {
    
    inline def apply(numberOfAttributesPerSpan: Double, numberOfEventsPerSpan: Double, numberOfLinksPerSpan: Double): NumberOfAttributesPerSpan = {
      val __obj = js.Dynamic.literal(numberOfAttributesPerSpan = numberOfAttributesPerSpan.asInstanceOf[js.Any], numberOfEventsPerSpan = numberOfEventsPerSpan.asInstanceOf[js.Any], numberOfLinksPerSpan = numberOfLinksPerSpan.asInstanceOf[js.Any])
      __obj.asInstanceOf[NumberOfAttributesPerSpan]
    }
    
    extension [Self <: NumberOfAttributesPerSpan](x: Self) {
      
      inline def setNumberOfAttributesPerSpan(value: Double): Self = StObject.set(x, "numberOfAttributesPerSpan", value.asInstanceOf[js.Any])
      
      inline def setNumberOfEventsPerSpan(value: Double): Self = StObject.set(x, "numberOfEventsPerSpan", value.asInstanceOf[js.Any])
      
      inline def setNumberOfLinksPerSpan(value: Double): Self = StObject.set(x, "numberOfLinksPerSpan", value.asInstanceOf[js.Any])
    }
  }
  
  /* Inlined {  logLevel :@opentelemetry/core.@opentelemetry/core.LogLevel,   sampler :@opentelemetry/core.@opentelemetry/core.AlwaysOnSampler,   traceParams :{  numberOfAttributesPerSpan :number,   numberOfLinksPerSpan :number,   numberOfEventsPerSpan :number},   gracefulShutdown :boolean,   sampler :@opentelemetry/core.@opentelemetry/core.ParentOrElseSampler} & @opentelemetry/tracing.@opentelemetry/tracing/build/src/types.TracerConfig */
  trait logLevelLogLevelsamplerAl extends StObject {
    
    /** Bool for whether or not graceful shutdown is enabled. If disabled spans will not be exported when SIGTERM is recieved */
    var gracefulShutdown: Boolean & js.UndefOr[Boolean]
    
    /**
      * Generator of trace and span IDs
      * The default idGenerator generates random ids
      */
    var idGenerator: js.UndefOr[IdGenerator] = js.undefined
    
    /** level of logger.  */
    var logLevel: LogLevel & js.UndefOr[LogLevel]
    
    /**
      * User provided logger.
      */
    var logger: js.UndefOr[Logger] = js.undefined
    
    /** Resource associated with trace telemetry  */
    var resource: js.UndefOr[Resource] = js.undefined
    
    /**
      * Sampler determines if a span should be recorded or should be a NoopSpan.
      */
    var sampler: AlwaysOnSampler & ParentOrElseSampler & js.UndefOr[Sampler]
    
    /** Trace Parameters */
    var traceParams: NumberOfAttributesPerSpan & js.UndefOr[TraceParams]
  }
  object logLevelLogLevelsamplerAl {
    
    inline def apply(
      gracefulShutdown: Boolean & js.UndefOr[Boolean],
      logLevel: LogLevel & js.UndefOr[LogLevel],
      sampler: AlwaysOnSampler & ParentOrElseSampler & js.UndefOr[Sampler],
      traceParams: NumberOfAttributesPerSpan & js.UndefOr[TraceParams]
    ): logLevelLogLevelsamplerAl = {
      val __obj = js.Dynamic.literal(gracefulShutdown = gracefulShutdown.asInstanceOf[js.Any], logLevel = logLevel.asInstanceOf[js.Any], sampler = sampler.asInstanceOf[js.Any], traceParams = traceParams.asInstanceOf[js.Any])
      __obj.asInstanceOf[logLevelLogLevelsamplerAl]
    }
    
    extension [Self <: logLevelLogLevelsamplerAl](x: Self) {
      
      inline def setGracefulShutdown(value: Boolean & js.UndefOr[Boolean]): Self = StObject.set(x, "gracefulShutdown", value.asInstanceOf[js.Any])
      
      inline def setIdGenerator(value: IdGenerator): Self = StObject.set(x, "idGenerator", value.asInstanceOf[js.Any])
      
      inline def setIdGeneratorUndefined: Self = StObject.set(x, "idGenerator", js.undefined)
      
      inline def setLogLevel(value: LogLevel & js.UndefOr[LogLevel]): Self = StObject.set(x, "logLevel", value.asInstanceOf[js.Any])
      
      inline def setLogger(value: Logger): Self = StObject.set(x, "logger", value.asInstanceOf[js.Any])
      
      inline def setLoggerUndefined: Self = StObject.set(x, "logger", js.undefined)
      
      inline def setResource(value: Resource): Self = StObject.set(x, "resource", value.asInstanceOf[js.Any])
      
      inline def setResourceUndefined: Self = StObject.set(x, "resource", js.undefined)
      
      inline def setSampler(value: AlwaysOnSampler & ParentOrElseSampler & js.UndefOr[Sampler]): Self = StObject.set(x, "sampler", value.asInstanceOf[js.Any])
      
      inline def setTraceParams(value: NumberOfAttributesPerSpan & js.UndefOr[TraceParams]): Self = StObject.set(x, "traceParams", value.asInstanceOf[js.Any])
    }
  }
}
