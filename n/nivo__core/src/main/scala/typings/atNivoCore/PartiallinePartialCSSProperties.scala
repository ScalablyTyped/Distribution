package typings.atNivoCore

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined std.Partial<{  line  :std.Partial<react.react.CSSProperties>}> */
trait PartiallinePartialCSSProperties extends js.Object {
  var line: js.UndefOr[PartialCSSProperties] = js.undefined
}

object PartiallinePartialCSSProperties {
  @scala.inline
  def apply(line: PartialCSSProperties = null): PartiallinePartialCSSProperties = {
    val __obj = js.Dynamic.literal()
    if (line != null) __obj.updateDynamic("line")(line)
    __obj.asInstanceOf[PartiallinePartialCSSProperties]
  }
}

