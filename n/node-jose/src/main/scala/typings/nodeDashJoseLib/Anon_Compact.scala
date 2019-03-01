package typings
package nodeDashJoseLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Compact extends js.Object {
  var fields: js.UndefOr[js.Object] = js.undefined
  var format: js.UndefOr[
    nodeDashJoseLib.nodeDashJoseLibStrings.compact | nodeDashJoseLib.nodeDashJoseLibStrings.flattened
  ] = js.undefined
  var zip: js.UndefOr[scala.Boolean] = js.undefined
}

object Anon_Compact {
  @scala.inline
  def apply(
    fields: js.Object = null,
    format: nodeDashJoseLib.nodeDashJoseLibStrings.compact | nodeDashJoseLib.nodeDashJoseLibStrings.flattened = null,
    zip: js.UndefOr[scala.Boolean] = js.undefined
  ): Anon_Compact = {
    val __obj = js.Dynamic.literal()
    if (fields != null) __obj.updateDynamic("fields")(fields)
    if (format != null) __obj.updateDynamic("format")(format.asInstanceOf[js.Any])
    if (!js.isUndefined(zip)) __obj.updateDynamic("zip")(zip)
    __obj.asInstanceOf[Anon_Compact]
  }
}

