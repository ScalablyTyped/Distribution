package typings.openui5.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GroupId extends StObject {
  
  /**
    * The ID of the `ChangeSet` that this request should belong to
    */
  var changeSetId: js.UndefOr[String] = js.undefined
  
  /**
    * The error callback function
    */
  var error: js.UndefOr[js.Function] = js.undefined
  
  /**
    * A comma-separated list of navigation properties to be expanded for the newly created entity; see {@link
    * sap.ui.model.odata.v2.ODataModel#createEntry}; **Note:** if no expand parameter is given, the expand
    * parameter of this binding is used; see {@link sap.ui.model.odata.v2.ODataModel#bindList}
    */
  var expand: js.UndefOr[String] = js.undefined
  
  /**
    * The ID of a request group; requests belonging to the same group will be bundled in one batch request
    */
  var groupId: js.UndefOr[String] = js.undefined
  
  /**
    * Whether the created context is inactive. An inactive context will only be sent to the server after the
    * first property update. From then on it behaves like any other created context.
    */
  var inactive: js.UndefOr[Boolean] = js.undefined
  
  /**
    * The success callback function
    */
  var success: js.UndefOr[js.Function] = js.undefined
}
object GroupId {
  
  inline def apply(): GroupId = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GroupId]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: GroupId] (val x: Self) extends AnyVal {
    
    inline def setChangeSetId(value: String): Self = StObject.set(x, "changeSetId", value.asInstanceOf[js.Any])
    
    inline def setChangeSetIdUndefined: Self = StObject.set(x, "changeSetId", js.undefined)
    
    inline def setError(value: js.Function): Self = StObject.set(x, "error", value.asInstanceOf[js.Any])
    
    inline def setErrorUndefined: Self = StObject.set(x, "error", js.undefined)
    
    inline def setExpand(value: String): Self = StObject.set(x, "expand", value.asInstanceOf[js.Any])
    
    inline def setExpandUndefined: Self = StObject.set(x, "expand", js.undefined)
    
    inline def setGroupId(value: String): Self = StObject.set(x, "groupId", value.asInstanceOf[js.Any])
    
    inline def setGroupIdUndefined: Self = StObject.set(x, "groupId", js.undefined)
    
    inline def setInactive(value: Boolean): Self = StObject.set(x, "inactive", value.asInstanceOf[js.Any])
    
    inline def setInactiveUndefined: Self = StObject.set(x, "inactive", js.undefined)
    
    inline def setSuccess(value: js.Function): Self = StObject.set(x, "success", value.asInstanceOf[js.Any])
    
    inline def setSuccessUndefined: Self = StObject.set(x, "success", js.undefined)
  }
}
