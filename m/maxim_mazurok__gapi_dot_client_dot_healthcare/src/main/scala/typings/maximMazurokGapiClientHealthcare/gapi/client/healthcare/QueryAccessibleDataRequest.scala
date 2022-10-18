package typings.maximMazurokGapiClientHealthcare.gapi.client.healthcare

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait QueryAccessibleDataRequest extends StObject {
  
  /** The Cloud Storage destination. The Cloud Healthcare API service account must have the `roles/storage.objectAdmin` Cloud IAM role for this Cloud Storage location. */
  var gcsDestination: js.UndefOr[GoogleCloudHealthcareV1ConsentGcsDestination] = js.undefined
  
  /** The values of request attributes associated with this access request. */
  var requestAttributes: js.UndefOr[
    /* import warning: importer.ImportType#apply Failed type conversion: {[ P in string ]: string} */ js.Any
  ] = js.undefined
  
  /** Optional. The values of resource attributes associated with the type of resources being requested. If no values are specified, then all resource types are included in the output. */
  var resourceAttributes: js.UndefOr[
    /* import warning: importer.ImportType#apply Failed type conversion: {[ P in string ]: string} */ js.Any
  ] = js.undefined
}
object QueryAccessibleDataRequest {
  
  inline def apply(): QueryAccessibleDataRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[QueryAccessibleDataRequest]
  }
  
  extension [Self <: QueryAccessibleDataRequest](x: Self) {
    
    inline def setGcsDestination(value: GoogleCloudHealthcareV1ConsentGcsDestination): Self = StObject.set(x, "gcsDestination", value.asInstanceOf[js.Any])
    
    inline def setGcsDestinationUndefined: Self = StObject.set(x, "gcsDestination", js.undefined)
    
    inline def setRequestAttributes(
      value: /* import warning: importer.ImportType#apply Failed type conversion: {[ P in string ]: string} */ js.Any
    ): Self = StObject.set(x, "requestAttributes", value.asInstanceOf[js.Any])
    
    inline def setRequestAttributesUndefined: Self = StObject.set(x, "requestAttributes", js.undefined)
    
    inline def setResourceAttributes(
      value: /* import warning: importer.ImportType#apply Failed type conversion: {[ P in string ]: string} */ js.Any
    ): Self = StObject.set(x, "resourceAttributes", value.asInstanceOf[js.Any])
    
    inline def setResourceAttributesUndefined: Self = StObject.set(x, "resourceAttributes", js.undefined)
  }
}
