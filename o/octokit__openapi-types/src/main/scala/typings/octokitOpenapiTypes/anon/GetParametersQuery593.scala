package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetParametersQuery593 extends StObject {
  
  /** Get the total number of clones and breakdown per day or week for the last 14 days. Timestamps are aligned to UTC midnight of the beginning of the day or week. Week begins on Monday. */
  var get: ParametersQuery593
}
object GetParametersQuery593 {
  
  inline def apply(get: ParametersQuery593): GetParametersQuery593 = {
    val __obj = js.Dynamic.literal(get = get.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetParametersQuery593]
  }
  
  extension [Self <: GetParametersQuery593](x: Self) {
    
    inline def setGet(value: ParametersQuery593): Self = StObject.set(x, "get", value.asInstanceOf[js.Any])
  }
}
