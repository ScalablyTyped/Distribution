package typings.maximMazurokGapiClientServicenetworking.gapi.client.servicenetworking

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CloudSQLConfig extends StObject {
  
  /** Peering service used for peering with the Cloud SQL project. */
  var service: js.UndefOr[String] = js.undefined
  
  /** The name of the umbrella network in the Cloud SQL umbrella project. */
  var umbrellaNetwork: js.UndefOr[String] = js.undefined
  
  /** The project number of the Cloud SQL umbrella project. */
  var umbrellaProject: js.UndefOr[String] = js.undefined
}
object CloudSQLConfig {
  
  inline def apply(): CloudSQLConfig = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CloudSQLConfig]
  }
  
  extension [Self <: CloudSQLConfig](x: Self) {
    
    inline def setService(value: String): Self = StObject.set(x, "service", value.asInstanceOf[js.Any])
    
    inline def setServiceUndefined: Self = StObject.set(x, "service", js.undefined)
    
    inline def setUmbrellaNetwork(value: String): Self = StObject.set(x, "umbrellaNetwork", value.asInstanceOf[js.Any])
    
    inline def setUmbrellaNetworkUndefined: Self = StObject.set(x, "umbrellaNetwork", js.undefined)
    
    inline def setUmbrellaProject(value: String): Self = StObject.set(x, "umbrellaProject", value.asInstanceOf[js.Any])
    
    inline def setUmbrellaProjectUndefined: Self = StObject.set(x, "umbrellaProject", js.undefined)
  }
}
