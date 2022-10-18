package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetParametersPathBranchOwnerRepo extends StObject {
  
  var get: ParametersPathBranchOwnerRepo
}
object GetParametersPathBranchOwnerRepo {
  
  inline def apply(get: ParametersPathBranchOwnerRepo): GetParametersPathBranchOwnerRepo = {
    val __obj = js.Dynamic.literal(get = get.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetParametersPathBranchOwnerRepo]
  }
  
  extension [Self <: GetParametersPathBranchOwnerRepo](x: Self) {
    
    inline def setGet(value: ParametersPathBranchOwnerRepo): Self = StObject.set(x, "get", value.asInstanceOf[js.Any])
  }
}
