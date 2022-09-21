package typings.officeJs.Excel

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait EventType extends StObject
/**
  * @remarks
  * [Api set: ExcelApi 1.7]
  */
@JSGlobal("Excel.EventType")
@js.native
object EventType extends StObject {
  
  /**
    * `AgaveVisualUpdate` represents the type of an event that is associated with an agave visual and carries a new data view following a data change.
    * @remarks
    * [Api set: ExcelApi 1.7]
    */
  @js.native
  sealed trait agaveVisualUpdate
    extends StObject
       with EventType
  
  /**
    * `ChartActivated` represents the type of event registered on a `Chart` or `ChartCollection` and occurs when a chart activates.
    * @remarks
    * [Api set: ExcelApi 1.7]
    */
  @js.native
  sealed trait chartActivated
    extends StObject
       with EventType
  
  /**
    * `ChartAdded` represents the type of event registered on a `ChartCollection` and occurs when a new chart is added to the worksheet.
    * @remarks
    * [Api set: ExcelApi 1.7]
    */
  @js.native
  sealed trait chartAdded
    extends StObject
       with EventType
  
  /**
    * `ChartDeactivated` represents the type of event registered on a `Chart` or `ChartCollection` and occurs when a chart deactivates.
    * @remarks
    * [Api set: ExcelApi 1.7]
    */
  @js.native
  sealed trait chartDeactivated
    extends StObject
       with EventType
  
  /**
    * `ChartDeleted` represents the type of event registered on a `ChartCollection` and occurs when a chart is deleted from the worksheet.
    * @remarks
    * [Api set: ExcelApi 1.7]
    */
  @js.native
  sealed trait chartDeleted
    extends StObject
       with EventType
  
  /**
    * `CommentAdded` represents the type of event that is registered on a comment collection and occurs when comments are added.
    * @remarks
    * [Api set: ExcelApi 1.7]
    */
  @js.native
  sealed trait commentAdded
    extends StObject
       with EventType
  
  /**
    * `CommentChanged` represents the type of event that is registered on a comment collection and occurs when comments are changed.
    * @remarks
    * [Api set: ExcelApi 1.7]
    */
  @js.native
  sealed trait commentChanged
    extends StObject
       with EventType
  
  /**
    * `CommentDeleted` represents the type of event that is registered on a comment collection and occurs when comments are deleted.
    * @remarks
    * [Api set: ExcelApi 1.7]
    */
  @js.native
  sealed trait commentDeleted
    extends StObject
       with EventType
  
  /**
    * LineageActivityUpdateAvailable represents the type of event registered when new revision updates lineage model.
    * @remarks
    * [Api set: ExcelApi 1.7]
    */
  @js.native
  sealed trait lineageActivityUpdateAvailable
    extends StObject
       with EventType
  
  /**
    * `LinkedDataTypeAdded` represents the type of event registered on a `LinkedDataType` and occurs when a new linked data type is added to the workbook.
    * @remarks
    * [Api set: ExcelApi 1.7]
    */
  @js.native
  sealed trait linkedDataTypeLinkedDataTypeAdded
    extends StObject
       with EventType
  
  /**
    * `RefreshModeChanged` represents the type of event registered on a `LinkedDataType` and occurs when the linked data type refresh mode is changed.
    * @remarks
    * [Api set: ExcelApi 1.7]
    */
  @js.native
  sealed trait linkedDataTypeRefreshModeChanged
    extends StObject
       with EventType
  
  /**
    * `RefreshRequestCompleted` represents the type of event registered on a `LinkedDataType` and occurs when a request to refresh a data source is completed.
    * @remarks
    * [Api set: ExcelApi 1.7]
    */
  @js.native
  sealed trait linkedDataTypeRefreshRequestCompleted
    extends StObject
       with EventType
  
  /**
    * `WorkbookLinksRefreshCompleted` represents the type of event registered on a linked Workbook and occurs when a linked workbook completes a refresh.
    * @remarks
    * [Api set: ExcelApi 1.7]
    */
  @js.native
  sealed trait linkedWorkbookRefreshCompleted
    extends StObject
       with EventType
  
  /**
    * `WorkbookLinksChanged` represents the type of event which is fired when a workbook link is changed.
    * @remarks
    * [Api set: ExcelApi 1.7]
    */
  @js.native
  sealed trait linkedWorkbookWorkbookLinksChanged
    extends StObject
       with EventType
  
