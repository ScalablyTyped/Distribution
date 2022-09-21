package typings.newrelic

import org.scalablytyped.runtime.StringDictionary
import typings.newrelic.anon.CollectPendingData
import typings.newrelic.anon.ModuleName
import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("newrelic", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def addCustomAttribute(key: String, value: String): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("addCustomAttribute")(key.asInstanceOf[js.Any], value.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def addCustomAttribute(key: String, value: Boolean): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("addCustomAttribute")(key.asInstanceOf[js.Any], value.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def addCustomAttribute(key: String, value: Double): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("addCustomAttribute")(key.asInstanceOf[js.Any], value.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def addCustomAttributes(atts: StringDictionary[String | Double | Boolean]): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("addCustomAttributes")(atts.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  inline def addCustomSpanAttribute(key: String, value: String): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("addCustomSpanAttribute")(key.asInstanceOf[js.Any], value.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def addCustomSpanAttribute(key: String, value: Boolean): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("addCustomSpanAttribute")(key.asInstanceOf[js.Any], value.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def addCustomSpanAttribute(key: String, value: Double): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("addCustomSpanAttribute")(key.asInstanceOf[js.Any], value.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def addCustomSpanAttributes(atts: StringDictionary[String | Double | Boolean]): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("addCustomSpanAttributes")(atts.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  inline def addIgnoringRule(pattern: String): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("addIgnoringRule")(pattern.asInstanceOf[js.Any]).asInstanceOf[Unit]
  inline def addIgnoringRule(pattern: js.RegExp): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("addIgnoringRule")(pattern.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  inline def addNamingRule(pattern: String, name: String): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("addNamingRule")(pattern.asInstanceOf[js.Any], name.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def addNamingRule(pattern: js.RegExp, name: String): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("addNamingRule")(pattern.asInstanceOf[js.Any], name.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def createTracer[T /* <: js.Function1[/* repeated */ Any, Any] */](name: String, handle: T): T = (^.asInstanceOf[js.Dynamic].applyDynamic("createTracer")(name.asInstanceOf[js.Any], handle.asInstanceOf[js.Any])).asInstanceOf[T]
  
  inline def endTransaction(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("endTransaction")().asInstanceOf[Unit]
  
  inline def getBrowserTimingHeader(): String = ^.asInstanceOf[js.Dynamic].applyDynamic("getBrowserTimingHeader")().asInstanceOf[String]
  
  inline def getLinkingMetadata(): LinkingMetadata = ^.asInstanceOf[js.Dynamic].applyDynamic("getLinkingMetadata")().asInstanceOf[LinkingMetadata]
  inline def getLinkingMetadata(omitSupportability: Boolean): LinkingMetadata = ^.asInstanceOf[js.Dynamic].applyDynamic("getLinkingMetadata")(omitSupportability.asInstanceOf[js.Any]).asInstanceOf[LinkingMetadata]
  
  inline def getTraceMetadata(): TraceMetadata = ^.asInstanceOf[js.Dynamic].applyDynamic("getTraceMetadata")().asInstanceOf[TraceMetadata]
  
  inline def getTransaction(): TransactionHandle = ^.asInstanceOf[js.Dynamic].applyDynamic("getTransaction")().asInstanceOf[TransactionHandle]
  
  inline def incrementMetric(name: String): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("incrementMetric")(name.asInstanceOf[js.Any]).asInstanceOf[Unit]
  inline def incrementMetric(name: String, value: Double): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("incrementMetric")(name.asInstanceOf[js.Any], value.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  @JSImport("newrelic", "instrument")
  @js.native
  val instrument: Instrument_ = js.native
  
  @JSImport("newrelic", "instrumentDatastore")
  @js.native
  val instrumentDatastore: Instrument_ = js.native
  
  inline def instrumentLoadedModule(moduleName: String, moduleInstance: Any): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("instrumentLoadedModule")(moduleName.asInstanceOf[js.Any], moduleInstance.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  
  @JSImport("newrelic", "instrumentMessages")
  @js.native
  val instrumentMessages: Instrument_ = js.native
  
  @JSImport("newrelic", "instrumentWebframework")
  @js.native
  val instrumentWebframework: Instrument_ = js.native
  
  inline def noticeError(error: js.Error): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("noticeError")(error.asInstanceOf[js.Any]).asInstanceOf[Unit]
  inline def noticeError(error: js.Error, customAttributes: StringDictionary[String | Double | Boolean]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("noticeError")(error.asInstanceOf[js.Any], customAttributes.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def recordCustomEvent(eventType: String, attributes: StringDictionary[Boolean | Double | String]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("recordCustomEvent")(eventType.asInstanceOf[js.Any], attributes.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def recordMetric(name: String, value: Double): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("recordMetric")(name.asInstanceOf[js.Any], value.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def recordMetric(name: String, value: Metric): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("recordMetric")(name.asInstanceOf[js.Any], value.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def setControllerName(name: String, action: String): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("setControllerName")(name.asInstanceOf[js.Any], action.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def setDispatcher(name: String): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("setDispatcher")(name.asInstanceOf[js.Any]).asInstanceOf[Unit]
  inline def setDispatcher(name: String, version: String): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("setDispatcher")(name.asInstanceOf[js.Any], version.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def setLambdaHandler[T /* <: js.Function1[/* repeated */ Any, Any] */](handler: T): T = ^.asInstanceOf[js.Dynamic].applyDynamic("setLambdaHandler")(handler.asInstanceOf[js.Any]).asInstanceOf[T]
  
  inline def setTransactionName(name: String): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("setTransactionName")(name.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  inline def shutdown(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("shutdown")().asInstanceOf[Unit]
  inline def shutdown(cb: js.Function1[/* error */ js.UndefOr[js.Error], Unit]): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("shutdown")(cb.asInstanceOf[js.Any]).asInstanceOf[Unit]
  inline def shutdown(options: Unit, cb: js.Function1[/* error */ js.UndefOr[js.Error], Unit]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("shutdown")(options.asInstanceOf[js.Any], cb.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def shutdown(options: CollectPendingData): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("shutdown")(options.asInstanceOf[js.Any]).asInstanceOf[Unit]
  inline def shutdown(options: CollectPendingData, cb: js.Function1[/* error */ js.UndefOr[js.Error], Unit]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("shutdown")(options.asInstanceOf[js.Any], cb.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def startBackgroundTransaction[T](name: String, group: String, handle: js.Function1[/* repeated */ Any, T]): T = (^.asInstanceOf[js.Dynamic].applyDynamic("startBackgroundTransaction")(name.asInstanceOf[js.Any], group.asInstanceOf[js.Any], handle.asInstanceOf[js.Any])).asInstanceOf[T]
  inline def startBackgroundTransaction[T](name: String, group: String, handle: js.Promise[T]): js.Promise[T] = (^.asInstanceOf[js.Dynamic].applyDynamic("startBackgroundTransaction")(name.asInstanceOf[js.Any], group.asInstanceOf[js.Any], handle.asInstanceOf[js.Any])).asInstanceOf[js.Promise[T]]
  inline def startBackgroundTransaction[T](name: String, handle: js.Function1[/* repeated */ Any, T]): T = (^.asInstanceOf[js.Dynamic].applyDynamic("startBackgroundTransaction")(name.asInstanceOf[js.Any], handle.asInstanceOf[js.Any])).asInstanceOf[T]
  inline def startBackgroundTransaction[T](name: String, handle: js.Promise[T]): js.Promise[T] = (^.asInstanceOf[js.Dynamic].applyDynamic("startBackgroundTransaction")(name.asInstanceOf[js.Any], handle.asInstanceOf[js.Any])).asInstanceOf[js.Promise[T]]
  
  inline def startSegment[T, C /* <: js.Function1[/* repeated */ Any, Any] */](name: String, record: Boolean, handler: js.Function1[/* cb */ js.UndefOr[C], T]): T = (^.asInstanceOf[js.Dynamic].applyDynamic("startSegment")(name.asInstanceOf[js.Any], record.asInstanceOf[js.Any], handler.asInstanceOf[js.Any])).asInstanceOf[T]
  inline def startSegment[T, C /* <: js.Function1[/* repeated */ Any, Any] */](name: String, record: Boolean, handler: js.Function1[/* cb */ js.UndefOr[C], T], callback: C): T = (^.asInstanceOf[js.Dynamic].applyDynamic("startSegment")(name.asInstanceOf[js.Any], record.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[T]
  
  inline def startWebTransaction[T](url: String, handle: js.Function1[/* repeated */ Any, T]): T = (^.asInstanceOf[js.Dynamic].applyDynamic("startWebTransaction")(url.asInstanceOf[js.Any], handle.asInstanceOf[js.Any])).asInstanceOf[T]
  inline def startWebTransaction[T](url: String, handle: js.Promise[T]): js.Promise[T] = (^.asInstanceOf[js.Dynamic].applyDynamic("startWebTransaction")(url.asInstanceOf[js.Any], handle.asInstanceOf[js.Any])).asInstanceOf[js.Promise[T]]
  
  type DistributedTraceHeaders = Record[String, js.UndefOr[Double | String | js.Array[String]]]
  
  trait DistributedTracePayload extends StObject {
    
    /**
      * The base64 encoded JSON representation of the distributed trace payload.
      */
    def httpSafe(): String
    
    /**
      * The base64 encoded JSON representation of the distributed trace payload.
      */
    def text(): String
  }
  object DistributedTracePayload {
    
    inline def apply(httpSafe: () => String, text: () => String): DistributedTracePayload = {
      val __obj = js.Dynamic.literal(httpSafe = js.Any.fromFunction0(httpSafe), text = js.Any.fromFunction0(text))
      __obj.asInstanceOf[DistributedTracePayload]
    }
    
    extension [Self <: DistributedTracePayload](x: Self) {
      
      inline def setHttpSafe(value: () => String): Self = StObject.set(x, "httpSafe", js.Any.fromFunction0(value))
      
      inline def setText(value: () => String): Self = StObject.set(x, "text", js.Any.fromFunction0(value))
    }
  }
  
  @js.native
  trait Instrument_ extends StObject {
    
    def apply(moduleName: String, onRequire: js.Function0[Unit]): Unit = js.native
    def apply(moduleName: String, onRequire: js.Function0[Unit], onError: js.Function1[/* err */ js.Error, Unit]): Unit = js.native
    def apply(opts: ModuleName): Unit = js.native
  }
  
  trait LinkingMetadata extends StObject {
    
    /**
      * The entity ID returned in the connect reply as entity_guid
      */
    @JSName("entity.guid")
    var entityDotguid: js.UndefOr[String] = js.undefined
    
    /**
      * The application name specified in the connect request as
      * app_name. If multiple application names are specified this will only be
      * the first name
      */
    @JSName("entity.name")
    var entityDotname: String
    
    /**
      * The string "SERVICE"
      */
    @JSName("entity.type")
    var entityDottype: String
    
    /**
      * The hostname as specified in the connect request as
      * utilization.full_hostname. If utilization.full_hostname is null or empty,
      * this will be the hostname specified in the connect request as host.
      */
    var hostname: String
    
    /**
      * The current span ID
      */
    @JSName("span.id")
    var spanDotid: js.UndefOr[String] = js.undefined
    
    /**
      * The current trace ID
      */
    @JSName("trace.id")
    var traceDotid: js.UndefOr[String] = js.undefined
  }
  object LinkingMetadata {
    
    inline def apply(entityDotname: String, entityDottype: String, hostname: String): LinkingMetadata = {
      val __obj = js.Dynamic.literal(hostname = hostname.asInstanceOf[js.Any])
      __obj.updateDynamic("entity.name")(entityDotname.asInstanceOf[js.Any])
      __obj.updateDynamic("entity.type")(entityDottype.asInstanceOf[js.Any])
      __obj.asInstanceOf[LinkingMetadata]
    }
    
    extension [Self <: LinkingMetadata](x: Self) {
      
      inline def setEntityDotguid(value: String): Self = StObject.set(x, "entity.guid", value.asInstanceOf[js.Any])
      
      inline def setEntityDotguidUndefined: Self = StObject.set(x, "entity.guid", js.undefined)
      
      inline def setEntityDotname(value: String): Self = StObject.set(x, "entity.name", value.asInstanceOf[js.Any])
      
      inline def setEntityDottype(value: String): Self = StObject.set(x, "entity.type", value.asInstanceOf[js.Any])
      
      inline def setHostname(value: String): Self = StObject.set(x, "hostname", value.asInstanceOf[js.Any])
      
      inline def setSpanDotid(value: String): Self = StObject.set(x, "span.id", value.asInstanceOf[js.Any])
      
      inline def setSpanDotidUndefined: Self = StObject.set(x, "span.id", js.undefined)
      
      inline def setTraceDotid(value: String): Self = StObject.set(x, "trace.id", value.asInstanceOf[js.Any])
      
      inline def setTraceDotidUndefined: Self = StObject.set(x, "trace.id", js.undefined)
    }
  }
  
  trait Metric extends StObject {
    
    var count: Double
    
    var max: Double
    
    var min: Double
    
    var sumOfSquares: Double
    
    var total: Double
  }
  object Metric {
    
    inline def apply(count: Double, max: Double, min: Double, sumOfSquares: Double, total: Double): Metric = {
      val __obj = js.Dynamic.literal(count = count.asInstanceOf[js.Any], max = max.asInstanceOf[js.Any], min = min.asInstanceOf[js.Any], sumOfSquares = sumOfSquares.asInstanceOf[js.Any], total = total.asInstanceOf[js.Any])
      __obj.asInstanceOf[Metric]
    }
    
    extension [Self <: Metric](x: Self) {
      
      inline def setCount(value: Double): Self = StObject.set(x, "count", value.asInstanceOf[js.Any])
      
      inline def setMax(value: Double): Self = StObject.set(x, "max", value.asInstanceOf[js.Any])
      
      inline def setMin(value: Double): Self = StObject.set(x, "min", value.asInstanceOf[js.Any])
      
      inline def setSumOfSquares(value: Double): Self = StObject.set(x, "sumOfSquares", value.asInstanceOf[js.Any])
      
      inline def setTotal(value: Double): Self = StObject.set(x, "total", value.asInstanceOf[js.Any])
    }
  }
  
  trait TraceMetadata extends StObject {
    
    /**
      * The current span ID
      */
    var spanId: js.UndefOr[String] = js.undefined
    
    /**
      * The current trace ID
      */
    var traceId: js.UndefOr[String] = js.undefined
  }
  object TraceMetadata {
    
    inline def apply(): TraceMetadata = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[TraceMetadata]
    }
    
    extension [Self <: TraceMetadata](x: Self) {
      
      inline def setSpanId(value: String): Self = StObject.set(x, "spanId", value.asInstanceOf[js.Any])
      
      inline def setSpanIdUndefined: Self = StObject.set(x, "spanId", js.undefined)
      
      inline def setTraceId(value: String): Self = StObject.set(x, "traceId", value.asInstanceOf[js.Any])
      
      inline def setTraceIdUndefined: Self = StObject.set(x, "traceId", js.undefined)
    }
  }
  
  @js.native
  trait TransactionHandle extends StObject {
    
    /**
      * Used to instrument the called service for inclusion in a distributed trace.
      *
      * Links the spans in a trace by accepting a payload generated by `insertDistributedTraceHeaders`
      * or generated by some other W3C Trace Context compliant tracer. This method accepts the headers
      * of an incoming request, looks for W3C Trace Context headers, and if not found, falls back to
      * New Relic distributed trace headers.
      *
      * Check the docs for valid transport types. If an invalid type is provided, it will fall back to "Unknown".
      */
    def acceptDistributedTraceHeaders(transportType: String, headers: DistributedTraceHeaders): Unit = js.native
    
    /**
      * End the transaction.
      */
    def end(): Unit = js.native
    def end(callback: js.Function0[Any]): Unit = js.native
    
    /**
      * Mark the transaction to be ignored.
      */
    def ignore(): Unit = js.native
    
    /**
      * Modifies the headers map that is passed in by adding W3C Trace Context headers
      * and New Relic Distributed Trace headers.
      */
    def insertDistributedTraceHeaders(headers: DistributedTraceHeaders): Unit = js.native
    
    /**
      * Return whether this Transaction is being sampled
      */
    def isSampled(): Boolean = js.native
  }
}
