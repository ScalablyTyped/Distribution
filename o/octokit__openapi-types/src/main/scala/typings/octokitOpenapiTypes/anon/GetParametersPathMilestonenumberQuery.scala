package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetParametersPathMilestonenumberQuery extends StObject {
  
  /**
    * List labels for issues in a milestone
    * @description Lists labels for issues in a milestone.
    */
  var get: ParametersPathMilestonenumberQuery
}
object GetParametersPathMilestonenumberQuery {
  
  inline def apply(get: ParametersPathMilestonenumberQuery): GetParametersPathMilestonenumberQuery = {
    val __obj = js.Dynamic.literal(get = get.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetParametersPathMilestonenumberQuery]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: GetParametersPathMilestonenumberQuery] (val x: Self) extends AnyVal {
    
    inline def setGet(value: ParametersPathMilestonenumberQuery): Self = StObject.set(x, "get", value.asInstanceOf[js.Any])
  }
}
