package typings.maximMazurokGapiClientDlp.gapi.client.dlp

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GooglePrivacyDlpV2PartitionId extends StObject {
  
  /** If not empty, the ID of the namespace to which the entities belong. */
  var namespaceId: js.UndefOr[String] = js.native
  
  /** The ID of the project to which the entities belong. */
  var projectId: js.UndefOr[String] = js.native
}
object GooglePrivacyDlpV2PartitionId {
  
  @scala.inline
  def apply(): GooglePrivacyDlpV2PartitionId = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GooglePrivacyDlpV2PartitionId]
  }
  
  @scala.inline
  implicit class GooglePrivacyDlpV2PartitionIdMutableBuilder[Self <: GooglePrivacyDlpV2PartitionId] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setNamespaceId(value: String): Self = StObject.set(x, "namespaceId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNamespaceIdUndefined: Self = StObject.set(x, "namespaceId", js.undefined)
    
    @scala.inline
    def setProjectId(value: String): Self = StObject.set(x, "projectId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setProjectIdUndefined: Self = StObject.set(x, "projectId", js.undefined)
  }
}
