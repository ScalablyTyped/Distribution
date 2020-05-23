package typings.octokitTypes.endpointsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ReposRequestPageBuildResponseData extends js.Object {
  var status: String
  var url: String
}

object ReposRequestPageBuildResponseData {
  @scala.inline
  def apply(status: String, url: String): ReposRequestPageBuildResponseData = {
    val __obj = js.Dynamic.literal(status = status.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any])
    __obj.asInstanceOf[ReposRequestPageBuildResponseData]
  }
}

