package typings
package officeDashJsLib.ExcelNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * [Api set: ExcelApi 1.7]
  */
@JSGlobal("Excel.WorksheetFreezePanes")
@js.native
class WorksheetFreezePanes ()
  extends officeDashJsLib.OfficeExtensionNs.ClientObject {
  def freezeAt(frozenRange: java.lang.String): scala.Unit = js.native
  /**
    *
    * Sets the frozen cells in the active worksheet view.
    The range provided corresponds to cells that will be frozen in the top- and left-most pane.
    *
    * [Api set: ExcelApi 1.7]
    *
    * @param frozenRange A range that represents the cells to be frozen, or null to remove all frozen panes.
    */
  def freezeAt(frozenRange: Range): scala.Unit = js.native
  /**
    *
    * Freeze the first column(s) of the worksheet in place.
    *
    * [Api set: ExcelApi 1.7]
    *
    * @param count Optional number of columns to freeze, or zero to unfreeze all columns
    */
  def freezeColumns(): scala.Unit = js.native
  def freezeColumns(count: scala.Double): scala.Unit = js.native
  /**
    *
    * Freeze the top row(s) of the worksheet in place.
    *
    * [Api set: ExcelApi 1.7]
    *
    * @param count Optional number of rows to freeze, or zero to unfreeze all rows
    */
  def freezeRows(): scala.Unit = js.native
  def freezeRows(count: scala.Double): scala.Unit = js.native
  /**
    *
    * Gets a range that describes the frozen cells in the active worksheet view.
    The frozen range is corresponds to cells that are frozen in the top- and left-most pane.
    *
    * [Api set: ExcelApi 1.7]
    */
  def getLocation(): Range = js.native
  /**
    *
    * Gets a range that describes the frozen cells in the active worksheet view.
    The frozen range is corresponds to cells that are frozen in the top- and left-most pane.
    If there is no frozen pane, returns a null object.
    *
    * [Api set: ExcelApi 1.7]
    */
  def getLocationOrNullObject(): Range = js.native
  def toJSON(): org.scalablytyped.runtime.StringDictionary[java.lang.String] = js.native
  /**
    *
    * Removes all frozen panes in the worksheet.
    *
    * [Api set: ExcelApi 1.7]
    */
  def unfreeze(): scala.Unit = js.native
}

