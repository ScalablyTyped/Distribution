package typings.nivoCore.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined std.Partial<{  line  :std.Partial<react.react.CSSProperties>}> */
trait PartiallinePartialCSSProp extends js.Object {
  var line: js.UndefOr[PartialCSSProperties] = js.undefined
}

object PartiallinePartialCSSProp {
  @scala.inline
  def apply(line: PartialCSSProperties = null): PartiallinePartialCSSProp = {
    val __obj = js.Dynamic.literal()
    if (line != null) __obj.updateDynamic("line")(line.asInstanceOf[js.Any])
    __obj.asInstanceOf[PartiallinePartialCSSProp]
  }
}

