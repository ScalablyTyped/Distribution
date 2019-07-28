package typings.nodeDashPgDashMigrate.nodeDashPgDashMigrateMod

import typings.nodeDashPgDashMigrate.nodeDashPgDashMigrateStrings.ALL
import typings.nodeDashPgDashMigrate.nodeDashPgDashMigrateStrings.DELETE
import typings.nodeDashPgDashMigrate.nodeDashPgDashMigrateStrings.INSERT
import typings.nodeDashPgDashMigrate.nodeDashPgDashMigrateStrings.SELECT
import typings.nodeDashPgDashMigrate.nodeDashPgDashMigrateStrings.UPDATE
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CreatePolicyOptionsEn extends js.Object {
  var command: ALL | SELECT | INSERT | UPDATE | DELETE
}

object CreatePolicyOptionsEn {
  @scala.inline
  def apply(command: ALL | SELECT | INSERT | UPDATE | DELETE): CreatePolicyOptionsEn = {
    val __obj = js.Dynamic.literal(command = command.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[CreatePolicyOptionsEn]
  }
}

