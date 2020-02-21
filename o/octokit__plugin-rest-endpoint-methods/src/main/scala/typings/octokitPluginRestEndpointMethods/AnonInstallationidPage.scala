package typings.octokitPluginRestEndpointMethods

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonInstallationidPage extends js.Object {
  var installation_id: AnonRequired
  var page: AnonType
  var per_page: AnonType
}

object AnonInstallationidPage {
  @scala.inline
  def apply(installation_id: AnonRequired, page: AnonType, per_page: AnonType): AnonInstallationidPage = {
    val __obj = js.Dynamic.literal(installation_id = installation_id.asInstanceOf[js.Any], page = page.asInstanceOf[js.Any], per_page = per_page.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AnonInstallationidPage]
  }
}

