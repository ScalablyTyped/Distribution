package typings.maximMazurokGapiClientFirestore.gapi.client.firestore

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GoogleFirestoreAdminV1ListDatabasesResponse extends StObject {
  
  /** The databases in the project. */
  var databases: js.UndefOr[js.Array[GoogleFirestoreAdminV1Database]] = js.undefined
}
object GoogleFirestoreAdminV1ListDatabasesResponse {
  
  inline def apply(): GoogleFirestoreAdminV1ListDatabasesResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GoogleFirestoreAdminV1ListDatabasesResponse]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: GoogleFirestoreAdminV1ListDatabasesResponse] (val x: Self) extends AnyVal {
    
    inline def setDatabases(value: js.Array[GoogleFirestoreAdminV1Database]): Self = StObject.set(x, "databases", value.asInstanceOf[js.Any])
    
    inline def setDatabasesUndefined: Self = StObject.set(x, "databases", js.undefined)
    
    inline def setDatabasesVarargs(value: GoogleFirestoreAdminV1Database*): Self = StObject.set(x, "databases", js.Array(value*))
  }
}
