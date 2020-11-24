package typings.nano.mod

import typings.nano.anon.Doc
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DocumentSearchResponse[V] extends js.Object {
  
  // token which if supplied to a subsequent search will return the next page of results.
  var bookmark: String = js.native
  
  // facet counts
  var counts: js.UndefOr[js.Object] = js.native
  
  var highlights: js.UndefOr[js.Object] = js.native
  
  // facet range results
  var ranges: js.UndefOr[js.Object] = js.native
  
  //  Array of search results
  var rows: js.Array[Doc[V]] = js.native
  
  // Number of documents in the search resykts
  var total_rows: Double = js.native
}
object DocumentSearchResponse {
  
  @scala.inline
  def apply[V](bookmark: String, rows: js.Array[Doc[V]], total_rows: Double): DocumentSearchResponse[V] = {
    val __obj = js.Dynamic.literal(bookmark = bookmark.asInstanceOf[js.Any], rows = rows.asInstanceOf[js.Any], total_rows = total_rows.asInstanceOf[js.Any])
    __obj.asInstanceOf[DocumentSearchResponse[V]]
  }
  
  @scala.inline
  implicit class DocumentSearchResponseOps[Self <: DocumentSearchResponse[_], V] (val x: Self with DocumentSearchResponse[V]) extends AnyVal {
    
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
    def setBookmark(value: String): Self = this.set("bookmark", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRowsVarargs(value: Doc[V]*): Self = this.set("rows", js.Array(value :_*))
    
    @scala.inline
    def setRows(value: js.Array[Doc[V]]): Self = this.set("rows", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTotal_rows(value: Double): Self = this.set("total_rows", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCounts(value: js.Object): Self = this.set("counts", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCounts: Self = this.set("counts", js.undefined)
    
    @scala.inline
    def setHighlights(value: js.Object): Self = this.set("highlights", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteHighlights: Self = this.set("highlights", js.undefined)
    
    @scala.inline
    def setRanges(value: js.Object): Self = this.set("ranges", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRanges: Self = this.set("ranges", js.undefined)
  }
}
