package typings
package atOctokitRestLib.atOctokitRestMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ReposRetrieveCommunityProfileMetricsResponse extends js.Object {
  var description: java.lang.String
  var documentation: scala.Boolean
  var files: ReposRetrieveCommunityProfileMetricsResponseFiles
  var health_percentage: scala.Double
  var updated_at: java.lang.String
}

object ReposRetrieveCommunityProfileMetricsResponse {
  @scala.inline
  def apply(
    description: java.lang.String,
    documentation: scala.Boolean,
    files: ReposRetrieveCommunityProfileMetricsResponseFiles,
    health_percentage: scala.Double,
    updated_at: java.lang.String
  ): ReposRetrieveCommunityProfileMetricsResponse = {
    val __obj = js.Dynamic.literal(description = description, documentation = documentation, files = files, health_percentage = health_percentage, updated_at = updated_at)
  
    __obj.asInstanceOf[ReposRetrieveCommunityProfileMetricsResponse]
  }
}

