package typings.moviedb.mod.MovieDB

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MovieImages extends js.Object {
  var backdrops: js.Array[MovieImage]
  var id: Double
  var posters: js.Array[MovieImage]
}

object MovieImages {
  @scala.inline
  def apply(backdrops: js.Array[MovieImage], id: Double, posters: js.Array[MovieImage]): MovieImages = {
    val __obj = js.Dynamic.literal(backdrops = backdrops.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], posters = posters.asInstanceOf[js.Any])
    __obj.asInstanceOf[MovieImages]
  }
}

