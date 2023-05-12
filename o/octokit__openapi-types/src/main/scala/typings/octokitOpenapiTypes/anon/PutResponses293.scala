package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PutResponses293 extends StObject {
  
  /**
    * Disable Git LFS for a repository
    * @description Disables Git LFS for a repository. Access tokens must have the `admin:enterprise` scope.
    */
  var delete: Parameters141Responses
  
  /**
    * Enable Git LFS for a repository
    * @description Enables Git LFS for a repository. Access tokens must have the `admin:enterprise` scope.
    */
  var put: Responses293
}
object PutResponses293 {
  
  inline def apply(delete: Parameters141Responses, put: Responses293): PutResponses293 = {
    val __obj = js.Dynamic.literal(delete = delete.asInstanceOf[js.Any], put = put.asInstanceOf[js.Any])
    __obj.asInstanceOf[PutResponses293]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: PutResponses293] (val x: Self) extends AnyVal {
    
    inline def setDelete(value: Parameters141Responses): Self = StObject.set(x, "delete", value.asInstanceOf[js.Any])
    
    inline def setPut(value: Responses293): Self = StObject.set(x, "put", value.asInstanceOf[js.Any])
  }
}
