package typings.maximMazurokGapiClientSpanner.gapi.client.spanner

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ListDatabaseRolesResponse extends StObject {
  
  /** Database roles that matched the request. */
  var databaseRoles: js.UndefOr[js.Array[DatabaseRole]] = js.undefined
  
  /** `next_page_token` can be sent in a subsequent ListDatabaseRoles call to fetch more of the matching roles. */
  var nextPageToken: js.UndefOr[String] = js.undefined
}
object ListDatabaseRolesResponse {
  
  inline def apply(): ListDatabaseRolesResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListDatabaseRolesResponse]
  }
  
  extension [Self <: ListDatabaseRolesResponse](x: Self) {
    
    inline def setDatabaseRoles(value: js.Array[DatabaseRole]): Self = StObject.set(x, "databaseRoles", value.asInstanceOf[js.Any])
    
    inline def setDatabaseRolesUndefined: Self = StObject.set(x, "databaseRoles", js.undefined)
    
    inline def setDatabaseRolesVarargs(value: DatabaseRole*): Self = StObject.set(x, "databaseRoles", js.Array(value*))
    
    inline def setNextPageToken(value: String): Self = StObject.set(x, "nextPageToken", value.asInstanceOf[js.Any])
    
    inline def setNextPageTokenUndefined: Self = StObject.set(x, "nextPageToken", js.undefined)
  }
}
