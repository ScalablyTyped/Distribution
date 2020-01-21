package typings.officeJs.Excel

import org.scalablytyped.runtime.TopLevel
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
  
  @JSBracketAccess
  def apply(value: String): js.UndefOr[EventType with String] = js.native
  /* "AgaveVisualUpdate" */ @js.native
  object agaveVisualUpdate extends TopLevel[agaveVisualUpdate with String]
  
  /* "ChartActivated" */ @js.native
  object chartActivated extends TopLevel[chartActivated with String]
  
  /* "ChartAdded" */ @js.native
  object chartAdded extends TopLevel[chartAdded with String]
  
  /* "ChartDeactivated" */ @js.native
  object chartDeactivated extends TopLevel[chartDeactivated with String]
  
  /* "ChartDeleted" */ @js.native
  object chartDeleted extends TopLevel[chartDeleted with String]
  
  /* "RibbonCommandExecuted" */ @js.native
  object ribbonCommandExecuted extends TopLevel[ribbonCommandExecuted with String]
  
  /* "ShapeActivated" */ @js.native
  object shapeActivated extends TopLevel[shapeActivated with String]
  
  /* "ShapeDeactivated" */ @js.native
  object shapeDeactivated extends TopLevel[shapeDeactivated with String]
  
  /* "TableAdded" */ @js.native
  object tableAdded extends TopLevel[tableAdded with String]
  
  /* "TableChanged" */ @js.native
  object tableChanged extends TopLevel[tableChanged with String]
  
  /* "TableDeleted" */ @js.native
  object tableDeleted extends TopLevel[tableDeleted with String]
  
  /* "TableFiltered" */ @js.native
  object tableFiltered extends TopLevel[tableFiltered with String]
  
  /* "TableSelectionChanged" */ @js.native
  object tableSelectionChanged extends TopLevel[tableSelectionChanged with String]
  
  /* "VisualChange" */ @js.native
  object visualChange extends TopLevel[visualChange with String]
  
  /* "VisualSelectionChanged" */ @js.native
  object visualSelectionChanged extends TopLevel[visualSelectionChanged with String]
  
  /* "WACOperationEvent" */ @js.native
  object wacoperationEvent extends TopLevel[wacoperationEvent with String]
  
  /* "WorkbookAutoSaveSettingChanged" */ @js.native
  object workbookAutoSaveSettingChanged extends TopLevel[workbookAutoSaveSettingChanged with String]
  
  /* "WorksheetActivated" */ @js.native
  object worksheetActivated extends TopLevel[worksheetActivated with String]
  
  /* "WorksheetAdded" */ @js.native
  object worksheetAdded extends TopLevel[worksheetAdded with String]
  
  /* "WorksheetCalculated" */ @js.native
  object worksheetCalculated extends TopLevel[worksheetCalculated with String]
  
  /* "WorksheetChanged" */ @js.native
  object worksheetChanged extends TopLevel[worksheetChanged with String]
  
  /* "WorksheetColumnSorted" */ @js.native
  object worksheetColumnSorted extends TopLevel[worksheetColumnSorted with String]
  
  /* "WorksheetDeactivated" */ @js.native
  object worksheetDeactivated extends TopLevel[worksheetDeactivated with String]
  
  /* "WorksheetDeleted" */ @js.native
  object worksheetDeleted extends TopLevel[worksheetDeleted with String]
  
  /* "WorksheetFiltered" */ @js.native
  object worksheetFiltered extends TopLevel[worksheetFiltered with String]
  
  /* "WorksheetFormatChanged" */ @js.native
  object worksheetFormatChanged extends TopLevel[worksheetFormatChanged with String]
  
  /* "WorksheetRowHiddenChanged" */ @js.native
  object worksheetRowHiddenChanged extends TopLevel[worksheetRowHiddenChanged with String]
  
  /* "WorksheetRowSorted" */ @js.native
  object worksheetRowSorted extends TopLevel[worksheetRowSorted with String]
  
  /* "WorksheetSelectionChanged" */ @js.native
  object worksheetSelectionChanged extends TopLevel[worksheetSelectionChanged with String]
  
  /* "WorksheetSingleClicked" */ @js.native
  object worksheetSingleClicked extends TopLevel[worksheetSingleClicked with String]
  
}

