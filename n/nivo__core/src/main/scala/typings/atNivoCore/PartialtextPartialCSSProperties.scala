package typings.atNivoCore

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined std.Partial<{  text  :std.Partial<react.react.CSSProperties>}> */
trait PartialtextPartialCSSProperties extends js.Object {
  var text: js.UndefOr[PartialCSSProperties] = js.undefined
}

object PartialtextPartialCSSProperties {
  @scala.inline
  def apply(text: PartialCSSProperties = null): PartialtextPartialCSSProperties = {
    val __obj = js.Dynamic.literal()
    if (text != null) __obj.updateDynamic("text")(text)
    __obj.asInstanceOf[PartialtextPartialCSSProperties]
  }
}

