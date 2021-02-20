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
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  @js.native
  trait NumberOfAttributesPerSpan extends StObject {
    
    var numberOfAttributesPerSpan: Double = js.native
    
    var numberOfEventsPerSpan: Double = js.native
    
    var numberOfLinksPerSpan: Double = js.native
  }
  object NumberOfAttributesPerSpan {
    
    @scala.inline
    def apply(numberOfAttributesPerSpan: Double, numberOfEventsPerSpan: Double, numberOfLinksPerSpan: Double): NumberOfAttributesPerSpan = {
      val __obj = js.Dynamic.literal(numberOfAttributesPerSpan = numberOfAttributesPerSpan.asInstanceOf[js.Any], numberOfEventsPerSpan = numberOfEventsPerSpan.asInstanceOf[js.Any], numberOfLinksPerSpan = numberOfLinksPerSpan.asInstanceOf[js.Any])
      __obj.asInstanceOf[NumberOfAttributesPerSpan]
    }
    
    @scala.inline
    implicit class NumberOfAttributesPerSpanMutableBuilder[Self <: NumberOfAttributesPerSpan] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setNumberOfAttributesPerSpan(value: Double): Self = StObject.set(x, "numberOfAttributesPerSpan", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNumberOfEventsPerSpan(value: Double): Self = StObject.set(x, "numberOfEventsPerSpan", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNumberOfLinksPerSpan(value: Double): Self = StObject.set(x, "numberOfLinksPerSpan", value.asInstanceOf[js.Any])
    }
  }
  
  /* Inlined {  logLevel :@opentelemetry/core.@opentelemetry/core.LogLevel,   sampler :@opentelemetry/core.@opentelemetry/core.AlwaysOnSampler,   traceParams :{  numberOfAttributesPerSpan :number,   numberOfLinksPerSpan :number,   numberOfEventsPerSpan :number},   gracefulShutdown :boolean,   sampler :@opentelemetry/core.@opentelemetry/core.ParentOrElseSampler} & @opentelemetry/tracing.@opentelemetry/tracing/build/src/types.TracerConfig */
  @js.native
  trait logLevelLogLevelsamplerAl extends StObject {
    
    /** Bool for whether or not graceful shutdown is enabled. If disabled spans will not be exported when SIGTERM is recieved */
    var gracefulShutdown: Boolean with js.UndefOr[Boolean] = js.native
    
    /**
      * Generator of trace and span IDs
      * The default idGenerator generates random ids
      */
    var idGenerator: js.UndefOr[IdGenerator] = js.native
    
    /** level of logger.  */
    var logLevel: LogLevel with js.UndefOr[LogLevel] = js.native
    
    /**
      * User provided logger.
      */
    var logger: js.UndefOr[Logger] = js.native
    
    /** Resource associated with trace telemetry  */
    var resource: js.UndefOr[Resource] = js.native
    
    /**
      * Sampler determines if a span should be recorded or should be a NoopSpan.
      */
    var sampler: AlwaysOnSampler with ParentOrElseSampler with js.UndefOr[Sampler] = js.native
    
    /** Trace Parameters */
    var traceParams: NumberOfAttributesPerSpan with js.UndefOr[TraceParams] = js.native
  }
  object logLevelLogLevelsamplerAl {
    
    @scala.inline
    def apply(
      gracefulShutdown: Boolean with js.UndefOr[Boolean],
      logLevel: LogLevel with js.UndefOr[LogLevel],
      sampler: AlwaysOnSampler with ParentOrElseSampler with js.UndefOr[Sampler],
      traceParams: NumberOfAttributesPerSpan with js.UndefOr[TraceParams]
    ): logLevelLogLevelsamplerAl = {
      val __obj = js.Dynamic.literal(gracefulShutdown = gracefulShutdown.asInstanceOf[js.Any], logLevel = logLevel.asInstanceOf[js.Any], sampler = sampler.asInstanceOf[js.Any], traceParams = traceParams.asInstanceOf[js.Any])
      __obj.asInstanceOf[logLevelLogLevelsamplerAl]
    }
    
    @scala.inline
    implicit class logLevelLogLevelsamplerAlMutableBuilder[Self <: logLevelLogLevelsamplerAl] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setGracefulShutdown(value: Boolean with js.UndefOr[Boolean]): Self = StObject.set(x, "gracefulShutdown", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIdGenerator(value: IdGenerator): Self = StObject.set(x, "idGenerator", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIdGeneratorUndefined: Self = StObject.set(x, "idGenerator", js.undefined)
      
      @scala.inline
      def setLogLevel(value: LogLevel with js.UndefOr[LogLevel]): Self = StObject.set(x, "logLevel", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLogger(value: Logger): Self = StObject.set(x, "logger", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLoggerUndefined: Self = StObject.set(x, "logger", js.undefined)
      
      @scala.inline
      def setResource(value: Resource): Self = StObject.set(x, "resource", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setResourceUndefined: Self = StObject.set(x, "resource", js.undefined)
      
      @scala.inline
      def setSampler(value: AlwaysOnSampler with ParentOrElseSampler with js.UndefOr[Sampler]): Self = StObject.set(x, "sampler", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTraceParams(value: NumberOfAttributesPerSpan with js.UndefOr[TraceParams]): Self = StObject.set(x, "traceParams", value.asInstanceOf[js.Any])
    }
  }
}
