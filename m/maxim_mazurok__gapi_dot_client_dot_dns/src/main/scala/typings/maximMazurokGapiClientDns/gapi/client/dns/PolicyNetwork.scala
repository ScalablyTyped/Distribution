package typings.maximMazurokGapiClientDns.gapi.client.dns

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PolicyNetwork extends StObject {
  
  var kind: js.UndefOr[String] = js.undefined
  
  /** The fully qualified URL of the VPC network to bind to. This should be formatted like https://www.googleapis.com/compute/v1/projects/{project}/global/networks/{network} */
  var networkUrl: js.UndefOr[String] = js.undefined
}
object PolicyNetwork {
  
  inline def apply(): PolicyNetwork = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PolicyNetwork]
  }
  
  extension [Self <: PolicyNetwork](x: Self) {
    
    inline def setKind(value: String): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
    
    inline def setKindUndefined: Self = StObject.set(x, "kind", js.undefined)
    
    inline def setNetworkUrl(value: String): Self = StObject.set(x, "networkUrl", value.asInstanceOf[js.Any])
    
    inline def setNetworkUrlUndefined: Self = StObject.set(x, "networkUrl", js.undefined)
  }
}
