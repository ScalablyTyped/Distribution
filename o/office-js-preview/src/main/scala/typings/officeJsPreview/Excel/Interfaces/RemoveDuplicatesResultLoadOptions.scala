package typings.officeJsPreview.Excel.Interfaces

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Represents the results from `Range.removeDuplicates`.
  *
  * @remarks
  * [Api set: ExcelApi 1.9]
  */
trait RemoveDuplicatesResultLoadOptions extends StObject {
  
  /**
    Specifying `$all` for the LoadOptions loads all the scalar properties (e.g.: `Range.address`) but not the navigational properties (e.g.: `Range.format.fill.color`).
    */
  @JSName("$all")
  var $all: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Number of duplicated rows removed by the operation.
    *
    * @remarks
    * [Api set: ExcelApi 1.9]
    */
  var removed: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Number of remaining unique rows present in the resulting range.
    *
    * @remarks
    * [Api set: ExcelApi 1.9]
    */
  var uniqueRemaining: js.UndefOr[Boolean] = js.undefined
}
object RemoveDuplicatesResultLoadOptions {
  
  inline def apply(): RemoveDuplicatesResultLoadOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[RemoveDuplicatesResultLoadOptions]
  }
  
  extension [Self <: RemoveDuplicatesResultLoadOptions](x: Self) {
    
    inline def set$all(value: Boolean): Self = StObject.set(x, "$all", value.asInstanceOf[js.Any])
    
    inline def set$allUndefined: Self = StObject.set(x, "$all", js.undefined)
    
    inline def setRemoved(value: Boolean): Self = StObject.set(x, "removed", value.asInstanceOf[js.Any])
    
    inline def setRemovedUndefined: Self = StObject.set(x, "removed", js.undefined)
    
    inline def setUniqueRemaining(value: Boolean): Self = StObject.set(x, "uniqueRemaining", value.asInstanceOf[js.Any])
    
    inline def setUniqueRemainingUndefined: Self = StObject.set(x, "uniqueRemaining", js.undefined)
  }
}
