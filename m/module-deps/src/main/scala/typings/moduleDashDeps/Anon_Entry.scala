package typings.moduleDashDeps

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Entry extends js.Object {
  var entry: js.UndefOr[Boolean] = js.undefined
  var expose: js.UndefOr[String] = js.undefined
  var file: String
  var id: String
  var noparse: js.UndefOr[Boolean] = js.undefined
  var source: js.UndefOr[String] = js.undefined
}

object Anon_Entry {
  @scala.inline
  def apply(
    file: String,
    id: String,
    entry: js.UndefOr[Boolean] = js.undefined,
    expose: String = null,
    noparse: js.UndefOr[Boolean] = js.undefined,
    source: String = null
  ): Anon_Entry = {
    val __obj = js.Dynamic.literal(file = file, id = id)
    if (!js.isUndefined(entry)) __obj.updateDynamic("entry")(entry)
    if (expose != null) __obj.updateDynamic("expose")(expose)
    if (!js.isUndefined(noparse)) __obj.updateDynamic("noparse")(noparse)
    if (source != null) __obj.updateDynamic("source")(source)
    __obj.asInstanceOf[Anon_Entry]
  }
}

