package typings.monacoEditor.mod.editor

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait INewScrollPosition extends js.Object {
  var scrollLeft: js.UndefOr[Double] = js.undefined
  var scrollTop: js.UndefOr[Double] = js.undefined
}

object INewScrollPosition {
  @scala.inline
  def apply(scrollLeft: js.UndefOr[Double] = js.undefined, scrollTop: js.UndefOr[Double] = js.undefined): INewScrollPosition = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(scrollLeft)) __obj.updateDynamic("scrollLeft")(scrollLeft.get.asInstanceOf[js.Any])
    if (!js.isUndefined(scrollTop)) __obj.updateDynamic("scrollTop")(scrollTop.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[INewScrollPosition]
  }
}

