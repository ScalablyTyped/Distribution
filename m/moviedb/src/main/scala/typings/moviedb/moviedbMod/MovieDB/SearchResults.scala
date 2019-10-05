package typings.moviedb.moviedbMod.MovieDB

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SearchResults extends js.Object {
  var page: Double
  var results: js.Array[SearchResult]
  var total_Pages: Double
  var total_results: Double
}

object SearchResults {
  @scala.inline
  def apply(page: Double, results: js.Array[SearchResult], total_Pages: Double, total_results: Double): SearchResults = {
    val __obj = js.Dynamic.literal(page = page, results = results, total_Pages = total_Pages, total_results = total_results)
  
    __obj.asInstanceOf[SearchResults]
  }
}

