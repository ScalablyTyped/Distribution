package typings.metamaskUtils.anon

import typings.metamaskUtils.distJsonMod.JsonRpcParams
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
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ParamsParams[?], Params /* <: JsonRpcParams */] (val x: Self & ParamsParams[Params]) extends AnyVal {
    
    inline def setParams(value: Params): Self = StObject.set(x, "params", value.asInstanceOf[js.Any])
  }
}
