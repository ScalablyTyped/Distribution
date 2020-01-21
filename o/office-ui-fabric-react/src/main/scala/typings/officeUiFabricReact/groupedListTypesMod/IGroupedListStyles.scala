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
  def apply(group: IStyle = null, groupIsDropping: IStyle = null, root: IStyle = null): IGroupedListStyles = {
    val __obj = js.Dynamic.literal()
    if (group != null) __obj.updateDynamic("group")(group.asInstanceOf[js.Any])
    if (groupIsDropping != null) __obj.updateDynamic("groupIsDropping")(groupIsDropping.asInstanceOf[js.Any])
    if (root != null) __obj.updateDynamic("root")(root.asInstanceOf[js.Any])
    __obj.asInstanceOf[IGroupedListStyles]
  }
}

