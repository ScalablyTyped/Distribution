package typings.moviedb.mod.MovieDB

import typings.std.Date
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Movie extends js.Object {
  var adult: Boolean
  var backdrop_path: String
  var belongs_to_collection: js.Any
  var budget: Double
  var genres: js.Array[Genre]
  var homepage: String
  var id: Double
  var imdb_id: Double
  var original_title: String
  var overview: String
  var popularity: Double
  var poster_path: String
  var production_companies: js.Array[ProductionCompany]
  var production_countries: js.Array[ProductionCountry]
  var release_date: Date
  var revenue: Double
  var runtime: Double
  var spoken_languages: js.Array[SpokenLanguage]
  var status: String
  var tagline: String
  var title: String
  var vote_average: Double
  var vote_count: Double
}

object Movie {
  @scala.inline
  def apply(
    adult: Boolean,
    backdrop_path: String,
    belongs_to_collection: js.Any,
    budget: Double,
    genres: js.Array[Genre],
    homepage: String,
    id: Double,
    imdb_id: Double,
    original_title: String,
    overview: String,
    popularity: Double,
    poster_path: String,
    production_companies: js.Array[ProductionCompany],
    production_countries: js.Array[ProductionCountry],
    release_date: Date,
    revenue: Double,
    runtime: Double,
    spoken_languages: js.Array[SpokenLanguage],
    status: String,
    tagline: String,
    title: String,
    vote_average: Double,
    vote_count: Double
  ): Movie = {
    val __obj = js.Dynamic.literal(adult = adult.asInstanceOf[js.Any], backdrop_path = backdrop_path.asInstanceOf[js.Any], belongs_to_collection = belongs_to_collection.asInstanceOf[js.Any], budget = budget.asInstanceOf[js.Any], genres = genres.asInstanceOf[js.Any], homepage = homepage.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], imdb_id = imdb_id.asInstanceOf[js.Any], original_title = original_title.asInstanceOf[js.Any], overview = overview.asInstanceOf[js.Any], popularity = popularity.asInstanceOf[js.Any], poster_path = poster_path.asInstanceOf[js.Any], production_companies = production_companies.asInstanceOf[js.Any], production_countries = production_countries.asInstanceOf[js.Any], release_date = release_date.asInstanceOf[js.Any], revenue = revenue.asInstanceOf[js.Any], runtime = runtime.asInstanceOf[js.Any], spoken_languages = spoken_languages.asInstanceOf[js.Any], status = status.asInstanceOf[js.Any], tagline = tagline.asInstanceOf[js.Any], title = title.asInstanceOf[js.Any], vote_average = vote_average.asInstanceOf[js.Any], vote_count = vote_count.asInstanceOf[js.Any])
    __obj.asInstanceOf[Movie]
  }
}

