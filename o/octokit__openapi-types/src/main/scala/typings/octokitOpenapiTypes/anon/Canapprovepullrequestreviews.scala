package typings.octokitOpenapiTypes.anon

import typings.octokitOpenapiTypes.octokitOpenapiTypesStrings.read
import typings.octokitOpenapiTypes.octokitOpenapiTypesStrings.write
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Canapprovepullrequestreviews extends StObject {
  
  var can_approve_pull_request_reviews: Boolean
  
  var default_workflow_permissions: read | write
}
object Canapprovepullrequestreviews {
  
  inline def apply(can_approve_pull_request_reviews: Boolean, default_workflow_permissions: read | write): Canapprovepullrequestreviews = {
    val __obj = js.Dynamic.literal(can_approve_pull_request_reviews = can_approve_pull_request_reviews.asInstanceOf[js.Any], default_workflow_permissions = default_workflow_permissions.asInstanceOf[js.Any])
    __obj.asInstanceOf[Canapprovepullrequestreviews]
  }
  
  extension [Self <: Canapprovepullrequestreviews](x: Self) {
    
    inline def setCan_approve_pull_request_reviews(value: Boolean): Self = StObject.set(x, "can_approve_pull_request_reviews", value.asInstanceOf[js.Any])
    
    inline def setDefault_workflow_permissions(value: read | write): Self = StObject.set(x, "default_workflow_permissions", value.asInstanceOf[js.Any])
  }
}
