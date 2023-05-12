package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetParametersQueryPagePerpageState extends StObject {
  
  /** List organization memberships for the authenticated user */
  var get: ParametersQueryPagePerpageState
}
object GetParametersQueryPagePerpageState {
  
  inline def apply(get: ParametersQueryPagePerpageState): GetParametersQueryPagePerpageState = {
    val __obj = js.Dynamic.literal(get = get.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetParametersQueryPagePerpageState]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: GetParametersQueryPagePerpageState] (val x: Self) extends AnyVal {
    
    inline def setGet(value: ParametersQueryPagePerpageState): Self = StObject.set(x, "get", value.asInstanceOf[js.Any])
  }
}
