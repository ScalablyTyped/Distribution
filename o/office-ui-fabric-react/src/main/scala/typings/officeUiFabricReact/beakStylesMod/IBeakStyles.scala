package typings.officeUiFabricReact.beakStylesMod

import typings.uifabricMergeStyles.istyleMod.IStyle
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IBeakStyles extends js.Object {
  var beak: js.UndefOr[IStyle] = js.undefined
  /**
    * Style for the root element in the default enabled/unchecked state.
    */
  var root: js.UndefOr[IStyle] = js.undefined
}

object IBeakStyles {
  @scala.inline
  def apply(beak: IStyle = null, root: IStyle = null): IBeakStyles = {
    val __obj = js.Dynamic.literal()
    if (beak != null) __obj.updateDynamic("beak")(beak.asInstanceOf[js.Any])
    if (root != null) __obj.updateDynamic("root")(root.asInstanceOf[js.Any])
    __obj.asInstanceOf[IBeakStyles]
  }
}

