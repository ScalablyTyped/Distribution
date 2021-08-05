package typings.maximMazurokGapiClientFirestore.gapi.client.firestore

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GoogleFirestoreAdminV1ImportDocumentsMetadata extends StObject {
  
  /** Which collection ids are being imported. */
  var collectionIds: js.UndefOr[js.Array[String]] = js.undefined
  
  /** The time this operation completed. Will be unset if operation still in progress. */
  var endTime: js.UndefOr[String] = js.undefined
  
  /** The location of the documents being imported. */
  var inputUriPrefix: js.UndefOr[String] = js.undefined
  
  /** The state of the import operation. */
  var operationState: js.UndefOr[String] = js.undefined
  
  /** The progress, in bytes, of this operation. */
  var progressBytes: js.UndefOr[GoogleFirestoreAdminV1Progress] = js.undefined
  
  /** The progress, in documents, of this operation. */
  var progressDocuments: js.UndefOr[GoogleFirestoreAdminV1Progress] = js.undefined
  
  /** The time this operation started. */
  var startTime: js.UndefOr[String] = js.undefined
}
object GoogleFirestoreAdminV1ImportDocumentsMetadata {
  
  inline def apply(): GoogleFirestoreAdminV1ImportDocumentsMetadata = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GoogleFirestoreAdminV1ImportDocumentsMetadata]
  }
  
  extension [Self <: GoogleFirestoreAdminV1ImportDocumentsMetadata](x: Self) {
    
    inline def setCollectionIds(value: js.Array[String]): Self = StObject.set(x, "collectionIds", value.asInstanceOf[js.Any])
    
    inline def setCollectionIdsUndefined: Self = StObject.set(x, "collectionIds", js.undefined)
    
    inline def setCollectionIdsVarargs(value: String*): Self = StObject.set(x, "collectionIds", js.Array(value :_*))
    
    inline def setEndTime(value: String): Self = StObject.set(x, "endTime", value.asInstanceOf[js.Any])
    
    inline def setEndTimeUndefined: Self = StObject.set(x, "endTime", js.undefined)
    
    inline def setInputUriPrefix(value: String): Self = StObject.set(x, "inputUriPrefix", value.asInstanceOf[js.Any])
    
    inline def setInputUriPrefixUndefined: Self = StObject.set(x, "inputUriPrefix", js.undefined)
    
    inline def setOperationState(value: String): Self = StObject.set(x, "operationState", value.asInstanceOf[js.Any])
    
    inline def setOperationStateUndefined: Self = StObject.set(x, "operationState", js.undefined)
    
    inline def setProgressBytes(value: GoogleFirestoreAdminV1Progress): Self = StObject.set(x, "progressBytes", value.asInstanceOf[js.Any])
    
    inline def setProgressBytesUndefined: Self = StObject.set(x, "progressBytes", js.undefined)
    
    inline def setProgressDocuments(value: GoogleFirestoreAdminV1Progress): Self = StObject.set(x, "progressDocuments", value.asInstanceOf[js.Any])
    
    inline def setProgressDocumentsUndefined: Self = StObject.set(x, "progressDocuments", js.undefined)
    
    inline def setStartTime(value: String): Self = StObject.set(x, "startTime", value.asInstanceOf[js.Any])
    
    inline def setStartTimeUndefined: Self = StObject.set(x, "startTime", js.undefined)
  }
}
