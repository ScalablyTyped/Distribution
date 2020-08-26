package typings.moviedb.mod.MovieDB

import typings.std.Date
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SearchResult extends js.Object {
  var adult: Boolean = js.native
  var backdrop_path: String = js.native
  var id: Double = js.native
  var original_title: String = js.native
  var popularity: Double = js.native
  var poster_path: String = js.native
  var release_date: Date = js.native
  var title: String = js.native
  var vote_average: Double = js.native
  var vote_count: Double = js.native
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
    val __obj = js.Dynamic.literal(adult = adult.asInstanceOf[js.Any], backdrop_path = backdrop_path.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], original_title = original_title.asInstanceOf[js.Any], popularity = popularity.asInstanceOf[js.Any], poster_path = poster_path.asInstanceOf[js.Any], release_date = release_date.asInstanceOf[js.Any], title = title.asInstanceOf[js.Any], vote_average = vote_average.asInstanceOf[js.Any], vote_count = vote_count.asInstanceOf[js.Any])
    __obj.asInstanceOf[SearchResult]
  }
  @scala.inline
  implicit class SearchResultOps[Self <: SearchResult] (val x: Self) extends AnyVal {
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
    def setId(value: Double): Self = this.set("id", value.asInstanceOf[js.Any])
    @scala.inline
    def setOriginal_title(value: String): Self = this.set("original_title", value.asInstanceOf[js.Any])
    @scala.inline
    def setPopularity(value: Double): Self = this.set("popularity", value.asInstanceOf[js.Any])
    @scala.inline
    def setPoster_path(value: String): Self = this.set("poster_path", value.asInstanceOf[js.Any])
    @scala.inline
    def setRelease_date(value: Date): Self = this.set("release_date", value.asInstanceOf[js.Any])
    @scala.inline
    def setTitle(value: String): Self = this.set("title", value.asInstanceOf[js.Any])
    @scala.inline
    def setVote_average(value: Double): Self = this.set("vote_average", value.asInstanceOf[js.Any])
    @scala.inline
    def setVote_count(value: Double): Self = this.set("vote_count", value.asInstanceOf[js.Any])
  }
  
}

