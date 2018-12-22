package typings
package officeDashJsDashPreviewLib.ExcelNs.InterfacesNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** An interface for updating data on the PivotItem object, for use in "pivotItem.set({ ... })". */

trait PivotItemUpdateData extends js.Object {
  /**
               *
               * Determines whether the item is expanded to show child items or if it's collapsed and child items are hidden.
               *
               * [Api set: ExcelApi 1.8]
               */
  var isExpanded: js.UndefOr[scala.Boolean] = js.undefined
  /**
               *
               * Name of the PivotItem.
               *
               * [Api set: ExcelApi 1.8]
               */
  var name: js.UndefOr[java.lang.String] = js.undefined
  /**
               *
               * Determines whether the PivotItem is visible or not.
               *
               * [Api set: ExcelApi 1.8]
               */
  var visible: js.UndefOr[scala.Boolean] = js.undefined
}

