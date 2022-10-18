package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetParametersPath637Query250 extends StObject {
  
  /** Lists all the repositories for this user migration. */
  var get: ParametersPath637Query250
}
object GetParametersPath637Query250 {
  
  inline def apply(get: ParametersPath637Query250): GetParametersPath637Query250 = {
    val __obj = js.Dynamic.literal(get = get.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetParametersPath637Query250]
  }
  
  extension [Self <: GetParametersPath637Query250](x: Self) {
    
    inline def setGet(value: ParametersPath637Query250): Self = StObject.set(x, "get", value.asInstanceOf[js.Any])
  }
}
