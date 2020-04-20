package typings.moviedb.mod.MovieDB

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MovieImage extends js.Object {
  var aspect_ratio: Double
  var file_path: String
  var height: Double
  var iso_639_1: String
  var vote_average: Double
  var vote_count: Double
  var width: Double
}

object MovieImage {
  @scala.inline
  def apply(
    aspect_ratio: Double,
    file_path: String,
    height: Double,
    iso_639_1: String,
    vote_average: Double,
    vote_count: Double,
    width: Double
  ): MovieImage = {
    val __obj = js.Dynamic.literal(aspect_ratio = aspect_ratio.asInstanceOf[js.Any], file_path = file_path.asInstanceOf[js.Any], height = height.asInstanceOf[js.Any], iso_639_1 = iso_639_1.asInstanceOf[js.Any], vote_average = vote_average.asInstanceOf[js.Any], vote_count = vote_count.asInstanceOf[js.Any], width = width.asInstanceOf[js.Any])
    __obj.asInstanceOf[MovieImage]
  }
}

