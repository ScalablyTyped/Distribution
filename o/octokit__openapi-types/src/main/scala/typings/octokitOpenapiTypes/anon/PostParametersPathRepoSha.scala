package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PostParametersPathRepoSha extends StObject {
  
  /**
    * Create a commit status
    * @description Users with push access in a repository can create commit statuses for a given SHA.
    *
    * Note: there is a limit of 1000 statuses per `sha` and `context` within a repository. Attempts to create more than 1000 statuses will result in a validation error.
    */
  var post: ParametersPathRepoSha
}
object PostParametersPathRepoSha {
  
  inline def apply(post: ParametersPathRepoSha): PostParametersPathRepoSha = {
    val __obj = js.Dynamic.literal(post = post.asInstanceOf[js.Any])
    __obj.asInstanceOf[PostParametersPathRepoSha]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: PostParametersPathRepoSha] (val x: Self) extends AnyVal {
    
    inline def setPost(value: ParametersPathRepoSha): Self = StObject.set(x, "post", value.asInstanceOf[js.Any])
  }
}
