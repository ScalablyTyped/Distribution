package typings.moviedb.mod.MovieDB

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SearchResults extends js.Object {
  
  var page: Double = js.native
  
  var results: js.Array[SearchResult] = js.native
  
  var total_Pages: Double = js.native
  
  var total_results: Double = js.native
}
object SearchResults {
  
  @scala.inline
  def apply(page: Double, results: js.Array[SearchResult], total_Pages: Double, total_results: Double): SearchResults = {
    val __obj = js.Dynamic.literal(page = page.asInstanceOf[js.Any], results = results.asInstanceOf[js.Any], total_Pages = total_Pages.asInstanceOf[js.Any], total_results = total_results.asInstanceOf[js.Any])
    __obj.asInstanceOf[SearchResults]
  }
  
  @scala.inline
  implicit class SearchResultsOps[Self <: SearchResults] (val x: Self) extends AnyVal {
    
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
    def setPage(value: Double): Self = this.set("page", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResultsVarargs(value: SearchResult*): Self = this.set("results", js.Array(value :_*))
    
    @scala.inline
    def setResults(value: js.Array[SearchResult]): Self = this.set("results", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTotal_Pages(value: Double): Self = this.set("total_Pages", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTotal_results(value: Double): Self = this.set("total_results", value.asInstanceOf[js.Any])
  }
}
