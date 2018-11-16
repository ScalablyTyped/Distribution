package typings
package officeDashJsLib.ExcelNs.InterfacesNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** An interface describing the data returned by calling "pivotItem.toJSON()". */

trait PivotItemData extends js.Object {
  /**
               *
               * Id of the PivotItem.
               *
               * [Api set: ExcelApi 1.8]
               */
  var id: js.UndefOr[java.lang.String] = js.undefined
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

