package typings.otplibPresetV11

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait HmacOptions extends js.Object {
  var algorithm: js.UndefOr[String] = js.undefined
  var encoding: js.UndefOr[String] = js.undefined
}

object HmacOptions {
  @scala.inline
  def apply(algorithm: String = null, encoding: String = null): HmacOptions = {
    val __obj = js.Dynamic.literal()
    if (algorithm != null) __obj.updateDynamic("algorithm")(algorithm.asInstanceOf[js.Any])
    if (encoding != null) __obj.updateDynamic("encoding")(encoding.asInstanceOf[js.Any])
    __obj.asInstanceOf[HmacOptions]
  }
}

