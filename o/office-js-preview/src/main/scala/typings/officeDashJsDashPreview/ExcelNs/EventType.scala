package typings.officeDashJsDashPreview.ExcelNs

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
  
  /* "AgaveVisualUpdate" */ val agaveVisualUpdate: typings.officeDashJsDashPreview.ExcelNs.EventType.agaveVisualUpdate with String = js.native
  /* "ChartActivated" */ val chartActivated: typings.officeDashJsDashPreview.ExcelNs.EventType.chartActivated with String = js.native
  /* "ChartAdded" */ val chartAdded: typings.officeDashJsDashPreview.ExcelNs.EventType.chartAdded with String = js.native
  /* "ChartDeactivated" */ val chartDeactivated: typings.officeDashJsDashPreview.ExcelNs.EventType.chartDeactivated with String = js.native
  /* "ChartDeleted" */ val chartDeleted: typings.officeDashJsDashPreview.ExcelNs.EventType.chartDeleted with String = js.native
  /* "RibbonCommandExecuted" */ val ribbonCommandExecuted: typings.officeDashJsDashPreview.ExcelNs.EventType.ribbonCommandExecuted with String = js.native
  /* "ShapeActivated" */ val shapeActivated: typings.officeDashJsDashPreview.ExcelNs.EventType.shapeActivated with String = js.native
  /* "ShapeDeactivated" */ val shapeDeactivated: typings.officeDashJsDashPreview.ExcelNs.EventType.shapeDeactivated with String = js.native
  /* "TableAdded" */ val tableAdded: typings.officeDashJsDashPreview.ExcelNs.EventType.tableAdded with String = js.native
  /* "TableChanged" */ val tableChanged: typings.officeDashJsDashPreview.ExcelNs.EventType.tableChanged with String = js.native
  /* "TableDeleted" */ val tableDeleted: typings.officeDashJsDashPreview.ExcelNs.EventType.tableDeleted with String = js.native
  /* "TableFiltered" */ val tableFiltered: typings.officeDashJsDashPreview.ExcelNs.EventType.tableFiltered with String = js.native
  /* "TableSelectionChanged" */ val tableSelectionChanged: typings.officeDashJsDashPreview.ExcelNs.EventType.tableSelectionChanged with String = js.native
  /* "VisualChange" */ val visualChange: typings.officeDashJsDashPreview.ExcelNs.EventType.visualChange with String = js.native
  /* "VisualSelectionChanged" */ val visualSelectionChanged: typings.officeDashJsDashPreview.ExcelNs.EventType.visualSelectionChanged with String = js.native
  /* "WACOperationEvent" */ val wacoperationEvent: typings.officeDashJsDashPreview.ExcelNs.EventType.wacoperationEvent with String = js.native
  /* "WorkbookAutoSaveSettingChanged" */ val workbookAutoSaveSettingChanged: typings.officeDashJsDashPreview.ExcelNs.EventType.workbookAutoSaveSettingChanged with String = js.native
  /* "WorksheetActivated" */ val worksheetActivated: typings.officeDashJsDashPreview.ExcelNs.EventType.worksheetActivated with String = js.native
  /* "WorksheetAdded" */ val worksheetAdded: typings.officeDashJsDashPreview.ExcelNs.EventType.worksheetAdded with String = js.native
  /* "WorksheetCalculated" */ val worksheetCalculated: typings.officeDashJsDashPreview.ExcelNs.EventType.worksheetCalculated with String = js.native
  /* "WorksheetChanged" */ val worksheetChanged: typings.officeDashJsDashPreview.ExcelNs.EventType.worksheetChanged with String = js.native
  /* "WorksheetColumnSorted" */ val worksheetColumnSorted: typings.officeDashJsDashPreview.ExcelNs.EventType.worksheetColumnSorted with String = js.native
  /* "WorksheetDeactivated" */ val worksheetDeactivated: typings.officeDashJsDashPreview.ExcelNs.EventType.worksheetDeactivated with String = js.native
  /* "WorksheetDeleted" */ val worksheetDeleted: typings.officeDashJsDashPreview.ExcelNs.EventType.worksheetDeleted with String = js.native
  /* "WorksheetFiltered" */ val worksheetFiltered: typings.officeDashJsDashPreview.ExcelNs.EventType.worksheetFiltered with String = js.native
  /* "WorksheetFormatChanged" */ val worksheetFormatChanged: typings.officeDashJsDashPreview.ExcelNs.EventType.worksheetFormatChanged with String = js.native
  /* "WorksheetRowHiddenChanged" */ val worksheetRowHiddenChanged: typings.officeDashJsDashPreview.ExcelNs.EventType.worksheetRowHiddenChanged with String = js.native
  /* "WorksheetRowSorted" */ val worksheetRowSorted: typings.officeDashJsDashPreview.ExcelNs.EventType.worksheetRowSorted with String = js.native
  /* "WorksheetSelectionChanged" */ val worksheetSelectionChanged: typings.officeDashJsDashPreview.ExcelNs.EventType.worksheetSelectionChanged with String = js.native
  /* "WorksheetSingleClicked" */ val worksheetSingleClicked: typings.officeDashJsDashPreview.ExcelNs.EventType.worksheetSingleClicked with String = js.native
  @JSBracketAccess
  def apply(value: String): js.UndefOr[EventType with String] = js.native
}

