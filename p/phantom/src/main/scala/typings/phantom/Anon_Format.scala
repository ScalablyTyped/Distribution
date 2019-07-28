package typings.phantom

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Format extends js.Object {
  var format: js.UndefOr[String] = js.undefined
  var quality: js.UndefOr[String] = js.undefined
}

object Anon_Format {
  @scala.inline
  def apply(format: String = null, quality: String = null): Anon_Format = {
    val __obj = js.Dynamic.literal()
    if (format != null) __obj.updateDynamic("format")(format)
    if (quality != null) __obj.updateDynamic("quality")(quality)
    __obj.asInstanceOf[Anon_Format]
  }
}

