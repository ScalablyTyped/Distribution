package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetParametersQuerySortType extends StObject {
  
  /**
    * List repositories for a user
    * @description Lists public repositories for the specified user. Note: For GitHub AE, this endpoint will list internal repositories for the specified user.
    */
  var get: ParametersQuerySortType
}
object GetParametersQuerySortType {
  
  inline def apply(get: ParametersQuerySortType): GetParametersQuerySortType = {
    val __obj = js.Dynamic.literal(get = get.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetParametersQuerySortType]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: GetParametersQuerySortType] (val x: Self) extends AnyVal {
    
    inline def setGet(value: ParametersQuerySortType): Self = StObject.set(x, "get", value.asInstanceOf[js.Any])
  }
}
