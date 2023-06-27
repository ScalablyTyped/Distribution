package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PutResponses346 extends StObject {
  
  /**
    * Disable Git LFS for a repository
    * @description Disables Git LFS for a repository. Access tokens must have the `admin:enterprise` scope.
    */
  var delete: Parameters165Responses
  
  /**
    * Enable Git LFS for a repository
    * @description Enables Git LFS for a repository. Access tokens must have the `admin:enterprise` scope.
    */
  var put: Responses346
}
object PutResponses346 {
  
  inline def apply(delete: Parameters165Responses, put: Responses346): PutResponses346 = {
    val __obj = js.Dynamic.literal(delete = delete.asInstanceOf[js.Any], put = put.asInstanceOf[js.Any])
    __obj.asInstanceOf[PutResponses346]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: PutResponses346] (val x: Self) extends AnyVal {
    
    inline def setDelete(value: Parameters165Responses): Self = StObject.set(x, "delete", value.asInstanceOf[js.Any])
    
    inline def setPut(value: Responses346): Self = StObject.set(x, "put", value.asInstanceOf[js.Any])
  }
}
