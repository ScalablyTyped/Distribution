package typings.officeDashUiDashFabricDashReact.libComponentsTextFieldTextFieldDotBaseMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ITextFieldSnapshot extends js.Object {
  /**
    * If set, the text field is changing between single- and multi-line, so we'll need to reset
    * selection/cursor after the change completes.
    */
  var selection: js.UndefOr[js.Tuple2[Double | Null, Double | Null]] = js.undefined
}

object ITextFieldSnapshot {
  @scala.inline
  def apply(selection: js.Tuple2[Double | Null, Double | Null] = null): ITextFieldSnapshot = {
    val __obj = js.Dynamic.literal()
    if (selection != null) __obj.updateDynamic("selection")(selection.asInstanceOf[js.Any])
    __obj.asInstanceOf[ITextFieldSnapshot]
  }
}

