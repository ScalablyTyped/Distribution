package typings
package moviedbLib.moviedbMod.MovieDBNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SearchResults extends js.Object {
  var page: scala.Double
  var results: js.Array[SearchResult]
  var total_Pages: scala.Double
  var total_results: scala.Double
}

object SearchResults {
  @scala.inline
  def apply(
    page: scala.Double,
    results: js.Array[SearchResult],
    total_Pages: scala.Double,
    total_results: scala.Double
  ): SearchResults = {
    val __obj = js.Dynamic.literal(page = page, results = results, total_Pages = total_Pages, total_results = total_results)
  
    __obj.asInstanceOf[SearchResults]
  }
}

