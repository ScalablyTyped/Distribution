package typings.musicmatch.musicmatchMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AlbumParams extends js.Object {
  var album_id: Double
}

object AlbumParams {
  @scala.inline
  def apply(album_id: Double): AlbumParams = {
    val __obj = js.Dynamic.literal(album_id = album_id)
  
    __obj.asInstanceOf[AlbumParams]
  }
}

