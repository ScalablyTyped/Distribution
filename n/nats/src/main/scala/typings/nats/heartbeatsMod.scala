package typings.nats

import typings.nats.typesMod.Status
import typings.nats.utilMod.Deferred_
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object heartbeatsMod {
  
  @JSImport("nats/lib/nats-base-client/heartbeats", "Heartbeat")
  @js.native
  open class Heartbeat protected () extends StObject {
    def this(ph: PH, interval: Double, maxOut: Double) = this()
    
    def _reset(): Unit = js.native
    
    def _schedule(): Unit = js.native
    
    def cancel(): Unit = js.native
    def cancel(stale: Boolean): Unit = js.native
    
    var interval: Double = js.native
    
    var maxOut: Double = js.native
    
    var pendings: js.Array[js.Promise[Unit]] = js.native
    
    var ph: PH = js.native
    
    def start(): Unit = js.native
    
    var timer: js.UndefOr[Double] = js.native
  }
  
  @js.native
  trait PH extends StObject {
    
    def disconnect(): Unit = js.native
    
    def dispatchStatus(status: Status): Unit = js.native
    
    def flush(): js.Promise[Unit] = js.native
    def flush(p: Deferred_[Unit]): js.Promise[Unit] = js.native
  }
}
