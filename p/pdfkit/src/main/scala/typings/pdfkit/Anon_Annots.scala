package typings.pdfkit

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
    val __obj = js.Dynamic.literal(Annots = Annots.asInstanceOf[js.Any], Pattern = Pattern.asInstanceOf[js.Any])
    if (ExtGState != null) __obj.updateDynamic("ExtGState")(ExtGState.asInstanceOf[js.Any])
    if (Font != null) __obj.updateDynamic("Font")(Font.asInstanceOf[js.Any])
    if (XObject != null) __obj.updateDynamic("XObject")(XObject.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_Annots]
  }
}

