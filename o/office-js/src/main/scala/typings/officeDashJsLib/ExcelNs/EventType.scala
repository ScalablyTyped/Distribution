package typings
package officeDashJsLib.ExcelNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait EventType extends js.Object

/**
  * [Api set: ExcelApi 1.7]
  */
@JSGlobal("Excel.EventType")
@js.native
object EventType extends js.Object {
  /**
    *
    * AgaveVisualUpdate represents the type of an event that is associated with an agave visual, and carries a new data view following a data change
    *
    */
  @js.native
  sealed trait agaveVisualUpdate
    extends officeDashJsLib.ExcelNs.EventType
  
  /**
    *
    * ChartActivated represents the type of event registered on Chart or ChartCollection, and occurs when chart activates.
    *
    */
  @js.native
  sealed trait chartActivated
    extends officeDashJsLib.ExcelNs.EventType
  
  /**
    *
    * ChartAdded represents the type of event registered on ChartCollection, and occurs when a new chart is added to the worksheet.
    *
    */
  @js.native
  sealed trait chartAdded
    extends officeDashJsLib.ExcelNs.EventType
  
  /**
    *
    * ChartDeactivated represents the type of event registered on Chart or ChartCollection, and occurs when chart deactivates.
    *
    */
  @js.native
  sealed trait chartDeactivated
    extends officeDashJsLib.ExcelNs.EventType
  
  /**
    *
    * ChartDeleted represents the type of event registered on ChartCollection, and occurs when a chart is deleted from the worksheet.
    *
    */
  @js.native
  sealed trait chartDeleted
    extends officeDashJsLib.ExcelNs.EventType
  
  /**
    *
    * ShapeActivated represents the type of event that is registered on Shape, and occurs when shape activates.
    *
    */
  @js.native
  sealed trait shapeActivated
    extends officeDashJsLib.ExcelNs.EventType
  
  /**
    *
    * ShapeDeactivated represents the type of event that is registered on Shape, and occurs when shape deactivates.
    *
    */
  @js.native
  sealed trait shapeDeactivated
    extends officeDashJsLib.ExcelNs.EventType
  
  /**
    *
    * TableAdded represents the type of event registered on TableCollection, and occurs when a table is added.
    *
    */
  @js.native
  sealed trait tableAdded
    extends officeDashJsLib.ExcelNs.EventType
  
  /**
    *
    * TableChanged represents the type of event registered on Table, and occurs when data changes.
    *
    */
  @js.native
  sealed trait tableChanged
    extends officeDashJsLib.ExcelNs.EventType
  
  /**
    *
    * TableDeleted represents the type of event that is registered on TableCollection, and occurs when a table is deleted.
    *
    */
  @js.native
  sealed trait tableDeleted
    extends officeDashJsLib.ExcelNs.EventType
  
  /**
    *
    * TableFiltered represents the type of event registered on table or TableCollection, and occurs when data of table is filtered.
    *
    */
  @js.native
  sealed trait tableFiltered
    extends officeDashJsLib.ExcelNs.EventType
  
  /**
    *
    * TableSelectionChanged represents the type of event registered on Table, and occurs when selection changes.
    *
    */
  @js.native
  sealed trait tableSelectionChanged
    extends officeDashJsLib.ExcelNs.EventType
  
  /**
    *
    * VisualChange represents the type of event registered on Visual, and occurs when there is a visual change.
    *
    */
  @js.native
  sealed trait visualChange
    extends officeDashJsLib.ExcelNs.EventType
  
  /**
    *
    * VisualSelectionChanged represents the type of event registered on VisualCollection, and occurs when visual selection changes.
    *
    */
  @js.native
  sealed trait visualSelectionChanged
    extends officeDashJsLib.ExcelNs.EventType
  
  /**
    *
    * WorkbookAutoSaveSettingChanged represents the type of event registered on workbook, and occurs when there is an auto save setting change.
    *
    */
  @js.native
  sealed trait workbookAutoSaveSettingChanged
    extends officeDashJsLib.ExcelNs.EventType
  
  /**
    *
    * WorksheetActivated represents the type of event registered on Worksheet or WorksheetCollection, and occurs when worksheet activates.
    *
    */
  @js.native
  sealed trait worksheetActivated
    extends officeDashJsLib.ExcelNs.EventType
  
  /**
    *
    * WorksheetAdded represents the type of event registered on WorksheetCollection, and occurs when a new worksheet is added to the workbook.
    *
    */
  @js.native
  sealed trait worksheetAdded
    extends officeDashJsLib.ExcelNs.EventType
  
