package typings.maximMazurokGapiClientIdentitytoolkit.gapi.client.identitytoolkit

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DownloadAccountResponse extends StObject {
  
  /** The fixed string "identitytoolkit#DownloadAccountResponse". */
  var kind: js.UndefOr[String] = js.undefined
  
  /** The next page token. To be used in a subsequent request to return the next page of results. */
  var nextPageToken: js.UndefOr[String] = js.undefined
  
  /** The user accounts data. */
  var users: js.UndefOr[js.Array[UserInfo]] = js.undefined
}
object DownloadAccountResponse {
  
  inline def apply(): DownloadAccountResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DownloadAccountResponse]
  }
  
  extension [Self <: DownloadAccountResponse](x: Self) {
    
    inline def setKind(value: String): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
    
    inline def setKindUndefined: Self = StObject.set(x, "kind", js.undefined)
    
    inline def setNextPageToken(value: String): Self = StObject.set(x, "nextPageToken", value.asInstanceOf[js.Any])
    
    inline def setNextPageTokenUndefined: Self = StObject.set(x, "nextPageToken", js.undefined)
    
    inline def setUsers(value: js.Array[UserInfo]): Self = StObject.set(x, "users", value.asInstanceOf[js.Any])
    
    inline def setUsersUndefined: Self = StObject.set(x, "users", js.undefined)
    
    inline def setUsersVarargs(value: UserInfo*): Self = StObject.set(x, "users", js.Array(value :_*))
  }
}
