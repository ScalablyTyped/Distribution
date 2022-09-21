package typings.officeJsPreview.Excel

import typings.officeJsPreview.officeJsPreviewStrings.Local
import typings.officeJsPreview.officeJsPreviewStrings.Remote
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Provides information about the worksheet whose name has changed.
  *
  * @remarks
  * [Api set: ExcelApiOnline 1.1]
  */
trait WorksheetNameChangedEventArgs extends StObject {
  
  /**
    * Gets the new name of the worksheet, after the name change.
    *
    * @remarks
    * [Api set: ExcelApiOnline 1.1]
    */
  var nameAfter: String
  
  /**
    * Gets the previous name of the worksheet, before the name changed.
    *
    * @remarks
    * [Api set: ExcelApiOnline 1.1]
    */
  var nameBefore: String
  
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
    * Gets the ID of the worksheet with the new name.
    *
    * @remarks
    * [Api set: ExcelApiOnline 1.1]
    */
  var worksheetId: String
}
object WorksheetNameChangedEventArgs {
  
  inline def apply(
    nameAfter: String,
    nameBefore: String,
    source: EventSource | Local | Remote,
    `type`: String,
    worksheetId: String
  ): WorksheetNameChangedEventArgs = {
    val __obj = js.Dynamic.literal(nameAfter = nameAfter.asInstanceOf[js.Any], nameBefore = nameBefore.asInstanceOf[js.Any], source = source.asInstanceOf[js.Any], worksheetId = worksheetId.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[WorksheetNameChangedEventArgs]
  }
  
  extension [Self <: WorksheetNameChangedEventArgs](x: Self) {
    
    inline def setNameAfter(value: String): Self = StObject.set(x, "nameAfter", value.asInstanceOf[js.Any])
    
    inline def setNameBefore(value: String): Self = StObject.set(x, "nameBefore", value.asInstanceOf[js.Any])
    
    inline def setSource(value: EventSource | Local | Remote): Self = StObject.set(x, "source", value.asInstanceOf[js.Any])
    
    inline def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    inline def setWorksheetId(value: String): Self = StObject.set(x, "worksheetId", value.asInstanceOf[js.Any])
  }
}
