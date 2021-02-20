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
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("@opentelemetry/core", "ACTIVE_SPAN_KEY")
  @js.native
  val ACTIVE_SPAN_KEY: js.Symbol = js.native
  
  @JSImport("@opentelemetry/core", "AlwaysOffSampler")
  @js.native
  class AlwaysOffSampler ()
    extends typings.opentelemetryCore.alwaysOffSamplerMod.AlwaysOffSampler
  
  @JSImport("@opentelemetry/core", "AlwaysOnSampler")
  @js.native
  class AlwaysOnSampler ()
    extends typings.opentelemetryCore.alwaysOnSamplerMod.AlwaysOnSampler
  
  @JSImport("@opentelemetry/core", "B3Propagator")
  @js.native
  class B3Propagator ()
    extends typings.opentelemetryCore.b3PropagatorMod.B3Propagator
  
  @JSImport("@opentelemetry/core", "BasePlugin")
  @js.native
  abstract class BasePlugin[T] protected ()
    extends typings.opentelemetryCore.platformMod.BasePlugin[T] {
    def this(_tracerName: String) = this()
    def this(_tracerName: String, _tracerVersion: String) = this()
  }
  
  @JSImport("@opentelemetry/core", "CORRELATION_CONTEXT_HEADER")
  @js.native
  val CORRELATION_CONTEXT_HEADER: /* "otcorrelations" */ String = js.native
  
  @JSImport("@opentelemetry/core", "CompositePropagator")
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
  
  @JSImport("@opentelemetry/core", "ConsoleLogger")
  @js.native
  class ConsoleLogger ()
    extends typings.opentelemetryCore.consoleLoggerMod.ConsoleLogger {
    def this(level: LogLevel) = this()
  }
  
  @JSImport("@opentelemetry/core", "DEBUG_FLAG_KEY")
  @js.native
  val DEBUG_FLAG_KEY: js.Symbol = js.native
  
  @JSImport("@opentelemetry/core", "ExportResult")
  @js.native
  object ExportResult extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[typings.opentelemetryCore.exportResultMod.ExportResult with Double] = js.native
    
    /* 1 */ val FAILED_NOT_RETRYABLE: typings.opentelemetryCore.exportResultMod.ExportResult.FAILED_NOT_RETRYABLE with Double = js.native
    
    /* 2 */ val FAILED_RETRYABLE: typings.opentelemetryCore.exportResultMod.ExportResult.FAILED_RETRYABLE with Double = js.native
    
    /* 0 */ val SUCCESS: typings.opentelemetryCore.exportResultMod.ExportResult.SUCCESS with Double = js.native
  }
  
  @JSImport("@opentelemetry/core", "HttpCorrelationContext")
  @js.native
  class HttpCorrelationContext ()
    extends typings.opentelemetryCore.httpCorrelationContextMod.HttpCorrelationContext
  
  @JSImport("@opentelemetry/core", "HttpTraceContext")
  @js.native
  class HttpTraceContext ()
    extends typings.opentelemetryCore.httpTraceContextMod.HttpTraceContext
  
  @JSImport("@opentelemetry/core", "LogLevel")
  @js.native
  object LogLevel extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[typings.opentelemetryCore.typesMod.LogLevel with Double] = js.native
    
    /* 3 */ val DEBUG: typings.opentelemetryCore.typesMod.LogLevel.DEBUG with Double = js.native
    
    /* 0 */ val ERROR: typings.opentelemetryCore.typesMod.LogLevel.ERROR with Double = js.native
    
    /* 2 */ val INFO: typings.opentelemetryCore.typesMod.LogLevel.INFO with Double = js.native
    
    /* 1 */ val WARN: typings.opentelemetryCore.typesMod.LogLevel.WARN with Double = js.native
  }
  
  @JSImport("@opentelemetry/core", "MAX_NAME_VALUE_PAIRS")
  @js.native
  val MAX_NAME_VALUE_PAIRS: /* 180 */ Double = js.native
  
  @JSImport("@opentelemetry/core", "MAX_PER_NAME_VALUE_PAIRS")
  @js.native
  val MAX_PER_NAME_VALUE_PAIRS: /* 4096 */ Double = js.native
  
  @JSImport("@opentelemetry/core", "MAX_TOTAL_LENGTH")
  @js.native
  val MAX_TOTAL_LENGTH: /* 8192 */ Double = js.native
  
  @JSImport("@opentelemetry/core", "NoRecordingSpan")
  @js.native
  class NoRecordingSpan protected ()
    extends typings.opentelemetryCore.noRecordingSpanMod.NoRecordingSpan {
    def this(spanContext: SpanContext) = this()
  }
  
  @JSImport("@opentelemetry/core", "NoopLogger")
  @js.native
  class NoopLogger ()
    extends typings.opentelemetryCore.noopLoggerMod.NoopLogger
  
  @JSImport("@opentelemetry/core", "PARENT_SPAN_ID_KEY")
  @js.native
  val PARENT_SPAN_ID_KEY: js.Symbol = js.native
  
  @JSImport("@opentelemetry/core", "ParentOrElseSampler")
  @js.native
  class ParentOrElseSampler protected ()
    extends typings.opentelemetryCore.parentOrElseSamplerMod.ParentOrElseSampler {
    def this(_delegateSampler: Sampler) = this()
  }
  
  @JSImport("@opentelemetry/core", "ProbabilitySampler")
  @js.native
  class ProbabilitySampler ()
    extends typings.opentelemetryCore.probabilitySamplerMod.ProbabilitySampler {
    def this(_probability: Double) = this()
  }
  
  @JSImport("@opentelemetry/core", "RandomIdGenerator")
  @js.native
  class RandomIdGenerator ()
    extends typings.opentelemetryCore.platformMod.RandomIdGenerator
  
  object SDK_INFO {
    
    @JSImport("@opentelemetry/core", "SDK_INFO")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("@opentelemetry/core", "SDK_INFO.LANGUAGE")
    @js.native
    def LANGUAGE: String = js.native
    @scala.inline
    def LANGUAGE_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("LANGUAGE")(x.asInstanceOf[js.Any])
    
    @JSImport("@opentelemetry/core", "SDK_INFO.NAME")
    @js.native
    def NAME: String = js.native
    @scala.inline
    def NAME_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("NAME")(x.asInstanceOf[js.Any])
    
    @JSImport("@opentelemetry/core", "SDK_INFO.RUNTIME")
    @js.native
    def RUNTIME: String = js.native
    @scala.inline
    def RUNTIME_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("RUNTIME")(x.asInstanceOf[js.Any])
    
    @JSImport("@opentelemetry/core", "SDK_INFO.VERSION")
    @js.native
    def VERSION: String = js.native
    @scala.inline
    def VERSION_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("VERSION")(x.asInstanceOf[js.Any])
  }
  
  @JSImport("@opentelemetry/core", "SUPPRESS_INSTRUMENTATION_KEY")
  @js.native
  val SUPPRESS_INSTRUMENTATION_KEY: js.Symbol = js.native
  
  @JSImport("@opentelemetry/core", "TRACE_PARENT_HEADER")
  @js.native
  val TRACE_PARENT_HEADER: /* "traceparent" */ String = js.native
  
  @JSImport("@opentelemetry/core", "TRACE_STATE_HEADER")
  @js.native
  val TRACE_STATE_HEADER: /* "tracestate" */ String = js.native
  
  @JSImport("@opentelemetry/core", "TraceState")
  @js.native
  class TraceState ()
    extends typings.opentelemetryCore.traceStateMod.TraceState {
    def this(rawTraceState: String) = this()
  }
  
  @JSImport("@opentelemetry/core", "VERSION")
  @js.native
  val VERSION: /* "0.11.0" */ String = js.native
  
  @JSImport("@opentelemetry/core", "X_B3_FLAGS")
  @js.native
  val X_B3_FLAGS: /* "x-b3-flags" */ String = js.native
  
  @JSImport("@opentelemetry/core", "X_B3_PARENT_SPAN_ID")
  @js.native
  val X_B3_PARENT_SPAN_ID: /* "x-b3-parentspanid" */ String = js.native
  
  @JSImport("@opentelemetry/core", "X_B3_SAMPLED")
  @js.native
  val X_B3_SAMPLED: /* "x-b3-sampled" */ String = js.native
  
  @JSImport("@opentelemetry/core", "X_B3_SPAN_ID")
  @js.native
  val X_B3_SPAN_ID: /* "x-b3-spanid" */ String = js.native
  
  @JSImport("@opentelemetry/core", "X_B3_TRACE_ID")
  @js.native
  val X_B3_TRACE_ID: /* "x-b3-traceid" */ String = js.native
  
  @JSImport("@opentelemetry/core", "getActiveSpan")
  @js.native
  def getActiveSpan(context: Context): js.UndefOr[Span] = js.native
  
  @JSImport("@opentelemetry/core", "getCorrelationContext")
  @js.native
  def getCorrelationContext(context: Context): js.UndefOr[CorrelationContext] = js.native
  
  @JSImport("@opentelemetry/core", "getEnv")
  @js.native
  def getEnv(): RequiredENVIRONMENT = js.native
  
  @JSImport("@opentelemetry/core", "getExtractedSpanContext")
  @js.native
  def getExtractedSpanContext(context: Context): js.UndefOr[SpanContext] = js.native
  
  @JSImport("@opentelemetry/core", "getParentSpanContext")
  @js.native
  def getParentSpanContext(context: Context): js.UndefOr[SpanContext] = js.native
  
  @JSImport("@opentelemetry/core", "hexToBase64")
  @js.native
  def hexToBase64(hexStr: String): String = js.native
  
  @JSImport("@opentelemetry/core", "hrTime")
  @js.native
  def hrTime(): HrTime = js.native
  @JSImport("@opentelemetry/core", "hrTime")
  @js.native
  def hrTime(performanceNow: Double): HrTime = js.native
  
  @JSImport("@opentelemetry/core", "hrTimeDuration")
  @js.native
  def hrTimeDuration(startTime: HrTime, endTime: HrTime): HrTime = js.native
  
  @JSImport("@opentelemetry/core", "hrTimeToMicroseconds")
  @js.native
  def hrTimeToMicroseconds(hrTime: HrTime): Double = js.native
  
  @JSImport("@opentelemetry/core", "hrTimeToMilliseconds")
  @js.native
  def hrTimeToMilliseconds(hrTime: HrTime): Double = js.native
  
  @JSImport("@opentelemetry/core", "hrTimeToNanoseconds")
  @js.native
  def hrTimeToNanoseconds(hrTime: HrTime): Double = js.native
  
  @JSImport("@opentelemetry/core", "hrTimeToTimeStamp")
  @js.native
  def hrTimeToTimeStamp(hrTime: HrTime): String = js.native
  
  @JSImport("@opentelemetry/core", "_invokeGlobalShutdown")
  @js.native
  def invokeGlobalShutdown(): Unit = js.native
  
  @JSImport("@opentelemetry/core", "isInstrumentationSuppressed")
  @js.native
  def isInstrumentationSuppressed(context: Context): Boolean = js.native
  
  @JSImport("@opentelemetry/core", "isTimeInput")
  @js.native
  def isTimeInput(value: js.Any): Boolean = js.native
  
  @JSImport("@opentelemetry/core", "isTimeInputHrTime")
  @js.native
  def isTimeInputHrTime(value: js.Any): Boolean = js.native
  
  @JSImport("@opentelemetry/core", "isUrlIgnored")
  @js.native
  def isUrlIgnored(url: String): Boolean = js.native
  @JSImport("@opentelemetry/core", "isUrlIgnored")
  @js.native
  def isUrlIgnored(url: String, ignoredUrls: js.Array[String | RegExp]): Boolean = js.native
  
  @JSImport("@opentelemetry/core", "isWrapped")
  @js.native
  def isWrapped(func: js.Any): Boolean = js.native
  
  @JSImport("@opentelemetry/core", "notifyOnGlobalShutdown")
  @js.native
  def notifyOnGlobalShutdown(cb: js.Function0[Unit]): js.Function0[Unit] = js.native
  
  @JSImport("@opentelemetry/core", "otperformance")
  @js.native
  val otperformance: Performance_ = js.native
  
  @JSImport("@opentelemetry/core", "parseTraceParent")
  @js.native
  def parseTraceParent(traceParent: String): SpanContext | Null = js.native
  
  @JSImport("@opentelemetry/core", "setActiveSpan")
  @js.native
  def setActiveSpan(context: Context, span: Span): Context = js.native
  
  @JSImport("@opentelemetry/core", "setCorrelationContext")
  @js.native
  def setCorrelationContext(context: Context, correlationContext: CorrelationContext): Context = js.native
  
  @JSImport("@opentelemetry/core", "setExtractedSpanContext")
  @js.native
  def setExtractedSpanContext(context: Context, spanContext: SpanContext): Context = js.native
  
  @JSImport("@opentelemetry/core", "suppressInstrumentation")
  @js.native
  def suppressInstrumentation(context: Context): Context = js.native
  
  @JSImport("@opentelemetry/core", "timeInputToHrTime")
  @js.native
  def timeInputToHrTime(time: TimeInput): HrTime = js.native
  
  @JSImport("@opentelemetry/core", "unrefTimer")
  @js.native
  def unrefTimer(timer: Timer): Unit = js.native
  
  @JSImport("@opentelemetry/core", "unsuppressInstrumentation")
  @js.native
  def unsuppressInstrumentation(context: Context): Context = js.native
  
  @JSImport("@opentelemetry/core", "urlMatches")
  @js.native
  def urlMatches(url: String, urlToMatch: String): Boolean = js.native
  @JSImport("@opentelemetry/core", "urlMatches")
  @js.native
  def urlMatches(url: String, urlToMatch: RegExp): Boolean = js.native
}
