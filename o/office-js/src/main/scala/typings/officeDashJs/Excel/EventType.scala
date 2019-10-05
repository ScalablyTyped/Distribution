package typings.officeDashJs.Excel

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
  sealed trait agaveVisualUpdate extends EventType
  
  /**
    *
    * ChartActivated represents the type of event registered on Chart or ChartCollection, and occurs when chart activates.
    *
    */
  @js.native
  sealed trait chartActivated extends EventType
  
  /**
    *
    * ChartAdded represents the type of event registered on ChartCollection, and occurs when a new chart is added to the worksheet.
    *
    */
  @js.native
  sealed trait chartAdded extends EventType
  
  /**
    *
    * ChartDeactivated represents the type of event registered on Chart or ChartCollection, and occurs when chart deactivates.
    *
    */
  @js.native
  sealed trait chartDeactivated extends EventType
  
  /**
    *
    * ChartDeleted represents the type of event registered on ChartCollection, and occurs when a chart is deleted from the worksheet.
    *
    */
  @js.native
  sealed trait chartDeleted extends EventType
  
  /**
    *
    * RibbonCommandExecuted represents the type of event registered on ribbon, and occurs when user click on ribbon
    *
    */
  @js.native
  sealed trait ribbonCommandExecuted extends EventType
  
  /**
    *
    * ShapeActivated represents the type of event that is registered on Shape, and occurs when shape activates.
    *
    */
  @js.native
  sealed trait shapeActivated extends EventType
  
  /**
    *
    * ShapeDeactivated represents the type of event that is registered on Shape, and occurs when shape deactivates.
    *
    */
  @js.native
  sealed trait shapeDeactivated extends EventType
  
  /**
    *
    * TableAdded represents the type of event registered on TableCollection, and occurs when a table is added.
    *
    */
  @js.native
  sealed trait tableAdded extends EventType
  
  /**
    *
    * TableChanged represents the type of event registered on Table, and occurs when data changes.
    *
    */
  @js.native
  sealed trait tableChanged extends EventType
  
  /**
    *
    * TableDeleted represents the type of event that is registered on TableCollection, and occurs when a table is deleted.
    *
    */
  @js.native
  sealed trait tableDeleted extends EventType
  
  /**
    *
    * TableFiltered represents the type of event registered on table or TableCollection, and occurs when data of table is filtered.
    *
    */
  @js.native
  sealed trait tableFiltered extends EventType
  
  /**
    *
    * TableSelectionChanged represents the type of event registered on Table, and occurs when selection changes.
    *
    */
  @js.native
  sealed trait tableSelectionChanged extends EventType
  
  /**
    *
    * VisualChange represents the type of event registered on Visual, and occurs when there is a visual change.
    *
    */
  @js.native
  sealed trait visualChange extends EventType
  
  /**
    *
    * VisualSelectionChanged represents the type of event registered on VisualCollection, and occurs when visual selection changes.
    *
    */
  @js.native
  sealed trait visualSelectionChanged extends EventType
  
  @js.native
  sealed trait wacoperationEvent extends EventType
  
  /**
    *
    * WorkbookAutoSaveSettingChanged represents the type of event registered on workbook, and occurs when there is an auto save setting change.
    *
    */
  @js.native
  sealed trait workbookAutoSaveSettingChanged extends EventType
  
  /**
    *
    * WorksheetActivated represents the type of event registered on Worksheet or WorksheetCollection, and occurs when worksheet activates.
    *
    */
  @js.native
  sealed trait worksheetActivated extends EventType
  
  /**
    *
    * WorksheetAdded represents the type of event registered on WorksheetCollection, and occurs when a new worksheet is added to the workbook.
    *
    */
  @js.native
  sealed trait worksheetAdded extends EventType
  
  /**
    *
    * WorksheetCalculated represents the type of event registered on Worksheet or WorksheetCollection, and occurs when a worksheet is calculated.
    *
    */
  @js.native
  sealed trait worksheetCalculated extends EventType
  
  /**
    *
    * WorksheetChanged represents the type of event registered on Worksheet or WorksheetCollection, and occurs when data changes.
    *
    */
  @js.native
  sealed trait worksheetChanged extends EventType
  
  /**
    *
    * WorksheetColumnSorted represents the type of event registered on worksheet, and occurs when there is a sorting on columns happened.
    *
    */
  @js.native
  sealed trait worksheetColumnSorted extends EventType
  
  /**
    *
    * WorksheetDeactivated represents the type of event registered on Worksheet or WorksheetCollection, and occurs when worksheet deactivates.
    *
    */
  @js.native
  sealed trait worksheetDeactivated extends EventType
  
  /**
    *
    * WorksheetDeleted represents the type of event registered on WorksheetCollection, and occurs when a worksheet is deleted from the workbook.
    *
    */
  @js.native
  sealed trait worksheetDeleted extends EventType
  
  /**
    *
    * WorksheetFiltered represents the type of event registered on worksheet or WorksheetCollection, and occurs when data of autofilter in the worksheet is filtered.
    *
    */
  @js.native
  sealed trait worksheetFiltered extends EventType
  
  /**
    *
    * WorksheetFormatChanged represents the type of event registered on worksheet, and occurs when there is a format changed.
    *
    */
  @js.native
  sealed trait worksheetFormatChanged extends EventType
  
  /**
    *
    * WorksheetRowHiddenChanged represents the type of event registered on worksheet, and occurs when a row's hidden state is changed.
    *
    */
  @js.native
  sealed trait worksheetRowHiddenChanged extends EventType
  
  /**
    *
    * WorksheetRowSorted represents the type of event registered on worksheet, and occurs when there is a sorting on rows happened.
    *
    */
  @js.native
  sealed trait worksheetRowSorted extends EventType
  
  /**
    *
    * WorksheetSelectionChanged represents the type of event registered on Worksheet, and occurs when selection changes.
    *
    */
  @js.native
  sealed trait worksheetSelectionChanged extends EventType
  
  /**
    *
    * WorksheetSingleClicked represents the type of event registered on worksheet, and occurs when cell is left-clicked/tapped.
    *
    */
  @js.native
  sealed trait worksheetSingleClicked extends EventType
  
  /* "AgaveVisualUpdate" */ val agaveVisualUpdate: typings.officeDashJs.Excel.EventType.agaveVisualUpdate with String = js.native
  /* "ChartActivated" */ val chartActivated: typings.officeDashJs.Excel.EventType.chartActivated with String = js.native
  /* "ChartAdded" */ val chartAdded: typings.officeDashJs.Excel.EventType.chartAdded with String = js.native
  /* "ChartDeactivated" */ val chartDeactivated: typings.officeDashJs.Excel.EventType.chartDeactivated with String = js.native
  /* "ChartDeleted" */ val chartDeleted: typings.officeDashJs.Excel.EventType.chartDeleted with String = js.native
  /* "RibbonCommandExecuted" */ val ribbonCommandExecuted: typings.officeDashJs.Excel.EventType.ribbonCommandExecuted with String = js.native
  /* "ShapeActivated" */ val shapeActivated: typings.officeDashJs.Excel.EventType.shapeActivated with String = js.native
  /* "ShapeDeactivated" */ val shapeDeactivated: typings.officeDashJs.Excel.EventType.shapeDeactivated with String = js.native
  /* "TableAdded" */ val tableAdded: typings.officeDashJs.Excel.EventType.tableAdded with String = js.native
  /* "TableChanged" */ val tableChanged: typings.officeDashJs.Excel.EventType.tableChanged with String = js.native
  /* "TableDeleted" */ val tableDeleted: typings.officeDashJs.Excel.EventType.tableDeleted with String = js.native
  /* "TableFiltered" */ val tableFiltered: typings.officeDashJs.Excel.EventType.tableFiltered with String = js.native
  /* "TableSelectionChanged" */ val tableSelectionChanged: typings.officeDashJs.Excel.EventType.tableSelectionChanged with String = js.native
  /* "VisualChange" */ val visualChange: typings.officeDashJs.Excel.EventType.visualChange with String = js.native
  /* "VisualSelectionChanged" */ val visualSelectionChanged: typings.officeDashJs.Excel.EventType.visualSelectionChanged with String = js.native
  /* "WACOperationEvent" */ val wacoperationEvent: typings.officeDashJs.Excel.EventType.wacoperationEvent with String = js.native
  /* "WorkbookAutoSaveSettingChanged" */ val workbookAutoSaveSettingChanged: typings.officeDashJs.Excel.EventType.workbookAutoSaveSettingChanged with String = js.native
  /* "WorksheetActivated" */ val worksheetActivated: typings.officeDashJs.Excel.EventType.worksheetActivated with String = js.native
  /* "WorksheetAdded" */ val worksheetAdded: typings.officeDashJs.Excel.EventType.worksheetAdded with String = js.native
  /* "WorksheetCalculated" */ val worksheetCalculated: typings.officeDashJs.Excel.EventType.worksheetCalculated with String = js.native
  /* "WorksheetChanged" */ val worksheetChanged: typings.officeDashJs.Excel.EventType.worksheetChanged with String = js.native
  /* "WorksheetColumnSorted" */ val worksheetColumnSorted: typings.officeDashJs.Excel.EventType.worksheetColumnSorted with String = js.native
  /* "WorksheetDeactivated" */ val worksheetDeactivated: typings.officeDashJs.Excel.EventType.worksheetDeactivated with String = js.native
  /* "WorksheetDeleted" */ val worksheetDeleted: typings.officeDashJs.Excel.EventType.worksheetDeleted with String = js.native
  /* "WorksheetFiltered" */ val worksheetFiltered: typings.officeDashJs.Excel.EventType.worksheetFiltered with String = js.native
  /* "WorksheetFormatChanged" */ val worksheetFormatChanged: typings.officeDashJs.Excel.EventType.worksheetFormatChanged with String = js.native
  /* "WorksheetRowHiddenChanged" */ val worksheetRowHiddenChanged: typings.officeDashJs.Excel.EventType.worksheetRowHiddenChanged with String = js.native
  /* "WorksheetRowSorted" */ val worksheetRowSorted: typings.officeDashJs.Excel.EventType.worksheetRowSorted with String = js.native
  /* "WorksheetSelectionChanged" */ val worksheetSelectionChanged: typings.officeDashJs.Excel.EventType.worksheetSelectionChanged with String = js.native
  /* "WorksheetSingleClicked" */ val worksheetSingleClicked: typings.officeDashJs.Excel.EventType.worksheetSingleClicked with String = js.native
  @JSBracketAccess
  def apply(value: String): js.UndefOr[EventType with String] = js.native
}

