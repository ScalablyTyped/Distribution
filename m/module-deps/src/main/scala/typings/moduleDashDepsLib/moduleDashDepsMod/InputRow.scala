package typings
package moduleDashDepsLib.moduleDashDepsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait InputRow extends js.Object {
  var entry: js.UndefOr[scala.Boolean] = js.undefined
  var expose: java.lang.String
  var file: java.lang.String
  var id: java.lang.String
  var noparse: js.UndefOr[scala.Boolean] = js.undefined
}

object InputRow {
  @scala.inline
  def apply(
    expose: java.lang.String,
    file: java.lang.String,
    id: java.lang.String,
    entry: js.UndefOr[scala.Boolean] = js.undefined,
    noparse: js.UndefOr[scala.Boolean] = js.undefined
  ): InputRow = {
    val __obj = js.Dynamic.literal(expose = expose, file = file, id = id)
    if (!js.isUndefined(entry)) __obj.updateDynamic("entry")(entry)
    if (!js.isUndefined(noparse)) __obj.updateDynamic("noparse")(noparse)
    __obj.asInstanceOf[InputRow]
  }
}

