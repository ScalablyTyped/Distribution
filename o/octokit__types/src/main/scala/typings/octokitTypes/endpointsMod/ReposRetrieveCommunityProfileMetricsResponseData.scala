package typings.octokitTypes.endpointsMod

import typings.octokitTypes.anon.Codeofconduct
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ReposRetrieveCommunityProfileMetricsResponseData extends js.Object {
  var description: String
  var documentation: Boolean
  var files: Codeofconduct
  var health_percentage: Double
  var updated_at: String
}

object ReposRetrieveCommunityProfileMetricsResponseData {
  @scala.inline
  def apply(
    description: String,
    documentation: Boolean,
    files: Codeofconduct,
    health_percentage: Double,
    updated_at: String
  ): ReposRetrieveCommunityProfileMetricsResponseData = {
    val __obj = js.Dynamic.literal(description = description.asInstanceOf[js.Any], documentation = documentation.asInstanceOf[js.Any], files = files.asInstanceOf[js.Any], health_percentage = health_percentage.asInstanceOf[js.Any], updated_at = updated_at.asInstanceOf[js.Any])
    __obj.asInstanceOf[ReposRetrieveCommunityProfileMetricsResponseData]
  }
}

