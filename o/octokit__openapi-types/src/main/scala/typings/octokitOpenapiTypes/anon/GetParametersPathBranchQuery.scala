package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetParametersPathBranchQuery extends StObject {
  
  /**
    * Get rules for a branch
    * @description Returns all rules that apply to the specified branch.
    */
  var get: ParametersPathBranchQuery
}
object GetParametersPathBranchQuery {
  
  inline def apply(get: ParametersPathBranchQuery): GetParametersPathBranchQuery = {
    val __obj = js.Dynamic.literal(get = get.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetParametersPathBranchQuery]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: GetParametersPathBranchQuery] (val x: Self) extends AnyVal {
    
    inline def setGet(value: ParametersPathBranchQuery): Self = StObject.set(x, "get", value.asInstanceOf[js.Any])
  }
}
