package typings.nodeDashPgDashMigrate.nodeDashPgDashMigrateMod

import typings.nodeDashPgDashMigrate.Anon_Options
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TableOptions extends js.Object {
  var comment: js.UndefOr[String | Null] = js.undefined
  var constraints: js.UndefOr[ConstraintOptions] = js.undefined
  var ifNotExists: js.UndefOr[Boolean] = js.undefined
  var inherits: js.UndefOr[Name] = js.undefined
  var like: js.UndefOr[Name | Anon_Options] = js.undefined
  var temporary: js.UndefOr[Boolean] = js.undefined
}

object TableOptions {
  @scala.inline
  def apply(
    comment: String = null,
    constraints: ConstraintOptions = null,
    ifNotExists: js.UndefOr[Boolean] = js.undefined,
    inherits: Name = null,
    like: Name | Anon_Options = null,
    temporary: js.UndefOr[Boolean] = js.undefined
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

