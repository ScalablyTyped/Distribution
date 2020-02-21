package typings.octokitPluginRestEndpointMethods.restEndpointMethodsTypesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SearchIssuesLegacyResponse extends js.Object {
  var issues: js.Array[SearchIssuesLegacyResponseIssuesItem]
}

object SearchIssuesLegacyResponse {
  @scala.inline
  def apply(issues: js.Array[SearchIssuesLegacyResponseIssuesItem]): SearchIssuesLegacyResponse = {
    val __obj = js.Dynamic.literal(issues = issues.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[SearchIssuesLegacyResponse]
  }
}

