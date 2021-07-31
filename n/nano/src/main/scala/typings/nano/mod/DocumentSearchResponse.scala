package typings.nano.mod

import typings.nano.anon.Doc
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DocumentSearchResponse[V] extends StObject {
  
  // token which if supplied to a subsequent search will return the next page of results.
  var bookmark: String
  
  // facet counts
  var counts: js.UndefOr[js.Object] = js.undefined
  
  var highlights: js.UndefOr[js.Object] = js.undefined
  
  // facet range results
  var ranges: js.UndefOr[js.Object] = js.undefined
  
  //  Array of search results
  var rows: js.Array[Doc[V]]
  
  // Number of documents in the search resykts
  var total_rows: Double
}
object DocumentSearchResponse {
  
  @scala.inline
  def apply[V](bookmark: String, rows: js.Array[Doc[V]], total_rows: Double): DocumentSearchResponse[V] = {
    val __obj = js.Dynamic.literal(bookmark = bookmark.asInstanceOf[js.Any], rows = rows.asInstanceOf[js.Any], total_rows = total_rows.asInstanceOf[js.Any])
    __obj.asInstanceOf[DocumentSearchResponse[V]]
  }
  
  @scala.inline
  implicit class DocumentSearchResponseMutableBuilder[Self <: DocumentSearchResponse[?], V] (val x: Self & DocumentSearchResponse[V]) extends AnyVal {
    
    @scala.inline
    def setBookmark(value: String): Self = StObject.set(x, "bookmark", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCounts(value: js.Object): Self = StObject.set(x, "counts", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCountsUndefined: Self = StObject.set(x, "counts", js.undefined)
    
    @scala.inline
    def setHighlights(value: js.Object): Self = StObject.set(x, "highlights", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHighlightsUndefined: Self = StObject.set(x, "highlights", js.undefined)
    
    @scala.inline
    def setRanges(value: js.Object): Self = StObject.set(x, "ranges", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRangesUndefined: Self = StObject.set(x, "ranges", js.undefined)
    
    @scala.inline
    def setRows(value: js.Array[Doc[V]]): Self = StObject.set(x, "rows", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRowsVarargs(value: Doc[V]*): Self = StObject.set(x, "rows", js.Array(value :_*))
    
    @scala.inline
    def setTotal_rows(value: Double): Self = StObject.set(x, "total_rows", value.asInstanceOf[js.Any])
  }
}
