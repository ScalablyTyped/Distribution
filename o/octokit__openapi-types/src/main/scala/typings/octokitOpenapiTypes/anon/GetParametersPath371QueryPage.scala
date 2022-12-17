package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetParametersPath371QueryPage extends StObject {
  
  /** Lists all the repositories for this user migration. */
  var get: ParametersPath371QueryPage
}
object GetParametersPath371QueryPage {
  
  inline def apply(get: ParametersPath371QueryPage): GetParametersPath371QueryPage = {
    val __obj = js.Dynamic.literal(get = get.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetParametersPath371QueryPage]
  }
  
  extension [Self <: GetParametersPath371QueryPage](x: Self) {
    
    inline def setGet(value: ParametersPath371QueryPage): Self = StObject.set(x, "get", value.asInstanceOf[js.Any])
  }
}
