package typings.momentMini.mod

import typings.std.RegExp
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait StandaloneFormatSpec extends js.Object {
  var format: js.Array[String]
  var isFormat: js.UndefOr[RegExp] = js.undefined
  var standalone: js.Array[String]
}

object StandaloneFormatSpec {
  @scala.inline
  def apply(format: js.Array[String], standalone: js.Array[String], isFormat: RegExp = null): StandaloneFormatSpec = {
    val __obj = js.Dynamic.literal(format = format.asInstanceOf[js.Any], standalone = standalone.asInstanceOf[js.Any])
    if (isFormat != null) __obj.updateDynamic("isFormat")(isFormat.asInstanceOf[js.Any])
    __obj.asInstanceOf[StandaloneFormatSpec]
  }
}

