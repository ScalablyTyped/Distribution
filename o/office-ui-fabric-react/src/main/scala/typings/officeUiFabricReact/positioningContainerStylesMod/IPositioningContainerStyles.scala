package typings.officeUiFabricReact.positioningContainerStylesMod

import typings.uifabricMergeStyles.istyleMod.IStyle
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IPositioningContainerStyles extends js.Object {
  /**
    * Style for the root element in the default enabled/unchecked state.
    */
  var root: js.UndefOr[IStyle] = js.undefined
}

object IPositioningContainerStyles {
  @scala.inline
  def apply(root: IStyle = null): IPositioningContainerStyles = {
    val __obj = js.Dynamic.literal()
    if (root != null) __obj.updateDynamic("root")(root.asInstanceOf[js.Any])
    __obj.asInstanceOf[IPositioningContainerStyles]
  }
}

