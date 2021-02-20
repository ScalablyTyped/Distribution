package typings.node.http2Mod

import typings.node.nodeStrings.httpColon
import typings.node.nodeStrings.httpsColon
import typings.node.streamMod.Duplex
import typings.node.urlMod.URL_
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ClientSessionOptions extends SessionOptions {
  
  @JSName("createConnection")
  var createConnection_ClientSessionOptions: js.UndefOr[js.Function2[/* authority */ URL_, /* option */ SessionOptions, Duplex]] = js.native
  
  var maxReservedRemoteStreams: js.UndefOr[Double] = js.native
  
  var protocol: js.UndefOr[httpColon | httpsColon] = js.native
}
object ClientSessionOptions {
  
  @scala.inline
  def apply(): ClientSessionOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ClientSessionOptions]
  }
  
  @scala.inline
  implicit class ClientSessionOptionsMutableBuilder[Self <: ClientSessionOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCreateConnection(value: (/* authority */ URL_, /* option */ SessionOptions) => Duplex): Self = StObject.set(x, "createConnection", js.Any.fromFunction2(value))
    
    @scala.inline
    def setCreateConnectionUndefined: Self = StObject.set(x, "createConnection", js.undefined)
    
    @scala.inline
    def setMaxReservedRemoteStreams(value: Double): Self = StObject.set(x, "maxReservedRemoteStreams", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMaxReservedRemoteStreamsUndefined: Self = StObject.set(x, "maxReservedRemoteStreams", js.undefined)
    
    @scala.inline
    def setProtocol(value: httpColon | httpsColon): Self = StObject.set(x, "protocol", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setProtocolUndefined: Self = StObject.set(x, "protocol", js.undefined)
  }
}
