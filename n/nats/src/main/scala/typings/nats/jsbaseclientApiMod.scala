package typings.nats

import typings.nats.codecMod.Codec
import typings.nats.natsMod.NatsConnectionImpl
import typings.nats.typesMod.JetStreamOptions
import typings.nats.typesMod.Msg
import typings.nats.typesMod.NatsConnection
import typings.nats.typesMod.RequestOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object jsbaseclientApiMod {
  
  @JSImport("nats/lib/nats-base-client/jsbaseclient_api", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("nats/lib/nats-base-client/jsbaseclient_api", "BaseApiClient")
  @js.native
  open class BaseApiClient protected () extends StObject {
    def this(nc: NatsConnection) = this()
    def this(nc: NatsConnection, opts: JetStreamOptions) = this()
    
    def _parseOpts(): Unit = js.native
    
    def _request(subj: String): js.Promise[Any] = js.native
    def _request(subj: String, data: Any): js.Promise[Any] = js.native
    def _request(subj: String, data: Any, opts: RequestOptions): js.Promise[Any] = js.native
    def _request(subj: String, data: Unit, opts: RequestOptions): js.Promise[Any] = js.native
    
    def findStream(subject: String): js.Promise[String] = js.native
    
    var jc: Codec[Any] = js.native
    
    var nc: NatsConnectionImpl = js.native
    
    var opts: JetStreamOptions = js.native
    
    def parseJsResponse(m: Msg): Any = js.native
    
    var prefix: String = js.native
    
    var timeout: Double = js.native
  }
  
  inline def defaultJsOptions(): JetStreamOptions = ^.asInstanceOf[js.Dynamic].applyDynamic("defaultJsOptions")().asInstanceOf[JetStreamOptions]
  inline def defaultJsOptions(opts: JetStreamOptions): JetStreamOptions = ^.asInstanceOf[js.Dynamic].applyDynamic("defaultJsOptions")(opts.asInstanceOf[js.Any]).asInstanceOf[JetStreamOptions]
}
