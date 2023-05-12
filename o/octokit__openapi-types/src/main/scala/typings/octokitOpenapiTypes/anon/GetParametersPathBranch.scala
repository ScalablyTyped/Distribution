package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetParametersPathBranch extends StObject {
  
  /** Get a branch */
  var get: ParametersPathBranch
}
object GetParametersPathBranch {
  
  inline def apply(get: ParametersPathBranch): GetParametersPathBranch = {
    val __obj = js.Dynamic.literal(get = get.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetParametersPathBranch]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: GetParametersPathBranch] (val x: Self) extends AnyVal {
    
    inline def setGet(value: ParametersPathBranch): Self = StObject.set(x, "get", value.asInstanceOf[js.Any])
  }
}
