package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetResponses200Content508 extends StObject {
  
  /**
    * Returns a single reference from your Git database. The `:ref` in the URL must be formatted as `heads/<branch name>` for branches and `tags/<tag name>` for tags. If the `:ref` doesn't match an existing ref, a `404` is returned.
    *
    * **Note:** You need to explicitly [request a pull request](https://docs.github.com/rest/reference/pulls#get-a-pull-request) to trigger a test merge commit, which checks the mergeability of pull requests. For more information, see "[Checking mergeability of pull requests](https://docs.github.com/rest/guides/getting-started-with-the-git-database-api#checking-mergeability-of-pull-requests)".
    */
  var get: Responses200Content508
}
object GetResponses200Content508 {
  
  inline def apply(get: Responses200Content508): GetResponses200Content508 = {
    val __obj = js.Dynamic.literal(get = get.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetResponses200Content508]
  }
  
  extension [Self <: GetResponses200Content508](x: Self) {
    
    inline def setGet(value: Responses200Content508): Self = StObject.set(x, "get", value.asInstanceOf[js.Any])
  }
}
