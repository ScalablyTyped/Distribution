package typings.atOctokitRest.atOctokitRestMod

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
    val __obj = js.Dynamic.literal(description = description, documentation = documentation, files = files, health_percentage = health_percentage, updated_at = updated_at)
  
    __obj.asInstanceOf[ReposRetrieveCommunityProfileMetricsResponse]
  }
}