  /**
    * `RibbonCommandExecuted` represents the type of event registered on the ribbon and occurs when a user clicks on the ribbon
    * @remarks
    * [Api set: ExcelApi 1.7]
    */
  @js.native
  sealed trait ribbonCommandExecuted
    extends StObject
       with EventType
  
  /**
    * `ShapeActivated` represents the type of event that is registered on a `Shape` and occurs when the shape activates.
    * @remarks
    * [Api set: ExcelApi 1.7]
    */
  @js.native
  sealed trait shapeActivated
    extends StObject
       with EventType
  
  /**
    * `ShapeDeactivated` represents the type of event that is registered on a `Shape` and occurs when the shape deactivates.
    * @remarks
    * [Api set: ExcelApi 1.7]
    */
  @js.native
  sealed trait shapeDeactivated
    extends StObject
       with EventType
  
  /**
    * `TableAdded` represents the type of event registered on a `TableCollection` and occurs when a table is added.
    * @remarks
    * [Api set: ExcelApi 1.7]
    */
  @js.native
  sealed trait tableAdded
    extends StObject
       with EventType
  
  /**
    * `TableChanged` represents the type of event registered on a `Table` and occurs when data changes.
    * @remarks
    * [Api set: ExcelApi 1.7]
    */
  @js.native
  sealed trait tableChanged
    extends StObject
       with EventType
  
  /**
    * `TableDeleted` represents the type of event that is registered on a `TableCollection` and occurs when a table is deleted.
    * @remarks
    * [Api set: ExcelApi 1.7]
    */
  @js.native
  sealed trait tableDeleted
    extends StObject
       with EventType
  
  /**
    * `TableFiltered` represents the type of event registered on a table or `TableCollection` and occurs when the data of a table is filtered.
    * @remarks
    * [Api set: ExcelApi 1.7]
    */
  @js.native
  sealed trait tableFiltered
    extends StObject
       with EventType
  
  /**
    * `TableSelectionChanged` represents the type of event registered on a `Table` and occurs when the selection changes.
    * @remarks
    * [Api set: ExcelApi 1.7]
    */
  @js.native
  sealed trait tableSelectionChanged
    extends StObject
       with EventType
  
  /**
    * `VisualChange` represents the type of event registered on a `Visual` and occurs when there is a visual change.
    * @remarks
    * [Api set: ExcelApi 1.7]
    */
  @js.native
  sealed trait visualChange
    extends StObject
       with EventType
  
  /**
    * `VisualSelectionChanged` represents the type of event registered on a `VisualCollection` and occurs when the visual selection changes.
    * @remarks
    * [Api set: ExcelApi 1.7]
    */
  @js.native
  sealed trait visualSelectionChanged
    extends StObject
       with EventType
  
  /**
    * `WorkbookActivated` represents the type of event which is fired when a workbook is activated.
    * @remarks
    * [Api set: ExcelApi 1.7]
    */
  @js.native
  sealed trait workbookActivated
    extends StObject
       with EventType
  
  /**
    * `WorkbookAutoSaveSettingChanged` represents the type of event registered on a workbook and occurs when there is an auto save setting change.
    * @remarks
    * [Api set: ExcelApi 1.7]
    */
  @js.native
  sealed trait workbookAutoSaveSettingChanged
    extends StObject
       with EventType
  
  /**
    * `WorksheetActivated` represents the type of event registered on a `Worksheet` or `WorksheetCollection` and occurs when a worksheet activates.
    * @remarks
    * [Api set: ExcelApi 1.7]
    */
  @js.native
  sealed trait worksheetActivated
    extends StObject
       with EventType
  
  /**
    * `WorksheetAdded` represents the type of event registered on a `WorksheetCollection` and occurs when a new worksheet is added to the workbook.
    * @remarks
    * [Api set: ExcelApi 1.7]
    */
  @js.native
  sealed trait worksheetAdded
    extends StObject
       with EventType
  
  /**
    * `WorksheetCalculated` represents the type of event registered on a `Worksheet` or `WorksheetCollection` and occurs when a worksheet is calculated.
    * @remarks
    * [Api set: ExcelApi 1.7]
    */
  @js.native
  sealed trait worksheetCalculated
    extends StObject
       with EventType
  
