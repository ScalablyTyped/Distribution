package typings.nginstackEngine.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DeletedIds extends StObject {
  
  var deletedIds: js.Array[Any]
  
  var insertedIds: js.Array[Any]
  
  var modified: Boolean
  
  var updatedIds: js.Array[Any]
}
object DeletedIds {
  
  inline def apply(
    deletedIds: js.Array[Any],
    insertedIds: js.Array[Any],
    modified: Boolean,
    updatedIds: js.Array[Any]
  ): DeletedIds = {
    val __obj = js.Dynamic.literal(deletedIds = deletedIds.asInstanceOf[js.Any], insertedIds = insertedIds.asInstanceOf[js.Any], modified = modified.asInstanceOf[js.Any], updatedIds = updatedIds.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeletedIds]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: DeletedIds] (val x: Self) extends AnyVal {
    
    inline def setDeletedIds(value: js.Array[Any]): Self = StObject.set(x, "deletedIds", value.asInstanceOf[js.Any])
    
    inline def setDeletedIdsVarargs(value: Any*): Self = StObject.set(x, "deletedIds", js.Array(value*))
    
    inline def setInsertedIds(value: js.Array[Any]): Self = StObject.set(x, "insertedIds", value.asInstanceOf[js.Any])
    
    inline def setInsertedIdsVarargs(value: Any*): Self = StObject.set(x, "insertedIds", js.Array(value*))
    
    inline def setModified(value: Boolean): Self = StObject.set(x, "modified", value.asInstanceOf[js.Any])
    
    inline def setUpdatedIds(value: js.Array[Any]): Self = StObject.set(x, "updatedIds", value.asInstanceOf[js.Any])
    
    inline def setUpdatedIdsVarargs(value: Any*): Self = StObject.set(x, "updatedIds", js.Array(value*))
  }
}
