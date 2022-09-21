package typings.maximMazurokGapiClientRun.gapi.client.run

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GoogleCloudRunV2ListRevisionsResponse extends StObject {
  
  /** A token indicating there are more items than page_size. Use it in the next ListRevisions request to continue. */
  var nextPageToken: js.UndefOr[String] = js.undefined
  
  /** The resulting list of Revisions. */
  var revisions: js.UndefOr[js.Array[GoogleCloudRunV2Revision]] = js.undefined
}
object GoogleCloudRunV2ListRevisionsResponse {
  
  inline def apply(): GoogleCloudRunV2ListRevisionsResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GoogleCloudRunV2ListRevisionsResponse]
  }
  
  extension [Self <: GoogleCloudRunV2ListRevisionsResponse](x: Self) {
    
    inline def setNextPageToken(value: String): Self = StObject.set(x, "nextPageToken", value.asInstanceOf[js.Any])
    
    inline def setNextPageTokenUndefined: Self = StObject.set(x, "nextPageToken", js.undefined)
    
    inline def setRevisions(value: js.Array[GoogleCloudRunV2Revision]): Self = StObject.set(x, "revisions", value.asInstanceOf[js.Any])
    
    inline def setRevisionsUndefined: Self = StObject.set(x, "revisions", js.undefined)
    
    inline def setRevisionsVarargs(value: GoogleCloudRunV2Revision*): Self = StObject.set(x, "revisions", js.Array(value*))
  }
}
