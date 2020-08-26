package typings.musicmatch.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AlbumTracksParams extends js.Object {
  var album_id: js.UndefOr[Double] = js.native
  var album_mbid: js.UndefOr[Double] = js.native
  var format: js.UndefOr[TFormat] = js.native
}

object AlbumTracksParams {
  @scala.inline
  def apply(): AlbumTracksParams = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AlbumTracksParams]
  }
  @scala.inline
  implicit class AlbumTracksParamsOps[Self <: AlbumTracksParams] (val x: Self) extends AnyVal {
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
    def setAlbum_id(value: Double): Self = this.set("album_id", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAlbum_id: Self = this.set("album_id", js.undefined)
    @scala.inline
    def setAlbum_mbid(value: Double): Self = this.set("album_mbid", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAlbum_mbid: Self = this.set("album_mbid", js.undefined)
    @scala.inline
    def setFormat(value: TFormat): Self = this.set("format", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFormat: Self = this.set("format", js.undefined)
  }
  
}

