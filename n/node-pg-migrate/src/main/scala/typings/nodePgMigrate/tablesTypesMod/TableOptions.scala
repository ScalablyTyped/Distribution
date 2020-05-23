package typings.nodePgMigrate.tablesTypesMod

import typings.nodePgMigrate.anon.Options
import typings.nodePgMigrate.generalTypesMod.IfNotExistsOption
import typings.nodePgMigrate.generalTypesMod.Name
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TableOptions extends IfNotExistsOption {
  var comment: js.UndefOr[String | Null] = js.undefined
  var constraints: js.UndefOr[ConstraintOptions] = js.undefined
  var inherits: js.UndefOr[Name] = js.undefined
  var like: js.UndefOr[Name | Options] = js.undefined
  var temporary: js.UndefOr[Boolean] = js.undefined
}

object TableOptions {
  @scala.inline
  def apply(
    comment: js.UndefOr[Null | String] = js.undefined,
    constraints: ConstraintOptions = null,
    ifNotExists: js.UndefOr[Boolean] = js.undefined,
    inherits: Name = null,
    like: Name | Options = null,
    temporary: js.UndefOr[Boolean] = js.undefined
  ): TableOptions = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(comment)) __obj.updateDynamic("comment")(comment.asInstanceOf[js.Any])
    if (constraints != null) __obj.updateDynamic("constraints")(constraints.asInstanceOf[js.Any])
    if (!js.isUndefined(ifNotExists)) __obj.updateDynamic("ifNotExists")(ifNotExists.get.asInstanceOf[js.Any])
    if (inherits != null) __obj.updateDynamic("inherits")(inherits.asInstanceOf[js.Any])
    if (like != null) __obj.updateDynamic("like")(like.asInstanceOf[js.Any])
    if (!js.isUndefined(temporary)) __obj.updateDynamic("temporary")(temporary.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[TableOptions]
  }
}

