package typings.opentelemetryTracing.anon

import typings.opentelemetryApi.loggerMod.Logger
import typings.opentelemetryApi.samplerMod.Sampler
import typings.opentelemetryCore.idGeneratorMod.IdGenerator
import typings.opentelemetryCore.mod.AlwaysOnSampler
import typings.opentelemetryCore.mod.ParentOrElseSampler
import typings.opentelemetryCore.typesMod.LogLevel
import typings.opentelemetryResources.mod.Resource
import typings.opentelemetryTracing.typesMod.TraceParams
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined {  logLevel :@opentelemetry/core.@opentelemetry/core.LogLevel,   sampler :@opentelemetry/core.@opentelemetry/core.AlwaysOnSampler,   traceParams :{  numberOfAttributesPerSpan :number,   numberOfLinksPerSpan :number,   numberOfEventsPerSpan :number},   gracefulShutdown :boolean,   sampler :@opentelemetry/core.@opentelemetry/core.ParentOrElseSampler} & @opentelemetry/tracing.@opentelemetry/tracing/build/src/types.TracerConfig */
@js.native
trait logLevelLogLevelsamplerAl extends js.Object {
  
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
  implicit class logLevelLogLevelsamplerAlOps[Self <: logLevelLogLevelsamplerAl] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setGracefulShutdown(value: Boolean with js.UndefOr[Boolean]): Self = this.set("gracefulShutdown", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLogLevel(value: LogLevel with js.UndefOr[LogLevel]): Self = this.set("logLevel", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSampler(value: AlwaysOnSampler with ParentOrElseSampler with js.UndefOr[Sampler]): Self = this.set("sampler", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTraceParams(value: NumberOfAttributesPerSpan with js.UndefOr[TraceParams]): Self = this.set("traceParams", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIdGenerator(value: IdGenerator): Self = this.set("idGenerator", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIdGenerator: Self = this.set("idGenerator", js.undefined)
    
    @scala.inline
    def setLogger(value: Logger): Self = this.set("logger", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLogger: Self = this.set("logger", js.undefined)
    
    @scala.inline
    def setResource(value: Resource): Self = this.set("resource", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteResource: Self = this.set("resource", js.undefined)
  }
}
