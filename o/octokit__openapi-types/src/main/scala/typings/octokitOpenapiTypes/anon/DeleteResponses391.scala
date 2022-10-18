package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DeleteResponses391 extends StObject {
  
  /** Removes a collaborator from an organization project. You must be an organization owner or a project `admin` to remove a collaborator. */
  var delete: Responses391
  
  /** Adds a collaborator to an organization project and sets their permission level. You must be an organization owner or a project `admin` to add a collaborator. */
  var put: ParametersPath390
}
object DeleteResponses391 {
  
  inline def apply(delete: Responses391, put: ParametersPath390): DeleteResponses391 = {
    val __obj = js.Dynamic.literal(delete = delete.asInstanceOf[js.Any], put = put.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeleteResponses391]
  }
  
  extension [Self <: DeleteResponses391](x: Self) {
    
    inline def setDelete(value: Responses391): Self = StObject.set(x, "delete", value.asInstanceOf[js.Any])
    
    inline def setPut(value: ParametersPath390): Self = StObject.set(x, "put", value.asInstanceOf[js.Any])
  }
}
