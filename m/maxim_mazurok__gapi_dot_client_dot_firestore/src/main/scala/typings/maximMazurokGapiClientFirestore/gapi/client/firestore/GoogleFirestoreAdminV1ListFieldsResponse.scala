package typings.maximMazurokGapiClientFirestore.gapi.client.firestore

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GoogleFirestoreAdminV1ListFieldsResponse extends StObject {
  
  /** The requested fields. */
  var fields: js.UndefOr[js.Array[GoogleFirestoreAdminV1Field]] = js.undefined
  
  /** A page token that may be used to request another page of results. If blank, this is the last page. */
  var nextPageToken: js.UndefOr[String] = js.undefined
}
object GoogleFirestoreAdminV1ListFieldsResponse {
  
  inline def apply(): GoogleFirestoreAdminV1ListFieldsResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GoogleFirestoreAdminV1ListFieldsResponse]
  }
  
  extension [Self <: GoogleFirestoreAdminV1ListFieldsResponse](x: Self) {
    
    inline def setFields(value: js.Array[GoogleFirestoreAdminV1Field]): Self = StObject.set(x, "fields", value.asInstanceOf[js.Any])
    
    inline def setFieldsUndefined: Self = StObject.set(x, "fields", js.undefined)
    
    inline def setFieldsVarargs(value: GoogleFirestoreAdminV1Field*): Self = StObject.set(x, "fields", js.Array(value :_*))
    
    inline def setNextPageToken(value: String): Self = StObject.set(x, "nextPageToken", value.asInstanceOf[js.Any])
    
    inline def setNextPageTokenUndefined: Self = StObject.set(x, "nextPageToken", js.undefined)
  }
}
