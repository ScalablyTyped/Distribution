package typings
package moviedbLib.moviedbMod.MovieDBNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MovieImage extends js.Object {
  var aspect_ratio: scala.Double
  var file_path: java.lang.String
  var height: scala.Double
  var iso_639_1: java.lang.String
  var vote_average: scala.Double
  var vote_count: scala.Double
  var width: scala.Double
}

object MovieImage {
  @scala.inline
  def apply(
    aspect_ratio: scala.Double,
    file_path: java.lang.String,
    height: scala.Double,
    iso_639_1: java.lang.String,
    vote_average: scala.Double,
    vote_count: scala.Double,
    width: scala.Double
  ): MovieImage = {
    val __obj = js.Dynamic.literal(aspect_ratio = aspect_ratio, file_path = file_path, height = height, iso_639_1 = iso_639_1, vote_average = vote_average, vote_count = vote_count, width = width)
  
    __obj.asInstanceOf[MovieImage]
  }
}

