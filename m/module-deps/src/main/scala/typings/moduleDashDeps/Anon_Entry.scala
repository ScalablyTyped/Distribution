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
    val __obj = js.Dynamic.literal(file = file.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any])
    if (!js.isUndefined(entry)) __obj.updateDynamic("entry")(entry.asInstanceOf[js.Any])
    if (expose != null) __obj.updateDynamic("expose")(expose.asInstanceOf[js.Any])
    if (!js.isUndefined(noparse)) __obj.updateDynamic("noparse")(noparse.asInstanceOf[js.Any])
    if (source != null) __obj.updateDynamic("source")(source.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_Entry]
  }
}

