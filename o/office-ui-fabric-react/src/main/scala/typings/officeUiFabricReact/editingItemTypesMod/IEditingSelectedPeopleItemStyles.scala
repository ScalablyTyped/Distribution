package typings.officeUiFabricReact.editingItemTypesMod

import typings.uifabricMergeStyles.istyleMod.IStyle
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IEditingSelectedPeopleItemStyles extends js.Object {
  var input: IStyle
  var root: IStyle
}

object IEditingSelectedPeopleItemStyles {
  @scala.inline
  def apply(input: IStyle = null, root: IStyle = null): IEditingSelectedPeopleItemStyles = {
    val __obj = js.Dynamic.literal()
    if (input != null) __obj.updateDynamic("input")(input.asInstanceOf[js.Any])
    if (root != null) __obj.updateDynamic("root")(root.asInstanceOf[js.Any])
    __obj.asInstanceOf[IEditingSelectedPeopleItemStyles]
  }
}

