package typings.officeJsPreview.Excel.Interfaces

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** An interface describing the data returned by calling `removeDuplicatesResult.toJSON()`. */
@js.native
trait RemoveDuplicatesResultData extends StObject {
  
  /**
    *
    * Number of duplicated rows removed by the operation.
    *
    * [Api set: ExcelApi 1.9]
    */
  var removed: js.UndefOr[Double] = js.native
  
  /**
    *
    * Number of remaining unique rows present in the resulting range.
    *
    * [Api set: ExcelApi 1.9]
    */
  var uniqueRemaining: js.UndefOr[Double] = js.native
}
object RemoveDuplicatesResultData {
  
  @scala.inline
  def apply(): RemoveDuplicatesResultData = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[RemoveDuplicatesResultData]
  }
  
  @scala.inline
  implicit class RemoveDuplicatesResultDataMutableBuilder[Self <: RemoveDuplicatesResultData] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setRemoved(value: Double): Self = StObject.set(x, "removed", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRemovedUndefined: Self = StObject.set(x, "removed", js.undefined)
    
    @scala.inline
    def setUniqueRemaining(value: Double): Self = StObject.set(x, "uniqueRemaining", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUniqueRemainingUndefined: Self = StObject.set(x, "uniqueRemaining", js.undefined)
  }
}
