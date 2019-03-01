package typings
package pdfkitLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Annots extends js.Object {
  var Annots: js.Any
  var ExtGState: js.UndefOr[js.Any] = js.undefined
  var Font: js.UndefOr[js.Any] = js.undefined
  var Pattern: js.Any
  var XObject: js.UndefOr[js.Any] = js.undefined
}

object Anon_Annots {
  @scala.inline
  def apply(
    Annots: js.Any,
    Pattern: js.Any,
    ExtGState: js.Any = null,
    Font: js.Any = null,
    XObject: js.Any = null
  ): Anon_Annots = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("Annots")(Annots)
    __obj.updateDynamic("Pattern")(Pattern)
    if (ExtGState != null) __obj.updateDynamic("ExtGState")(ExtGState)
    if (Font != null) __obj.updateDynamic("Font")(Font)
    if (XObject != null) __obj.updateDynamic("XObject")(XObject)
    __obj.asInstanceOf[Anon_Annots]
  }
}

