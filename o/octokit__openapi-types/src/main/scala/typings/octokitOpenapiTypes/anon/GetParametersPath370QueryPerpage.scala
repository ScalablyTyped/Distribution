package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetParametersPath370QueryPerpage extends StObject {
  
  /**
    * List gists for a user
    * @description Lists public gists for the specified user:
    */
  var get: ParametersPath370QueryPerpage
}
object GetParametersPath370QueryPerpage {
  
  inline def apply(get: ParametersPath370QueryPerpage): GetParametersPath370QueryPerpage = {
    val __obj = js.Dynamic.literal(get = get.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetParametersPath370QueryPerpage]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: GetParametersPath370QueryPerpage] (val x: Self) extends AnyVal {
    
    inline def setGet(value: ParametersPath370QueryPerpage): Self = StObject.set(x, "get", value.asInstanceOf[js.Any])
  }
}
