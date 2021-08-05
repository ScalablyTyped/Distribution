package typings.maximMazurokGapiClientIdentitytoolkit.gapi.client.identitytoolkit

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IdentitytoolkitRelyingpartyDownloadAccountRequest extends StObject {
  
  /** GCP project number of the requesting delegated app. Currently only intended for Firebase V1 migration. */
  var delegatedProjectNumber: js.UndefOr[String] = js.undefined
  
  /** The max number of results to return in the response. */
  var maxResults: js.UndefOr[Double] = js.undefined
  
  /** The token for the next page. This should be taken from the previous response. */
  var nextPageToken: js.UndefOr[String] = js.undefined
  
  /** Specify which project (field value is actually project id) to operate. Only used when provided credential. */
  var targetProjectId: js.UndefOr[String] = js.undefined
}
object IdentitytoolkitRelyingpartyDownloadAccountRequest {
  
  inline def apply(): IdentitytoolkitRelyingpartyDownloadAccountRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IdentitytoolkitRelyingpartyDownloadAccountRequest]
  }
  
  extension [Self <: IdentitytoolkitRelyingpartyDownloadAccountRequest](x: Self) {
    
    inline def setDelegatedProjectNumber(value: String): Self = StObject.set(x, "delegatedProjectNumber", value.asInstanceOf[js.Any])
    
    inline def setDelegatedProjectNumberUndefined: Self = StObject.set(x, "delegatedProjectNumber", js.undefined)
    
    inline def setMaxResults(value: Double): Self = StObject.set(x, "maxResults", value.asInstanceOf[js.Any])
    
    inline def setMaxResultsUndefined: Self = StObject.set(x, "maxResults", js.undefined)
    
    inline def setNextPageToken(value: String): Self = StObject.set(x, "nextPageToken", value.asInstanceOf[js.Any])
    
    inline def setNextPageTokenUndefined: Self = StObject.set(x, "nextPageToken", js.undefined)
    
    inline def setTargetProjectId(value: String): Self = StObject.set(x, "targetProjectId", value.asInstanceOf[js.Any])
    
    inline def setTargetProjectIdUndefined: Self = StObject.set(x, "targetProjectId", js.undefined)
  }
}
