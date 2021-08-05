package typings.opentelemetryTracing

import typings.opentelemetryCore.mod.AlwaysOnSampler
import typings.opentelemetryCore.typesMod.LogLevel
import typings.opentelemetryTracing.anon.NumberOfAttributesPerSpan
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object configMod {
  
  object DEFAULT_CONFIG {
    
    @JSImport("@opentelemetry/tracing/build/src/config", "DEFAULT_CONFIG")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("@opentelemetry/tracing/build/src/config", "DEFAULT_CONFIG.gracefulShutdown")
    @js.native
    def gracefulShutdown: Boolean = js.native
    inline def gracefulShutdown_=(x: Boolean): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("gracefulShutdown")(x.asInstanceOf[js.Any])
    
    @JSImport("@opentelemetry/tracing/build/src/config", "DEFAULT_CONFIG.logLevel")
    @js.native
    def logLevel: LogLevel = js.native
    inline def logLevel_=(x: LogLevel): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("logLevel")(x.asInstanceOf[js.Any])
    
    @JSImport("@opentelemetry/tracing/build/src/config", "DEFAULT_CONFIG.sampler")
    @js.native
    def sampler: AlwaysOnSampler = js.native
    inline def sampler_=(x: AlwaysOnSampler): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("sampler")(x.asInstanceOf[js.Any])
    
    @JSImport("@opentelemetry/tracing/build/src/config", "DEFAULT_CONFIG.traceParams")
    @js.native
    def traceParams: NumberOfAttributesPerSpan = js.native
    inline def traceParams_=(x: NumberOfAttributesPerSpan): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("traceParams")(x.asInstanceOf[js.Any])
  }
  
  @JSImport("@opentelemetry/tracing/build/src/config", "DEFAULT_MAX_ATTRIBUTES_PER_SPAN")
  @js.native
  val DEFAULT_MAX_ATTRIBUTES_PER_SPAN: /* 32 */ Double = js.native
  
  @JSImport("@opentelemetry/tracing/build/src/config", "DEFAULT_MAX_EVENTS_PER_SPAN")
  @js.native
  val DEFAULT_MAX_EVENTS_PER_SPAN: /* 128 */ Double = js.native
  
  @JSImport("@opentelemetry/tracing/build/src/config", "DEFAULT_MAX_LINKS_PER_SPAN")
  @js.native
  val DEFAULT_MAX_LINKS_PER_SPAN: /* 32 */ Double = js.native
}
