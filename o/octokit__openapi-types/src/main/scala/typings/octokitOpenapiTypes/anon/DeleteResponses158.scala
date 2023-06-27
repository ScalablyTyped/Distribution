package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DeleteResponses158 extends StObject {
  
  /**
    * Remove user as a collaborator
    * @description Removes a collaborator from an organization project. You must be an organization owner or a project `admin` to remove a collaborator.
    */
  var delete: Responses158
  
  /**
    * Add project collaborator
    * @description Adds a collaborator to an organization project and sets their permission level. You must be an organization owner or a project `admin` to add a collaborator.
    */
  var put: ParametersPathProjectidUsername
}
object DeleteResponses158 {
  
  inline def apply(delete: Responses158, put: ParametersPathProjectidUsername): DeleteResponses158 = {
    val __obj = js.Dynamic.literal(delete = delete.asInstanceOf[js.Any], put = put.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeleteResponses158]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: DeleteResponses158] (val x: Self) extends AnyVal {
    
    inline def setDelete(value: Responses158): Self = StObject.set(x, "delete", value.asInstanceOf[js.Any])
    
    inline def setPut(value: ParametersPathProjectidUsername): Self = StObject.set(x, "put", value.asInstanceOf[js.Any])
  }
}
