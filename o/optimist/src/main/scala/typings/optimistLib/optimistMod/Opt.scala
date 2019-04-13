package typings
package optimistLib.optimistMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Opt extends js.Object {
  var alias: js.UndefOr[java.lang.String | js.Array[java.lang.String]] = js.undefined
  var default: js.UndefOr[js.Any] = js.undefined
  var demand: js.UndefOr[java.lang.String | scala.Double | js.Array[java.lang.String]] = js.undefined
  var describe: js.UndefOr[java.lang.String] = js.undefined
  var `type`: js.UndefOr[java.lang.String] = js.undefined
}

object Opt {
  @scala.inline
  def apply(
    alias: java.lang.String | js.Array[java.lang.String] = null,
    default: js.Any = null,
    demand: java.lang.String | scala.Double | js.Array[java.lang.String] = null,
    describe: java.lang.String = null,
    `type`: java.lang.String = null
  ): Opt = {
    val __obj = js.Dynamic.literal()
    if (alias != null) __obj.updateDynamic("alias")(alias.asInstanceOf[js.Any])
    if (default != null) __obj.updateDynamic("default")(default)
    if (demand != null) __obj.updateDynamic("demand")(demand.asInstanceOf[js.Any])
    if (describe != null) __obj.updateDynamic("describe")(describe)
    if (`type` != null) __obj.updateDynamic("type")(`type`)
    __obj.asInstanceOf[Opt]
  }
}

