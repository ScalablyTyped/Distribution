package typings.metamaskUtils.anon

import typings.metamaskUtils.jsonMod.JsonRpcParams
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParamsParams[Params /* <: JsonRpcParams */] extends StObject {
  
  var params: Params
}
object ParamsParams {
  
  inline def apply[Params /* <: JsonRpcParams */](params: Params): ParamsParams[Params] = {
    val __obj = js.Dynamic.literal(params = params.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParamsParams[Params]]
  }
  
  extension [Self <: ParamsParams[?], Params /* <: JsonRpcParams */](x: Self & ParamsParams[Params]) {
    
    inline def setParams(value: Params): Self = StObject.set(x, "params", value.asInstanceOf[js.Any])
  }
}