  /**
    * `WorksheetChanged` represents the type of event registered on a `Worksheet` or `WorksheetCollection` and occurs when data changes.
    * @remarks
    * [Api set: ExcelApi 1.7]
    */
  @js.native
  sealed trait worksheetChanged
    extends StObject
       with EventType
  
  /**
    * `WorksheetColumnSorted` represents the type of event registered on a worksheet and occurs columns are sorted.
    * @remarks
    * [Api set: ExcelApi 1.7]
    */
  @js.native
  sealed trait worksheetColumnSorted
    extends StObject
       with EventType
  
  /**
    * `WorksheetDeactivated` represents the type of event registered on a `Worksheet` or `WorksheetCollection` and occurs when a worksheet deactivates.
    * @remarks
    * [Api set: ExcelApi 1.7]
    */
  @js.native
  sealed trait worksheetDeactivated
    extends StObject
       with EventType
  
  /**
    * `WorksheetDeleted` represents the type of event registered on a `WorksheetCollection` and occurs when a worksheet is deleted from the workbook.
    * @remarks
    * [Api set: ExcelApi 1.7]
    */
  @js.native
  sealed trait worksheetDeleted
    extends StObject
       with EventType
  
  /**
    * `WorksheetFiltered` represents the type of event registered on a worksheet or `WorksheetCollection` and occurs when the data of an AutoFilter in the worksheet is filtered.
    * @remarks
    * [Api set: ExcelApi 1.7]
    */
  @js.native
  sealed trait worksheetFiltered
    extends StObject
       with EventType
  
  /**
    * `WorksheetFormatChanged` represents the type of event registered on a worksheet and occurs when a format is changed.
    * @remarks
    * [Api set: ExcelApi 1.7]
    */
  @js.native
  sealed trait worksheetFormatChanged
    extends StObject
       with EventType
  
  /**
    * `WorksheetFormulaChanged` represents the type of event registered on a worksheet and occurs when a formula is changed.
    * @remarks
    * [Api set: ExcelApi 1.7]
    */
  @js.native
  sealed trait worksheetFormulaChanged
    extends StObject
       with EventType
  
  /**
    * WorksheetMoved represents the type of event registered on a worksheet that occurs when it is moved within a workbook.
    * @remarks
    * [Api set: ExcelApi 1.7]
    */
  @js.native
  sealed trait worksheetMoved
    extends StObject
       with EventType
  
  /**
    * WorksheetNameChanged represents the type of event registered on a worksheet that occurs when its name changes.
    * @remarks
    * [Api set: ExcelApi 1.7]
    */
  @js.native
  sealed trait worksheetNameChanged
    extends StObject
       with EventType
  
  /**
    * WorksheetProtectionChanged represents the type of event registered on worksheet, and occurs when protection status is changed.
    * @remarks
    * [Api set: ExcelApi 1.7]
    */
  @js.native
  sealed trait worksheetProtectionChanged
    extends StObject
       with EventType
  
  /**
    * `WorksheetRowHiddenChanged` represents the type of event registered on a worksheet and occurs when a row's hidden state is changed.
    * @remarks
    * [Api set: ExcelApi 1.7]
    */
  @js.native
  sealed trait worksheetRowHiddenChanged
    extends StObject
       with EventType
  
  /**
    * `WorksheetRowSorted` represents the type of event registered on a worksheet and occurs when rows are sorted.
    * @remarks
    * [Api set: ExcelApi 1.7]
    */
  @js.native
  sealed trait worksheetRowSorted
    extends StObject
       with EventType
  
  /**
    * `WorksheetSelectionChanged` represents the type of event registered on a `Worksheet` and occurs when the selection changes.
    * @remarks
    * [Api set: ExcelApi 1.7]
    */
  @js.native
  sealed trait worksheetSelectionChanged
    extends StObject
       with EventType
  
  /**
    * `WorksheetSingleClicked` represents the type of event registered on a worksheet and occurs when a cell is left-clicked or tapped.
    * @remarks
    * [Api set: ExcelApi 1.7]
    */
  @js.native
  sealed trait worksheetSingleClicked
    extends StObject
       with EventType
  
  /**
    * WorksheetVisibilityChanged represents the type of event registered on a worksheet that occurs when its visibility changes.
    * @remarks
    * [Api set: ExcelApi 1.7]
    */
  @js.native
  sealed trait worksheetVisibilityChanged
    extends StObject
       with EventType
}
