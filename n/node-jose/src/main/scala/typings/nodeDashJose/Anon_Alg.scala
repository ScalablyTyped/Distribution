package typings.nodeDashJose

import typings.nodeDashJose.nodeDashJoseStrings.compact
import typings.nodeDashJose.nodeDashJoseStrings.flattened
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Alg extends js.Object {
  var alg: js.UndefOr[String] = js.undefined
  var compact: js.UndefOr[Boolean] = js.undefined
  var fields: js.UndefOr[js.Object] = js.undefined
  var format: js.UndefOr[compact | flattened] = js.undefined
}

object Anon_Alg {
  @scala.inline
  def apply(
    alg: String = null,
    compact: js.UndefOr[Boolean] = js.undefined,
    fields: js.Object = null,
    format: compact | flattened = null
  ): Anon_Alg = {
    val __obj = js.Dynamic.literal()
    if (alg != null) __obj.updateDynamic("alg")(alg)
    if (!js.isUndefined(compact)) __obj.updateDynamic("compact")(compact)
    if (fields != null) __obj.updateDynamic("fields")(fields)
    if (format != null) __obj.updateDynamic("format")(format.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_Alg]
  }
}

