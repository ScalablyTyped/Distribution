package typings.opentelemetryCore

import typings.node.NodeJS.Timer
import typings.node.perfHooksMod.Performance_
import typings.opentelemetryApi.correlationContextMod.CorrelationContext
import typings.opentelemetryApi.samplerMod.Sampler
import typings.opentelemetryApi.spanContextMod.SpanContext
import typings.opentelemetryApi.spanMod.Span
import typings.opentelemetryApi.timeMod.HrTime
import typings.opentelemetryApi.timeMod.TimeInput
import typings.opentelemetryContextBase.mod.Context
import typings.opentelemetryCore.anon.RequiredENVIRONMENT
import typings.opentelemetryCore.propagationTypesMod.CompositePropagatorConfig
import typings.opentelemetryCore.typesMod.LogLevel
import typings.std.RegExp
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@opentelemetry/core", JSImport.Namespace)
@js.native
object mod extends js.Object {
  
  val ACTIVE_SPAN_KEY: js.Symbol = js.native
  
  val CORRELATION_CONTEXT_HEADER: /* "otcorrelations" */ String = js.native
  
  val DEBUG_FLAG_KEY: js.Symbol = js.native
  
  val MAX_NAME_VALUE_PAIRS: /* 180 */ Double = js.native
  
  val MAX_PER_NAME_VALUE_PAIRS: /* 4096 */ Double = js.native
  
  val MAX_TOTAL_LENGTH: /* 8192 */ Double = js.native
  
  val PARENT_SPAN_ID_KEY: js.Symbol = js.native
  
  val SUPPRESS_INSTRUMENTATION_KEY: js.Symbol = js.native
  
  val TRACE_PARENT_HEADER: /* "traceparent" */ String = js.native
  
  val TRACE_STATE_HEADER: /* "tracestate" */ String = js.native
  
  val VERSION: /* "0.11.0" */ String = js.native
  
  val X_B3_FLAGS: /* "x-b3-flags" */ String = js.native
  
  val X_B3_PARENT_SPAN_ID: /* "x-b3-parentspanid" */ String = js.native
  
  val X_B3_SAMPLED: /* "x-b3-sampled" */ String = js.native
  
  val X_B3_SPAN_ID: /* "x-b3-spanid" */ String = js.native
  
  val X_B3_TRACE_ID: /* "x-b3-traceid" */ String = js.native
  
  def getActiveSpan(context: Context): js.UndefOr[Span] = js.native
  
  def getCorrelationContext(context: Context): js.UndefOr[CorrelationContext] = js.native
  
  def getEnv(): RequiredENVIRONMENT = js.native
  
  def getExtractedSpanContext(context: Context): js.UndefOr[SpanContext] = js.native
  
  def getParentSpanContext(context: Context): js.UndefOr[SpanContext] = js.native
  
  def hexToBase64(hexStr: String): String = js.native
  
  def hrTime(): HrTime = js.native
  def hrTime(performanceNow: Double): HrTime = js.native
  
  def hrTimeDuration(startTime: HrTime, endTime: HrTime): HrTime = js.native
  
  def hrTimeToMicroseconds(hrTime: HrTime): Double = js.native
  
  def hrTimeToMilliseconds(hrTime: HrTime): Double = js.native
  
  def hrTimeToNanoseconds(hrTime: HrTime): Double = js.native
  
  def hrTimeToTimeStamp(hrTime: HrTime): String = js.native
  
  @JSName("_invokeGlobalShutdown")
  def invokeGlobalShutdown(): Unit = js.native
  
  def isInstrumentationSuppressed(context: Context): Boolean = js.native
  
  def isTimeInput(value: js.Any): Boolean = js.native
  
  def isTimeInputHrTime(value: js.Any): Boolean = js.native
  
  def isUrlIgnored(url: String): Boolean = js.native
  def isUrlIgnored(url: String, ignoredUrls: js.Array[String | RegExp]): Boolean = js.native
  
  def isWrapped(func: js.Any): Boolean = js.native
  
  def notifyOnGlobalShutdown(cb: js.Function0[Unit]): js.Function0[Unit] = js.native
  
  val otperformance: Performance_ = js.native
  
  def parseTraceParent(traceParent: String): SpanContext | Null = js.native
  
  def setActiveSpan(context: Context, span: Span): Context = js.native
  
  def setCorrelationContext(context: Context, correlationContext: CorrelationContext): Context = js.native
  
  def setExtractedSpanContext(context: Context, spanContext: SpanContext): Context = js.native
  
