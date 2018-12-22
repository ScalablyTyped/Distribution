package typings
package officeDashJsDashPreviewLib.ExcelNs.InterfacesNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
         *
         * Represents a collection of all the PivotTables that are part of the workbook or worksheet.
         *
         * [Api set: ExcelApi 1.8]
         */

trait PivotFieldCollectionLoadOptions extends js.Object {
  @JSName("$all")
  var $all: js.UndefOr[scala.Boolean] = js.undefined
  /**
               *
               * For EACH ITEM in the collection: Id of the PivotField.
               *
               * [Api set: ExcelApi 1.8]
               */
  var id: js.UndefOr[scala.Boolean] = js.undefined
  /**
               *
               * For EACH ITEM in the collection: Name of the PivotField.
               *
               * [Api set: ExcelApi 1.8]
               */
  var name: js.UndefOr[scala.Boolean] = js.undefined
  /**
               *
               * For EACH ITEM in the collection: Determines whether to show all items of the PivotField.
               *
               * [Api set: ExcelApi 1.8]
               */
  var showAllItems: js.UndefOr[scala.Boolean] = js.undefined
  /**
               *
               * For EACH ITEM in the collection: Subtotals of the PivotField.
               *
               * [Api set: ExcelApi 1.8]
               */
  var subtotals: js.UndefOr[scala.Boolean] = js.undefined
}

