package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetParametersPath370QueryDirectionPagePerpage extends StObject {
  
  /**
    * List repositories starred by a user
    * @description Lists repositories a user has starred.
    *
    * You can also find out _when_ stars were created by passing the following custom [media type](https://docs.github.com/rest/overview/media-types/) via the `Accept` header: `application/vnd.github.star+json`.
    */
  var get: ParametersPath370QueryDirectionPagePerpage
}
object GetParametersPath370QueryDirectionPagePerpage {
  
  inline def apply(get: ParametersPath370QueryDirectionPagePerpage): GetParametersPath370QueryDirectionPagePerpage = {
    val __obj = js.Dynamic.literal(get = get.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetParametersPath370QueryDirectionPagePerpage]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: GetParametersPath370QueryDirectionPagePerpage] (val x: Self) extends AnyVal {
    
    inline def setGet(value: ParametersPath370QueryDirectionPagePerpage): Self = StObject.set(x, "get", value.asInstanceOf[js.Any])
  }
}
