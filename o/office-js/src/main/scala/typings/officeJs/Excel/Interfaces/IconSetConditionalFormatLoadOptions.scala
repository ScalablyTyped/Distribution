package typings.officeJs.Excel.Interfaces

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  *
  * Represents an IconSet criteria for conditional formatting.
  *
  * [Api set: ExcelApi 1.6]
  */
trait IconSetConditionalFormatLoadOptions extends StObject {
  
  /**
    Specifying `$all` for the LoadOptions loads all the scalar properties (e.g.: `Range.address`) but not the navigational properties (e.g.: `Range.format.fill.color`).
    */
  @JSName("$all")
  var $all: js.UndefOr[Boolean] = js.undefined
  
  /**
    *
    * An array of Criteria and IconSets for the rules and potential custom icons for conditional icons. Note that for the first criterion only the custom icon can be modified, while type, formula, and operator will be ignored when set.
    *
    * [Api set: ExcelApi 1.6]
    */
  var criteria: js.UndefOr[Boolean] = js.undefined
  
  /**
    *
    * If true, reverses the icon orders for the IconSet. Note that this cannot be set if custom icons are used.
    *
    * [Api set: ExcelApi 1.6]
    */
  var reverseIconOrder: js.UndefOr[Boolean] = js.undefined
  
  /**
    *
    * If true, hides the values and only shows icons.
    *
    * [Api set: ExcelApi 1.6]
    */
  var showIconOnly: js.UndefOr[Boolean] = js.undefined
  
  /**
    *
    * If set, displays the IconSet option for the conditional format.
    *
    * [Api set: ExcelApi 1.6]
    */
  var style: js.UndefOr[Boolean] = js.undefined
}
object IconSetConditionalFormatLoadOptions {
  
  inline def apply(): IconSetConditionalFormatLoadOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IconSetConditionalFormatLoadOptions]
  }
  
  extension [Self <: IconSetConditionalFormatLoadOptions](x: Self) {
    
    inline def set$all(value: Boolean): Self = StObject.set(x, "$all", value.asInstanceOf[js.Any])
    
    inline def set$allUndefined: Self = StObject.set(x, "$all", js.undefined)
    
    inline def setCriteria(value: Boolean): Self = StObject.set(x, "criteria", value.asInstanceOf[js.Any])
    
    inline def setCriteriaUndefined: Self = StObject.set(x, "criteria", js.undefined)
    
    inline def setReverseIconOrder(value: Boolean): Self = StObject.set(x, "reverseIconOrder", value.asInstanceOf[js.Any])
    
    inline def setReverseIconOrderUndefined: Self = StObject.set(x, "reverseIconOrder", js.undefined)
    
    inline def setShowIconOnly(value: Boolean): Self = StObject.set(x, "showIconOnly", value.asInstanceOf[js.Any])
    
    inline def setShowIconOnlyUndefined: Self = StObject.set(x, "showIconOnly", js.undefined)
    
    inline def setStyle(value: Boolean): Self = StObject.set(x, "style", value.asInstanceOf[js.Any])
    
    inline def setStyleUndefined: Self = StObject.set(x, "style", js.undefined)
  }
}
