package typings.maximMazurokGapiClientDns.gapi.client.dns

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Change extends StObject {
  
  /** Which ResourceRecordSets to add? */
  var additions: js.UndefOr[js.Array[ResourceRecordSet]] = js.native
  
  /** Which ResourceRecordSets to remove? Must match existing data exactly. */
  var deletions: js.UndefOr[js.Array[ResourceRecordSet]] = js.native
  
  /** Unique identifier for the resource; defined by the server (output only). */
  var id: js.UndefOr[String] = js.native
  
  /** If the DNS queries for the zone will be served. */
  var isServing: js.UndefOr[Boolean] = js.native
  
  var kind: js.UndefOr[String] = js.native
  
  /** The time that this operation was started by the server (output only). This is in RFC3339 text format. */
  var startTime: js.UndefOr[String] = js.native
  
  /** Status of the operation (output only). A status of "done" means that the request to update the authoritative servers has been sent but the servers might not be updated yet. */
  var status: js.UndefOr[String] = js.native
}
object Change {
  
  @scala.inline
  def apply(): Change = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Change]
  }
  
  @scala.inline
  implicit class ChangeMutableBuilder[Self <: Change] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAdditions(value: js.Array[ResourceRecordSet]): Self = StObject.set(x, "additions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAdditionsUndefined: Self = StObject.set(x, "additions", js.undefined)
    
    @scala.inline
    def setAdditionsVarargs(value: ResourceRecordSet*): Self = StObject.set(x, "additions", js.Array(value :_*))
    
    @scala.inline
    def setDeletions(value: js.Array[ResourceRecordSet]): Self = StObject.set(x, "deletions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDeletionsUndefined: Self = StObject.set(x, "deletions", js.undefined)
    
    @scala.inline
    def setDeletionsVarargs(value: ResourceRecordSet*): Self = StObject.set(x, "deletions", js.Array(value :_*))
    
    @scala.inline
    def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
    
    @scala.inline
    def setIsServing(value: Boolean): Self = StObject.set(x, "isServing", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIsServingUndefined: Self = StObject.set(x, "isServing", js.undefined)
    
    @scala.inline
    def setKind(value: String): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setKindUndefined: Self = StObject.set(x, "kind", js.undefined)
    
    @scala.inline
    def setStartTime(value: String): Self = StObject.set(x, "startTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStartTimeUndefined: Self = StObject.set(x, "startTime", js.undefined)
    
    @scala.inline
    def setStatus(value: String): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStatusUndefined: Self = StObject.set(x, "status", js.undefined)
  }
}
