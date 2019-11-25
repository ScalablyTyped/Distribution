package typings.moduleDashDeps.moduleDashDepsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait InputRow extends js.Object {
  var entry: js.UndefOr[Boolean] = js.undefined
  var expose: String
  var file: String
  var id: String
  var noparse: js.UndefOr[Boolean] = js.undefined
}

object InputRow {
  @scala.inline
  def apply(
    expose: String,
    file: String,
    id: String,
    entry: js.UndefOr[Boolean] = js.undefined,
    noparse: js.UndefOr[Boolean] = js.undefined
  ): InputRow = {
    val __obj = js.Dynamic.literal(expose = expose.asInstanceOf[js.Any], file = file.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any])
    if (!js.isUndefined(entry)) __obj.updateDynamic("entry")(entry.asInstanceOf[js.Any])
    if (!js.isUndefined(noparse)) __obj.updateDynamic("noparse")(noparse.asInstanceOf[js.Any])
    __obj.asInstanceOf[InputRow]
  }
}

