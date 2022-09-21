package typings.opentelemetryApi

import typings.opentelemetryApi.contextTypesMod.Context
import typings.opentelemetryApi.proxyTracerMod.TracerDelegator
import typings.opentelemetryApi.spanContextMod.SpanContext
import typings.opentelemetryApi.textMapPropagatorMod.TextMapGetter
import typings.opentelemetryApi.textMapPropagatorMod.TextMapSetter
import typings.opentelemetryApi.traceStateMod.TraceState
import typings.opentelemetryApi.tracerOptionsMod.TracerOptions
import typings.opentelemetryApi.typesMod.BaggageEntryMetadata
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("@opentelemetry/api", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  object default {
    
    @JSImport("@opentelemetry/api", JSImport.Default)
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("@opentelemetry/api", "default.context")
    @js.native
    def context: typings.opentelemetryApi.contextMod.ContextAPI = js.native
    inline def context_=(x: typings.opentelemetryApi.contextMod.ContextAPI): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("context")(x.asInstanceOf[js.Any])
    
    @JSImport("@opentelemetry/api", "default.diag")
    @js.native
    def diag: typings.opentelemetryApi.diagMod.DiagAPI = js.native
    inline def diag_=(x: typings.opentelemetryApi.diagMod.DiagAPI): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("diag")(x.asInstanceOf[js.Any])
    
    @JSImport("@opentelemetry/api", "default.propagation")
    @js.native
    def propagation: typings.opentelemetryApi.propagationMod.PropagationAPI = js.native
    inline def propagation_=(x: typings.opentelemetryApi.propagationMod.PropagationAPI): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("propagation")(x.asInstanceOf[js.Any])
    
    @JSImport("@opentelemetry/api", "default.trace")
    @js.native
    def trace: typings.opentelemetryApi.traceMod.TraceAPI = js.native
    inline def trace_=(x: typings.opentelemetryApi.traceMod.TraceAPI): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("trace")(x.asInstanceOf[js.Any])
  }
  
  @JSImport("@opentelemetry/api", "ContextAPI")
  @js.native
  /** Empty private constructor prevents end users from constructing a new instance of the API */
  /* private */ open class ContextAPI ()
    extends typings.opentelemetryApi.contextMod.ContextAPI
  /* static members */
  object ContextAPI {
    
    @JSImport("@opentelemetry/api", "ContextAPI")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("@opentelemetry/api", "ContextAPI._instance")
    @js.native
    def _instance: Any = js.native
    inline def _instance_=(x: Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("_instance")(x.asInstanceOf[js.Any])
    
    /** Get the singleton instance of the Context API */
    inline def getInstance(): typings.opentelemetryApi.contextMod.ContextAPI = ^.asInstanceOf[js.Dynamic].applyDynamic("getInstance")().asInstanceOf[typings.opentelemetryApi.contextMod.ContextAPI]
  }
  
  @JSImport("@opentelemetry/api", "DiagAPI")
  @js.native
  /**
    * Private internal constructor
    * @private
    */
  /* private */ open class DiagAPI ()
    extends typings.opentelemetryApi.diagMod.DiagAPI
  /* static members */
  object DiagAPI {
    
    @JSImport("@opentelemetry/api", "DiagAPI")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("@opentelemetry/api", "DiagAPI._instance")
    @js.native
    def _instance: Any = js.native
    inline def _instance_=(x: Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("_instance")(x.asInstanceOf[js.Any])
    
    /** Get the singleton instance of the DiagAPI API */
    inline def instance(): typings.opentelemetryApi.diagMod.DiagAPI = ^.asInstanceOf[js.Dynamic].applyDynamic("instance")().asInstanceOf[typings.opentelemetryApi.diagMod.DiagAPI]
  }
  
  @JSImport("@opentelemetry/api", "DiagConsoleLogger")
  @js.native
  open class DiagConsoleLogger ()
    extends typings.opentelemetryApi.srcDiagMod.DiagConsoleLogger
  
  @JSImport("@opentelemetry/api", "DiagLogLevel")
  @js.native
  object DiagLogLevel extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[typings.opentelemetryApi.diagTypesMod.DiagLogLevel & Double] = js.native
    
    /* 9999 */ val ALL: typings.opentelemetryApi.diagTypesMod.DiagLogLevel.ALL & Double = js.native
    
    /* 70 */ val DEBUG: typings.opentelemetryApi.diagTypesMod.DiagLogLevel.DEBUG & Double = js.native
    
    /* 30 */ val ERROR: typings.opentelemetryApi.diagTypesMod.DiagLogLevel.ERROR & Double = js.native
    
    /* 60 */ val INFO: typings.opentelemetryApi.diagTypesMod.DiagLogLevel.INFO & Double = js.native
    
    /* 0 */ val NONE: typings.opentelemetryApi.diagTypesMod.DiagLogLevel.NONE & Double = js.native
    
    /* 80 */ val VERBOSE: typings.opentelemetryApi.diagTypesMod.DiagLogLevel.VERBOSE & Double = js.native
    
    /* 50 */ val WARN: typings.opentelemetryApi.diagTypesMod.DiagLogLevel.WARN & Double = js.native
  }
  
  @JSImport("@opentelemetry/api", "INVALID_SPANID")
  @js.native
  val INVALID_SPANID: /* "0000000000000000" */ String = js.native
  
  @JSImport("@opentelemetry/api", "INVALID_SPAN_CONTEXT")
  @js.native
  val INVALID_SPAN_CONTEXT: SpanContext = js.native
  
  @JSImport("@opentelemetry/api", "INVALID_TRACEID")
  @js.native
  val INVALID_TRACEID: /* "00000000000000000000000000000000" */ String = js.native
  
  @JSImport("@opentelemetry/api", "PropagationAPI")
  @js.native
  /** Empty private constructor prevents end users from constructing a new instance of the API */
  /* private */ open class PropagationAPI ()
    extends typings.opentelemetryApi.propagationMod.PropagationAPI
  /* static members */
  object PropagationAPI {
    
    @JSImport("@opentelemetry/api", "PropagationAPI")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("@opentelemetry/api", "PropagationAPI._instance")
    @js.native
    def _instance: Any = js.native
    inline def _instance_=(x: Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("_instance")(x.asInstanceOf[js.Any])
    
    /** Get the singleton instance of the Propagator API */
    inline def getInstance(): typings.opentelemetryApi.propagationMod.PropagationAPI = ^.asInstanceOf[js.Dynamic].applyDynamic("getInstance")().asInstanceOf[typings.opentelemetryApi.propagationMod.PropagationAPI]
  }
  
  @JSImport("@opentelemetry/api", "ProxyTracer")
  @js.native
  open class ProxyTracer protected ()
    extends typings.opentelemetryApi.proxyTracerMod.ProxyTracer {
    def this(_provider: TracerDelegator, name: String) = this()
    def this(_provider: TracerDelegator, name: String, version: String) = this()
    def this(_provider: TracerDelegator, name: String, version: String, options: TracerOptions) = this()
    def this(_provider: TracerDelegator, name: String, version: Unit, options: TracerOptions) = this()
  }
  
  @JSImport("@opentelemetry/api", "ProxyTracerProvider")
  @js.native
  open class ProxyTracerProvider ()
    extends typings.opentelemetryApi.proxyTracerProviderMod.ProxyTracerProvider
  
  @JSImport("@opentelemetry/api", "ROOT_CONTEXT")
  @js.native
  val ROOT_CONTEXT: Context = js.native
  
  @JSImport("@opentelemetry/api", "SamplingDecision")
  @js.native
  object SamplingDecision extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[typings.opentelemetryApi.samplingResultMod.SamplingDecision & Double] = js.native
    
    /* 0 */ val NOT_RECORD: typings.opentelemetryApi.samplingResultMod.SamplingDecision.NOT_RECORD & Double = js.native
    
    /* 1 */ val RECORD: typings.opentelemetryApi.samplingResultMod.SamplingDecision.RECORD & Double = js.native
    
    /* 2 */ val RECORD_AND_SAMPLED: typings.opentelemetryApi.samplingResultMod.SamplingDecision.RECORD_AND_SAMPLED & Double = js.native
  }
  
  @JSImport("@opentelemetry/api", "SpanKind")
  @js.native
  object SpanKind extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[typings.opentelemetryApi.spanKindMod.SpanKind & Double] = js.native
    
    /* 2 */ val CLIENT: typings.opentelemetryApi.spanKindMod.SpanKind.CLIENT & Double = js.native
    
    /* 4 */ val CONSUMER: typings.opentelemetryApi.spanKindMod.SpanKind.CONSUMER & Double = js.native
    
    /* 0 */ val INTERNAL: typings.opentelemetryApi.spanKindMod.SpanKind.INTERNAL & Double = js.native
    
    /* 3 */ val PRODUCER: typings.opentelemetryApi.spanKindMod.SpanKind.PRODUCER & Double = js.native
    
    /* 1 */ val SERVER: typings.opentelemetryApi.spanKindMod.SpanKind.SERVER & Double = js.native
  }
  
  @JSImport("@opentelemetry/api", "SpanStatusCode")
  @js.native
  object SpanStatusCode extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[typings.opentelemetryApi.statusMod.SpanStatusCode & Double] = js.native
    
    /* 2 */ val ERROR: typings.opentelemetryApi.statusMod.SpanStatusCode.ERROR & Double = js.native
    
    /* 1 */ val OK: typings.opentelemetryApi.statusMod.SpanStatusCode.OK & Double = js.native
    
    /* 0 */ val UNSET: typings.opentelemetryApi.statusMod.SpanStatusCode.UNSET & Double = js.native
  }
  
  @JSImport("@opentelemetry/api", "TraceAPI")
  @js.native
  /** Empty private constructor prevents end users from constructing a new instance of the API */
  /* private */ open class TraceAPI ()
    extends typings.opentelemetryApi.traceMod.TraceAPI
  /* static members */
  object TraceAPI {
    
    @JSImport("@opentelemetry/api", "TraceAPI")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("@opentelemetry/api", "TraceAPI._instance")
    @js.native
    def _instance: Any = js.native
    inline def _instance_=(x: Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("_instance")(x.asInstanceOf[js.Any])
    
    /** Get the singleton instance of the Trace API */
    inline def getInstance(): typings.opentelemetryApi.traceMod.TraceAPI = ^.asInstanceOf[js.Dynamic].applyDynamic("getInstance")().asInstanceOf[typings.opentelemetryApi.traceMod.TraceAPI]
  }
  
  @JSImport("@opentelemetry/api", "TraceFlags")
  @js.native
  object TraceFlags extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[typings.opentelemetryApi.traceFlagsMod.TraceFlags & Double] = js.native
    
    /* 0 */ val NONE: typings.opentelemetryApi.traceFlagsMod.TraceFlags.NONE & Double = js.native
    
    /* 1 */ val SAMPLED: typings.opentelemetryApi.traceFlagsMod.TraceFlags.SAMPLED & Double = js.native
  }
  
  inline def baggageEntryMetadataFromString(str: String): BaggageEntryMetadata = ^.asInstanceOf[js.Dynamic].applyDynamic("baggageEntryMetadataFromString")(str.asInstanceOf[js.Any]).asInstanceOf[BaggageEntryMetadata]
  
  @JSImport("@opentelemetry/api", "context")
  @js.native
  val context: typings.opentelemetryApi.contextMod.ContextAPI = js.native
  
  inline def createContextKey(description: String): js.Symbol = ^.asInstanceOf[js.Dynamic].applyDynamic("createContextKey")(description.asInstanceOf[js.Any]).asInstanceOf[js.Symbol]
  
  inline def createTraceState(): TraceState = ^.asInstanceOf[js.Dynamic].applyDynamic("createTraceState")().asInstanceOf[TraceState]
  inline def createTraceState(rawTraceState: String): TraceState = ^.asInstanceOf[js.Dynamic].applyDynamic("createTraceState")(rawTraceState.asInstanceOf[js.Any]).asInstanceOf[TraceState]
  
  @JSImport("@opentelemetry/api", "defaultTextMapGetter")
  @js.native
  val defaultTextMapGetter: TextMapGetter[Any] = js.native
  
  @JSImport("@opentelemetry/api", "defaultTextMapSetter")
  @js.native
  val defaultTextMapSetter: TextMapSetter[Any] = js.native
  
  @JSImport("@opentelemetry/api", "diag")
  @js.native
  val diag: typings.opentelemetryApi.diagMod.DiagAPI = js.native
  
  inline def isSpanContextValid(spanContext: SpanContext): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isSpanContextValid")(spanContext.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  
  inline def isValidSpanId(spanId: String): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isValidSpanId")(spanId.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  
  inline def isValidTraceId(traceId: String): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isValidTraceId")(traceId.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  
  @JSImport("@opentelemetry/api", "propagation")
  @js.native
  val propagation: typings.opentelemetryApi.propagationMod.PropagationAPI = js.native
  
  @JSImport("@opentelemetry/api", "trace")
  @js.native
  val trace: typings.opentelemetryApi.traceMod.TraceAPI = js.native
}
