package typings.maximMazurokGapiClientFirestore.gapi.client.firestore

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GoogleFirestoreAdminV1Index extends StObject {
  
  /**
    * The fields supported by this index. For composite indexes, this is always 2 or more fields. The last field entry is always for the field path `__name__`. If, on creation, `__name__`
    * was not specified as the last field, it will be added automatically with the same direction as that of the last field defined. If the final field in a composite index is not
    * directional, the `__name__` will be ordered ASCENDING (unless explicitly specified). For single field indexes, this will always be exactly one entry with a field path equal to the
    * field path of the associated field.
    */
  var fields: js.UndefOr[js.Array[GoogleFirestoreAdminV1IndexField]] = js.undefined
  
  /**
    * Output only. A server defined name for this index. The form of this name for composite indexes will be:
    * `projects/{project_id}/databases/{database_id}/collectionGroups/{collection_id}/indexes/{composite_index_id}` For single field indexes, this field will be empty.
    */
  var name: js.UndefOr[String] = js.undefined
  
  /**
    * Indexes with a collection query scope specified allow queries against a collection that is the child of a specific document, specified at query time, and that has the same
    * collection id. Indexes with a collection group query scope specified allow queries against all collections descended from a specific document, specified at query time, and that have
    * the same collection id as this index.
    */
  var queryScope: js.UndefOr[String] = js.undefined
  
  /** Output only. The serving state of the index. */
  var state: js.UndefOr[String] = js.undefined
}
object GoogleFirestoreAdminV1Index {
  
  inline def apply(): GoogleFirestoreAdminV1Index = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GoogleFirestoreAdminV1Index]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: GoogleFirestoreAdminV1Index] (val x: Self) extends AnyVal {
    
    inline def setFields(value: js.Array[GoogleFirestoreAdminV1IndexField]): Self = StObject.set(x, "fields", value.asInstanceOf[js.Any])
    
    inline def setFieldsUndefined: Self = StObject.set(x, "fields", js.undefined)
    
    inline def setFieldsVarargs(value: GoogleFirestoreAdminV1IndexField*): Self = StObject.set(x, "fields", js.Array(value*))
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    inline def setQueryScope(value: String): Self = StObject.set(x, "queryScope", value.asInstanceOf[js.Any])
    
    inline def setQueryScopeUndefined: Self = StObject.set(x, "queryScope", js.undefined)
    
    inline def setState(value: String): Self = StObject.set(x, "state", value.asInstanceOf[js.Any])
    
    inline def setStateUndefined: Self = StObject.set(x, "state", js.undefined)
  }
}
