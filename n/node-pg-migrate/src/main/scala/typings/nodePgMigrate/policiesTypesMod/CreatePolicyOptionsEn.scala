package typings.nodePgMigrate.policiesTypesMod

import typings.nodePgMigrate.nodePgMigrateStrings.ALL
import typings.nodePgMigrate.nodePgMigrateStrings.DELETE
import typings.nodePgMigrate.nodePgMigrateStrings.INSERT
import typings.nodePgMigrate.nodePgMigrateStrings.SELECT
import typings.nodePgMigrate.nodePgMigrateStrings.UPDATE
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CreatePolicyOptionsEn extends js.Object {
  var command: js.UndefOr[ALL | SELECT | INSERT | UPDATE | DELETE] = js.undefined
}

object CreatePolicyOptionsEn {
  @scala.inline
  def apply(command: ALL | SELECT | INSERT | UPDATE | DELETE = null): CreatePolicyOptionsEn = {
    val __obj = js.Dynamic.literal()
    if (command != null) __obj.updateDynamic("command")(command.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreatePolicyOptionsEn]
  }
}

