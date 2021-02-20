package typings.maximMazurokGapiClientPagespeedonline.gapi.client.pagespeedonline

import org.scalablytyped.runtime.TopLevel
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait LighthouseAuditResultV5 extends StObject {
  
  /** The description of the audit. */
  var description: js.UndefOr[String] = js.native
  
  /** Freeform details section of the audit. */
  var details: js.UndefOr[
    /* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {[ P in string ]: any}
    */ typings.maximMazurokGapiClientPagespeedonline.maximMazurokGapiClientPagespeedonlineStrings.LighthouseAuditResultV5 with TopLevel[js.Any]
  ] = js.native
  
  /** The value that should be displayed on the UI for this audit. */
  var displayValue: js.UndefOr[String] = js.native
  
  /** An error message from a thrown error inside the audit. */
  var errorMessage: js.UndefOr[String] = js.native
  
  /** An explanation of the errors in the audit. */
  var explanation: js.UndefOr[String] = js.native
  
  /** The audit's id. */
  var id: js.UndefOr[String] = js.native
  
  /**
    * A numeric value that has a meaning specific to the audit, e.g. the number of nodes in the DOM or the timestamp of a specific load event. More information can be found in the audit
    * details, if present.
    */
  var numericValue: js.UndefOr[Double] = js.native
  
  /** The score of the audit, can be null. */
  var score: js.UndefOr[js.Any] = js.native
  
  /** The enumerated score display mode. */
  var scoreDisplayMode: js.UndefOr[String] = js.native
  
  /** The human readable title. */
  var title: js.UndefOr[String] = js.native
  
  /** Possible warnings that occurred in the audit, can be null. */
  var warnings: js.UndefOr[js.Any] = js.native
}
object LighthouseAuditResultV5 {
  
  @scala.inline
  def apply(): LighthouseAuditResultV5 = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[LighthouseAuditResultV5]
  }
  
  @scala.inline
  implicit class LighthouseAuditResultV5MutableBuilder[Self <: LighthouseAuditResultV5] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDescription(value: String): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDescriptionUndefined: Self = StObject.set(x, "description", js.undefined)
    
    @scala.inline
    def setDetails(
      value: /* import warning: importer.ImportType#apply c Unsupported type mapping: 
    {[ P in string ]: any}
      */ typings.maximMazurokGapiClientPagespeedonline.maximMazurokGapiClientPagespeedonlineStrings.LighthouseAuditResultV5 with TopLevel[js.Any]
    ): Self = StObject.set(x, "details", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDetailsUndefined: Self = StObject.set(x, "details", js.undefined)
    
    @scala.inline
    def setDisplayValue(value: String): Self = StObject.set(x, "displayValue", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDisplayValueUndefined: Self = StObject.set(x, "displayValue", js.undefined)
    
    @scala.inline
    def setErrorMessage(value: String): Self = StObject.set(x, "errorMessage", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setErrorMessageUndefined: Self = StObject.set(x, "errorMessage", js.undefined)
    
    @scala.inline
    def setExplanation(value: String): Self = StObject.set(x, "explanation", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setExplanationUndefined: Self = StObject.set(x, "explanation", js.undefined)
    
    @scala.inline
    def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
    
    @scala.inline
    def setNumericValue(value: Double): Self = StObject.set(x, "numericValue", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNumericValueUndefined: Self = StObject.set(x, "numericValue", js.undefined)
    
    @scala.inline
    def setScore(value: js.Any): Self = StObject.set(x, "score", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setScoreDisplayMode(value: String): Self = StObject.set(x, "scoreDisplayMode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setScoreDisplayModeUndefined: Self = StObject.set(x, "scoreDisplayMode", js.undefined)
    
    @scala.inline
    def setScoreUndefined: Self = StObject.set(x, "score", js.undefined)
    
    @scala.inline
    def setTitle(value: String): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTitleUndefined: Self = StObject.set(x, "title", js.undefined)
    
    @scala.inline
    def setWarnings(value: js.Any): Self = StObject.set(x, "warnings", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWarningsUndefined: Self = StObject.set(x, "warnings", js.undefined)
  }
}
