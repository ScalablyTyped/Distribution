package typings.nats

import typings.nats.typesMod.ConnectionOptions
import typings.nats.typesMod.DnsResolveFn
import typings.nats.typesMod.Server
import typings.nats.typesMod.URLParseFn
import typings.std.AsyncIterable
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object transportMod {
  
  @JSImport("nats/lib/nats-base-client/transport", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def defaultPort(): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("defaultPort")().asInstanceOf[Double]
  
  inline def getResolveFn(): js.UndefOr[DnsResolveFn] = ^.asInstanceOf[js.Dynamic].applyDynamic("getResolveFn")().asInstanceOf[js.UndefOr[DnsResolveFn]]
  
  inline def getUrlParseFn(): js.UndefOr[URLParseFn] = ^.asInstanceOf[js.Dynamic].applyDynamic("getUrlParseFn")().asInstanceOf[js.UndefOr[URLParseFn]]
  
  inline def newTransport(): Transport = ^.asInstanceOf[js.Dynamic].applyDynamic("newTransport")().asInstanceOf[Transport]
  
  inline def setTransportFactory(config: TransportFactory): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("setTransportFactory")(config.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  @js.native
  trait Transport
    extends StObject
       with AsyncIterable[js.typedarray.Uint8Array] {
    
    def close(): js.Promise[Unit] = js.native
    def close(err: js.Error): js.Promise[Unit] = js.native
    
    val closeError: js.UndefOr[js.Error] = js.native
    
    def closed(): js.Promise[Unit | js.Error] = js.native
    
    def connect(server: Server, opts: ConnectionOptions): js.Promise[Unit] = js.native
    
    def disconnect(): Unit = js.native
    
    val isClosed: Boolean = js.native
    
    def isEncrypted(): Boolean = js.native
    
    val lang: String = js.native
    
    def send(frame: js.typedarray.Uint8Array): Unit = js.native
    
    val version: String = js.native
  }
  
  trait TransportFactory extends StObject {
    
    var defaultPort: js.UndefOr[Double] = js.undefined
    
    var dnsResolveFn: js.UndefOr[DnsResolveFn] = js.undefined
    
    var factory: js.UndefOr[js.Function0[Transport]] = js.undefined
    
    var urlParseFn: js.UndefOr[URLParseFn] = js.undefined
  }
  object TransportFactory {
    
    inline def apply(): TransportFactory = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[TransportFactory]
    }
    
    extension [Self <: TransportFactory](x: Self) {
      
      inline def setDefaultPort(value: Double): Self = StObject.set(x, "defaultPort", value.asInstanceOf[js.Any])
      
      inline def setDefaultPortUndefined: Self = StObject.set(x, "defaultPort", js.undefined)
      
      inline def setDnsResolveFn(value: /* h */ String => js.Promise[js.Array[String]]): Self = StObject.set(x, "dnsResolveFn", js.Any.fromFunction1(value))
      
      inline def setDnsResolveFnUndefined: Self = StObject.set(x, "dnsResolveFn", js.undefined)
      
      inline def setFactory(value: () => Transport): Self = StObject.set(x, "factory", js.Any.fromFunction0(value))
      
      inline def setFactoryUndefined: Self = StObject.set(x, "factory", js.undefined)
      
      inline def setUrlParseFn(value: /* u */ String => String): Self = StObject.set(x, "urlParseFn", js.Any.fromFunction1(value))
      
      inline def setUrlParseFnUndefined: Self = StObject.set(x, "urlParseFn", js.undefined)
    }
  }
}
