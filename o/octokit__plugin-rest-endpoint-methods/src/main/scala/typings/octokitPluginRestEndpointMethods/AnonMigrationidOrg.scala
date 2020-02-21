package typings.octokitPluginRestEndpointMethods

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonMigrationidOrg extends js.Object {
  var migration_id: AnonRequired
  var org: AnonRequired
}

object AnonMigrationidOrg {
  @scala.inline
  def apply(migration_id: AnonRequired, org: AnonRequired): AnonMigrationidOrg = {
    val __obj = js.Dynamic.literal(migration_id = migration_id.asInstanceOf[js.Any], org = org.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AnonMigrationidOrg]
  }
}

