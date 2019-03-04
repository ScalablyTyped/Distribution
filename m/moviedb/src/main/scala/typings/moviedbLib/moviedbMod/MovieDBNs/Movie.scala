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
    val __obj = js.Dynamic.literal(adult = adult, backdrop_path = backdrop_path, belongs_to_collection = belongs_to_collection, budget = budget, genres = genres, homepage = homepage, id = id, imdb_id = imdb_id, original_title = original_title, overview = overview, popularity = popularity, poster_path = poster_path, production_companies = production_companies, production_countries = production_countries, release_date = release_date, revenue = revenue, runtime = runtime, spoken_languages = spoken_languages, status = status, tagline = tagline, title = title, vote_average = vote_average, vote_count = vote_count)
  
    __obj.asInstanceOf[Movie]
  }
}

