package typings.nats

import typings.nats.errorMod.NatsError
import typings.nats.requestMod.Request
import typings.nats.typesMod.Msg
import typings.std.Map
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object muxsubscriptionMod {
  
  @JSImport("nats/lib/nats-base-client/muxsubscription", "MuxSubscription")
  @js.native
  open class MuxSubscription () extends StObject {
    
    def add(r: Request): Unit = js.native
    
    def all(): js.Array[Request] = js.native
    
    var baseInbox: String = js.native
    
    def cancel(r: Request): Unit = js.native
    
    def close(): Unit = js.native
    
    def dispatcher(): js.Function2[/* err */ NatsError | Null, /* m */ Msg, Unit] = js.native
    
    def get(token: String): js.UndefOr[Request] = js.native
    
    def getToken(m: Msg): String | Null = js.native
    
    def handleError(isMuxPermissionError: Boolean): Boolean = js.native
    def handleError(isMuxPermissionError: Boolean, err: NatsError): Boolean = js.native
    
    def init(): String = js.native
    def init(prefix: String): String = js.native
    
    var reqs: Map[String, Request] = js.native
    
    def size(): Double = js.native
  }
}
