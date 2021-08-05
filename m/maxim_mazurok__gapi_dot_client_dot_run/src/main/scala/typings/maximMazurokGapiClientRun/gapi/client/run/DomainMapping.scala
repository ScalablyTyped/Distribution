package typings.maximMazurokGapiClientRun.gapi.client.run

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DomainMapping extends StObject {
  
  /** The API version for this call such as "domains.cloudrun.com/v1". */
  var apiVersion: js.UndefOr[String] = js.undefined
  
  /** The kind of resource, in this case "DomainMapping". */
  var kind: js.UndefOr[String] = js.undefined
  
  /** Metadata associated with this BuildTemplate. */
  var metadata: js.UndefOr[ObjectMeta] = js.undefined
  
  /** The spec for this DomainMapping. */
  var spec: js.UndefOr[DomainMappingSpec] = js.undefined
  
  /** The current status of the DomainMapping. */
  var status: js.UndefOr[DomainMappingStatus] = js.undefined
}
object DomainMapping {
  
  inline def apply(): DomainMapping = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DomainMapping]
  }
  
  extension [Self <: DomainMapping](x: Self) {
    
    inline def setApiVersion(value: String): Self = StObject.set(x, "apiVersion", value.asInstanceOf[js.Any])
    
    inline def setApiVersionUndefined: Self = StObject.set(x, "apiVersion", js.undefined)
    
    inline def setKind(value: String): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
    
    inline def setKindUndefined: Self = StObject.set(x, "kind", js.undefined)
    
    inline def setMetadata(value: ObjectMeta): Self = StObject.set(x, "metadata", value.asInstanceOf[js.Any])
    
    inline def setMetadataUndefined: Self = StObject.set(x, "metadata", js.undefined)
    
    inline def setSpec(value: DomainMappingSpec): Self = StObject.set(x, "spec", value.asInstanceOf[js.Any])
    
    inline def setSpecUndefined: Self = StObject.set(x, "spec", js.undefined)
    
    inline def setStatus(value: DomainMappingStatus): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
    
    inline def setStatusUndefined: Self = StObject.set(x, "status", js.undefined)
  }
}
