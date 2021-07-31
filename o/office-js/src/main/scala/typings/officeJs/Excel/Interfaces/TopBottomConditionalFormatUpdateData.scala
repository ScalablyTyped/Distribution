package typings.officeJs.Excel.Interfaces

import typings.officeJs.Excel.ConditionalTopBottomRule
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** An interface for updating data on the TopBottomConditionalFormat object, for use in `topBottomConditionalFormat.set({ ... })`. */
trait TopBottomConditionalFormatUpdateData extends StObject {
  
  /**
    *
    * Returns a format object, encapsulating the conditional format's font, fill, borders, and other properties.
    *
    * [Api set: ExcelApi 1.6]
    */
  var format: js.UndefOr[ConditionalRangeFormatUpdateData] = js.undefined
  
  /**
    *
    * The criteria of the Top/Bottom conditional format.
    *
    * [Api set: ExcelApi 1.6]
    */
  var rule: js.UndefOr[ConditionalTopBottomRule] = js.undefined
}
object TopBottomConditionalFormatUpdateData {
  
  @scala.inline
  def apply(): TopBottomConditionalFormatUpdateData = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TopBottomConditionalFormatUpdateData]
  }
  
  @scala.inline
  implicit class TopBottomConditionalFormatUpdateDataMutableBuilder[Self <: TopBottomConditionalFormatUpdateData] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setFormat(value: ConditionalRangeFormatUpdateData): Self = StObject.set(x, "format", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFormatUndefined: Self = StObject.set(x, "format", js.undefined)
    
    @scala.inline
    def setRule(value: ConditionalTopBottomRule): Self = StObject.set(x, "rule", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRuleUndefined: Self = StObject.set(x, "rule", js.undefined)
  }
}
