package typings.mjmlReact.mod

import typings.csstype.mod.BackgroundColorProperty
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MjmlBodyProps extends js.Object {
  var backgroundColor: js.UndefOr[BackgroundColorProperty] = js.undefined
  var width: js.UndefOr[Double] = js.undefined
}

object MjmlBodyProps {
  @scala.inline
  def apply(backgroundColor: BackgroundColorProperty = null, width: js.UndefOr[Double] = js.undefined): MjmlBodyProps = {
    val __obj = js.Dynamic.literal()
    if (backgroundColor != null) __obj.updateDynamic("backgroundColor")(backgroundColor.asInstanceOf[js.Any])
    if (!js.isUndefined(width)) __obj.updateDynamic("width")(width.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[MjmlBodyProps]
  }
}

