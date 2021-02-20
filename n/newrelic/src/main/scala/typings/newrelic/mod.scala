package typings.newrelic

import org.scalablytyped.runtime.StringDictionary
import typings.newrelic.anon.CollectPendingData
import typings.newrelic.anon.ModuleName
import typings.std.Error
import typings.std.Record
import typings.std.RegExp
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("newrelic", "addCustomAttribute")
  @js.native
  def addCustomAttribute(key: String, value: String): Unit = js.native
  @JSImport("newrelic", "addCustomAttribute")
  @js.native
  def addCustomAttribute(key: String, value: Boolean): Unit = js.native
  @JSImport("newrelic", "addCustomAttribute")
  @js.native
  def addCustomAttribute(key: String, value: Double): Unit = js.native
  
  @JSImport("newrelic", "addCustomAttributes")
  @js.native
  def addCustomAttributes(atts: StringDictionary[String | Double | Boolean]): Unit = js.native
  
  @JSImport("newrelic", "addIgnoringRule")
  @js.native
  def addIgnoringRule(pattern: String): Unit = js.native
  @JSImport("newrelic", "addIgnoringRule")
  @js.native
  def addIgnoringRule(pattern: RegExp): Unit = js.native
  
  @JSImport("newrelic", "addNamingRule")
  @js.native
  def addNamingRule(pattern: String, name: String): Unit = js.native
  @JSImport("newrelic", "addNamingRule")
  @js.native
  def addNamingRule(pattern: RegExp, name: String): Unit = js.native
  
  @JSImport("newrelic", "createTracer")
  @js.native
  def createTracer[T /* <: js.Function1[/* repeated */ js.Any, _] */](name: String, handle: T): T = js.native
  
  @JSImport("newrelic", "endTransaction")
  @js.native
  def endTransaction(): Unit = js.native
  
  @JSImport("newrelic", "getBrowserTimingHeader")
  @js.native
  def getBrowserTimingHeader(): String = js.native
  
  @JSImport("newrelic", "getLinkingMetadata")
  @js.native
  def getLinkingMetadata(): LinkingMetadata = js.native
  @JSImport("newrelic", "getLinkingMetadata")
  @js.native
  def getLinkingMetadata(omitSupportability: Boolean): LinkingMetadata = js.native
  
  @JSImport("newrelic", "getTraceMetadata")
  @js.native
  def getTraceMetadata(): TraceMetadata = js.native
  
  @JSImport("newrelic", "getTransaction")
  @js.native
  def getTransaction(): TransactionHandle = js.native
  
  @JSImport("newrelic", "incrementMetric")
  @js.native
  def incrementMetric(name: String): Unit = js.native
  @JSImport("newrelic", "incrementMetric")
  @js.native
  def incrementMetric(name: String, value: Double): Unit = js.native
  
  @JSImport("newrelic", "instrument")
  @js.native
  val instrument: Instrument_ = js.native
  
  @JSImport("newrelic", "instrumentDatastore")
  @js.native
  val instrumentDatastore: Instrument_ = js.native
  
  @JSImport("newrelic", "instrumentLoadedModule")
  @js.native
  def instrumentLoadedModule(moduleName: String, moduleInstance: js.Any): Boolean = js.native
  
  @JSImport("newrelic", "instrumentMessages")
  @js.native
  val instrumentMessages: Instrument_ = js.native
  
  @JSImport("newrelic", "instrumentWebframework")
  @js.native
  val instrumentWebframework: Instrument_ = js.native
  
  @JSImport("newrelic", "noticeError")
  @js.native
  def noticeError(error: Error): Unit = js.native
  @JSImport("newrelic", "noticeError")
  @js.native
  def noticeError(error: Error, customAttributes: StringDictionary[String | Double | Boolean]): Unit = js.native
  
  @JSImport("newrelic", "recordCustomEvent")
  @js.native
  def recordCustomEvent(eventType: String, attributes: StringDictionary[Boolean | Double | String]): Unit = js.native
  
  @JSImport("newrelic", "recordMetric")
  @js.native
  def recordMetric(name: String, value: Double): Unit = js.native
  @JSImport("newrelic", "recordMetric")
  @js.native
  def recordMetric(name: String, value: Metric): Unit = js.native
  
  @JSImport("newrelic", "setControllerName")
  @js.native
  def setControllerName(name: String, action: String): Unit = js.native
  
  @JSImport("newrelic", "setDispatcher")
  @js.native
  def setDispatcher(name: String): Unit = js.native
  @JSImport("newrelic", "setDispatcher")
  @js.native
  def setDispatcher(name: String, version: String): Unit = js.native
  
  @JSImport("newrelic", "setIgnoreTransaction")
  @js.native
  def setIgnoreTransaction(ignored: Boolean): Unit = js.native
  
  @JSImport("newrelic", "setLambdaHandler")
  @js.native
  def setLambdaHandler[T /* <: js.Function1[/* repeated */ js.Any, _] */](handler: T): T = js.native
  
  @JSImport("newrelic", "setTransactionName")
  @js.native
  def setTransactionName(name: String): Unit = js.native
  
  @JSImport("newrelic", "shutdown")
  @js.native
  def shutdown(): Unit = js.native
  @JSImport("newrelic", "shutdown")
  @js.native
  def shutdown(cb: js.Function1[/* error */ js.UndefOr[Error], Unit]): Unit = js.native
  @JSImport("newrelic", "shutdown")
  @js.native
  def shutdown(options: js.UndefOr[scala.Nothing], cb: js.Function1[/* error */ js.UndefOr[Error], Unit]): Unit = js.native
  @JSImport("newrelic", "shutdown")
  @js.native
  def shutdown(options: CollectPendingData): Unit = js.native
  @JSImport("newrelic", "shutdown")
  @js.native
  def shutdown(options: CollectPendingData, cb: js.Function1[/* error */ js.UndefOr[Error], Unit]): Unit = js.native
  
  @JSImport("newrelic", "startBackgroundTransaction")
  @js.native
  def startBackgroundTransaction[T](name: String, group: String, handle: js.Function1[/* repeated */ js.Any, T]): T = js.native
  @JSImport("newrelic", "startBackgroundTransaction")
  @js.native
  def startBackgroundTransaction[T](name: String, group: String, handle: js.Promise[T]): js.Promise[T] = js.native
  @JSImport("newrelic", "startBackgroundTransaction")
  @js.native
  def startBackgroundTransaction[T](name: String, handle: js.Function1[/* repeated */ js.Any, T]): T = js.native
  @JSImport("newrelic", "startBackgroundTransaction")
  @js.native
  def startBackgroundTransaction[T](name: String, handle: js.Promise[T]): js.Promise[T] = js.native
  
  @JSImport("newrelic", "startSegment")
  @js.native
  def startSegment[T /* <: js.Thenable[_] */](name: String, record: Boolean, handler: T): T = js.native
  @JSImport("newrelic", "startSegment")
  @js.native
  def startSegment[T, C /* <: js.Function1[/* repeated */ js.Any, _] */](name: String, record: Boolean, handler: js.Function1[/* cb */ js.UndefOr[C], T]): T = js.native
  @JSImport("newrelic", "startSegment")
  @js.native
  def startSegment[T, C /* <: js.Function1[/* repeated */ js.Any, _] */](name: String, record: Boolean, handler: js.Function1[/* cb */ js.UndefOr[C], T], callback: C): T = js.native
  
  @JSImport("newrelic", "startWebTransaction")
  @js.native
  def startWebTransaction[T](url: String, handle: js.Function1[/* repeated */ js.Any, T]): T = js.native
  @JSImport("newrelic", "startWebTransaction")
  @js.native
  def startWebTransaction[T](url: String, handle: js.Promise[T]): js.Promise[T] = js.native
  
  type DistributedTraceHeaders = Record[String, js.UndefOr[Double | String | js.Array[String]]]
  
  @js.native
  trait DistributedTracePayload extends StObject {
    
    /**
      * The base64 encoded JSON representation of the distributed trace payload.
      */
    def httpSafe(): String = js.native
    
    /**
      * The base64 encoded JSON representation of the distributed trace payload.
      */
    def text(): String = js.native
  }
  object DistributedTracePayload {
    
    @scala.inline
    def apply(httpSafe: () => String, text: () => String): DistributedTracePayload = {
      val __obj = js.Dynamic.literal(httpSafe = js.Any.fromFunction0(httpSafe), text = js.Any.fromFunction0(text))
      __obj.asInstanceOf[DistributedTracePayload]
    }
    
    @scala.inline
    implicit class DistributedTracePayloadMutableBuilder[Self <: DistributedTracePayload] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setHttpSafe(value: () => String): Self = StObject.set(x, "httpSafe", js.Any.fromFunction0(value))
      
      @scala.inline
      def setText(value: () => String): Self = StObject.set(x, "text", js.Any.fromFunction0(value))
    }
  }
  
  @js.native
  trait Instrument_ extends StObject {
    
    def apply(moduleName: String, onRequire: js.Function0[Unit]): Unit = js.native
    def apply(moduleName: String, onRequire: js.Function0[Unit], onError: js.Function1[/* err */ Error, Unit]): Unit = js.native
    def apply(opts: ModuleName): Unit = js.native
  }
  
  @js.native
  trait LinkingMetadata extends StObject {
    
    /**
      * The entity ID returned in the connect reply as entity_guid
      */
    @JSName("entity.guid")
    var entityDotguid: js.UndefOr[String] = js.native
    
    /**
      * The application name specified in the connect request as
      * app_name. If multiple application names are specified this will only be
      * the first name
      */
    @JSName("entity.name")
    var entityDotname: String = js.native
    
    /**
      * The string "SERVICE"
      */
    @JSName("entity.type")
    var entityDottype: String = js.native
    
    /**
      * The hostname as specified in the connect request as
      * utilization.full_hostname. If utilization.full_hostname is null or empty,
      * this will be the hostname specified in the connect request as host.
      */
    var hostname: String = js.native
    
    /**
      * The current span ID
      */
    @JSName("span.id")
    var spanDotid: js.UndefOr[String] = js.native
    
    /**
      * The current trace ID
      */
    @JSName("trace.id")
    var traceDotid: js.UndefOr[String] = js.native
  }
  object LinkingMetadata {
    
    @scala.inline
    def apply(entityDotname: String, entityDottype: String, hostname: String): LinkingMetadata = {
      val __obj = js.Dynamic.literal(hostname = hostname.asInstanceOf[js.Any])
      __obj.updateDynamic("entity.name")(entityDotname.asInstanceOf[js.Any])
      __obj.updateDynamic("entity.type")(entityDottype.asInstanceOf[js.Any])
      __obj.asInstanceOf[LinkingMetadata]
    }
    
    @scala.inline
    implicit class LinkingMetadataMutableBuilder[Self <: LinkingMetadata] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setEntityDotguid(value: String): Self = StObject.set(x, "entity.guid", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setEntityDotguidUndefined: Self = StObject.set(x, "entity.guid", js.undefined)
      
      @scala.inline
      def setEntityDotname(value: String): Self = StObject.set(x, "entity.name", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setEntityDottype(value: String): Self = StObject.set(x, "entity.type", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHostname(value: String): Self = StObject.set(x, "hostname", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSpanDotid(value: String): Self = StObject.set(x, "span.id", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSpanDotidUndefined: Self = StObject.set(x, "span.id", js.undefined)
      
      @scala.inline
      def setTraceDotid(value: String): Self = StObject.set(x, "trace.id", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTraceDotidUndefined: Self = StObject.set(x, "trace.id", js.undefined)
    }
  }
  
  @js.native
  trait Metric extends StObject {
    
    var count: Double = js.native
    
    var max: Double = js.native
    
    var min: Double = js.native
    
    var sumOfSquares: Double = js.native
    
    var total: Double = js.native
  }
  object Metric {
    
    @scala.inline
    def apply(count: Double, max: Double, min: Double, sumOfSquares: Double, total: Double): Metric = {
      val __obj = js.Dynamic.literal(count = count.asInstanceOf[js.Any], max = max.asInstanceOf[js.Any], min = min.asInstanceOf[js.Any], sumOfSquares = sumOfSquares.asInstanceOf[js.Any], total = total.asInstanceOf[js.Any])
      __obj.asInstanceOf[Metric]
    }
    
    @scala.inline
    implicit class MetricMutableBuilder[Self <: Metric] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setCount(value: Double): Self = StObject.set(x, "count", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMax(value: Double): Self = StObject.set(x, "max", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMin(value: Double): Self = StObject.set(x, "min", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSumOfSquares(value: Double): Self = StObject.set(x, "sumOfSquares", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTotal(value: Double): Self = StObject.set(x, "total", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait TraceMetadata extends StObject {
    
    /**
      * The current span ID
      */
    var spanId: js.UndefOr[String] = js.native
    
    /**
      * The current trace ID
      */
    var traceId: js.UndefOr[String] = js.native
  }
  object TraceMetadata {
    
    @scala.inline
    def apply(): TraceMetadata = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[TraceMetadata]
    }
    
    @scala.inline
    implicit class TraceMetadataMutableBuilder[Self <: TraceMetadata] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setSpanId(value: String): Self = StObject.set(x, "spanId", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSpanIdUndefined: Self = StObject.set(x, "spanId", js.undefined)
      
      @scala.inline
      def setTraceId(value: String): Self = StObject.set(x, "traceId", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTraceIdUndefined: Self = StObject.set(x, "traceId", js.undefined)
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
      * Parses incoming distributed trace header payload.
      * @deprecated - use acceptDistributedTraceHeaders instead
      */
    def acceptDistributedTracePayload(payload: DistributedTracePayload): Unit = js.native
    
    /**
      * Creates a distributed trace payload.
      * @deprecated - use insertDistributedTraceHeaders instead
      */
    def createDistributedTracePayload(): DistributedTracePayload = js.native
    
    /**
      * End the transaction.
      */
    def end(): Unit = js.native
    def end(callback: js.Function0[_]): Unit = js.native
    
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
