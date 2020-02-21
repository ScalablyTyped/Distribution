package typings.octokitPluginRestEndpointMethods

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonMigrationidOrgPage extends js.Object {
  var migration_id: AnonRequired
  var org: AnonRequired
  var page: AnonType
  var per_page: AnonType
}

object AnonMigrationidOrgPage {
  @scala.inline
  def apply(migration_id: AnonRequired, org: AnonRequired, page: AnonType, per_page: AnonType): AnonMigrationidOrgPage = {
    val __obj = js.Dynamic.literal(migration_id = migration_id.asInstanceOf[js.Any], org = org.asInstanceOf[js.Any], page = page.asInstanceOf[js.Any], per_page = per_page.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AnonMigrationidOrgPage]
  }
}

