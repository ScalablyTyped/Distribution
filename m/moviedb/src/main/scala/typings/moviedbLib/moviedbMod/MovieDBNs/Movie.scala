package typings
package moviedbLib.moviedbMod.MovieDBNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Movie extends js.Object {
  var adult: scala.Boolean
  var backdrop_path: java.lang.String
  var belongs_to_collection: js.Any
  var budget: scala.Double
  var genres: js.Array[Genre]
  var homepage: java.lang.String
  var id: scala.Double
  var imdb_id: scala.Double
  var original_title: java.lang.String
  var overview: java.lang.String
  var popularity: scala.Double
  var poster_path: java.lang.String
  var production_companies: js.Array[ProductionCompany]
  var production_countries: js.Array[ProductionCountry]
  var release_date: stdLib.Date
  var revenue: scala.Double
  var runtime: scala.Double
  var spoken_languages: js.Array[SpokenLanguage]
  var status: java.lang.String
  var tagline: java.lang.String
  var title: java.lang.String
  var vote_average: scala.Double
  var vote_count: scala.Double
}

object Movie {
  @scala.inline
  def apply(
    adult: scala.Boolean,
    backdrop_path: java.lang.String,
    belongs_to_collection: js.Any,
    budget: scala.Double,
    genres: js.Array[Genre],
    homepage: java.lang.String,
    id: scala.Double,
    imdb_id: scala.Double,
    original_title: java.lang.String,
    overview: java.lang.String,
    popularity: scala.Double,
    poster_path: java.lang.String,
    production_companies: js.Array[ProductionCompany],
    production_countries: js.Array[ProductionCountry],
    release_date: stdLib.Date,
    revenue: scala.Double,
    runtime: scala.Double,
    spoken_languages: js.Array[SpokenLanguage],
    status: java.lang.String,
    tagline: java.lang.String,
    title: java.lang.String,
    vote_average: scala.Double,
    vote_count: scala.Double
  ): Movie = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("adult")(adult)
    __obj.updateDynamic("backdrop_path")(backdrop_path)
    __obj.updateDynamic("belongs_to_collection")(belongs_to_collection)
    __obj.updateDynamic("budget")(budget)
    __obj.updateDynamic("genres")(genres)
    __obj.updateDynamic("homepage")(homepage)
    __obj.updateDynamic("id")(id)
    __obj.updateDynamic("imdb_id")(imdb_id)
    __obj.updateDynamic("original_title")(original_title)
    __obj.updateDynamic("overview")(overview)
    __obj.updateDynamic("popularity")(popularity)
    __obj.updateDynamic("poster_path")(poster_path)
    __obj.updateDynamic("production_companies")(production_companies)
    __obj.updateDynamic("production_countries")(production_countries)
    __obj.updateDynamic("release_date")(release_date)
    __obj.updateDynamic("revenue")(revenue)
    __obj.updateDynamic("runtime")(runtime)
    __obj.updateDynamic("spoken_languages")(spoken_languages)
    __obj.updateDynamic("status")(status)
    __obj.updateDynamic("tagline")(tagline)
    __obj.updateDynamic("title")(title)
    __obj.updateDynamic("vote_average")(vote_average)
    __obj.updateDynamic("vote_count")(vote_count)
    __obj.asInstanceOf[Movie]
  }
}

