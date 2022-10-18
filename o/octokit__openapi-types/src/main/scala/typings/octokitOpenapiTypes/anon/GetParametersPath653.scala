package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetParametersPath653 extends StObject {
  
  /** This is the user's organization dashboard. You must be authenticated as the user to view this. */
  var get: ParametersPath653
}
object GetParametersPath653 {
  
  inline def apply(get: ParametersPath653): GetParametersPath653 = {
    val __obj = js.Dynamic.literal(get = get.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetParametersPath653]
  }
  
  extension [Self <: GetParametersPath653](x: Self) {
    
    inline def setGet(value: ParametersPath653): Self = StObject.set(x, "get", value.asInstanceOf[js.Any])
  }
}
