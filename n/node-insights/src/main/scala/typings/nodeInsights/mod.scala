package typings.nodeInsights

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("node-insights", JSImport.Namespace)
  @js.native
  open class ^ protected ()
    extends StObject
       with Insights {
    /**
      * Insights
      */
    def this(config: Config) = this()
  }
  @JSImport("node-insights", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  /* static member */
  @JSImport("node-insights", "collectorBaseURL")
  @js.native
  def collectorBaseURL: String = js.native
  inline def collectorBaseURL_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("collectorBaseURL")(x.asInstanceOf[js.Any])
  
  /* static member */
  @JSImport("node-insights", "collectorHost")
  @js.native
  def collectorHost: String = js.native
  inline def collectorHost_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("collectorHost")(x.asInstanceOf[js.Any])
  
  /* static member */
  @JSImport("node-insights", "queryBaseURL")
  @js.native
  def queryBaseURL: String = js.native
  inline def queryBaseURL_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("queryBaseURL")(x.asInstanceOf[js.Any])
  
  type CallbackFunc = js.Function2[/* err */ js.UndefOr[js.Error | Null], /* responseBody */ String, Unit]
  
  trait Config extends StObject {
    
    var accountId: String
    
    var defaultEventType: js.UndefOr[String] = js.undefined
    
    var enabled: js.UndefOr[Boolean] = js.undefined
    
    var gzip: js.UndefOr[Boolean] = js.undefined
    
    var insertKey: String
    
    var maxPending: js.UndefOr[Double] = js.undefined
    
    var queryKey: String
    
    var timerInterval: js.UndefOr[Double] = js.undefined
  }
  object Config {
    
    inline def apply(accountId: String, insertKey: String, queryKey: String): Config = {
      val __obj = js.Dynamic.literal(accountId = accountId.asInstanceOf[js.Any], insertKey = insertKey.asInstanceOf[js.Any], queryKey = queryKey.asInstanceOf[js.Any])
      __obj.asInstanceOf[Config]
    }
    
    extension [Self <: Config](x: Self) {
      
      inline def setAccountId(value: String): Self = StObject.set(x, "accountId", value.asInstanceOf[js.Any])
      
      inline def setDefaultEventType(value: String): Self = StObject.set(x, "defaultEventType", value.asInstanceOf[js.Any])
      
      inline def setDefaultEventTypeUndefined: Self = StObject.set(x, "defaultEventType", js.undefined)
      
      inline def setEnabled(value: Boolean): Self = StObject.set(x, "enabled", value.asInstanceOf[js.Any])
      
      inline def setEnabledUndefined: Self = StObject.set(x, "enabled", js.undefined)
      
      inline def setGzip(value: Boolean): Self = StObject.set(x, "gzip", value.asInstanceOf[js.Any])
      
      inline def setGzipUndefined: Self = StObject.set(x, "gzip", js.undefined)
      
      inline def setInsertKey(value: String): Self = StObject.set(x, "insertKey", value.asInstanceOf[js.Any])
      
      inline def setMaxPending(value: Double): Self = StObject.set(x, "maxPending", value.asInstanceOf[js.Any])
      
      inline def setMaxPendingUndefined: Self = StObject.set(x, "maxPending", js.undefined)
      
      inline def setQueryKey(value: String): Self = StObject.set(x, "queryKey", value.asInstanceOf[js.Any])
      
      inline def setTimerInterval(value: Double): Self = StObject.set(x, "timerInterval", value.asInstanceOf[js.Any])
      
      inline def setTimerIntervalUndefined: Self = StObject.set(x, "timerInterval", js.undefined)
    }
  }
  
  @js.native
  trait Insights extends StObject {
    
    /**
      * Add insights data to the queue.
      * It is sent when the queue reaches a max size or a period of time has elapsed
      */
    def add(data: js.Object): Unit = js.native
    def add(data: js.Object, eventType: String): Unit = js.native
    
    var enabled: Boolean = js.native
    
    /**
      * Stop the timer after flushing.
      */
    def finish(): Unit = js.native
    
    var insertKey: String = js.native
    
    /**
      * Build a nrql query string
      * @example
      *    nrql = insights.nrql({
      *      select: 'uniqueCount(session)',
      *      from: 'PageView',
      *      since: '1 week ago',
      *      until: '1 day ago',
      *      timeseries: '1 hour'
      *   });
      *   insights.query(nrql);
      */
    def nrql(params: js.Object): String = js.native
    
    /**
      * Execute a nrql query
      */
    def query(query: String, callback: CallbackFunc): Unit = js.native
    
    var queryKey: String = js.native
    
    /**
      * Send accumulated insights data to new relic (if enabled)
      */
    def send(): Unit = js.native
    def send(done: CallbackFunc): Unit = js.native
    
    /**
      * Start the timer that will send insights after some interval of time
      * this is called implicitly when data is added via the add method
      */
    def start(): Unit = js.native
    
    /**
      * Stop the timer that will send insights after some interval of time
      * this is called implicitly when the amount of data exceeds maxPending and the queue is sent
      */
    def stop(): Unit = js.native
    
    /**
      * nrql where clause builder
      */
    def where(clause: String): String = js.native
    def where(clause: js.Array[String]): String = js.native
    def where(clause: js.Object): String = js.native
  }
}
