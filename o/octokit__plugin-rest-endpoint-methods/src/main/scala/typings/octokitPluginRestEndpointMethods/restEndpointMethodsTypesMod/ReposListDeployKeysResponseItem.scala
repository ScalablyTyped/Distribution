package typings.octokitPluginRestEndpointMethods.restEndpointMethodsTypesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ReposListDeployKeysResponseItem extends js.Object {
  var created_at: String
  var id: Double
  var key: String
  var read_only: Boolean
  var title: String
  var url: String
  var verified: Boolean
}

object ReposListDeployKeysResponseItem {
  @scala.inline
  def apply(
    created_at: String,
    id: Double,
    key: String,
    read_only: Boolean,
    title: String,
    url: String,
    verified: Boolean
  ): ReposListDeployKeysResponseItem = {
    val __obj = js.Dynamic.literal(created_at = created_at.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], key = key.asInstanceOf[js.Any], read_only = read_only.asInstanceOf[js.Any], title = title.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any], verified = verified.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[ReposListDeployKeysResponseItem]
  }
}

