package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetParametersPath348QuerySince extends StObject {
  
  /** Lists public gists for the specified user: */
  var get: ParametersPath348QuerySince
}
object GetParametersPath348QuerySince {
  
  inline def apply(get: ParametersPath348QuerySince): GetParametersPath348QuerySince = {
    val __obj = js.Dynamic.literal(get = get.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetParametersPath348QuerySince]
  }
  
  extension [Self <: GetParametersPath348QuerySince](x: Self) {
    
    inline def setGet(value: ParametersPath348QuerySince): Self = StObject.set(x, "get", value.asInstanceOf[js.Any])
  }
}
