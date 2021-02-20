package typings.maximMazurokGapiClientSheets.gapi.client.sheets

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DataValidationRule extends StObject {
  
  /** The condition that data in the cell must match. */
  var condition: js.UndefOr[BooleanCondition] = js.native
  
  /** A message to show the user when adding data to the cell. */
  var inputMessage: js.UndefOr[String] = js.native
  
  /** True if the UI should be customized based on the kind of condition. If true, "List" conditions will show a dropdown. */
  var showCustomUi: js.UndefOr[Boolean] = js.native
  
  /** True if invalid data should be rejected. */
  var strict: js.UndefOr[Boolean] = js.native
}
object DataValidationRule {
  
  @scala.inline
  def apply(): DataValidationRule = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DataValidationRule]
  }
  
  @scala.inline
  implicit class DataValidationRuleMutableBuilder[Self <: DataValidationRule] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCondition(value: BooleanCondition): Self = StObject.set(x, "condition", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setConditionUndefined: Self = StObject.set(x, "condition", js.undefined)
    
    @scala.inline
    def setInputMessage(value: String): Self = StObject.set(x, "inputMessage", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInputMessageUndefined: Self = StObject.set(x, "inputMessage", js.undefined)
    
    @scala.inline
    def setShowCustomUi(value: Boolean): Self = StObject.set(x, "showCustomUi", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setShowCustomUiUndefined: Self = StObject.set(x, "showCustomUi", js.undefined)
    
    @scala.inline
    def setStrict(value: Boolean): Self = StObject.set(x, "strict", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStrictUndefined: Self = StObject.set(x, "strict", js.undefined)
  }
}
