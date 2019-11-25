package typings.optimist.optimistMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Opt extends js.Object {
  var alias: js.UndefOr[String | js.Array[String]] = js.undefined
  var default: js.UndefOr[js.Any] = js.undefined
  var demand: js.UndefOr[String | Double | js.Array[String]] = js.undefined
  var describe: js.UndefOr[String] = js.undefined
  var `type`: js.UndefOr[String] = js.undefined
}

object Opt {
  @scala.inline
  def apply(
    alias: String | js.Array[String] = null,
    default: js.Any = null,
    demand: String | Double | js.Array[String] = null,
    describe: String = null,
    `type`: String = null
  ): Opt = {
    val __obj = js.Dynamic.literal()
    if (alias != null) __obj.updateDynamic("alias")(alias.asInstanceOf[js.Any])
    if (default != null) __obj.updateDynamic("default")(default.asInstanceOf[js.Any])
    if (demand != null) __obj.updateDynamic("demand")(demand.asInstanceOf[js.Any])
    if (describe != null) __obj.updateDynamic("describe")(describe.asInstanceOf[js.Any])
    if (`type` != null) __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Opt]
  }
}

