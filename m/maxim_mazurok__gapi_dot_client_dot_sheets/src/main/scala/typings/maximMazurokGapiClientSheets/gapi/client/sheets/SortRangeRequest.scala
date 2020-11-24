package typings.maximMazurokGapiClientSheets.gapi.client.sheets

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SortRangeRequest extends js.Object {
  
  /** The range to sort. */
  var range: js.UndefOr[GridRange] = js.native
  
  /** The sort order per column. Later specifications are used when values are equal in the earlier specifications. */
  var sortSpecs: js.UndefOr[js.Array[SortSpec]] = js.native
}
object SortRangeRequest {
  
  @scala.inline
  def apply(): SortRangeRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SortRangeRequest]
  }
  
  @scala.inline
  implicit class SortRangeRequestOps[Self <: SortRangeRequest] (val x: Self) extends AnyVal {
    
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
    def setRange(value: GridRange): Self = this.set("range", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRange: Self = this.set("range", js.undefined)
    
    @scala.inline
    def setSortSpecsVarargs(value: SortSpec*): Self = this.set("sortSpecs", js.Array(value :_*))
    
    @scala.inline
    def setSortSpecs(value: js.Array[SortSpec]): Self = this.set("sortSpecs", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSortSpecs: Self = this.set("sortSpecs", js.undefined)
  }
}
