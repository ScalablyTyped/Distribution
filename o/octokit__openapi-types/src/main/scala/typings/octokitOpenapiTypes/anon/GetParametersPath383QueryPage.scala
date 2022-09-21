package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetParametersPath383QueryPage extends StObject {
  
  /** Lists all the repositories for this user migration. */
  var get: ParametersPath383QueryPage
}
object GetParametersPath383QueryPage {
  
  inline def apply(get: ParametersPath383QueryPage): GetParametersPath383QueryPage = {
    val __obj = js.Dynamic.literal(get = get.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetParametersPath383QueryPage]
  }
  
  extension [Self <: GetParametersPath383QueryPage](x: Self) {
    
    inline def setGet(value: ParametersPath383QueryPage): Self = StObject.set(x, "get", value.asInstanceOf[js.Any])
  }
}
