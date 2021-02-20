package typings.maximMazurokGapiClientRun.gapi.client.run

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DomainMapping extends StObject {
  
  /** The API version for this call such as "domains.cloudrun.com/v1". */
  var apiVersion: js.UndefOr[String] = js.native
  
  /** The kind of resource, in this case "DomainMapping". */
  var kind: js.UndefOr[String] = js.native
  
  /** Metadata associated with this BuildTemplate. */
  var metadata: js.UndefOr[ObjectMeta] = js.native
  
  /** The spec for this DomainMapping. */
  var spec: js.UndefOr[DomainMappingSpec] = js.native
  
  /** The current status of the DomainMapping. */
  var status: js.UndefOr[DomainMappingStatus] = js.native
}
object DomainMapping {
  
  @scala.inline
  def apply(): DomainMapping = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DomainMapping]
  }
  
  @scala.inline
  implicit class DomainMappingMutableBuilder[Self <: DomainMapping] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setApiVersion(value: String): Self = StObject.set(x, "apiVersion", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setApiVersionUndefined: Self = StObject.set(x, "apiVersion", js.undefined)
    
    @scala.inline
    def setKind(value: String): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setKindUndefined: Self = StObject.set(x, "kind", js.undefined)
    
    @scala.inline
    def setMetadata(value: ObjectMeta): Self = StObject.set(x, "metadata", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMetadataUndefined: Self = StObject.set(x, "metadata", js.undefined)
    
    @scala.inline
    def setSpec(value: DomainMappingSpec): Self = StObject.set(x, "spec", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSpecUndefined: Self = StObject.set(x, "spec", js.undefined)
    
    @scala.inline
    def setStatus(value: DomainMappingStatus): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStatusUndefined: Self = StObject.set(x, "status", js.undefined)
  }
}
