package typings
package ngDashTableLib.srcCoreGroupingGroupSettingsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IGroupSettings extends js.Object {
  /**
    * The default sort direction that will be used whenever a group is supplied that
    * does not define its own sort direction
    */
  var defaultSort: js.UndefOr[ngDashTableLib.srcCoreSortingMod.SortDirection] = js.undefined
  /**
    * Determines whether groups should be displayed expanded to show their items. Defaults to true
    */
  var isExpanded: js.UndefOr[scala.Boolean] = js.undefined
}

