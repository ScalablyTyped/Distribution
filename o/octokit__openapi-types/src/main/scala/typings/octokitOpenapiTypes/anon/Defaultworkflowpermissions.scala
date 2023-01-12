package typings.octokitOpenapiTypes.anon

import typings.octokitOpenapiTypes.octokitOpenapiTypesStrings.read
import typings.octokitOpenapiTypes.octokitOpenapiTypesStrings.write
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Defaultworkflowpermissions extends StObject {
  
  var can_approve_pull_request_reviews: js.UndefOr[Boolean] = js.undefined
  
  var default_workflow_permissions: js.UndefOr[read | write] = js.undefined
}
object Defaultworkflowpermissions {
  
  inline def apply(): Defaultworkflowpermissions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Defaultworkflowpermissions]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Defaultworkflowpermissions] (val x: Self) extends AnyVal {
    
    inline def setCan_approve_pull_request_reviews(value: Boolean): Self = StObject.set(x, "can_approve_pull_request_reviews", value.asInstanceOf[js.Any])
    
    inline def setCan_approve_pull_request_reviewsUndefined: Self = StObject.set(x, "can_approve_pull_request_reviews", js.undefined)
    
    inline def setDefault_workflow_permissions(value: read | write): Self = StObject.set(x, "default_workflow_permissions", value.asInstanceOf[js.Any])
    
    inline def setDefault_workflow_permissionsUndefined: Self = StObject.set(x, "default_workflow_permissions", js.undefined)
  }
}
