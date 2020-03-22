package typings.octokitPluginRestEndpointMethods.typesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ActionsListSelfHostedRunnersForRepoResponseItem extends js.Object {
  var id: Double
  var name: String
  var os: String
  var status: String
}

object ActionsListSelfHostedRunnersForRepoResponseItem {
  @scala.inline
  def apply(id: Double, name: String, os: String, status: String): ActionsListSelfHostedRunnersForRepoResponseItem = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], os = os.asInstanceOf[js.Any], status = status.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[ActionsListSelfHostedRunnersForRepoResponseItem]
  }
}

