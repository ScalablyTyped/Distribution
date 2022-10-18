package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetParametersQueryPagePerpageSortType extends StObject {
  
  /** Lists public repositories for the specified user. Note: For GitHub AE, this endpoint will list internal repositories for the specified user. */
  var get: ParametersQueryPagePerpageSortType
}
object GetParametersQueryPagePerpageSortType {
  
  inline def apply(get: ParametersQueryPagePerpageSortType): GetParametersQueryPagePerpageSortType = {
    val __obj = js.Dynamic.literal(get = get.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetParametersQueryPagePerpageSortType]
  }
  
  extension [Self <: GetParametersQueryPagePerpageSortType](x: Self) {
    
    inline def setGet(value: ParametersQueryPagePerpageSortType): Self = StObject.set(x, "get", value.asInstanceOf[js.Any])
  }
}
