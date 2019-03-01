package typings
package moduleDashDepsLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Entry extends js.Object {
  var entry: js.UndefOr[scala.Boolean] = js.undefined
  var expose: js.UndefOr[java.lang.String] = js.undefined
  var file: java.lang.String
  var id: java.lang.String
  var noparse: js.UndefOr[scala.Boolean] = js.undefined
  var source: js.UndefOr[java.lang.String] = js.undefined
}

object Anon_Entry {
  @scala.inline
  def apply(
    file: java.lang.String,
    id: java.lang.String,
    entry: js.UndefOr[scala.Boolean] = js.undefined,
    expose: java.lang.String = null,
    noparse: js.UndefOr[scala.Boolean] = js.undefined,
    source: java.lang.String = null
  ): Anon_Entry = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("file")(file)
    __obj.updateDynamic("id")(id)
    if (!js.isUndefined(entry)) __obj.updateDynamic("entry")(entry)
    if (expose != null) __obj.updateDynamic("expose")(expose)
    if (!js.isUndefined(noparse)) __obj.updateDynamic("noparse")(noparse)
    if (source != null) __obj.updateDynamic("source")(source)
    __obj.asInstanceOf[Anon_Entry]
  }
}

