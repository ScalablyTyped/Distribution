package typings
package nodeDashPgDashMigrateLib.nodeDashPgDashMigrateMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TableOptions extends js.Object {
  var comment: js.UndefOr[java.lang.String | scala.Null] = js.undefined
  var constraints: js.UndefOr[ConstraintOptions] = js.undefined
  var ifNotExists: js.UndefOr[scala.Boolean] = js.undefined
  var inherits: js.UndefOr[Name] = js.undefined
  var like: js.UndefOr[Name | nodeDashPgDashMigrateLib.Anon_Options] = js.undefined
  var temporary: js.UndefOr[scala.Boolean] = js.undefined
}

object TableOptions {
  @scala.inline
  def apply(
    comment: java.lang.String = null,
    constraints: ConstraintOptions = null,
    ifNotExists: js.UndefOr[scala.Boolean] = js.undefined,
    inherits: Name = null,
    like: Name | nodeDashPgDashMigrateLib.Anon_Options = null,
    temporary: js.UndefOr[scala.Boolean] = js.undefined
  ): TableOptions = {
    val __obj = js.Dynamic.literal()
    if (comment != null) __obj.updateDynamic("comment")(comment)
    if (constraints != null) __obj.updateDynamic("constraints")(constraints)
    if (!js.isUndefined(ifNotExists)) __obj.updateDynamic("ifNotExists")(ifNotExists)
    if (inherits != null) __obj.updateDynamic("inherits")(inherits.asInstanceOf[js.Any])
    if (like != null) __obj.updateDynamic("like")(like.asInstanceOf[js.Any])
    if (!js.isUndefined(temporary)) __obj.updateDynamic("temporary")(temporary)
    __obj.asInstanceOf[TableOptions]
  }
}

