package typings.opentelemetryCore

import org.scalablytyped.runtime.StringDictionary
import typings.opentelemetryCore.anon.CONTAINERNAME
import typings.std.Required
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object buildSrcUtilsEnvironmentMod {
  
  @JSImport("@opentelemetry/core/build/src/utils/environment", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("@opentelemetry/core/build/src/utils/environment", "DEFAULT_ATTRIBUTE_COUNT_LIMIT")
  @js.native
  val DEFAULT_ATTRIBUTE_COUNT_LIMIT: /* 128 */ Double = js.native
  
  @JSImport("@opentelemetry/core/build/src/utils/environment", "DEFAULT_ATTRIBUTE_VALUE_LENGTH_LIMIT")
  @js.native
  val DEFAULT_ATTRIBUTE_VALUE_LENGTH_LIMIT: Double = js.native
  
  @JSImport("@opentelemetry/core/build/src/utils/environment", "DEFAULT_ENVIRONMENT")
  @js.native
  val DEFAULT_ENVIRONMENT: Required[ENVIRONMENT] = js.native
  
  inline def getEnvWithoutDefaults(): ENVIRONMENT = ^.asInstanceOf[js.Dynamic].applyDynamic("getEnvWithoutDefaults")().asInstanceOf[ENVIRONMENT]
  
  inline def parseEnvironment(values: RAW_ENVIRONMENT): ENVIRONMENT = ^.asInstanceOf[js.Dynamic].applyDynamic("parseEnvironment")(values.asInstanceOf[js.Any]).asInstanceOf[ENVIRONMENT]
  
  type ENVIRONMENT = CONTAINERNAME & ENVIRONMENT_NUMBERS & ENVIRONMENT_LISTS
  
  /** NOTE: Mapped type definitions are impossible to translate to Scala.
    * See https://www.typescriptlang.org/docs/handbook/2/mapped-types.html for an intro.
    * You'll have to cast your way around this structure, unfortunately. 
    * TS definition: {{{
    {[ K in 'OTEL_NO_PATCH_MODULES' | 'OTEL_PROPAGATORS' ]:? std.Array<string>}
    }}}
    */
  @js.native
  trait ENVIRONMENT_LISTS extends StObject
  
  /** NOTE: Mapped type definitions are impossible to translate to Scala.
    * See https://www.typescriptlang.org/docs/handbook/2/mapped-types.html for an intro.
    * You'll have to cast your way around this structure, unfortunately. 
    * TS definition: {{{
    {[ K in 'OTEL_BSP_EXPORT_TIMEOUT' | 'OTEL_BSP_MAX_EXPORT_BATCH_SIZE' | 'OTEL_BSP_MAX_QUEUE_SIZE' | 'OTEL_BSP_SCHEDULE_DELAY' | 'OTEL_ATTRIBUTE_VALUE_LENGTH_LIMIT' | 'OTEL_ATTRIBUTE_COUNT_LIMIT' | 'OTEL_SPAN_ATTRIBUTE_VALUE_LENGTH_LIMIT' | 'OTEL_SPAN_ATTRIBUTE_COUNT_LIMIT' | 'OTEL_SPAN_EVENT_COUNT_LIMIT' | 'OTEL_SPAN_LINK_COUNT_LIMIT' | 'OTEL_EXPORTER_OTLP_TIMEOUT' | 'OTEL_EXPORTER_OTLP_TRACES_TIMEOUT' | 'OTEL_EXPORTER_OTLP_METRICS_TIMEOUT' | 'OTEL_EXPORTER_JAEGER_AGENT_PORT' ]:? number}
    }}}
    */
  @js.native
  trait ENVIRONMENT_NUMBERS extends StObject
  
  type RAW_ENVIRONMENT = StringDictionary[js.UndefOr[String | Double | js.Array[String]]]
}
