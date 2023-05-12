package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PostRequestBodyContentApplicationjsonCheckouturi extends StObject {
  
  /**
    * Upload an analysis as SARIF data
    * @description Uploads SARIF data containing the results of a code scanning analysis to make the results available in a repository. You must use an access token with the `security_events` scope to use this endpoint for private repositories. You can also use tokens with the `public_repo` scope for public repositories only. GitHub Apps must have the `security_events` write permission to use this endpoint.
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
    * <br>
    * SARIF upload supports a maximum number of entries per the following data objects, and an analysis will be rejected if any of these objects is above its maximum value. For some objects, there are additional values over which the entries will be ignored while keeping the most important entries whenever applicable.
    * To get the most out of your analysis when it includes data above the supported limits, try to optimize the analysis configuration. For example, for the CodeQL tool, identify and remove the most noisy queries.
    *
    *
    * | **SARIF data**                   | **Maximum values** | **Additional limits**                                                            |
    * |----------------------------------|:------------------:|----------------------------------------------------------------------------------|
    * | Runs per file                    |         20         |                                                                                  |
    * | Results per run                  |       25,000       | Only the top 5,000 results will be included, prioritized by severity.            |
    * | Rules per run                    |       25,000       |                                                                                  |
    * | Tool extensions per run          |        100         |                                                                                  |
    * | Thread Flow Locations per result |       10,000       | Only the top 1,000 Thread Flow Locations will be included, using prioritization. |
    * | Location per result	             |       1,000        | Only 100 locations will be included.                                             |
    * | Tags per rule	                   |         20         | Only 10 tags will be included.                                                   |
    *
    *
    * The `202 Accepted` response includes an `id` value.
    * You can use this ID to check the status of the upload by using it in the `/sarifs/{sarif_id}` endpoint.
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
