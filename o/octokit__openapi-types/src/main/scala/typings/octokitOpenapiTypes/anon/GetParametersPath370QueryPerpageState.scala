package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetParametersPath370QueryPerpageState extends StObject {
  
  /** List user projects */
  var get: ParametersPath370QueryPerpageState
}
object GetParametersPath370QueryPerpageState {
  
  inline def apply(get: ParametersPath370QueryPerpageState): GetParametersPath370QueryPerpageState = {
    val __obj = js.Dynamic.literal(get = get.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetParametersPath370QueryPerpageState]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: GetParametersPath370QueryPerpageState] (val x: Self) extends AnyVal {
    
    inline def setGet(value: ParametersPath370QueryPerpageState): Self = StObject.set(x, "get", value.asInstanceOf[js.Any])
  }
}
