package typings.openui5.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ChangeSetId extends StObject {
  
  /**
    * ID of the `ChangeSet` that this request should belong to. If not provided, the `changeSetId` defined
    * for the type of the entity to be deleted is used.
    */
  var changeSetId: js.UndefOr[String] = js.undefined
  
  /**
    * ID of a request group; requests belonging to the same group will be bundled in one batch request. If
    * not provided, the `groupId` defined for the type of the entity to be deleted is used.
    */
  var groupId: js.UndefOr[String] = js.undefined
  
  /**
    * Defines whether to update all bindings after submitting this change operation, see {@link #setRefreshAfterChange}.
    * If given, this overrules the model-wide `refreshAfterChange` flag for this operation only.
    */
  var refreshAfterChange: js.UndefOr[Boolean] = js.undefined
}
object ChangeSetId {
  
  inline def apply(): ChangeSetId = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ChangeSetId]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ChangeSetId] (val x: Self) extends AnyVal {
    
    inline def setChangeSetId(value: String): Self = StObject.set(x, "changeSetId", value.asInstanceOf[js.Any])
    
    inline def setChangeSetIdUndefined: Self = StObject.set(x, "changeSetId", js.undefined)
    
    inline def setGroupId(value: String): Self = StObject.set(x, "groupId", value.asInstanceOf[js.Any])
    
    inline def setGroupIdUndefined: Self = StObject.set(x, "groupId", js.undefined)
    
    inline def setRefreshAfterChange(value: Boolean): Self = StObject.set(x, "refreshAfterChange", value.asInstanceOf[js.Any])
    
    inline def setRefreshAfterChangeUndefined: Self = StObject.set(x, "refreshAfterChange", js.undefined)
  }
}
