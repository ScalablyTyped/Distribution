package typings
package officeDashJsLib.ExcelNs.InterfacesNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
         *
         * Represents a collection of all the PivotTables that are part of the workbook or worksheet.
         *
         * [Api set: ExcelApi 1.3]
         */

trait PivotTableCollectionLoadOptions extends js.Object {
  @JSName("$all")
  var $all: js.UndefOr[scala.Boolean] = js.undefined
  /**
               *
               * For EACH ITEM in the collection: Id of the PivotTable. Read-only.
               *
               * [Api set: ExcelApi 1.5]
               */
  var id: js.UndefOr[scala.Boolean] = js.undefined
  /**
              *
              * For EACH ITEM in the collection: The PivotLayout describing the layout and visual structure of the PivotTable.
              *
              * [Api set: ExcelApi 1.8]
              */
  var layout: js.UndefOr[PivotLayoutLoadOptions] = js.undefined
  /**
               *
               * For EACH ITEM in the collection: Name of the PivotTable.
               *
               * [Api set: ExcelApi 1.3]
               */
  var name: js.UndefOr[scala.Boolean] = js.undefined
  /**
              *
              * For EACH ITEM in the collection: The worksheet containing the current PivotTable.
              *
              * [Api set: ExcelApi 1.3]
              */
  var worksheet: js.UndefOr[WorksheetLoadOptions] = js.undefined
}

