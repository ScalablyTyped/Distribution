package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetParametersPath370QueryPage extends StObject {
  
  /** List public events received by a user */
  var get: ParametersPath370QueryPage
}
object GetParametersPath370QueryPage {
  
  inline def apply(get: ParametersPath370QueryPage): GetParametersPath370QueryPage = {
    val __obj = js.Dynamic.literal(get = get.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetParametersPath370QueryPage]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: GetParametersPath370QueryPage] (val x: Self) extends AnyVal {
    
    inline def setGet(value: ParametersPath370QueryPage): Self = StObject.set(x, "get", value.asInstanceOf[js.Any])
  }
}
