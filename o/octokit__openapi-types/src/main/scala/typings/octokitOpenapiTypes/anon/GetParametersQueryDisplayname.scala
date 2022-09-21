package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetParametersQueryDisplayname extends StObject {
  
  /**
    * Lists external groups available in an organization. You can query the groups using the `display_name` parameter, only groups with a `group_name` containing the text provided in the `display_name` parameter will be returned.  You can also limit your page results using the `per_page` parameter. GitHub generates a url-encoded `page` token using a cursor value for where the next page begins. For more information on cursor pagination, see "[Offset and Cursor Pagination explained](https://dev.to/jackmarchant/offset-and-cursor-pagination-explained-b89)."
    *
    * You can manage team membership with your identity provider using Enterprise Managed Users for GitHub Enterprise Cloud. For more information, see "[GitHub's products](https://docs.github.com/github/getting-started-with-github/githubs-products)" in the GitHub Help documentation.
    */
  var get: ParametersQueryDisplayname
}
object GetParametersQueryDisplayname {
  
  inline def apply(get: ParametersQueryDisplayname): GetParametersQueryDisplayname = {
    val __obj = js.Dynamic.literal(get = get.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetParametersQueryDisplayname]
  }
  
  extension [Self <: GetParametersQueryDisplayname](x: Self) {
    
    inline def setGet(value: ParametersQueryDisplayname): Self = StObject.set(x, "get", value.asInstanceOf[js.Any])
  }
}
