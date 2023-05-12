package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetParametersPath394QueryPage extends StObject {
  
  /**
    * List repositories for a user migration
    * @description Lists all the repositories for this user migration.
    */
  var get: ParametersPath394QueryPage
}
object GetParametersPath394QueryPage {
  
  inline def apply(get: ParametersPath394QueryPage): GetParametersPath394QueryPage = {
    val __obj = js.Dynamic.literal(get = get.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetParametersPath394QueryPage]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: GetParametersPath394QueryPage] (val x: Self) extends AnyVal {
    
    inline def setGet(value: ParametersPath394QueryPage): Self = StObject.set(x, "get", value.asInstanceOf[js.Any])
  }
}
