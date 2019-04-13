package typings
package atOctokitRestLib.atOctokitRestMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MigrationsDeleteArchiveForOrgParams extends js.Object {
  var migration_id: scala.Double
  var org: java.lang.String
}

object MigrationsDeleteArchiveForOrgParams {
  @scala.inline
  def apply(migration_id: scala.Double, org: java.lang.String): MigrationsDeleteArchiveForOrgParams = {
    val __obj = js.Dynamic.literal(migration_id = migration_id, org = org)
  
    __obj.asInstanceOf[MigrationsDeleteArchiveForOrgParams]
  }
}

