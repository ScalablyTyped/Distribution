package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetParametersPath361QuerySince extends StObject {
  
  /** Lists public gists for the specified user: */
  var get: ParametersPath361QuerySince
}
object GetParametersPath361QuerySince {
  
  inline def apply(get: ParametersPath361QuerySince): GetParametersPath361QuerySince = {
    val __obj = js.Dynamic.literal(get = get.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetParametersPath361QuerySince]
  }
  
  extension [Self <: GetParametersPath361QuerySince](x: Self) {
    
    inline def setGet(value: ParametersPath361QuerySince): Self = StObject.set(x, "get", value.asInstanceOf[js.Any])
  }
}
