package typings.maximMazurokGapiClientPagespeedonline.gapi.client.pagespeedonline

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait LighthouseAuditResultV5 extends StObject {
  
  /** The description of the audit. */
  var description: js.UndefOr[String] = js.undefined
  
  /** Freeform details section of the audit. */
  var details: js.UndefOr[
    /* import warning: importer.ImportType#apply Failed type conversion: {[ P in string ]: any} */ js.Any
  ] = js.undefined
  
  /** The value that should be displayed on the UI for this audit. */
  var displayValue: js.UndefOr[String] = js.undefined
  
  /** An error message from a thrown error inside the audit. */
  var errorMessage: js.UndefOr[String] = js.undefined
  
  /** An explanation of the errors in the audit. */
  var explanation: js.UndefOr[String] = js.undefined
  
  /** The audit's id. */
  var id: js.UndefOr[String] = js.undefined
  
  /** The unit of the numeric_value field. Used to format the numeric value for display. */
  var numericUnit: js.UndefOr[String] = js.undefined
  
  /**
    * A numeric value that has a meaning specific to the audit, e.g. the number of nodes in the DOM or the timestamp of a specific load event. More information can be found in the audit
    * details, if present.
    */
  var numericValue: js.UndefOr[Double] = js.undefined
  
  /** The score of the audit, can be null. */
  var score: js.UndefOr[Any] = js.undefined
  
  /** The enumerated score display mode. */
  var scoreDisplayMode: js.UndefOr[String] = js.undefined
  
  /** The human readable title. */
  var title: js.UndefOr[String] = js.undefined
  
  /** Possible warnings that occurred in the audit, can be null. */
  var warnings: js.UndefOr[Any] = js.undefined
}
object LighthouseAuditResultV5 {
  
  inline def apply(): LighthouseAuditResultV5 = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[LighthouseAuditResultV5]
  }
  
  extension [Self <: LighthouseAuditResultV5](x: Self) {
    
    inline def setDescription(value: String): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
    
    inline def setDescriptionUndefined: Self = StObject.set(x, "description", js.undefined)
    
    inline def setDetails(
      value: /* import warning: importer.ImportType#apply Failed type conversion: {[ P in string ]: any} */ js.Any
    ): Self = StObject.set(x, "details", value.asInstanceOf[js.Any])
    
    inline def setDetailsUndefined: Self = StObject.set(x, "details", js.undefined)
    
    inline def setDisplayValue(value: String): Self = StObject.set(x, "displayValue", value.asInstanceOf[js.Any])
    
    inline def setDisplayValueUndefined: Self = StObject.set(x, "displayValue", js.undefined)
    
    inline def setErrorMessage(value: String): Self = StObject.set(x, "errorMessage", value.asInstanceOf[js.Any])
    
    inline def setErrorMessageUndefined: Self = StObject.set(x, "errorMessage", js.undefined)
    
    inline def setExplanation(value: String): Self = StObject.set(x, "explanation", value.asInstanceOf[js.Any])
    
    inline def setExplanationUndefined: Self = StObject.set(x, "explanation", js.undefined)
    
    inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
    
    inline def setNumericUnit(value: String): Self = StObject.set(x, "numericUnit", value.asInstanceOf[js.Any])
    
    inline def setNumericUnitUndefined: Self = StObject.set(x, "numericUnit", js.undefined)
    
    inline def setNumericValue(value: Double): Self = StObject.set(x, "numericValue", value.asInstanceOf[js.Any])
    
    inline def setNumericValueUndefined: Self = StObject.set(x, "numericValue", js.undefined)
    
    inline def setScore(value: Any): Self = StObject.set(x, "score", value.asInstanceOf[js.Any])
    
    inline def setScoreDisplayMode(value: String): Self = StObject.set(x, "scoreDisplayMode", value.asInstanceOf[js.Any])
    
    inline def setScoreDisplayModeUndefined: Self = StObject.set(x, "scoreDisplayMode", js.undefined)
    
    inline def setScoreUndefined: Self = StObject.set(x, "score", js.undefined)
    
    inline def setTitle(value: String): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
    
    inline def setTitleUndefined: Self = StObject.set(x, "title", js.undefined)
    
    inline def setWarnings(value: Any): Self = StObject.set(x, "warnings", value.asInstanceOf[js.Any])
    
    inline def setWarningsUndefined: Self = StObject.set(x, "warnings", js.undefined)
  }
}
