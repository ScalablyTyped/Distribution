package typings.maximMazurokGapiClientSecretmanager.gapi.client.secretmanager

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ListSecretsResponse extends StObject {
  
  /** A token to retrieve the next page of results. Pass this value in ListSecretsRequest.page_token to retrieve the next page. */
  var nextPageToken: js.UndefOr[String] = js.undefined
  
  /** The list of Secrets sorted in reverse by create_time (newest first). */
  var secrets: js.UndefOr[js.Array[Secret]] = js.undefined
  
  /** The total number of Secrets. */
  var totalSize: js.UndefOr[Double] = js.undefined
}
object ListSecretsResponse {
  
  inline def apply(): ListSecretsResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListSecretsResponse]
  }
  
  extension [Self <: ListSecretsResponse](x: Self) {
    
    inline def setNextPageToken(value: String): Self = StObject.set(x, "nextPageToken", value.asInstanceOf[js.Any])
    
    inline def setNextPageTokenUndefined: Self = StObject.set(x, "nextPageToken", js.undefined)
    
    inline def setSecrets(value: js.Array[Secret]): Self = StObject.set(x, "secrets", value.asInstanceOf[js.Any])
    
    inline def setSecretsUndefined: Self = StObject.set(x, "secrets", js.undefined)
    
    inline def setSecretsVarargs(value: Secret*): Self = StObject.set(x, "secrets", js.Array(value :_*))
    
    inline def setTotalSize(value: Double): Self = StObject.set(x, "totalSize", value.asInstanceOf[js.Any])
    
    inline def setTotalSizeUndefined: Self = StObject.set(x, "totalSize", js.undefined)
  }
}
