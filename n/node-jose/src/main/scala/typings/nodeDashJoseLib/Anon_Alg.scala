package typings
package nodeDashJoseLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Alg extends js.Object {
  var alg: js.UndefOr[java.lang.String] = js.undefined
  var compact: js.UndefOr[scala.Boolean] = js.undefined
  var fields: js.UndefOr[js.Object] = js.undefined
  var format: js.UndefOr[
    nodeDashJoseLib.nodeDashJoseLibStrings.compact | nodeDashJoseLib.nodeDashJoseLibStrings.flattened
  ] = js.undefined
}

object Anon_Alg {
  @scala.inline
  def apply(
    alg: java.lang.String = null,
    compact: js.UndefOr[scala.Boolean] = js.undefined,
    fields: js.Object = null,
    format: nodeDashJoseLib.nodeDashJoseLibStrings.compact | nodeDashJoseLib.nodeDashJoseLibStrings.flattened = null
  ): Anon_Alg = {
    val __obj = js.Dynamic.literal()
    if (alg != null) __obj.updateDynamic("alg")(alg)
    if (!js.isUndefined(compact)) __obj.updateDynamic("compact")(compact)
    if (fields != null) __obj.updateDynamic("fields")(fields)
    if (format != null) __obj.updateDynamic("format")(format.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_Alg]
  }
}

