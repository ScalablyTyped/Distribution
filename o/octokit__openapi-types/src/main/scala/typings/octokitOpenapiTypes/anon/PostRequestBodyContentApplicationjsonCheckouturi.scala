package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PostRequestBodyContentApplicationjsonCheckouturi extends StObject {
  
  /**
    * Uploads SARIF data containing the results of a code scanning analysis to make the results available in a repository. You must use an access token with the `security_events` scope to use this endpoint for private repositories. You can also use tokens with the `public_repo` scope for public repositories only. GitHub Apps must have the `security_events` write permission to use this endpoint.
    *
    * There are two places where you can upload code scanning results.
    *  - If you upload to a pull request, for example `--ref refs/pull/42/merge` or `--ref refs/pull/42/head`, then the results appear as alerts in a pull request check. For more information, see "[Triaging code scanning alerts in pull requests](/code-security/secure-coding/triaging-code-scanning-alerts-in-pull-requests)."
    *  - If you upload to a branch, for example `--ref refs/heads/my-branch`, then the results appear in the **Security** tab for your repository. For more information, see "[Managing code scanning alerts for your repository](/code-security/secure-coding/managing-code-scanning-alerts-for-your-repository#viewing-the-alerts-for-a-repository)."
    *
    * You must compress the SARIF-formatted analysis data that you want to upload, using `gzip`, and then encode it as a Base64 format string. For example:
    *
    * ```
    * gzip -c analysis-data.sarif | base64 -w0
    * ```
    *
    * SARIF upload supports a maximum of 5000 results per analysis run. Any results over this limit are ignored and any SARIF uploads with more than 25,000 results are rejected. Typically, but not necessarily, a SARIF file contains a single run of a single tool. If a code scanning tool generates too many results, you should update the analysis configuration to run only the most important rules or queries.
    *
    * The `202 Accepted`, response includes an `id` value.
    * You can use this ID to check the status of the upload by using this for the `/sarifs/{sarif_id}` endpoint.
    * For more information, see "[Get information about a SARIF upload](/rest/reference/code-scanning#get-information-about-a-sarif-upload)."
    */
  var post: RequestBodyContentApplicationjsonCheckouturi
}
object PostRequestBodyContentApplicationjsonCheckouturi {
  
  inline def apply(post: RequestBodyContentApplicationjsonCheckouturi): PostRequestBodyContentApplicationjsonCheckouturi = {
    val __obj = js.Dynamic.literal(post = post.asInstanceOf[js.Any])
    __obj.asInstanceOf[PostRequestBodyContentApplicationjsonCheckouturi]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: PostRequestBodyContentApplicationjsonCheckouturi] (val x: Self) extends AnyVal {
    
    inline def setPost(value: RequestBodyContentApplicationjsonCheckouturi): Self = StObject.set(x, "post", value.asInstanceOf[js.Any])
  }
}
