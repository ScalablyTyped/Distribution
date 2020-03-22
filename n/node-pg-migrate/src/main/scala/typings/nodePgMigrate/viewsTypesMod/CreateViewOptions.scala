package typings.nodePgMigrate.viewsTypesMod

import typings.nodePgMigrate.nodePgMigrateStrings.CASCADED
import typings.nodePgMigrate.nodePgMigrateStrings.LOCAL
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CreateViewOptions extends js.Object {
  var checkOption: js.UndefOr[CASCADED | LOCAL] = js.undefined
  var columns: js.UndefOr[String | js.Array[String]] = js.undefined
  var recursive: js.UndefOr[Boolean] = js.undefined
  var replace: js.UndefOr[Boolean] = js.undefined
  var temporary: js.UndefOr[Boolean] = js.undefined
}

object CreateViewOptions {
  @scala.inline
  def apply(
    checkOption: CASCADED | LOCAL = null,
    columns: String | js.Array[String] = null,
    recursive: js.UndefOr[Boolean] = js.undefined,
    replace: js.UndefOr[Boolean] = js.undefined,
    temporary: js.UndefOr[Boolean] = js.undefined
  ): CreateViewOptions = {
    val __obj = js.Dynamic.literal()
    if (checkOption != null) __obj.updateDynamic("checkOption")(checkOption.asInstanceOf[js.Any])
    if (columns != null) __obj.updateDynamic("columns")(columns.asInstanceOf[js.Any])
    if (!js.isUndefined(recursive)) __obj.updateDynamic("recursive")(recursive.asInstanceOf[js.Any])
    if (!js.isUndefined(replace)) __obj.updateDynamic("replace")(replace.asInstanceOf[js.Any])
    if (!js.isUndefined(temporary)) __obj.updateDynamic("temporary")(temporary.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateViewOptions]
  }
}

