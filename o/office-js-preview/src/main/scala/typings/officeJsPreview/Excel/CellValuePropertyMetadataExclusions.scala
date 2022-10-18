package typings.officeJsPreview.Excel

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Represents the exclusion of a property in `EntityCellValue.properties` from features of Excel.
  *
  * @remarks
  * [Api set: ExcelApi 1.16]
  */
trait CellValuePropertyMetadataExclusions extends StObject {
  
  /**
    * True represents that the property is excluded from the properties shown by auto complete. False and undefined represent the default behavior of including the property.
    *
    * @remarks
    * [Api set: ExcelApi 1.16]
    */
  var autoComplete: js.UndefOr[Boolean] = js.undefined
  
  /**
    * True represents that the property is excluded from the properties used to compare cell values during recalc. False and undefined represent the default behavior of including the property.
    *
    * @remarks
    * [Api set: ExcelApi 1.16]
    */
  var calcCompare: js.UndefOr[Boolean] = js.undefined
  
  /**
    * True represents that the property is excluded from the properties shown by card view. False and undefined represent the default behavior of including the property.
    *
    * @remarks
    * [Api set: ExcelApi 1.16]
    */
  var cardView: js.UndefOr[Boolean] = js.undefined
  
  /**
    * True represents that the property is excluded from the properties which can be accessed via the FIELDVALUE function. False and undefined represent the default behavior of including the property.
    *
    * @remarks
    * [Api set: ExcelApi 1.16]
    */
  var dotNotation: js.UndefOr[Boolean] = js.undefined
}
object CellValuePropertyMetadataExclusions {
  
  inline def apply(): CellValuePropertyMetadataExclusions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CellValuePropertyMetadataExclusions]
  }
  
  extension [Self <: CellValuePropertyMetadataExclusions](x: Self) {
    
    inline def setAutoComplete(value: Boolean): Self = StObject.set(x, "autoComplete", value.asInstanceOf[js.Any])
    
    inline def setAutoCompleteUndefined: Self = StObject.set(x, "autoComplete", js.undefined)
    
    inline def setCalcCompare(value: Boolean): Self = StObject.set(x, "calcCompare", value.asInstanceOf[js.Any])
    
    inline def setCalcCompareUndefined: Self = StObject.set(x, "calcCompare", js.undefined)
    
    inline def setCardView(value: Boolean): Self = StObject.set(x, "cardView", value.asInstanceOf[js.Any])
    
    inline def setCardViewUndefined: Self = StObject.set(x, "cardView", js.undefined)
    
    inline def setDotNotation(value: Boolean): Self = StObject.set(x, "dotNotation", value.asInstanceOf[js.Any])
    
    inline def setDotNotationUndefined: Self = StObject.set(x, "dotNotation", js.undefined)
  }
}
