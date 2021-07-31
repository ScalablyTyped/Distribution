package typings.officeJsPreview.Excel

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait EventType extends StObject
/**
  * [Api set: ExcelApi 1.7]
  */
@JSGlobal("Excel.EventType")
@js.native
object EventType extends StObject {
  
  /**
    * AgaveVisualUpdate represents the type of an event that is associated with an agave visual, and carries a new data view following a data change
    *
    */
  @js.native
  sealed trait agaveVisualUpdate
    extends StObject
       with EventType
  
  /**
    * ChartActivated represents the type of event registered on Chart or ChartCollection, and occurs when chart activates.
    *
    */
  @js.native
  sealed trait chartActivated
    extends StObject
       with EventType
  
  /**
    * ChartAdded represents the type of event registered on ChartCollection, and occurs when a new chart is added to the worksheet.
    *
    */
  @js.native
  sealed trait chartAdded
    extends StObject
       with EventType
  
  /**
    * ChartDeactivated represents the type of event registered on Chart or ChartCollection, and occurs when chart deactivates.
    *
    */
  @js.native
  sealed trait chartDeactivated
    extends StObject
       with EventType
  
  /**
    * ChartDeleted represents the type of event registered on ChartCollection, and occurs when a chart is deleted from the worksheet.
    *
    */
  @js.native
  sealed trait chartDeleted
    extends StObject
       with EventType
  
  /**
    * CommentAdded represents the type of event that is registered on commentCollection, and occurs when comments are added.
    *
    */
  @js.native
  sealed trait commentAdded
    extends StObject
       with EventType
  
  /**
    * CommentChanged represents the type of event that is registered on commentCollection, and occurs when comments are changed.
    *
    */
  @js.native
  sealed trait commentChanged
    extends StObject
       with EventType
  
  /**
    * CommentDeleted represents the type of event that is registered on commentCollection, and occurs when comments are deleted.
    *
    */
  @js.native
  sealed trait commentDeleted
    extends StObject
       with EventType
  
  /**
    * LinkedDataTypeAdded represents the type of event registered on LinkedDataType, and occurs when a new linked data type is added to the workbook.
    *
    */
  @js.native
  sealed trait linkedDataTypeLinkedDataTypeAdded
    extends StObject
       with EventType
  
  /**
    * RefreshModeChanged represents the type of event registered on LinkedDataType, and occurs when the linked data type refresh mode is changed.
    *
    */
  @js.native
  sealed trait linkedDataTypeRefreshModeChanged
    extends StObject
       with EventType
  
  /**
    * RefreshRequestCompleted represents the type of event registered on LinkedDataType, and occurs when a request to refresh a data source is completed.
    *
    */
  @js.native
  sealed trait linkedDataTypeRefreshRequestCompleted
    extends StObject
       with EventType
  
  /**
    * RibbonCommandExecuted represents the type of event registered on ribbon, and occurs when user click on ribbon
    *
    */
  @js.native
  sealed trait ribbonCommandExecuted
    extends StObject
       with EventType
  
  /**
    * ShapeActivated represents the type of event that is registered on Shape, and occurs when shape activates.
    *
    */
  @js.native
  sealed trait shapeActivated
    extends StObject
       with EventType
  
  /**
    * ShapeDeactivated represents the type of event that is registered on Shape, and occurs when shape deactivates.
    *
    */
  @js.native
  sealed trait shapeDeactivated
    extends StObject
       with EventType
  
  /**
    * TableAdded represents the type of event registered on TableCollection, and occurs when a table is added.
    *
    */
  @js.native
  sealed trait tableAdded
    extends StObject
       with EventType
  
  /**
    * TableChanged represents the type of event registered on Table, and occurs when data changes.
    *
    */
  @js.native
  sealed trait tableChanged
    extends StObject
       with EventType
  
  /**
    * TableDeleted represents the type of event that is registered on TableCollection, and occurs when a table is deleted.
    *
    */
  @js.native
  sealed trait tableDeleted
    extends StObject
       with EventType
  
  /**
    * TableFiltered represents the type of event registered on table or TableCollection, and occurs when data of table is filtered.
    *
    */
  @js.native
  sealed trait tableFiltered
    extends StObject
       with EventType
  
