package typings
package moviedbLib.moviedbMod.MovieDBNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SearchResult extends js.Object {
  var adult: scala.Boolean
  var backdrop_path: java.lang.String
  var id: scala.Double
  var original_title: java.lang.String
  var popularity: scala.Double
  var poster_path: java.lang.String
  var release_date: stdLib.Date
  var title: java.lang.String
  var vote_average: scala.Double
  var vote_count: scala.Double
}

object SearchResult {
  @scala.inline
  def apply(
    adult: scala.Boolean,
    backdrop_path: java.lang.String,
    id: scala.Double,
    original_title: java.lang.String,
    popularity: scala.Double,
    poster_path: java.lang.String,
    release_date: stdLib.Date,
    title: java.lang.String,
    vote_average: scala.Double,
    vote_count: scala.Double
  ): SearchResult = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("adult")(adult)
    __obj.updateDynamic("backdrop_path")(backdrop_path)
    __obj.updateDynamic("id")(id)
    __obj.updateDynamic("original_title")(original_title)
    __obj.updateDynamic("popularity")(popularity)
    __obj.updateDynamic("poster_path")(poster_path)
    __obj.updateDynamic("release_date")(release_date)
    __obj.updateDynamic("title")(title)
    __obj.updateDynamic("vote_average")(vote_average)
    __obj.updateDynamic("vote_count")(vote_count)
    __obj.asInstanceOf[SearchResult]
  }
}

