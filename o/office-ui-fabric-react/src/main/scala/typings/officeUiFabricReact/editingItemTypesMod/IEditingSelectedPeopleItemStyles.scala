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
  def apply(input: js.UndefOr[Null | IStyle] = js.undefined, root: js.UndefOr[Null | IStyle] = js.undefined): IEditingSelectedPeopleItemStyles = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(input)) __obj.updateDynamic("input")(input.asInstanceOf[js.Any])
    if (!js.isUndefined(root)) __obj.updateDynamic("root")(root.asInstanceOf[js.Any])
    __obj.asInstanceOf[IEditingSelectedPeopleItemStyles]
  }
}

