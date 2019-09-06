package typings.nodeDashPolyglot.nodeDashPolyglotMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait InterpolationTokenOptions extends js.Object {
  var prefix: js.UndefOr[String] = js.undefined
  var suffix: js.UndefOr[String] = js.undefined
}

object InterpolationTokenOptions {
  @scala.inline
  def apply(prefix: String = null, suffix: String = null): InterpolationTokenOptions = {
    val __obj = js.Dynamic.literal()
    if (prefix != null) __obj.updateDynamic("prefix")(prefix)
    if (suffix != null) __obj.updateDynamic("suffix")(suffix)
    __obj.asInstanceOf[InterpolationTokenOptions]
  }
}

