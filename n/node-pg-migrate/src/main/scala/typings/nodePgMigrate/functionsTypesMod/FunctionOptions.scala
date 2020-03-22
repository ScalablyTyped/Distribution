package typings.nodePgMigrate.functionsTypesMod

import typings.nodePgMigrate.nodePgMigrateStrings.IMMUTABLE
import typings.nodePgMigrate.nodePgMigrateStrings.RESTRICTED
import typings.nodePgMigrate.nodePgMigrateStrings.SAFE
import typings.nodePgMigrate.nodePgMigrateStrings.STABLE
import typings.nodePgMigrate.nodePgMigrateStrings.UNSAFE
import typings.nodePgMigrate.nodePgMigrateStrings.VOLATILE
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait FunctionOptions extends js.Object {
  var behavior: js.UndefOr[IMMUTABLE | STABLE | VOLATILE] = js.undefined
  var language: String
  var onNull: js.UndefOr[Boolean] = js.undefined
  var parallel: js.UndefOr[UNSAFE | RESTRICTED | SAFE] = js.undefined
  var replace: js.UndefOr[Boolean] = js.undefined
  var returns: js.UndefOr[String] = js.undefined
  var window: js.UndefOr[Boolean] = js.undefined
}

object FunctionOptions {
  @scala.inline
  def apply(
    language: String,
    behavior: IMMUTABLE | STABLE | VOLATILE = null,
    onNull: js.UndefOr[Boolean] = js.undefined,
    parallel: UNSAFE | RESTRICTED | SAFE = null,
    replace: js.UndefOr[Boolean] = js.undefined,
    returns: String = null,
    window: js.UndefOr[Boolean] = js.undefined
  ): FunctionOptions = {
    val __obj = js.Dynamic.literal(language = language.asInstanceOf[js.Any])
    if (behavior != null) __obj.updateDynamic("behavior")(behavior.asInstanceOf[js.Any])
    if (!js.isUndefined(onNull)) __obj.updateDynamic("onNull")(onNull.asInstanceOf[js.Any])
    if (parallel != null) __obj.updateDynamic("parallel")(parallel.asInstanceOf[js.Any])
    if (!js.isUndefined(replace)) __obj.updateDynamic("replace")(replace.asInstanceOf[js.Any])
    if (returns != null) __obj.updateDynamic("returns")(returns.asInstanceOf[js.Any])
    if (!js.isUndefined(window)) __obj.updateDynamic("window")(window.asInstanceOf[js.Any])
    __obj.asInstanceOf[FunctionOptions]
  }
}