  /**
    *
    * WorksheetCalculated represents the type of event registered on Worksheet or WorksheetCollection, and occurs when a worksheet is calculated.
    *
    */
  @js.native
  sealed trait worksheetCalculated
    extends officeDashJsLib.ExcelNs.EventType
  
  /**
    *
    * WorksheetChanged represents the type of event registered on Worksheet or WorksheetCollection, and occurs when data changes.
    *
    */
  @js.native
  sealed trait worksheetChanged
    extends officeDashJsLib.ExcelNs.EventType
  
  /**
    *
    * WorksheetDeactivated represents the type of event registered on Worksheet or WorksheetCollection, and occurs when worksheet deactivates.
    *
    */
  @js.native
  sealed trait worksheetDeactivated
    extends officeDashJsLib.ExcelNs.EventType
  
  /**
    *
    * WorksheetDeleted represents the type of event registered on WorksheetCollection, and occurs when a worksheet is deleted from the workbook.
    *
    */
  @js.native
  sealed trait worksheetDeleted
    extends officeDashJsLib.ExcelNs.EventType
  
  /**
    *
    * WorksheetFiltered represents the type of event registered on worksheet or WorksheetCollection, and occurs when data of autofilter in the worksheet is filtered.
    *
    */
  @js.native
  sealed trait worksheetFiltered
    extends officeDashJsLib.ExcelNs.EventType
  
  /**
    *
    * WorksheetFormatChanged represents the type of event registered on worksheet, and occurs when there is a format changed.
    *
    */
  @js.native
  sealed trait worksheetFormatChanged
    extends officeDashJsLib.ExcelNs.EventType
  
  /**
    *
    * WorksheetSelectionChanged represents the type of event registered on Worksheet, and occurs when selection changes.
    *
    */
  @js.native
  sealed trait worksheetSelectionChanged
    extends officeDashJsLib.ExcelNs.EventType
  
  /* "AgaveVisualUpdate" */ val agaveVisualUpdate: agaveVisualUpdate with java.lang.String = js.native
  /* "ChartActivated" */ val chartActivated: chartActivated with java.lang.String = js.native
  /* "ChartAdded" */ val chartAdded: chartAdded with java.lang.String = js.native
  /* "ChartDeactivated" */ val chartDeactivated: chartDeactivated with java.lang.String = js.native
  /* "ChartDeleted" */ val chartDeleted: chartDeleted with java.lang.String = js.native
  /* "ShapeActivated" */ val shapeActivated: shapeActivated with java.lang.String = js.native
  /* "ShapeDeactivated" */ val shapeDeactivated: shapeDeactivated with java.lang.String = js.native
  /* "TableAdded" */ val tableAdded: tableAdded with java.lang.String = js.native
  /* "TableChanged" */ val tableChanged: tableChanged with java.lang.String = js.native
  /* "TableDeleted" */ val tableDeleted: tableDeleted with java.lang.String = js.native
  /* "TableFiltered" */ val tableFiltered: tableFiltered with java.lang.String = js.native
  /* "TableSelectionChanged" */ val tableSelectionChanged: tableSelectionChanged with java.lang.String = js.native
  /* "VisualChange" */ val visualChange: visualChange with java.lang.String = js.native
  /* "VisualSelectionChanged" */ val visualSelectionChanged: visualSelectionChanged with java.lang.String = js.native
  /* "WorkbookAutoSaveSettingChanged" */ val workbookAutoSaveSettingChanged: workbookAutoSaveSettingChanged with java.lang.String = js.native
  /* "WorksheetActivated" */ val worksheetActivated: worksheetActivated with java.lang.String = js.native
  /* "WorksheetAdded" */ val worksheetAdded: worksheetAdded with java.lang.String = js.native
  /* "WorksheetCalculated" */ val worksheetCalculated: worksheetCalculated with java.lang.String = js.native
  /* "WorksheetChanged" */ val worksheetChanged: worksheetChanged with java.lang.String = js.native
  /* "WorksheetDeactivated" */ val worksheetDeactivated: worksheetDeactivated with java.lang.String = js.native
  /* "WorksheetDeleted" */ val worksheetDeleted: worksheetDeleted with java.lang.String = js.native
  /* "WorksheetFiltered" */ val worksheetFiltered: worksheetFiltered with java.lang.String = js.native
  /* "WorksheetFormatChanged" */ val worksheetFormatChanged: worksheetFormatChanged with java.lang.String = js.native
  /* "WorksheetSelectionChanged" */ val worksheetSelectionChanged: worksheetSelectionChanged with java.lang.String = js.native
  @JSBracketAccess
  def apply(value: java.lang.String): js.UndefOr[officeDashJsLib.ExcelNs.EventType with java.lang.String] = js.native
}