  /**
    * TableSelectionChanged represents the type of event registered on Table, and occurs when selection changes.
    *
    */
  @js.native
  sealed trait tableSelectionChanged
    extends StObject
       with EventType
  
  /**
    * VisualChange represents the type of event registered on Visual, and occurs when there is a visual change.
    *
    */
  @js.native
  sealed trait visualChange
    extends StObject
       with EventType
  
  /**
    * VisualSelectionChanged represents the type of event registered on VisualCollection, and occurs when visual selection changes.
    *
    */
  @js.native
  sealed trait visualSelectionChanged
    extends StObject
       with EventType
  
  /**
    * WorkbookAutoSaveSettingChanged represents the type of event registered on workbook, and occurs when there is an auto save setting change.
    *
    */
  @js.native
  sealed trait workbookAutoSaveSettingChanged
    extends StObject
       with EventType
  
  /**
    * WorksheetActivated represents the type of event registered on Worksheet or WorksheetCollection, and occurs when worksheet activates.
    *
    */
  @js.native
  sealed trait worksheetActivated
    extends StObject
       with EventType
  
  /**
    * WorksheetAdded represents the type of event registered on WorksheetCollection, and occurs when a new worksheet is added to the workbook.
    *
    */
  @js.native
  sealed trait worksheetAdded
    extends StObject
       with EventType
  
  /**
    * WorksheetCalculated represents the type of event registered on Worksheet or WorksheetCollection, and occurs when a worksheet is calculated.
    *
    */
  @js.native
  sealed trait worksheetCalculated
    extends StObject
       with EventType
  
  /**
    * WorksheetChanged represents the type of event registered on Worksheet or WorksheetCollection, and occurs when data changes.
    *
    */
  @js.native
  sealed trait worksheetChanged
    extends StObject
       with EventType
  
  /**
    * WorksheetColumnSorted represents the type of event registered on worksheet, and occurs when there is a sorting on columns happened.
    *
    */
  @js.native
  sealed trait worksheetColumnSorted
    extends StObject
       with EventType
  
  /**
    * WorksheetDeactivated represents the type of event registered on Worksheet or WorksheetCollection, and occurs when worksheet deactivates.
    *
    */
  @js.native
  sealed trait worksheetDeactivated
    extends StObject
       with EventType
  
  /**
    * WorksheetDeleted represents the type of event registered on WorksheetCollection, and occurs when a worksheet is deleted from the workbook.
    *
    */
  @js.native
  sealed trait worksheetDeleted
    extends StObject
       with EventType
  
  /**
    * WorksheetFiltered represents the type of event registered on worksheet or WorksheetCollection, and occurs when data of autofilter in the worksheet is filtered.
    *
    */
  @js.native
  sealed trait worksheetFiltered
    extends StObject
       with EventType
  
  /**
    * WorksheetFormatChanged represents the type of event registered on worksheet, and occurs when there is a format changed.
    *
    */
  @js.native
  sealed trait worksheetFormatChanged
    extends StObject
       with EventType
  
  /**
    * WorksheetFormulaChanged represents the type of event registered on a worksheet, and occurs when a formula is changed.
    *
    */
  @js.native
  sealed trait worksheetFormulaChanged
    extends StObject
       with EventType
  
  /**
    * WorksheetRowHiddenChanged represents the type of event registered on worksheet, and occurs when a row's hidden state is changed.
    *
    */
  @js.native
  sealed trait worksheetRowHiddenChanged
    extends StObject
       with EventType
  
  /**
    * WorksheetRowSorted represents the type of event registered on worksheet, and occurs when there is a sorting on rows happened.
    *
    */
  @js.native
  sealed trait worksheetRowSorted
    extends StObject
       with EventType
  
  /**
    * WorksheetSelectionChanged represents the type of event registered on Worksheet, and occurs when selection changes.
    *
    */
  @js.native
  sealed trait worksheetSelectionChanged
    extends StObject
       with EventType
  
  /**
    * WorksheetSingleClicked represents the type of event registered on worksheet, and occurs when cell is left-clicked/tapped.
    *
    */
  @js.native
  sealed trait worksheetSingleClicked
    extends StObject
       with EventType
}
