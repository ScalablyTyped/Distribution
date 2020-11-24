package typings.officeJsPreview.Excel.Interfaces

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** An interface describing the data returned by calling `removeDuplicatesResult.toJSON()`. */
@js.native
trait RemoveDuplicatesResultData extends js.Object {
  
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
  implicit class RemoveDuplicatesResultDataOps[Self <: RemoveDuplicatesResultData] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setRemoved(value: Double): Self = this.set("removed", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRemoved: Self = this.set("removed", js.undefined)
    
    @scala.inline
    def setUniqueRemaining(value: Double): Self = this.set("uniqueRemaining", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteUniqueRemaining: Self = this.set("uniqueRemaining", js.undefined)
  }
}
