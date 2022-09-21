package typings.nats.typesMod

import typings.nats.anon.PartialfnDnsResolveFnrandFn
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Server extends StObject {
  
  var hostname: String
  
  var listen: String
  
  var port: Double
  
  def resolve(opts: PartialfnDnsResolveFnrandFn): js.Promise[js.Array[Server]]
  
  var src: String
  
  var tlsName: String
}
object Server {
  
  inline def apply(
    hostname: String,
    listen: String,
    port: Double,
    resolve: PartialfnDnsResolveFnrandFn => js.Promise[js.Array[Server]],
    src: String,
    tlsName: String
  ): Server = {
    val __obj = js.Dynamic.literal(hostname = hostname.asInstanceOf[js.Any], listen = listen.asInstanceOf[js.Any], port = port.asInstanceOf[js.Any], resolve = js.Any.fromFunction1(resolve), src = src.asInstanceOf[js.Any], tlsName = tlsName.asInstanceOf[js.Any])
    __obj.asInstanceOf[Server]
  }
  
  extension [Self <: Server](x: Self) {
    
    inline def setHostname(value: String): Self = StObject.set(x, "hostname", value.asInstanceOf[js.Any])
    
    inline def setListen(value: String): Self = StObject.set(x, "listen", value.asInstanceOf[js.Any])
    
    inline def setPort(value: Double): Self = StObject.set(x, "port", value.asInstanceOf[js.Any])
    
    inline def setResolve(value: PartialfnDnsResolveFnrandFn => js.Promise[js.Array[Server]]): Self = StObject.set(x, "resolve", js.Any.fromFunction1(value))
    
    inline def setSrc(value: String): Self = StObject.set(x, "src", value.asInstanceOf[js.Any])
    
    inline def setTlsName(value: String): Self = StObject.set(x, "tlsName", value.asInstanceOf[js.Any])
  }
}
