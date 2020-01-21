package typings.ngTable.groupSettingsMod

import typings.ngTable.sortingMod.SortDirection
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IGroupSettings extends js.Object {
  /**
    * The default sort direction that will be used whenever a group is supplied that
    * does not define its own sort direction
    */
  var defaultSort: js.UndefOr[SortDirection] = js.undefined
  /**
    * Determines whether groups should be displayed expanded to show their items. Defaults to true
    */
  var isExpanded: js.UndefOr[Boolean] = js.undefined
}

object IGroupSettings {
  @scala.inline
  def apply(defaultSort: SortDirection = null, isExpanded: js.UndefOr[Boolean] = js.undefined): IGroupSettings = {
    val __obj = js.Dynamic.literal()
    if (defaultSort != null) __obj.updateDynamic("defaultSort")(defaultSort.asInstanceOf[js.Any])
    if (!js.isUndefined(isExpanded)) __obj.updateDynamic("isExpanded")(isExpanded.asInstanceOf[js.Any])
    __obj.asInstanceOf[IGroupSettings]
  }
}

