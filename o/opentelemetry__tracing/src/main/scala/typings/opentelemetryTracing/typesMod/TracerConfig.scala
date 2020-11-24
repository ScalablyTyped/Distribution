package typings.opentelemetryTracing.typesMod

import typings.opentelemetryApi.loggerMod.Logger
import typings.opentelemetryApi.samplerMod.Sampler
import typings.opentelemetryCore.idGeneratorMod.IdGenerator
import typings.opentelemetryCore.typesMod.LogLevel
import typings.opentelemetryResources.mod.Resource
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TracerConfig extends js.Object {
  
  /** Bool for whether or not graceful shutdown is enabled. If disabled spans will not be exported when SIGTERM is recieved */
  var gracefulShutdown: js.UndefOr[Boolean] = js.native
  
  /**
    * Generator of trace and span IDs
    * The default idGenerator generates random ids
    */
  var idGenerator: js.UndefOr[IdGenerator] = js.native
  
  /** level of logger.  */
  var logLevel: js.UndefOr[LogLevel] = js.native
  
  /**
    * User provided logger.
    */
  var logger: js.UndefOr[Logger] = js.native
  
  /** Resource associated with trace telemetry  */
  var resource: js.UndefOr[Resource] = js.native
  
  /**
    * Sampler determines if a span should be recorded or should be a NoopSpan.
    */
  var sampler: js.UndefOr[Sampler] = js.native
  
  /** Trace Parameters */
  var traceParams: js.UndefOr[TraceParams] = js.native
}
object TracerConfig {
  
  @scala.inline
  def apply(): TracerConfig = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TracerConfig]
  }
  
  @scala.inline
  implicit class TracerConfigOps[Self <: TracerConfig] (val x: Self) extends AnyVal {
    
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
    def setGracefulShutdown(value: Boolean): Self = this.set("gracefulShutdown", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteGracefulShutdown: Self = this.set("gracefulShutdown", js.undefined)
    
    @scala.inline
    def setIdGenerator(value: IdGenerator): Self = this.set("idGenerator", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIdGenerator: Self = this.set("idGenerator", js.undefined)
    
    @scala.inline
    def setLogLevel(value: LogLevel): Self = this.set("logLevel", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLogLevel: Self = this.set("logLevel", js.undefined)
    
    @scala.inline
    def setLogger(value: Logger): Self = this.set("logger", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLogger: Self = this.set("logger", js.undefined)
    
    @scala.inline
    def setResource(value: Resource): Self = this.set("resource", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteResource: Self = this.set("resource", js.undefined)
    
    @scala.inline
    def setSampler(value: Sampler): Self = this.set("sampler", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSampler: Self = this.set("sampler", js.undefined)
    
    @scala.inline
    def setTraceParams(value: TraceParams): Self = this.set("traceParams", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTraceParams: Self = this.set("traceParams", js.undefined)
  }
}
