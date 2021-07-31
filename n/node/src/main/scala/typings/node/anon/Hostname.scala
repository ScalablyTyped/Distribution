package typings.node.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Hostname extends StObject {
  
  var hostname: String
  
  var service: String
}
object Hostname {
  
  @scala.inline
  def apply(hostname: String, service: String): Hostname = {
    val __obj = js.Dynamic.literal(hostname = hostname.asInstanceOf[js.Any], service = service.asInstanceOf[js.Any])
    __obj.asInstanceOf[Hostname]
  }
  
  @scala.inline
  implicit class HostnameMutableBuilder[Self <: Hostname] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setHostname(value: String): Self = StObject.set(x, "hostname", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setService(value: String): Self = StObject.set(x, "service", value.asInstanceOf[js.Any])
  }
}
