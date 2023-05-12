package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetParametersPathIssuenumberQueryPage extends StObject {
  
  /** List issue events */
  var get: ParametersPathIssuenumberQueryPage
}
object GetParametersPathIssuenumberQueryPage {
  
  inline def apply(get: ParametersPathIssuenumberQueryPage): GetParametersPathIssuenumberQueryPage = {
    val __obj = js.Dynamic.literal(get = get.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetParametersPathIssuenumberQueryPage]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: GetParametersPathIssuenumberQueryPage] (val x: Self) extends AnyVal {
    
    inline def setGet(value: ParametersPathIssuenumberQueryPage): Self = StObject.set(x, "get", value.asInstanceOf[js.Any])
  }
}
