package typings.octokitPluginRestEndpointMethods

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonInstallationid extends js.Object {
  var installation_id: AnonRequired
  var repository_id: AnonRequired
}

object AnonInstallationid {
  @scala.inline
  def apply(installation_id: AnonRequired, repository_id: AnonRequired): AnonInstallationid = {
    val __obj = js.Dynamic.literal(installation_id = installation_id.asInstanceOf[js.Any], repository_id = repository_id.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AnonInstallationid]
  }
}

