package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetResponses200Content308 extends StObject {
  
  /** List GitHub Pages builds */
  var get: Responses200Content308
  
  /**
    * Request a GitHub Pages build
    * @description You can request that your site be built from the latest revision on the default branch. This has the same effect as pushing a commit to your default branch, but does not require an additional commit. Manually triggering page builds can be helpful when diagnosing build warnings and failures.
    *
    * Build requests are limited to one concurrent build per repository and one concurrent build per requester. If you request a build while another is still in progress, the second request will be queued until the first completes.
    */
  var post: Responses201Content309
}
object GetResponses200Content308 {
  
  inline def apply(get: Responses200Content308, post: Responses201Content309): GetResponses200Content308 = {
    val __obj = js.Dynamic.literal(get = get.asInstanceOf[js.Any], post = post.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetResponses200Content308]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: GetResponses200Content308] (val x: Self) extends AnyVal {
    
    inline def setGet(value: Responses200Content308): Self = StObject.set(x, "get", value.asInstanceOf[js.Any])
    
    inline def setPost(value: Responses201Content309): Self = StObject.set(x, "post", value.asInstanceOf[js.Any])
  }
}
