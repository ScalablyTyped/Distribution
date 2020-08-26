package typings.moviedb.mod.MovieDB

import typings.std.Date
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Movie extends js.Object {
  var adult: Boolean = js.native
  var backdrop_path: String = js.native
  var belongs_to_collection: js.Any = js.native
  var budget: Double = js.native
  var genres: js.Array[Genre] = js.native
  var homepage: String = js.native
  var id: Double = js.native
  var imdb_id: Double = js.native
  var original_title: String = js.native
  var overview: String = js.native
  var popularity: Double = js.native
  var poster_path: String = js.native
  var production_companies: js.Array[ProductionCompany] = js.native
  var production_countries: js.Array[ProductionCountry] = js.native
  var release_date: Date = js.native
  var revenue: Double = js.native
  var runtime: Double = js.native
  var spoken_languages: js.Array[SpokenLanguage] = js.native
  var status: String = js.native
  var tagline: String = js.native
  var title: String = js.native
  var vote_average: Double = js.native
  var vote_count: Double = js.native
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
  @scala.inline
  implicit class MovieOps[Self <: Movie] (val x: Self) extends AnyVal {
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
    def setAdult(value: Boolean): Self = this.set("adult", value.asInstanceOf[js.Any])
    @scala.inline
    def setBackdrop_path(value: String): Self = this.set("backdrop_path", value.asInstanceOf[js.Any])
    @scala.inline
    def setBelongs_to_collection(value: js.Any): Self = this.set("belongs_to_collection", value.asInstanceOf[js.Any])
    @scala.inline
    def setBudget(value: Double): Self = this.set("budget", value.asInstanceOf[js.Any])
    @scala.inline
    def setGenresVarargs(value: Genre*): Self = this.set("genres", js.Array(value :_*))
    @scala.inline
    def setGenres(value: js.Array[Genre]): Self = this.set("genres", value.asInstanceOf[js.Any])
    @scala.inline
    def setHomepage(value: String): Self = this.set("homepage", value.asInstanceOf[js.Any])
    @scala.inline
    def setId(value: Double): Self = this.set("id", value.asInstanceOf[js.Any])
    @scala.inline
    def setImdb_id(value: Double): Self = this.set("imdb_id", value.asInstanceOf[js.Any])
    @scala.inline
    def setOriginal_title(value: String): Self = this.set("original_title", value.asInstanceOf[js.Any])
    @scala.inline
    def setOverview(value: String): Self = this.set("overview", value.asInstanceOf[js.Any])
    @scala.inline
    def setPopularity(value: Double): Self = this.set("popularity", value.asInstanceOf[js.Any])
    @scala.inline
    def setPoster_path(value: String): Self = this.set("poster_path", value.asInstanceOf[js.Any])
    @scala.inline
    def setProduction_companiesVarargs(value: ProductionCompany*): Self = this.set("production_companies", js.Array(value :_*))
    @scala.inline
    def setProduction_companies(value: js.Array[ProductionCompany]): Self = this.set("production_companies", value.asInstanceOf[js.Any])
    @scala.inline
    def setProduction_countriesVarargs(value: ProductionCountry*): Self = this.set("production_countries", js.Array(value :_*))
    @scala.inline
    def setProduction_countries(value: js.Array[ProductionCountry]): Self = this.set("production_countries", value.asInstanceOf[js.Any])
    @scala.inline
    def setRelease_date(value: Date): Self = this.set("release_date", value.asInstanceOf[js.Any])
    @scala.inline
    def setRevenue(value: Double): Self = this.set("revenue", value.asInstanceOf[js.Any])
    @scala.inline
    def setRuntime(value: Double): Self = this.set("runtime", value.asInstanceOf[js.Any])
    @scala.inline
    def setSpoken_languagesVarargs(value: SpokenLanguage*): Self = this.set("spoken_languages", js.Array(value :_*))
    @scala.inline
    def setSpoken_languages(value: js.Array[SpokenLanguage]): Self = this.set("spoken_languages", value.asInstanceOf[js.Any])
    @scala.inline
    def setStatus(value: String): Self = this.set("status", value.asInstanceOf[js.Any])
    @scala.inline
    def setTagline(value: String): Self = this.set("tagline", value.asInstanceOf[js.Any])
    @scala.inline
    def setTitle(value: String): Self = this.set("title", value.asInstanceOf[js.Any])
    @scala.inline
    def setVote_average(value: Double): Self = this.set("vote_average", value.asInstanceOf[js.Any])
    @scala.inline
    def setVote_count(value: Double): Self = this.set("vote_count", value.asInstanceOf[js.Any])
  }
  
}

