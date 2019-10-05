package typings.monacoDashEditor.monacoDashEditorMod.editor

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait INewScrollPosition extends js.Object {
  var scrollLeft: js.UndefOr[Double] = js.undefined
  var scrollTop: js.UndefOr[Double] = js.undefined
}

object INewScrollPosition {
  @scala.inline
  def apply(scrollLeft: Int | Double = null, scrollTop: Int | Double = null): INewScrollPosition = {
    val __obj = js.Dynamic.literal()
    if (scrollLeft != null) __obj.updateDynamic("scrollLeft")(scrollLeft.asInstanceOf[js.Any])
    if (scrollTop != null) __obj.updateDynamic("scrollTop")(scrollTop.asInstanceOf[js.Any])
    __obj.asInstanceOf[INewScrollPosition]
  }
}

