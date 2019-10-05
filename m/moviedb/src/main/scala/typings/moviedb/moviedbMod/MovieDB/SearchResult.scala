package typings.moviedb.moviedbMod.MovieDB

import typings.std.Date
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SearchResult extends js.Object {
  var adult: Boolean
  var backdrop_path: String
  var id: Double
  var original_title: String
  var popularity: Double
  var poster_path: String
  var release_date: Date
  var title: String
  var vote_average: Double
  var vote_count: Double
}

object SearchResult {
  @scala.inline
  def apply(
    adult: Boolean,
    backdrop_path: String,
    id: Double,
    original_title: String,
    popularity: Double,
    poster_path: String,
    release_date: Date,
    title: String,
    vote_average: Double,
    vote_count: Double
  ): SearchResult = {
    val __obj = js.Dynamic.literal(adult = adult, backdrop_path = backdrop_path, id = id, original_title = original_title, popularity = popularity, poster_path = poster_path, release_date = release_date, title = title, vote_average = vote_average, vote_count = vote_count)
  
    __obj.asInstanceOf[SearchResult]
  }
}

