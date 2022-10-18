package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PostParametersPathRepoWorkflowidRequestBodyContentApplicationjsonInputs extends StObject {
  
  /**
    * You can use this endpoint to manually trigger a GitHub Actions workflow run. You can replace `workflow_id` with the workflow file name. For example, you could use `main.yaml`.
    *
    * You must configure your GitHub Actions workflow to run when the [`workflow_dispatch` webhook](/developers/webhooks-and-events/webhook-events-and-payloads#workflow_dispatch) event occurs. The `inputs` are configured in the workflow file. For more information about how to configure the `workflow_dispatch` event in the workflow file, see "[Events that trigger workflows](/actions/reference/events-that-trigger-workflows#workflow_dispatch)."
    *
    * You must authenticate using an access token with the `repo` scope to use this endpoint. GitHub Apps must have the `actions:write` permission to use this endpoint. For more information, see "[Creating a personal access token for the command line](https://docs.github.com/articles/creating-a-personal-access-token-for-the-command-line)."
    */
  var post: ParametersPathRepoWorkflowidRequestBodyContentApplicationjsonInputs
}
object PostParametersPathRepoWorkflowidRequestBodyContentApplicationjsonInputs {
  
  inline def apply(post: ParametersPathRepoWorkflowidRequestBodyContentApplicationjsonInputs): PostParametersPathRepoWorkflowidRequestBodyContentApplicationjsonInputs = {
    val __obj = js.Dynamic.literal(post = post.asInstanceOf[js.Any])
    __obj.asInstanceOf[PostParametersPathRepoWorkflowidRequestBodyContentApplicationjsonInputs]
  }
  
  extension [Self <: PostParametersPathRepoWorkflowidRequestBodyContentApplicationjsonInputs](x: Self) {
    
    inline def setPost(value: ParametersPathRepoWorkflowidRequestBodyContentApplicationjsonInputs): Self = StObject.set(x, "post", value.asInstanceOf[js.Any])
  }
}
