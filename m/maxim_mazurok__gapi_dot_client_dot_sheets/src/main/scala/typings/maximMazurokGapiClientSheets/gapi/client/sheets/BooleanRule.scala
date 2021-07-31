package typings.maximMazurokGapiClientSheets.gapi.client.sheets

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait BooleanRule extends StObject {
  
  /** The condition of the rule. If the condition evaluates to true, the format is applied. */
  var condition: js.UndefOr[BooleanCondition] = js.undefined
  
  /** The format to apply. Conditional formatting can only apply a subset of formatting: bold, italic, strikethrough, foreground color & background color. */
  var format: js.UndefOr[CellFormat] = js.undefined
}
object BooleanRule {
  
  @scala.inline
  def apply(): BooleanRule = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[BooleanRule]
  }
  
  @scala.inline
  implicit class BooleanRuleMutableBuilder[Self <: BooleanRule] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCondition(value: BooleanCondition): Self = StObject.set(x, "condition", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setConditionUndefined: Self = StObject.set(x, "condition", js.undefined)
    
    @scala.inline
    def setFormat(value: CellFormat): Self = StObject.set(x, "format", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFormatUndefined: Self = StObject.set(x, "format", js.undefined)
  }
}
