package typings.octokitPluginRestEndpointMethods.restEndpointMethodsTypesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ReposRetrieveCommunityProfileMetricsResponse extends js.Object {
  var description: String
  var documentation: Boolean
  var files: ReposRetrieveCommunityProfileMetricsResponseFiles
  var health_percentage: Double
  var updated_at: String
}

object ReposRetrieveCommunityProfileMetricsResponse {
  @scala.inline
  def apply(
    description: String,
    documentation: Boolean,
    files: ReposRetrieveCommunityProfileMetricsResponseFiles,
    health_percentage: Double,
    updated_at: String
  ): ReposRetrieveCommunityProfileMetricsResponse = {
    val __obj = js.Dynamic.literal(description = description.asInstanceOf[js.Any], documentation = documentation.asInstanceOf[js.Any], files = files.asInstanceOf[js.Any], health_percentage = health_percentage.asInstanceOf[js.Any], updated_at = updated_at.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[ReposRetrieveCommunityProfileMetricsResponse]
  }
}

