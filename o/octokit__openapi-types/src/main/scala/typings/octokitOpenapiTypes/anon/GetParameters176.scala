package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetParameters176 extends StObject {
  
  /**
    * List repository organization variables
    * @description Lists all organiation variables shared with a repository. You must authenticate using an access token with the `repo` scope to use this endpoint. GitHub Apps must have the `actions_variables:read` repository permission to use this endpoint.
    */
  var get: Parameters176
}
object GetParameters176 {
  
  inline def apply(get: Parameters176): GetParameters176 = {
    val __obj = js.Dynamic.literal(get = get.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetParameters176]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: GetParameters176] (val x: Self) extends AnyVal {
    
    inline def setGet(value: Parameters176): Self = StObject.set(x, "get", value.asInstanceOf[js.Any])
  }
}
