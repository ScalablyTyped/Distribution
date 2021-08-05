package typings.maximMazurokGapiClientDlp.gapi.client.dlp

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GooglePrivacyDlpV2PartitionId extends StObject {
  
  /** If not empty, the ID of the namespace to which the entities belong. */
  var namespaceId: js.UndefOr[String] = js.undefined
  
  /** The ID of the project to which the entities belong. */
  var projectId: js.UndefOr[String] = js.undefined
}
object GooglePrivacyDlpV2PartitionId {
  
  inline def apply(): GooglePrivacyDlpV2PartitionId = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GooglePrivacyDlpV2PartitionId]
  }
  
  extension [Self <: GooglePrivacyDlpV2PartitionId](x: Self) {
    
    inline def setNamespaceId(value: String): Self = StObject.set(x, "namespaceId", value.asInstanceOf[js.Any])
    
    inline def setNamespaceIdUndefined: Self = StObject.set(x, "namespaceId", js.undefined)
    
    inline def setProjectId(value: String): Self = StObject.set(x, "projectId", value.asInstanceOf[js.Any])
    
    inline def setProjectIdUndefined: Self = StObject.set(x, "projectId", js.undefined)
  }
}
