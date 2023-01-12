package typings.officeJsPreview.Excel

import typings.officeJsPreview.officeJsPreviewStrings.Hidden
import typings.officeJsPreview.officeJsPreviewStrings.Local
import typings.officeJsPreview.officeJsPreviewStrings.Remote
import typings.officeJsPreview.officeJsPreviewStrings.VeryHidden
import typings.officeJsPreview.officeJsPreviewStrings.Visible
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Provides information about the worksheet whose visibility has changed.
  *
  * @remarks
  * [Api set: ExcelApiOnline 1.1]
  */
trait WorksheetVisibilityChangedEventArgs extends StObject {
  
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
    * Gets the new visibility setting of the worksheet, after the visibility change.
    *
    * @remarks
    * [Api set: ExcelApiOnline 1.1]
    */
  var visibilityAfter: SheetVisibility | Visible | Hidden | VeryHidden
  
  /**
    * Gets the previous visibility setting of the worksheet, before the visibility change.
    *
    * @remarks
    * [Api set: ExcelApiOnline 1.1]
    */
  var visibilityBefore: SheetVisibility | Visible | Hidden | VeryHidden
  
  /**
    * Gets the ID of the worksheet whose visibility has changed.
    *
    * @remarks
    * [Api set: ExcelApiOnline 1.1]
    */
  var worksheetId: String
}
object WorksheetVisibilityChangedEventArgs {
  
  inline def apply(
    source: EventSource | Local | Remote,
    `type`: String,
    visibilityAfter: SheetVisibility | Visible | Hidden | VeryHidden,
    visibilityBefore: SheetVisibility | Visible | Hidden | VeryHidden,
    worksheetId: String
  ): WorksheetVisibilityChangedEventArgs = {
    val __obj = js.Dynamic.literal(source = source.asInstanceOf[js.Any], visibilityAfter = visibilityAfter.asInstanceOf[js.Any], visibilityBefore = visibilityBefore.asInstanceOf[js.Any], worksheetId = worksheetId.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[WorksheetVisibilityChangedEventArgs]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: WorksheetVisibilityChangedEventArgs] (val x: Self) extends AnyVal {
    
    inline def setSource(value: EventSource | Local | Remote): Self = StObject.set(x, "source", value.asInstanceOf[js.Any])
    
    inline def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    inline def setVisibilityAfter(value: SheetVisibility | Visible | Hidden | VeryHidden): Self = StObject.set(x, "visibilityAfter", value.asInstanceOf[js.Any])
    
    inline def setVisibilityBefore(value: SheetVisibility | Visible | Hidden | VeryHidden): Self = StObject.set(x, "visibilityBefore", value.asInstanceOf[js.Any])
    
    inline def setWorksheetId(value: String): Self = StObject.set(x, "worksheetId", value.asInstanceOf[js.Any])
  }
}
