package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetParametersQuery350 extends StObject {
  
  /** List all users who are outside collaborators of an organization. */
  var get: ParametersQuery350
}
object GetParametersQuery350 {
  
  inline def apply(get: ParametersQuery350): GetParametersQuery350 = {
    val __obj = js.Dynamic.literal(get = get.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetParametersQuery350]
  }
  
  extension [Self <: GetParametersQuery350](x: Self) {
    
    inline def setGet(value: ParametersQuery350): Self = StObject.set(x, "get", value.asInstanceOf[js.Any])
  }
}
