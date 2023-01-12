package typings.officeJsPreview.Excel.Interfaces

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** An interface describing the data returned by calling `removeDuplicatesResult.toJSON()`. */
trait RemoveDuplicatesResultData extends StObject {
  
  /**
    * Number of duplicated rows removed by the operation.
    *
    * @remarks
    * [Api set: ExcelApi 1.9]
    */
  var removed: js.UndefOr[Double] = js.undefined
  
  /**
    * Number of remaining unique rows present in the resulting range.
    *
    * @remarks
    * [Api set: ExcelApi 1.9]
    */
  var uniqueRemaining: js.UndefOr[Double] = js.undefined
}
object RemoveDuplicatesResultData {
  
  inline def apply(): RemoveDuplicatesResultData = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[RemoveDuplicatesResultData]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: RemoveDuplicatesResultData] (val x: Self) extends AnyVal {
    
    inline def setRemoved(value: Double): Self = StObject.set(x, "removed", value.asInstanceOf[js.Any])
    
    inline def setRemovedUndefined: Self = StObject.set(x, "removed", js.undefined)
    
    inline def setUniqueRemaining(value: Double): Self = StObject.set(x, "uniqueRemaining", value.asInstanceOf[js.Any])
    
    inline def setUniqueRemainingUndefined: Self = StObject.set(x, "uniqueRemaining", js.undefined)
  }
}
