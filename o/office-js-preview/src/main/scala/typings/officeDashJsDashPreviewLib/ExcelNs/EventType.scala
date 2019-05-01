package typings
package officeDashJsDashPreviewLib.ExcelNs

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
    extends officeDashJsDashPreviewLib.ExcelNs.EventType
  
  /**
    *
    * ChartActivated represents the type of event registered on Chart or ChartCollection, and occurs when chart activates.
    *
    */
  @js.native
  sealed trait chartActivated
    extends officeDashJsDashPreviewLib.ExcelNs.EventType
  
  /**
    *
    * ChartAdded represents the type of event registered on ChartCollection, and occurs when a new chart is added to the worksheet.
    *
    */
  @js.native
  sealed trait chartAdded
    extends officeDashJsDashPreviewLib.ExcelNs.EventType
  
  /**
    *
    * ChartDeactivated represents the type of event registered on Chart or ChartCollection, and occurs when chart deactivates.
    *
    */
  @js.native
  sealed trait chartDeactivated
    extends officeDashJsDashPreviewLib.ExcelNs.EventType
  
  /**
    *
    * ChartDeleted represents the type of event registered on ChartCollection, and occurs when a chart is deleted from the worksheet.
    *
    */
  @js.native
  sealed trait chartDeleted
    extends officeDashJsDashPreviewLib.ExcelNs.EventType
  
  /**
    *
    * RibbonCommandExecuted represents the type of event registered on ribbon, and occurs when user click on ribbon
    *
    */
  @js.native
  sealed trait ribbonCommandExecuted
    extends officeDashJsDashPreviewLib.ExcelNs.EventType
  
  /**
    *
    * ShapeActivated represents the type of event that is registered on Shape, and occurs when shape activates.
    *
    */
  @js.native
  sealed trait shapeActivated
    extends officeDashJsDashPreviewLib.ExcelNs.EventType
  
  /**
    *
    * ShapeDeactivated represents the type of event that is registered on Shape, and occurs when shape deactivates.
    *
    */
  @js.native
  sealed trait shapeDeactivated
    extends officeDashJsDashPreviewLib.ExcelNs.EventType
  
  /**
    *
    * TableAdded represents the type of event registered on TableCollection, and occurs when a table is added.
    *
    */
  @js.native
  sealed trait tableAdded
    extends officeDashJsDashPreviewLib.ExcelNs.EventType
  
  /**
    *
    * TableChanged represents the type of event registered on Table, and occurs when data changes.
    *
    */
  @js.native
  sealed trait tableChanged
    extends officeDashJsDashPreviewLib.ExcelNs.EventType
  
  /**
    *
    * TableDeleted represents the type of event that is registered on TableCollection, and occurs when a table is deleted.
    *
    */
  @js.native
  sealed trait tableDeleted
    extends officeDashJsDashPreviewLib.ExcelNs.EventType
  
  /**
    *
    * TableFiltered represents the type of event registered on table or TableCollection, and occurs when data of table is filtered.
    *
    */
  @js.native
  sealed trait tableFiltered
    extends officeDashJsDashPreviewLib.ExcelNs.EventType
  
  /**
    *
    * TableSelectionChanged represents the type of event registered on Table, and occurs when selection changes.
    *
    */
  @js.native
  sealed trait tableSelectionChanged
    extends officeDashJsDashPreviewLib.ExcelNs.EventType
  
  /**
    *
    * VisualChange represents the type of event registered on Visual, and occurs when there is a visual change.
    *
    */
  @js.native
  sealed trait visualChange
    extends officeDashJsDashPreviewLib.ExcelNs.EventType
  
  /**
    *
    * VisualSelectionChanged represents the type of event registered on VisualCollection, and occurs when visual selection changes.
    *
    */
  @js.native
  sealed trait visualSelectionChanged
    extends officeDashJsDashPreviewLib.ExcelNs.EventType
  
  @js.native
  sealed trait wacoperationEvent
    extends officeDashJsDashPreviewLib.ExcelNs.EventType
  
  /**
    *
    * WorkbookAutoSaveSettingChanged represents the type of event registered on workbook, and occurs when there is an auto save setting change.
    *
    */
  @js.native
  sealed trait workbookAutoSaveSettingChanged
    extends officeDashJsDashPreviewLib.ExcelNs.EventType
  
  /**
    *
    * WorksheetActivated represents the type of event registered on Worksheet or WorksheetCollection, and occurs when worksheet activates.
    *
    */
  @js.native
  sealed trait worksheetActivated
    extends officeDashJsDashPreviewLib.ExcelNs.EventType
  
  /**
    *
    * WorksheetAdded represents the type of event registered on WorksheetCollection, and occurs when a new worksheet is added to the workbook.
    *
    */
  @js.native
  sealed trait worksheetAdded
    extends officeDashJsDashPreviewLib.ExcelNs.EventType
  
  /**
    *
    * WorksheetCalculated represents the type of event registered on Worksheet or WorksheetCollection, and occurs when a worksheet is calculated.
    *
    */
  @js.native
  sealed trait worksheetCalculated
    extends officeDashJsDashPreviewLib.ExcelNs.EventType
  
  /**
    *
    * WorksheetChanged represents the type of event registered on Worksheet or WorksheetCollection, and occurs when data changes.
    *
    */
  @js.native
  sealed trait worksheetChanged
    extends officeDashJsDashPreviewLib.ExcelNs.EventType
  
  /**
    *
    * WorksheetColumnSorted represents the type of event registered on worksheet, and occurs when there is a sorting on columns happened.
    *
    */
  @js.native
  sealed trait worksheetColumnSorted
    extends officeDashJsDashPreviewLib.ExcelNs.EventType
  
  /**
    *
    * WorksheetDeactivated represents the type of event registered on Worksheet or WorksheetCollection, and occurs when worksheet deactivates.
    *
    */
  @js.native
  sealed trait worksheetDeactivated
    extends officeDashJsDashPreviewLib.ExcelNs.EventType
  
  /**
    *
    * WorksheetDeleted represents the type of event registered on WorksheetCollection, and occurs when a worksheet is deleted from the workbook.
    *
    */
  @js.native
  sealed trait worksheetDeleted
    extends officeDashJsDashPreviewLib.ExcelNs.EventType
  
  /**
    *
    * WorksheetFiltered represents the type of event registered on worksheet or WorksheetCollection, and occurs when data of autofilter in the worksheet is filtered.
    *
    */
  @js.native
  sealed trait worksheetFiltered
    extends officeDashJsDashPreviewLib.ExcelNs.EventType
  
  /**
    *
    * WorksheetFormatChanged represents the type of event registered on worksheet, and occurs when there is a format changed.
    *
    */
  @js.native
  sealed trait worksheetFormatChanged
    extends officeDashJsDashPreviewLib.ExcelNs.EventType
  
  /**
    *
    * WorksheetRowSorted represents the type of event registered on worksheet, and occurs when there is a sorting on rows happened.
    *
    */
  @js.native
  sealed trait worksheetRowSorted
    extends officeDashJsDashPreviewLib.ExcelNs.EventType
  
  /**
    *
    * WorksheetSelectionChanged represents the type of event registered on Worksheet, and occurs when selection changes.
    *
    */
  @js.native
  sealed trait worksheetSelectionChanged
    extends officeDashJsDashPreviewLib.ExcelNs.EventType
  
  /**
    *
    * WorksheetSingleClicked represents the type of event registered on worksheet, and occurs when cell is left-clicked/tapped.
    *
    */
  @js.native
  sealed trait worksheetSingleClicked
    extends officeDashJsDashPreviewLib.ExcelNs.EventType
  
  /* "AgaveVisualUpdate" */ val agaveVisualUpdate: agaveVisualUpdate with java.lang.String = js.native
  /* "ChartActivated" */ val chartActivated: chartActivated with java.lang.String = js.native
  /* "ChartAdded" */ val chartAdded: chartAdded with java.lang.String = js.native
  /* "ChartDeactivated" */ val chartDeactivated: chartDeactivated with java.lang.String = js.native
  /* "ChartDeleted" */ val chartDeleted: chartDeleted with java.lang.String = js.native
  /* "RibbonCommandExecuted" */ val ribbonCommandExecuted: ribbonCommandExecuted with java.lang.String = js.native
  /* "ShapeActivated" */ val shapeActivated: shapeActivated with java.lang.String = js.native
  /* "ShapeDeactivated" */ val shapeDeactivated: shapeDeactivated with java.lang.String = js.native
  /* "TableAdded" */ val tableAdded: tableAdded with java.lang.String = js.native
  /* "TableChanged" */ val tableChanged: tableChanged with java.lang.String = js.native
  /* "TableDeleted" */ val tableDeleted: tableDeleted with java.lang.String = js.native
  /* "TableFiltered" */ val tableFiltered: tableFiltered with java.lang.String = js.native
  /* "TableSelectionChanged" */ val tableSelectionChanged: tableSelectionChanged with java.lang.String = js.native
  /* "VisualChange" */ val visualChange: visualChange with java.lang.String = js.native
  /* "VisualSelectionChanged" */ val visualSelectionChanged: visualSelectionChanged with java.lang.String = js.native
  /* "WACOperationEvent" */ val wacoperationEvent: wacoperationEvent with java.lang.String = js.native
  /* "WorkbookAutoSaveSettingChanged" */ val workbookAutoSaveSettingChanged: workbookAutoSaveSettingChanged with java.lang.String = js.native
  /* "WorksheetActivated" */ val worksheetActivated: worksheetActivated with java.lang.String = js.native
  /* "WorksheetAdded" */ val worksheetAdded: worksheetAdded with java.lang.String = js.native
  /* "WorksheetCalculated" */ val worksheetCalculated: worksheetCalculated with java.lang.String = js.native
  /* "WorksheetChanged" */ val worksheetChanged: worksheetChanged with java.lang.String = js.native
  /* "WorksheetColumnSorted" */ val worksheetColumnSorted: worksheetColumnSorted with java.lang.String = js.native
  /* "WorksheetDeactivated" */ val worksheetDeactivated: worksheetDeactivated with java.lang.String = js.native
  /* "WorksheetDeleted" */ val worksheetDeleted: worksheetDeleted with java.lang.String = js.native
  /* "WorksheetFiltered" */ val worksheetFiltered: worksheetFiltered with java.lang.String = js.native
  /* "WorksheetFormatChanged" */ val worksheetFormatChanged: worksheetFormatChanged with java.lang.String = js.native
  /* "WorksheetRowSorted" */ val worksheetRowSorted: worksheetRowSorted with java.lang.String = js.native
  /* "WorksheetSelectionChanged" */ val worksheetSelectionChanged: worksheetSelectionChanged with java.lang.String = js.native
  /* "WorksheetSingleClicked" */ val worksheetSingleClicked: worksheetSingleClicked with java.lang.String = js.native
  @JSBracketAccess
  def apply(value: java.lang.String): js.UndefOr[officeDashJsDashPreviewLib.ExcelNs.EventType with java.lang.String] = js.native
}

