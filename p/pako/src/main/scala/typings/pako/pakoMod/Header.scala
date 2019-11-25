package typings.pako.pakoMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Header extends js.Object {
  var comment: js.UndefOr[String] = js.undefined
  var extra: js.UndefOr[js.Array[Double]] = js.undefined
  var hcrc: js.UndefOr[Boolean] = js.undefined
  var name: js.UndefOr[String] = js.undefined
  var os: js.UndefOr[Double] = js.undefined
  var text: js.UndefOr[Boolean] = js.undefined
  var time: js.UndefOr[Double] = js.undefined
}

object Header {
  @scala.inline
  def apply(
    comment: String = null,
    extra: js.Array[Double] = null,
    hcrc: js.UndefOr[Boolean] = js.undefined,
    name: String = null,
    os: Int | Double = null,
    text: js.UndefOr[Boolean] = js.undefined,
    time: Int | Double = null
  ): Header = {
    val __obj = js.Dynamic.literal()
    if (comment != null) __obj.updateDynamic("comment")(comment.asInstanceOf[js.Any])
    if (extra != null) __obj.updateDynamic("extra")(extra.asInstanceOf[js.Any])
    if (!js.isUndefined(hcrc)) __obj.updateDynamic("hcrc")(hcrc.asInstanceOf[js.Any])
    if (name != null) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    if (os != null) __obj.updateDynamic("os")(os.asInstanceOf[js.Any])
    if (!js.isUndefined(text)) __obj.updateDynamic("text")(text.asInstanceOf[js.Any])
    if (time != null) __obj.updateDynamic("time")(time.asInstanceOf[js.Any])
    __obj.asInstanceOf[Header]
  }
}

