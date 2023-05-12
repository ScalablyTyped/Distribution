package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetParametersQueryPage extends StObject {
  
  /**
    * List installation requests for the authenticated app
    * @description Lists all the pending installation requests for the authenticated GitHub App.
    */
  var get: ParametersQueryPage
}
object GetParametersQueryPage {
  
  inline def apply(get: ParametersQueryPage): GetParametersQueryPage = {
    val __obj = js.Dynamic.literal(get = get.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetParametersQueryPage]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: GetParametersQueryPage] (val x: Self) extends AnyVal {
    
    inline def setGet(value: ParametersQueryPage): Self = StObject.set(x, "get", value.asInstanceOf[js.Any])
  }
}
