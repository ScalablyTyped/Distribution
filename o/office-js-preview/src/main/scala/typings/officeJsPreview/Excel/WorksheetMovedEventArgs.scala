package typings.officeJsPreview.Excel

import typings.officeJsPreview.officeJsPreviewStrings.Local
import typings.officeJsPreview.officeJsPreviewStrings.Remote
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Notifies when a worksheet is moved within a workbook.
  
  If a worksheet is moved from one position within the workbook to another
  via the Excel UI, then this API will trigger an event. Note that if
  the position of a worksheet changes as a result of moving a different worksheet,
  then this event won't trigger for both position changes. This event only triggers
  for the primary worksheet move, and not any worksheet position changes that occur
  as a result of that primary move.
  *
  * @remarks
  * [Api set: ExcelApiOnline 1.1]
  */
trait WorksheetMovedEventArgs extends StObject {
  
  /**
    * Gets the new position of the worksheet, after the move.
    *
    * @remarks
    * [Api set: ExcelApiOnline 1.1]
    */
  var positionAfter: Double
  
  /**
    * Gets the previous position of the worksheet, prior to the move.
    *
    * @remarks
    * [Api set: ExcelApiOnline 1.1]
    */
  var positionBefore: Double
  
  /**
    * The source of the event. It can be local or remote (through co-authoring).
    *
    * @remarks
    * [Api set: ExcelApiOnline 1.1]
    */
  var source: EventSource | Local | Remote
  
  /**
    * Gets the type of the event.
    *
    * @remarks
    * [Api set: ExcelApiOnline 1.1]
    */
  var `type`: String
  
  /**
    * Gets the ID of the worksheet that was moved.
    *
    * @remarks
    * [Api set: ExcelApiOnline 1.1]
    */
  var worksheetId: String
}
object WorksheetMovedEventArgs {
  
  inline def apply(
    positionAfter: Double,
    positionBefore: Double,
    source: EventSource | Local | Remote,
    `type`: String,
    worksheetId: String
  ): WorksheetMovedEventArgs = {
    val __obj = js.Dynamic.literal(positionAfter = positionAfter.asInstanceOf[js.Any], positionBefore = positionBefore.asInstanceOf[js.Any], source = source.asInstanceOf[js.Any], worksheetId = worksheetId.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[WorksheetMovedEventArgs]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: WorksheetMovedEventArgs] (val x: Self) extends AnyVal {
    
    inline def setPositionAfter(value: Double): Self = StObject.set(x, "positionAfter", value.asInstanceOf[js.Any])
    
    inline def setPositionBefore(value: Double): Self = StObject.set(x, "positionBefore", value.asInstanceOf[js.Any])
    
    inline def setSource(value: EventSource | Local | Remote): Self = StObject.set(x, "source", value.asInstanceOf[js.Any])
    
    inline def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    inline def setWorksheetId(value: String): Self = StObject.set(x, "worksheetId", value.asInstanceOf[js.Any])
  }
}
