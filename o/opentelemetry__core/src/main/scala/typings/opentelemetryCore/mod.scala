package typings.opentelemetryCore

import typings.node.perfHooksMod.Performance_
import typings.node.timersMod.global.NodeJS.Timer
import typings.opentelemetryApi.buildSrcBaggageTypesMod.Baggage
import typings.opentelemetryApi.buildSrcCommonExceptionMod.Exception
import typings.opentelemetryApi.buildSrcCommonTimeMod.HrTime
import typings.opentelemetryApi.buildSrcCommonTimeMod.TimeInput
import typings.opentelemetryApi.buildSrcContextTypesMod.Context
import typings.opentelemetryApi.buildSrcTraceAttributesMod.SpanAttributes
import typings.opentelemetryApi.buildSrcTraceSpanContextMod.SpanContext
import typings.opentelemetryCore.anon.FnCall
import typings.opentelemetryCore.buildSrcBaggageUtilsMod.ParsedBaggageKeyValue
import typings.opentelemetryCore.buildSrcCommonAnchoredClockMod.Clock
import typings.opentelemetryCore.buildSrcCommonTypesMod.ErrorHandler
import typings.opentelemetryCore.buildSrcExportResultMod.ExportResult
import typings.opentelemetryCore.buildSrcInternalExporterMod.Exporter
import typings.opentelemetryCore.buildSrcPropagationCompositeMod.CompositePropagatorConfig
import typings.opentelemetryCore.buildSrcTraceRpcMetadataMod.RPCMetadata
import typings.opentelemetryCore.buildSrcTraceSamplerParentBasedSamplerMod.ParentBasedSamplerConfig
import typings.opentelemetryCore.buildSrcUtilsEnvironmentMod.ENVIRONMENT
import typings.opentelemetryCore.buildSrcUtilsEnvironmentMod.RAW_ENVIRONMENT
import typings.std.Record
import typings.std.Required
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("@opentelemetry/core", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("@opentelemetry/core", "AlwaysOffSampler")
  @js.native
  open class AlwaysOffSampler ()
    extends typings.opentelemetryCore.buildSrcTraceSamplerAlwaysOffSamplerMod.AlwaysOffSampler
  
  @JSImport("@opentelemetry/core", "AlwaysOnSampler")
  @js.native
  open class AlwaysOnSampler ()
    extends typings.opentelemetryCore.buildSrcTraceSamplerAlwaysOnSamplerMod.AlwaysOnSampler
  
  @JSImport("@opentelemetry/core", "AnchoredClock")
  @js.native
  open class AnchoredClock protected ()
    extends typings.opentelemetryCore.buildSrcCommonAnchoredClockMod.AnchoredClock {
    /**
      * Create a new AnchoredClock anchored to the current time returned by systemClock.
      *
      * @param systemClock should be a clock that returns the number of milliseconds since January 1 1970 such as Date
      * @param monotonicClock should be a clock that counts milliseconds monotonically such as window.performance or perf_hooks.performance
      */
    def this(systemClock: Clock, monotonicClock: Clock) = this()
  }
  
  @JSImport("@opentelemetry/core", "BindOnceFuture")
  @js.native
  open class BindOnceFuture[R, This, T /* <: js.ThisFunction1[/* this */ This, /* repeated */ Any, R] */] protected ()
    extends typings.opentelemetryCore.buildSrcUtilsCallbackMod.BindOnceFuture[R, This, T] {
    def this(_callback: T, _that: This) = this()
  }
  
  @JSImport("@opentelemetry/core", "CompositePropagator")
  @js.native
  /**
    * Construct a composite propagator from a list of propagators.
    *
    * @param [config] Configuration object for composite propagator
    */
  open class CompositePropagator ()
    extends typings.opentelemetryCore.buildSrcPropagationCompositeMod.CompositePropagator {
    def this(config: CompositePropagatorConfig) = this()
  }
  
  @JSImport("@opentelemetry/core", "DEFAULT_ATTRIBUTE_COUNT_LIMIT")
  @js.native
  val DEFAULT_ATTRIBUTE_COUNT_LIMIT: /* 128 */ Double = js.native
  
  @JSImport("@opentelemetry/core", "DEFAULT_ATTRIBUTE_VALUE_LENGTH_LIMIT")
  @js.native
  val DEFAULT_ATTRIBUTE_VALUE_LENGTH_LIMIT: Double = js.native
  
  @JSImport("@opentelemetry/core", "DEFAULT_ENVIRONMENT")
  @js.native
  val DEFAULT_ENVIRONMENT: Required[ENVIRONMENT] = js.native
  
  @JSImport("@opentelemetry/core", "DEFAULT_SPAN_ATTRIBUTE_PER_EVENT_COUNT_LIMIT")
  @js.native
  val DEFAULT_SPAN_ATTRIBUTE_PER_EVENT_COUNT_LIMIT: /* 128 */ Double = js.native
  
  @JSImport("@opentelemetry/core", "DEFAULT_SPAN_ATTRIBUTE_PER_LINK_COUNT_LIMIT")
  @js.native
  val DEFAULT_SPAN_ATTRIBUTE_PER_LINK_COUNT_LIMIT: /* 128 */ Double = js.native
  
  @JSImport("@opentelemetry/core", "ExportResultCode")
  @js.native
  object ExportResultCode extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[typings.opentelemetryCore.buildSrcExportResultMod.ExportResultCode & Double] = js.native
    
    /* 1 */ val FAILED: typings.opentelemetryCore.buildSrcExportResultMod.ExportResultCode.FAILED & Double = js.native
    
    /* 0 */ val SUCCESS: typings.opentelemetryCore.buildSrcExportResultMod.ExportResultCode.SUCCESS & Double = js.native
  }
  
  @JSImport("@opentelemetry/core", "ParentBasedSampler")
  @js.native
  open class ParentBasedSampler protected ()
    extends typings.opentelemetryCore.buildSrcTraceSamplerParentBasedSamplerMod.ParentBasedSampler {
    def this(config: ParentBasedSamplerConfig) = this()
  }
  
  @JSImport("@opentelemetry/core", "RPCType")
  @js.native
  object RPCType extends StObject {
    
    @JSBracketAccess
    def apply(value: String): js.UndefOr[typings.opentelemetryCore.buildSrcTraceRpcMetadataMod.RPCType & String] = js.native
    
    /* "http" */ val HTTP: typings.opentelemetryCore.buildSrcTraceRpcMetadataMod.RPCType.HTTP & String = js.native
  }
  
  @JSImport("@opentelemetry/core", "RandomIdGenerator")
  @js.native
  open class RandomIdGenerator ()
    extends typings.opentelemetryCore.buildSrcPlatformMod.RandomIdGenerator
  
  @JSImport("@opentelemetry/core", "TRACE_PARENT_HEADER")
  @js.native
  val TRACE_PARENT_HEADER: /* "traceparent" */ String = js.native
  
  @JSImport("@opentelemetry/core", "TRACE_STATE_HEADER")
  @js.native
  val TRACE_STATE_HEADER: /* "tracestate" */ String = js.native
  
  @JSImport("@opentelemetry/core", "TimeoutError")
  @js.native
  open class TimeoutError ()
    extends typings.opentelemetryCore.buildSrcUtilsTimeoutMod.TimeoutError {
    def this(message: String) = this()
  }
  
  @JSImport("@opentelemetry/core", "TraceIdRatioBasedSampler")
  @js.native
  open class TraceIdRatioBasedSampler ()
    extends typings.opentelemetryCore.buildSrcTraceSamplerTraceIdRatioBasedSamplerMod.TraceIdRatioBasedSampler {
    def this(_ratio: Double) = this()
  }
  
  @JSImport("@opentelemetry/core", "TraceState")
  @js.native
  open class TraceState ()
    extends typings.opentelemetryCore.buildSrcTraceTraceStateMod.TraceState {
    def this(rawTraceState: String) = this()
  }
  
  @JSImport("@opentelemetry/core", "TracesSamplerValues")
  @js.native
  object TracesSamplerValues extends StObject {
    
    @JSBracketAccess
    def apply(value: String): js.UndefOr[typings.opentelemetryCore.buildSrcUtilsSamplingMod.TracesSamplerValues & String] = js.native
    
    /* "always_off" */ val AlwaysOff: typings.opentelemetryCore.buildSrcUtilsSamplingMod.TracesSamplerValues.AlwaysOff & String = js.native
    
    /* "always_on" */ val AlwaysOn: typings.opentelemetryCore.buildSrcUtilsSamplingMod.TracesSamplerValues.AlwaysOn & String = js.native
    
    /* "parentbased_always_off" */ val ParentBasedAlwaysOff: typings.opentelemetryCore.buildSrcUtilsSamplingMod.TracesSamplerValues.ParentBasedAlwaysOff & String = js.native
    
    /* "parentbased_always_on" */ val ParentBasedAlwaysOn: typings.opentelemetryCore.buildSrcUtilsSamplingMod.TracesSamplerValues.ParentBasedAlwaysOn & String = js.native
    
    /* "parentbased_traceidratio" */ val ParentBasedTraceIdRatio: typings.opentelemetryCore.buildSrcUtilsSamplingMod.TracesSamplerValues.ParentBasedTraceIdRatio & String = js.native
    
    /* "traceidratio" */ val TraceIdRatio: typings.opentelemetryCore.buildSrcUtilsSamplingMod.TracesSamplerValues.TraceIdRatio & String = js.native
  }
  
  @JSImport("@opentelemetry/core", "VERSION")
  @js.native
  val VERSION: /* "1.13.0" */ String = js.native
  
  @JSImport("@opentelemetry/core", "W3CBaggagePropagator")
  @js.native
  open class W3CBaggagePropagator ()
    extends typings.opentelemetryCore.buildSrcBaggagePropagationW3CBaggagePropagatorMod.W3CBaggagePropagator
  
  @JSImport("@opentelemetry/core", "W3CTraceContextPropagator")
  @js.native
  open class W3CTraceContextPropagator ()
    extends typings.opentelemetryCore.buildSrcTraceW3CTraceContextPropagatorMod.W3CTraceContextPropagator
  
  inline def addHrTimes(time1: HrTime, time2: HrTime): HrTime = (^.asInstanceOf[js.Dynamic].applyDynamic("addHrTimes")(time1.asInstanceOf[js.Any], time2.asInstanceOf[js.Any])).asInstanceOf[HrTime]
  
  object baggageUtils {
    
    @JSImport("@opentelemetry/core", "baggageUtils")
    @js.native
    val ^ : js.Any = js.native
    
    inline def getKeyPairs(baggage: Baggage): js.Array[String] = ^.asInstanceOf[js.Dynamic].applyDynamic("getKeyPairs")(baggage.asInstanceOf[js.Any]).asInstanceOf[js.Array[String]]
    
    inline def parseKeyPairsIntoRecord(): Record[String, String] = ^.asInstanceOf[js.Dynamic].applyDynamic("parseKeyPairsIntoRecord")().asInstanceOf[Record[String, String]]
    inline def parseKeyPairsIntoRecord(value: String): Record[String, String] = ^.asInstanceOf[js.Dynamic].applyDynamic("parseKeyPairsIntoRecord")(value.asInstanceOf[js.Any]).asInstanceOf[Record[String, String]]
    
    inline def parsePairKeyValue(entry: String): js.UndefOr[ParsedBaggageKeyValue] = ^.asInstanceOf[js.Dynamic].applyDynamic("parsePairKeyValue")(entry.asInstanceOf[js.Any]).asInstanceOf[js.UndefOr[ParsedBaggageKeyValue]]
    
    inline def serializeKeyPairs(keyPairs: js.Array[String]): String = ^.asInstanceOf[js.Dynamic].applyDynamic("serializeKeyPairs")(keyPairs.asInstanceOf[js.Any]).asInstanceOf[String]
  }
  
  inline def callWithTimeout[T](promise: js.Promise[T], timeout: Double): js.Promise[T] = (^.asInstanceOf[js.Dynamic].applyDynamic("callWithTimeout")(promise.asInstanceOf[js.Any], timeout.asInstanceOf[js.Any])).asInstanceOf[js.Promise[T]]
  
  inline def deleteRPCMetadata(context: Context): Context = ^.asInstanceOf[js.Dynamic].applyDynamic("deleteRPCMetadata")(context.asInstanceOf[js.Any]).asInstanceOf[Context]
  
  inline def getEnv(): Required[ENVIRONMENT] = ^.asInstanceOf[js.Dynamic].applyDynamic("getEnv")().asInstanceOf[Required[ENVIRONMENT]]
  
  inline def getEnvWithoutDefaults(): ENVIRONMENT = ^.asInstanceOf[js.Dynamic].applyDynamic("getEnvWithoutDefaults")().asInstanceOf[ENVIRONMENT]
  
  inline def getRPCMetadata(context: Context): js.UndefOr[RPCMetadata] = ^.asInstanceOf[js.Dynamic].applyDynamic("getRPCMetadata")(context.asInstanceOf[js.Any]).asInstanceOf[js.UndefOr[RPCMetadata]]
  
  inline def getTimeOrigin(): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("getTimeOrigin")().asInstanceOf[Double]
  
  inline def globalErrorHandler(ex: Exception): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("globalErrorHandler")(ex.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  @JSImport("@opentelemetry/core", "_globalThis")
  @js.native
  val globalThis: /* globalThis */ Any = js.native
  
  inline def hexToBase64(hexStr: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("hexToBase64")(hexStr.asInstanceOf[js.Any]).asInstanceOf[String]
  
  inline def hrTime(): HrTime = ^.asInstanceOf[js.Dynamic].applyDynamic("hrTime")().asInstanceOf[HrTime]
  inline def hrTime(performanceNow: Double): HrTime = ^.asInstanceOf[js.Dynamic].applyDynamic("hrTime")(performanceNow.asInstanceOf[js.Any]).asInstanceOf[HrTime]
  
  inline def hrTimeDuration(startTime: HrTime, endTime: HrTime): HrTime = (^.asInstanceOf[js.Dynamic].applyDynamic("hrTimeDuration")(startTime.asInstanceOf[js.Any], endTime.asInstanceOf[js.Any])).asInstanceOf[HrTime]
  
  inline def hrTimeToMicroseconds(time: HrTime): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("hrTimeToMicroseconds")(time.asInstanceOf[js.Any]).asInstanceOf[Double]
  
  inline def hrTimeToMilliseconds(time: HrTime): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("hrTimeToMilliseconds")(time.asInstanceOf[js.Any]).asInstanceOf[Double]
  
  inline def hrTimeToNanoseconds(time: HrTime): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("hrTimeToNanoseconds")(time.asInstanceOf[js.Any]).asInstanceOf[Double]
  
  inline def hrTimeToTimeStamp(time: HrTime): String = ^.asInstanceOf[js.Dynamic].applyDynamic("hrTimeToTimeStamp")(time.asInstanceOf[js.Any]).asInstanceOf[String]
  
  object internal {
    
    @JSImport("@opentelemetry/core", "internal")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("@opentelemetry/core", "internal._export")
    @js.native
    val `export`: FnCall = js.native
    
    inline def `export`[T](exporter: Exporter[T], arg: T): js.Promise[ExportResult] = (^.asInstanceOf[js.Dynamic].applyDynamic("_export")(exporter.asInstanceOf[js.Any], arg.asInstanceOf[js.Any])).asInstanceOf[js.Promise[ExportResult]]
  }
  
  inline def isAttributeKey(key: Any): /* is string */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isAttributeKey")(key.asInstanceOf[js.Any]).asInstanceOf[/* is string */ Boolean]
  
  inline def isAttributeValue(`val`: Any): /* is @opentelemetry/api.@opentelemetry/api/build/src/trace/attributes.SpanAttributeValue */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isAttributeValue")(`val`.asInstanceOf[js.Any]).asInstanceOf[/* is @opentelemetry/api.@opentelemetry/api/build/src/trace/attributes.SpanAttributeValue */ Boolean]
  
  inline def isTimeInput(value: Any): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isTimeInput")(value.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  
  inline def isTimeInputHrTime(value: Any): /* is @opentelemetry/api.@opentelemetry/api/build/src/common/Time.HrTime */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isTimeInputHrTime")(value.asInstanceOf[js.Any]).asInstanceOf[/* is @opentelemetry/api.@opentelemetry/api/build/src/common/Time.HrTime */ Boolean]
  
  inline def isTracingSuppressed(context: Context): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isTracingSuppressed")(context.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  
  inline def isUrlIgnored(url: String): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isUrlIgnored")(url.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  inline def isUrlIgnored(url: String, ignoredUrls: js.Array[String | js.RegExp]): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("isUrlIgnored")(url.asInstanceOf[js.Any], ignoredUrls.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  
  inline def isWrapped(func: Any): /* is @opentelemetry/core.@opentelemetry/core/build/src/common/types.ShimWrapped */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isWrapped")(func.asInstanceOf[js.Any]).asInstanceOf[/* is @opentelemetry/core.@opentelemetry/core/build/src/common/types.ShimWrapped */ Boolean]
  
  inline def loggingErrorHandler(): ErrorHandler = ^.asInstanceOf[js.Dynamic].applyDynamic("loggingErrorHandler")().asInstanceOf[ErrorHandler]
  
  inline def merge(args: Any*): Any = ^.asInstanceOf[js.Dynamic].applyDynamic("merge")(args.asInstanceOf[Seq[js.Any]]*).asInstanceOf[Any]
  
  inline def millisToHrTime(epochMillis: Double): HrTime = ^.asInstanceOf[js.Dynamic].applyDynamic("millisToHrTime")(epochMillis.asInstanceOf[js.Any]).asInstanceOf[HrTime]
  
  @JSImport("@opentelemetry/core", "otperformance")
  @js.native
  val otperformance: Performance_ = js.native
  
  inline def parseEnvironment(values: RAW_ENVIRONMENT): ENVIRONMENT = ^.asInstanceOf[js.Dynamic].applyDynamic("parseEnvironment")(values.asInstanceOf[js.Any]).asInstanceOf[ENVIRONMENT]
  
  inline def parseTraceParent(traceParent: String): SpanContext | Null = ^.asInstanceOf[js.Dynamic].applyDynamic("parseTraceParent")(traceParent.asInstanceOf[js.Any]).asInstanceOf[SpanContext | Null]
  
  inline def sanitizeAttributes(attributes: Any): SpanAttributes = ^.asInstanceOf[js.Dynamic].applyDynamic("sanitizeAttributes")(attributes.asInstanceOf[js.Any]).asInstanceOf[SpanAttributes]
  
  inline def setGlobalErrorHandler(handler: ErrorHandler): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("setGlobalErrorHandler")(handler.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  inline def setRPCMetadata(context: Context, meta: RPCMetadata): Context = (^.asInstanceOf[js.Dynamic].applyDynamic("setRPCMetadata")(context.asInstanceOf[js.Any], meta.asInstanceOf[js.Any])).asInstanceOf[Context]
  
  inline def suppressTracing(context: Context): Context = ^.asInstanceOf[js.Dynamic].applyDynamic("suppressTracing")(context.asInstanceOf[js.Any]).asInstanceOf[Context]
  
  inline def timeInputToHrTime(time: TimeInput): HrTime = ^.asInstanceOf[js.Dynamic].applyDynamic("timeInputToHrTime")(time.asInstanceOf[js.Any]).asInstanceOf[HrTime]
  
  inline def unrefTimer(timer: Timer): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("unrefTimer")(timer.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  inline def unsuppressTracing(context: Context): Context = ^.asInstanceOf[js.Dynamic].applyDynamic("unsuppressTracing")(context.asInstanceOf[js.Any]).asInstanceOf[Context]
  
  inline def urlMatches(url: String, urlToMatch: String): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("urlMatches")(url.asInstanceOf[js.Any], urlToMatch.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  inline def urlMatches(url: String, urlToMatch: js.RegExp): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("urlMatches")(url.asInstanceOf[js.Any], urlToMatch.asInstanceOf[js.Any])).asInstanceOf[Boolean]
}
