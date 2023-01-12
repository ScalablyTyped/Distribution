package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetParametersPathIssuenumberQueryContentPage extends StObject {
  
  /** List the reactions to an [issue](https://docs.github.com/rest/reference/issues). */
  var get: ParametersPathIssuenumberQueryContentPage
  
  /** Create a reaction to an [issue](https://docs.github.com/rest/reference/issues/). A response with an HTTP `200` status means that you already added the reaction type to this issue. */
  var post: ParametersPathIssuenumberRequestBodyContentApplicationjson114
}
object GetParametersPathIssuenumberQueryContentPage {
  
  inline def apply(
    get: ParametersPathIssuenumberQueryContentPage,
    post: ParametersPathIssuenumberRequestBodyContentApplicationjson114
  ): GetParametersPathIssuenumberQueryContentPage = {
    val __obj = js.Dynamic.literal(get = get.asInstanceOf[js.Any], post = post.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetParametersPathIssuenumberQueryContentPage]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: GetParametersPathIssuenumberQueryContentPage] (val x: Self) extends AnyVal {
    
    inline def setGet(value: ParametersPathIssuenumberQueryContentPage): Self = StObject.set(x, "get", value.asInstanceOf[js.Any])
    
    inline def setPost(value: ParametersPathIssuenumberRequestBodyContentApplicationjson114): Self = StObject.set(x, "post", value.asInstanceOf[js.Any])
  }
}
