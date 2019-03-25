package typings
package pakoLib.pakoMod.PakoNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Header extends js.Object {
  var comment: js.UndefOr[java.lang.String] = js.undefined
  var extra: js.UndefOr[js.Array[scala.Double]] = js.undefined
  var hcrc: js.UndefOr[scala.Boolean] = js.undefined
  var name: js.UndefOr[java.lang.String] = js.undefined
  var os: js.UndefOr[scala.Double] = js.undefined
  var text: js.UndefOr[scala.Boolean] = js.undefined
  var time: js.UndefOr[scala.Double] = js.undefined
}

object Header {
  @scala.inline
  def apply(
    comment: java.lang.String = null,
    extra: js.Array[scala.Double] = null,
    hcrc: js.UndefOr[scala.Boolean] = js.undefined,
    name: java.lang.String = null,
    os: scala.Int | scala.Double = null,
    text: js.UndefOr[scala.Boolean] = js.undefined,
    time: scala.Int | scala.Double = null
  ): Header = {
    val __obj = js.Dynamic.literal()
    if (comment != null) __obj.updateDynamic("comment")(comment)
    if (extra != null) __obj.updateDynamic("extra")(extra)
    if (!js.isUndefined(hcrc)) __obj.updateDynamic("hcrc")(hcrc)
    if (name != null) __obj.updateDynamic("name")(name)
    if (os != null) __obj.updateDynamic("os")(os.asInstanceOf[js.Any])
    if (!js.isUndefined(text)) __obj.updateDynamic("text")(text)
    if (time != null) __obj.updateDynamic("time")(time.asInstanceOf[js.Any])
    __obj.asInstanceOf[Header]
  }
}

