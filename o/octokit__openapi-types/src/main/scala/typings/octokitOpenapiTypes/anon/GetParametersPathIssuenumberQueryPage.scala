package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetParametersPathIssuenumberQueryPage extends StObject {
  
  var get: ParametersPathIssuenumberQueryPage
}
object GetParametersPathIssuenumberQueryPage {
  
  inline def apply(get: ParametersPathIssuenumberQueryPage): GetParametersPathIssuenumberQueryPage = {
    val __obj = js.Dynamic.literal(get = get.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetParametersPathIssuenumberQueryPage]
  }
  
  extension [Self <: GetParametersPathIssuenumberQueryPage](x: Self) {
    
    inline def setGet(value: ParametersPathIssuenumberQueryPage): Self = StObject.set(x, "get", value.asInstanceOf[js.Any])
  }
}
