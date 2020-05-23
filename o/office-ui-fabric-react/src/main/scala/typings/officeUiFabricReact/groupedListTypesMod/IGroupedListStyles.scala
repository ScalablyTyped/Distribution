package typings.officeUiFabricReact.groupedListTypesMod

import typings.uifabricMergeStyles.istyleMod.IStyle
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IGroupedListStyles extends js.Object {
  var group: IStyle
  var groupIsDropping: IStyle
  var root: IStyle
}

object IGroupedListStyles {
  @scala.inline
  def apply(
    group: js.UndefOr[Null | IStyle] = js.undefined,
    groupIsDropping: js.UndefOr[Null | IStyle] = js.undefined,
    root: js.UndefOr[Null | IStyle] = js.undefined
  ): IGroupedListStyles = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(group)) __obj.updateDynamic("group")(group.asInstanceOf[js.Any])
    if (!js.isUndefined(groupIsDropping)) __obj.updateDynamic("groupIsDropping")(groupIsDropping.asInstanceOf[js.Any])
    if (!js.isUndefined(root)) __obj.updateDynamic("root")(root.asInstanceOf[js.Any])
    __obj.asInstanceOf[IGroupedListStyles]
  }
}

