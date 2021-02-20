package typings.maximMazurokGapiClientRun.gapi.client.run

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Revision extends StObject {
  
  /** The API version for this call such as "serving.knative.dev/v1". */
  var apiVersion: js.UndefOr[String] = js.native
  
  /** The kind of this resource, in this case "Revision". */
  var kind: js.UndefOr[String] = js.native
  
  /** Metadata associated with this Revision, including name, namespace, labels, and annotations. */
  var metadata: js.UndefOr[ObjectMeta] = js.native
  
  /** Spec holds the desired state of the Revision (from the client). */
  var spec: js.UndefOr[RevisionSpec] = js.native
  
  /** Status communicates the observed state of the Revision (from the controller). */
  var status: js.UndefOr[RevisionStatus] = js.native
}
object Revision {
  
  @scala.inline
  def apply(): Revision = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Revision]
  }
  
  @scala.inline
  implicit class RevisionMutableBuilder[Self <: Revision] (val x: Self) extends AnyVal {
    
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
    def setSpec(value: RevisionSpec): Self = StObject.set(x, "spec", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSpecUndefined: Self = StObject.set(x, "spec", js.undefined)
    
    @scala.inline
    def setStatus(value: RevisionStatus): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStatusUndefined: Self = StObject.set(x, "status", js.undefined)
  }
}
