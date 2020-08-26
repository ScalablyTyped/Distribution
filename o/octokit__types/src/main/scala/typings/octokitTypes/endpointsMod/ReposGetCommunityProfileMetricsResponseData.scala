package typings.octokitTypes.endpointsMod

import typings.octokitTypes.anon.Codeofconduct
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ReposGetCommunityProfileMetricsResponseData extends js.Object {
  var description: String = js.native
  var documentation: Boolean = js.native
  var files: Codeofconduct = js.native
  var health_percentage: Double = js.native
  var updated_at: String = js.native
}

object ReposGetCommunityProfileMetricsResponseData {
  @scala.inline
  def apply(
    description: String,
    documentation: Boolean,
    files: Codeofconduct,
    health_percentage: Double,
    updated_at: String
  ): ReposGetCommunityProfileMetricsResponseData = {
    val __obj = js.Dynamic.literal(description = description.asInstanceOf[js.Any], documentation = documentation.asInstanceOf[js.Any], files = files.asInstanceOf[js.Any], health_percentage = health_percentage.asInstanceOf[js.Any], updated_at = updated_at.asInstanceOf[js.Any])
    __obj.asInstanceOf[ReposGetCommunityProfileMetricsResponseData]
  }
  @scala.inline
  implicit class ReposGetCommunityProfileMetricsResponseDataOps[Self <: ReposGetCommunityProfileMetricsResponseData] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setDescription(value: String): Self = this.set("description", value.asInstanceOf[js.Any])
    @scala.inline
    def setDocumentation(value: Boolean): Self = this.set("documentation", value.asInstanceOf[js.Any])
    @scala.inline
    def setFiles(value: Codeofconduct): Self = this.set("files", value.asInstanceOf[js.Any])
    @scala.inline
    def setHealth_percentage(value: Double): Self = this.set("health_percentage", value.asInstanceOf[js.Any])
    @scala.inline
    def setUpdated_at(value: String): Self = this.set("updated_at", value.asInstanceOf[js.Any])
  }
  
}

