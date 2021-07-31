package typings.microsoftGraph.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ResourceOperation
  extends StObject
     with Entity {
  
  /**
    * Type of action this operation is going to perform. The actionName should be concise and limited to as few words as
    * possible.
    */
  var actionName: js.UndefOr[NullableOption[String]] = js.undefined
  
  /**
    * Description of the resource operation. The description is used in mouse-over text for the operation when shown in the
    * Azure Portal.
    */
  var description: js.UndefOr[NullableOption[String]] = js.undefined
  
  // Name of the Resource this operation is performed on.
  var resourceName: js.UndefOr[NullableOption[String]] = js.undefined
}
object ResourceOperation {
  
  @scala.inline
  def apply(): ResourceOperation = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ResourceOperation]
  }
  
  @scala.inline
  implicit class ResourceOperationMutableBuilder[Self <: ResourceOperation] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setActionName(value: NullableOption[String]): Self = StObject.set(x, "actionName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setActionNameNull: Self = StObject.set(x, "actionName", null)
    
    @scala.inline
    def setActionNameUndefined: Self = StObject.set(x, "actionName", js.undefined)
    
    @scala.inline
    def setDescription(value: NullableOption[String]): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDescriptionNull: Self = StObject.set(x, "description", null)
    
    @scala.inline
    def setDescriptionUndefined: Self = StObject.set(x, "description", js.undefined)
    
    @scala.inline
    def setResourceName(value: NullableOption[String]): Self = StObject.set(x, "resourceName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResourceNameNull: Self = StObject.set(x, "resourceName", null)
    
    @scala.inline
    def setResourceNameUndefined: Self = StObject.set(x, "resourceName", js.undefined)
  }
}
