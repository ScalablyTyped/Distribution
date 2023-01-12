package typings.maximMazurokGapiClientFirestore.gapi.client.firestore

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CollectionGroupsResource extends StObject {
  
  var fields: FieldsResource
  
  var indexes: IndexesResource
}
object CollectionGroupsResource {
  
  inline def apply(fields: FieldsResource, indexes: IndexesResource): CollectionGroupsResource = {
    val __obj = js.Dynamic.literal(fields = fields.asInstanceOf[js.Any], indexes = indexes.asInstanceOf[js.Any])
    __obj.asInstanceOf[CollectionGroupsResource]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: CollectionGroupsResource] (val x: Self) extends AnyVal {
    
    inline def setFields(value: FieldsResource): Self = StObject.set(x, "fields", value.asInstanceOf[js.Any])
    
    inline def setIndexes(value: IndexesResource): Self = StObject.set(x, "indexes", value.asInstanceOf[js.Any])
  }
}
