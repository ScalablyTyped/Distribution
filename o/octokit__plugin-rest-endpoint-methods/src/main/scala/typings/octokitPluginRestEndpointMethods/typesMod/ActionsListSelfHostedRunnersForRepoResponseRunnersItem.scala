package typings.octokitPluginRestEndpointMethods.typesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ActionsListSelfHostedRunnersForRepoResponseRunnersItem extends js.Object {
  var id: Double
  var name: String
  var os: String
  var status: String
}

object ActionsListSelfHostedRunnersForRepoResponseRunnersItem {
  @scala.inline
  def apply(id: Double, name: String, os: String, status: String): ActionsListSelfHostedRunnersForRepoResponseRunnersItem = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], os = os.asInstanceOf[js.Any], status = status.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[ActionsListSelfHostedRunnersForRepoResponseRunnersItem]
  }
}

