package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PostRequestBodyContentApplicationjsonClientpayload extends StObject {
  
  /**
    * Create a repository dispatch event
    * @description You can use this endpoint to trigger a webhook event called `repository_dispatch` when you want activity that happens outside of GitHub to trigger a GitHub Actions workflow or GitHub App webhook. You must configure your GitHub Actions workflow or GitHub App to run when the `repository_dispatch` event occurs. For an example `repository_dispatch` webhook payload, see "[RepositoryDispatchEvent](https://docs.github.com/webhooks/event-payloads/#repository_dispatch)."
    *
    * The `client_payload` parameter is available for any extra information that your workflow might need. This parameter is a JSON payload that will be passed on when the webhook event is dispatched. For example, the `client_payload` can include a message that a user would like to send using a GitHub Actions workflow. Or the `client_payload` can be used as a test to debug your workflow.
    *
    * This endpoint requires write access to the repository by providing either:
    *
    *   - Personal access tokens with `repo` scope. For more information, see "[Creating a personal access token for the command line](https://docs.github.com/articles/creating-a-personal-access-token-for-the-command-line)" in the GitHub Help documentation.
    *   - GitHub Apps with both `metadata:read` and `contents:read&write` permissions.
    *
    * This input example shows how you can use the `client_payload` as a test to debug your workflow.
    */
  var post: RequestBodyContentApplicationjsonClientpayload
}
object PostRequestBodyContentApplicationjsonClientpayload {
  
  inline def apply(post: RequestBodyContentApplicationjsonClientpayload): PostRequestBodyContentApplicationjsonClientpayload = {
    val __obj = js.Dynamic.literal(post = post.asInstanceOf[js.Any])
    __obj.asInstanceOf[PostRequestBodyContentApplicationjsonClientpayload]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: PostRequestBodyContentApplicationjsonClientpayload] (val x: Self) extends AnyVal {
    
    inline def setPost(value: RequestBodyContentApplicationjsonClientpayload): Self = StObject.set(x, "post", value.asInstanceOf[js.Any])
  }
}
