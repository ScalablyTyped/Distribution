package typings.maximMazurokGapiClientRun.gapi.client.run

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GoogleCloudRunV2VpcAccess extends StObject {
  
  /** VPC Access connector name. Format: projects/{project}/locations/{location}/connectors/{connector} */
  var connector: js.UndefOr[String] = js.undefined
  
  /** Traffic VPC egress settings. */
  var egress: js.UndefOr[String] = js.undefined
}
object GoogleCloudRunV2VpcAccess {
  
  inline def apply(): GoogleCloudRunV2VpcAccess = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GoogleCloudRunV2VpcAccess]
  }
  
  extension [Self <: GoogleCloudRunV2VpcAccess](x: Self) {
    
    inline def setConnector(value: String): Self = StObject.set(x, "connector", value.asInstanceOf[js.Any])
    
    inline def setConnectorUndefined: Self = StObject.set(x, "connector", js.undefined)
    
    inline def setEgress(value: String): Self = StObject.set(x, "egress", value.asInstanceOf[js.Any])
    
    inline def setEgressUndefined: Self = StObject.set(x, "egress", js.undefined)
  }
}
