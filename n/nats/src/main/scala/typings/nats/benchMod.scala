package typings.nats

import typings.nats.typesMod.NatsConnection
import typings.nats.utilMod.Perf
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object benchMod {
  
  @JSImport("nats/lib/nats-base-client/bench", "Bench")
  @js.native
  open class Bench protected () extends StObject {
    def this(nc: NatsConnection) = this()
    def this(nc: NatsConnection, opts: BenchOpts) = this()
    
    var asyncRequests: js.UndefOr[Boolean] = js.native
    
    var callbacks: Boolean = js.native
    
    var msgs: Double = js.native
    
    var nc: NatsConnection = js.native
    
    var payload: js.typedarray.Uint8Array = js.native
    
    var perf: Perf = js.native
    
    def processMetrics(): js.Array[Metric] = js.native
    
    var pub: js.UndefOr[Boolean] = js.native
    
    var rep: js.UndefOr[Boolean] = js.native
    
    var req: js.UndefOr[Boolean] = js.native
    
    def run(): js.Promise[js.Array[Metric]] = js.native
    
    def runAsync(): js.Promise[Unit] = js.native
    
    def runCallbacks(): js.Promise[Unit] = js.native
    
    var size: Double = js.native
    
    var sub: js.UndefOr[Boolean] = js.native
    
    var subject: String = js.native
  }
  
  @JSImport("nats/lib/nats-base-client/bench", "Metric")
  @js.native
  open class Metric protected () extends StObject {
    def this(name: String, duration: Double) = this()
    
    var asyncRequests: js.UndefOr[Boolean] = js.native
    
    var bytes: Double = js.native
    
    var date: Double = js.native
    
    var duration: Double = js.native
    
    var lang: String = js.native
    
    var max: js.UndefOr[Double] = js.native
    
    var min: js.UndefOr[Double] = js.native
    
    var msgs: Double = js.native
    
    var name: String = js.native
    
    var payload: Double = js.native
    
    def toCsv(): String = js.native
    
    var version: String = js.native
  }
  /* static members */
  object Metric {
    
    @JSImport("nats/lib/nats-base-client/bench", "Metric")
    @js.native
    val ^ : js.Any = js.native
    
    inline def header(): String = ^.asInstanceOf[js.Dynamic].applyDynamic("header")().asInstanceOf[String]
  }
  
  trait BenchOpts extends StObject {
    
    var asyncRequests: js.UndefOr[Boolean] = js.undefined
    
    var callbacks: js.UndefOr[Boolean] = js.undefined
    
    var msgs: js.UndefOr[Double] = js.undefined
    
    var pub: js.UndefOr[Boolean] = js.undefined
    
    var rep: js.UndefOr[Boolean] = js.undefined
    
    var req: js.UndefOr[Boolean] = js.undefined
    
    var size: js.UndefOr[Double] = js.undefined
    
    var sub: js.UndefOr[Boolean] = js.undefined
    
    var subject: js.UndefOr[String] = js.undefined
  }
  object BenchOpts {
    
    inline def apply(): BenchOpts = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[BenchOpts]
    }
    
    extension [Self <: BenchOpts](x: Self) {
      
      inline def setAsyncRequests(value: Boolean): Self = StObject.set(x, "asyncRequests", value.asInstanceOf[js.Any])
      
      inline def setAsyncRequestsUndefined: Self = StObject.set(x, "asyncRequests", js.undefined)
      
      inline def setCallbacks(value: Boolean): Self = StObject.set(x, "callbacks", value.asInstanceOf[js.Any])
      
      inline def setCallbacksUndefined: Self = StObject.set(x, "callbacks", js.undefined)
      
      inline def setMsgs(value: Double): Self = StObject.set(x, "msgs", value.asInstanceOf[js.Any])
      
      inline def setMsgsUndefined: Self = StObject.set(x, "msgs", js.undefined)
      
      inline def setPub(value: Boolean): Self = StObject.set(x, "pub", value.asInstanceOf[js.Any])
      
      inline def setPubUndefined: Self = StObject.set(x, "pub", js.undefined)
      
      inline def setRep(value: Boolean): Self = StObject.set(x, "rep", value.asInstanceOf[js.Any])
      
      inline def setRepUndefined: Self = StObject.set(x, "rep", js.undefined)
      
      inline def setReq(value: Boolean): Self = StObject.set(x, "req", value.asInstanceOf[js.Any])
      
      inline def setReqUndefined: Self = StObject.set(x, "req", js.undefined)
      
      inline def setSize(value: Double): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
      
      inline def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
      
      inline def setSub(value: Boolean): Self = StObject.set(x, "sub", value.asInstanceOf[js.Any])
      
      inline def setSubUndefined: Self = StObject.set(x, "sub", js.undefined)
      
      inline def setSubject(value: String): Self = StObject.set(x, "subject", value.asInstanceOf[js.Any])
      
      inline def setSubjectUndefined: Self = StObject.set(x, "subject", js.undefined)
    }
  }
}
