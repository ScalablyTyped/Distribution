package typings.nextAuth.providersMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ProviderEmailServer extends StObject {
  
  var auth: ProviderEmailAuth
  
  var host: String
  
  var port: Double
}
object ProviderEmailServer {
  
  @scala.inline
  def apply(auth: ProviderEmailAuth, host: String, port: Double): ProviderEmailServer = {
    val __obj = js.Dynamic.literal(auth = auth.asInstanceOf[js.Any], host = host.asInstanceOf[js.Any], port = port.asInstanceOf[js.Any])
    __obj.asInstanceOf[ProviderEmailServer]
  }
  
  @scala.inline
  implicit class ProviderEmailServerMutableBuilder[Self <: ProviderEmailServer] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAuth(value: ProviderEmailAuth): Self = StObject.set(x, "auth", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHost(value: String): Self = StObject.set(x, "host", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPort(value: Double): Self = StObject.set(x, "port", value.asInstanceOf[js.Any])
  }
}
