package typings.node.http2Mod

import typings.node.nodeColonstreamMod.Duplex
import typings.node.nodeColonurlMod.URL
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ClientSessionOptions
  extends StObject
     with SessionOptions {
  
  @JSName("createConnection")
  var createConnection_ClientSessionOptions: js.UndefOr[js.Function2[/* authority */ URL, /* option */ SessionOptions, Duplex]] = js.undefined
  
  var maxReservedRemoteStreams: js.UndefOr[Double] = js.undefined
  
  var protocol: js.UndefOr["http:" | "https:"] = js.undefined
}
object ClientSessionOptions {
  
  inline def apply(): ClientSessionOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ClientSessionOptions]
  }
  
  extension [Self <: ClientSessionOptions](x: Self) {
    
    inline def setCreateConnection(value: (/* authority */ URL, /* option */ SessionOptions) => Duplex): Self = StObject.set(x, "createConnection", js.Any.fromFunction2(value))
    
    inline def setCreateConnectionUndefined: Self = StObject.set(x, "createConnection", js.undefined)
    
    inline def setMaxReservedRemoteStreams(value: Double): Self = StObject.set(x, "maxReservedRemoteStreams", value.asInstanceOf[js.Any])
    
    inline def setMaxReservedRemoteStreamsUndefined: Self = StObject.set(x, "maxReservedRemoteStreams", js.undefined)
    
    inline def setProtocol(value: "http:" | "https:"): Self = StObject.set(x, "protocol", value.asInstanceOf[js.Any])
    
    inline def setProtocolUndefined: Self = StObject.set(x, "protocol", js.undefined)
  }
}
