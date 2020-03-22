package typings.octokitPluginRestEndpointMethods.typesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ReposRequestPageBuildResponse extends js.Object {
  var status: String
  var url: String
}

object ReposRequestPageBuildResponse {
  @scala.inline
  def apply(status: String, url: String): ReposRequestPageBuildResponse = {
    val __obj = js.Dynamic.literal(status = status.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[ReposRequestPageBuildResponse]
  }
}

