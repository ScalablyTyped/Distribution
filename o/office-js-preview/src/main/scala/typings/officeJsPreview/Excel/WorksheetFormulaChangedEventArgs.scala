package typings.officeJsPreview.Excel

import typings.officeJsPreview.officeJsPreviewStrings.Local
import typings.officeJsPreview.officeJsPreviewStrings.Remote
import typings.officeJsPreview.officeJsPreviewStrings.WorksheetFormulaChanged
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Provides information about the worksheet and formulas that raised the formula changed event.
  *
  * @remarks
  * [Api set: ExcelApi 1.13]
  */
trait WorksheetFormulaChangedEventArgs extends StObject {
  
  /**
    * Gets an array of `FormulaChangedEventDetail` objects, which contain the details about the all of the changed formulas.
    *
    * @remarks
    * [Api set: ExcelApi 1.13]
    */
  var formulaDetails: js.Array[FormulaChangedEventDetail]
  
  /**
    * The source of the event. It can be local or remote (through co-authoring).
    *
    * @remarks
    * [Api set: ExcelApi 1.13]
    */
  var source: EventSource | Local | Remote
  
  /**
    * Gets the type of the event. See `Excel.EventType` for details.
    *
    * @remarks
    * [Api set: ExcelApi 1.13]
    */
  var `type`: WorksheetFormulaChanged
  
  /**
    * Gets the ID of the worksheet in which the formula changed.
    *
    * @remarks
    * [Api set: ExcelApi 1.13]
    */
  var worksheetId: String
}
object WorksheetFormulaChangedEventArgs {
  
  inline def apply(
    formulaDetails: js.Array[FormulaChangedEventDetail],
    source: EventSource | Local | Remote,
    worksheetId: String
  ): WorksheetFormulaChangedEventArgs = {
    val __obj = js.Dynamic.literal(formulaDetails = formulaDetails.asInstanceOf[js.Any], source = source.asInstanceOf[js.Any], worksheetId = worksheetId.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("WorksheetFormulaChanged")
    __obj.asInstanceOf[WorksheetFormulaChangedEventArgs]
  }
  
  extension [Self <: WorksheetFormulaChangedEventArgs](x: Self) {
    
    inline def setFormulaDetails(value: js.Array[FormulaChangedEventDetail]): Self = StObject.set(x, "formulaDetails", value.asInstanceOf[js.Any])
    
    inline def setFormulaDetailsVarargs(value: FormulaChangedEventDetail*): Self = StObject.set(x, "formulaDetails", js.Array(value*))
    
    inline def setSource(value: EventSource | Local | Remote): Self = StObject.set(x, "source", value.asInstanceOf[js.Any])
    
    inline def setType(value: WorksheetFormulaChanged): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    inline def setWorksheetId(value: String): Self = StObject.set(x, "worksheetId", value.asInstanceOf[js.Any])
  }
}
