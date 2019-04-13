package typings
package momentLib.momentMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait StandaloneFormatSpec extends js.Object {
  var format: js.Array[java.lang.String]
  var isFormat: js.UndefOr[stdLib.RegExp] = js.undefined
  var standalone: js.Array[java.lang.String]
}

object StandaloneFormatSpec {
  @scala.inline
  def apply(
    format: js.Array[java.lang.String],
    standalone: js.Array[java.lang.String],
    isFormat: stdLib.RegExp = null
  ): StandaloneFormatSpec = {
    val __obj = js.Dynamic.literal(format = format, standalone = standalone)
    if (isFormat != null) __obj.updateDynamic("isFormat")(isFormat)
    __obj.asInstanceOf[StandaloneFormatSpec]
  }
}

