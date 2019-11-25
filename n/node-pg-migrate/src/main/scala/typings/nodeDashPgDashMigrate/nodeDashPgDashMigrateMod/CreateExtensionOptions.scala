package typings.nodeDashPgDashMigrate.nodeDashPgDashMigrateMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CreateExtensionOptions extends js.Object {
  var ifNotExists: js.UndefOr[Boolean] = js.undefined
  var schema: js.UndefOr[String] = js.undefined
}

object CreateExtensionOptions {
  @scala.inline
  def apply(ifNotExists: js.UndefOr[Boolean] = js.undefined, schema: String = null): CreateExtensionOptions = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(ifNotExists)) __obj.updateDynamic("ifNotExists")(ifNotExists.asInstanceOf[js.Any])
    if (schema != null) __obj.updateDynamic("schema")(schema.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateExtensionOptions]
  }
}

