package typings.moviedb.mod.MovieDB

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait MovieImages extends js.Object {
  var backdrops: js.Array[MovieImage] = js.native
  var id: Double = js.native
  var posters: js.Array[MovieImage] = js.native
}

object MovieImages {
  @scala.inline
  def apply(backdrops: js.Array[MovieImage], id: Double, posters: js.Array[MovieImage]): MovieImages = {
    val __obj = js.Dynamic.literal(backdrops = backdrops.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], posters = posters.asInstanceOf[js.Any])
    __obj.asInstanceOf[MovieImages]
  }
  @scala.inline
  implicit class MovieImagesOps[Self <: MovieImages] (val x: Self) extends AnyVal {
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
    def setBackdropsVarargs(value: MovieImage*): Self = this.set("backdrops", js.Array(value :_*))
    @scala.inline
    def setBackdrops(value: js.Array[MovieImage]): Self = this.set("backdrops", value.asInstanceOf[js.Any])
    @scala.inline
    def setId(value: Double): Self = this.set("id", value.asInstanceOf[js.Any])
    @scala.inline
    def setPostersVarargs(value: MovieImage*): Self = this.set("posters", js.Array(value :_*))
    @scala.inline
    def setPosters(value: js.Array[MovieImage]): Self = this.set("posters", value.asInstanceOf[js.Any])
  }
  
}

