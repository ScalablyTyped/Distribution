package typings.maximMazurokGapiClientWebsecurityscanner.gapi.client.websecurityscanner

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ProjectsResource extends StObject {
  
  var scanConfigs: ScanConfigsResource
}
object ProjectsResource {
  
  inline def apply(scanConfigs: ScanConfigsResource): ProjectsResource = {
    val __obj = js.Dynamic.literal(scanConfigs = scanConfigs.asInstanceOf[js.Any])
    __obj.asInstanceOf[ProjectsResource]
  }
  
  extension [Self <: ProjectsResource](x: Self) {
    
    inline def setScanConfigs(value: ScanConfigsResource): Self = StObject.set(x, "scanConfigs", value.asInstanceOf[js.Any])
  }
}
