package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetParametersPathAttemptnumber extends StObject {
  
  /**
    * Gets a specific workflow run attempt. Anyone with read access to the repository
    * can use this endpoint. If the repository is private you must use an access token
    * with the `repo` scope. GitHub Apps must have the `actions:read` permission to
    * use this endpoint.
    */
  var get: ParametersPathAttemptnumber
}
object GetParametersPathAttemptnumber {
  
  inline def apply(get: ParametersPathAttemptnumber): GetParametersPathAttemptnumber = {
    val __obj = js.Dynamic.literal(get = get.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetParametersPathAttemptnumber]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: GetParametersPathAttemptnumber] (val x: Self) extends AnyVal {
    
    inline def setGet(value: ParametersPathAttemptnumber): Self = StObject.set(x, "get", value.asInstanceOf[js.Any])
  }
}