  def suppressInstrumentation(context: Context): Context = js.native
  
  def timeInputToHrTime(time: TimeInput): HrTime = js.native
  
  def unrefTimer(timer: Timer): Unit = js.native
  
  def unsuppressInstrumentation(context: Context): Context = js.native
  
  def urlMatches(url: String, urlToMatch: String): Boolean = js.native
  def urlMatches(url: String, urlToMatch: RegExp): Boolean = js.native
  
  @js.native
  class AlwaysOffSampler ()
    extends typings.opentelemetryCore.alwaysOffSamplerMod.AlwaysOffSampler
  
  @js.native
  class AlwaysOnSampler ()
    extends typings.opentelemetryCore.alwaysOnSamplerMod.AlwaysOnSampler
  
  @js.native
  class B3Propagator ()
    extends typings.opentelemetryCore.b3PropagatorMod.B3Propagator
  
  @js.native
  abstract class BasePlugin[T] ()
    extends typings.opentelemetryCore.nodeBasePluginMod.BasePlugin[T]
  
  @js.native
  /**
    * Construct a composite propagator from a list of propagators.
    *
    * @param [config] Configuration object for composite propagator
    */
  class CompositePropagator ()
    extends typings.opentelemetryCore.compositeMod.CompositePropagator {
    def this(config: CompositePropagatorConfig) = this()
  }
  
  @js.native
  class ConsoleLogger ()
    extends typings.opentelemetryCore.consoleLoggerMod.ConsoleLogger {
    def this(level: LogLevel) = this()
  }
  
  @js.native
  object ExportResult extends js.Object {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[typings.opentelemetryCore.exportResultMod.ExportResult with Double] = js.native
    
    /* 1 */ val FAILED_NOT_RETRYABLE: typings.opentelemetryCore.exportResultMod.ExportResult.FAILED_NOT_RETRYABLE with Double = js.native
    
    /* 2 */ val FAILED_RETRYABLE: typings.opentelemetryCore.exportResultMod.ExportResult.FAILED_RETRYABLE with Double = js.native
    
    /* 0 */ val SUCCESS: typings.opentelemetryCore.exportResultMod.ExportResult.SUCCESS with Double = js.native
  }
  
  @js.native
  class HttpCorrelationContext ()
    extends typings.opentelemetryCore.httpCorrelationContextMod.HttpCorrelationContext
  
  @js.native
  class HttpTraceContext ()
    extends typings.opentelemetryCore.httpTraceContextMod.HttpTraceContext
  
  @js.native
  object LogLevel extends js.Object {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[typings.opentelemetryCore.typesMod.LogLevel with Double] = js.native
    
    /* 3 */ val DEBUG: typings.opentelemetryCore.typesMod.LogLevel.DEBUG with Double = js.native
    
    /* 0 */ val ERROR: typings.opentelemetryCore.typesMod.LogLevel.ERROR with Double = js.native
    
    /* 2 */ val INFO: typings.opentelemetryCore.typesMod.LogLevel.INFO with Double = js.native
    
    /* 1 */ val WARN: typings.opentelemetryCore.typesMod.LogLevel.WARN with Double = js.native
  }
  
  @js.native
  class NoRecordingSpan protected ()
    extends typings.opentelemetryCore.noRecordingSpanMod.NoRecordingSpan {
    def this(spanContext: SpanContext) = this()
  }
  
  @js.native
  class NoopLogger ()
    extends typings.opentelemetryCore.noopLoggerMod.NoopLogger
  
  @js.native
  class ParentOrElseSampler protected ()
    extends typings.opentelemetryCore.parentOrElseSamplerMod.ParentOrElseSampler {
    def this(_delegateSampler: Sampler) = this()
  }
  
  @js.native
  class ProbabilitySampler ()
    extends typings.opentelemetryCore.probabilitySamplerMod.ProbabilitySampler {
    def this(_probability: Double) = this()
  }
  
  @js.native
  class RandomIdGenerator ()
    extends typings.opentelemetryCore.nodeRandomIdGeneratorMod.RandomIdGenerator
  
  @js.native
  object SDK_INFO extends js.Object {
    
    var LANGUAGE: String = js.native
    
    var NAME: String = js.native
    
    var RUNTIME: String = js.native
    
    var VERSION: String = js.native
  }
  
  @js.native
  class TraceState ()
    extends typings.opentelemetryCore.traceStateMod.TraceState {
    def this(rawTraceState: String) = this()
  }
}
