package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetParametersPathThreadid extends StObject {
  
  var get: ParametersPathThreadid
  
  var patch: Responses205304
}
object GetParametersPathThreadid {
  
  inline def apply(get: ParametersPathThreadid, patch: Responses205304): GetParametersPathThreadid = {
    val __obj = js.Dynamic.literal(get = get.asInstanceOf[js.Any], patch = patch.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetParametersPathThreadid]
  }
  
  extension [Self <: GetParametersPathThreadid](x: Self) {
    
    inline def setGet(value: ParametersPathThreadid): Self = StObject.set(x, "get", value.asInstanceOf[js.Any])
    
    inline def setPatch(value: Responses205304): Self = StObject.set(x, "patch", value.asInstanceOf[js.Any])
  }
}
