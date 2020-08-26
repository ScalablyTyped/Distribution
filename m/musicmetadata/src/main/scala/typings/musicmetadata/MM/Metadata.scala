package typings.musicmetadata.MM

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Metadata extends js.Object {
  var album: String = js.native
  var albumartist: js.Array[String] = js.native
  var artist: js.Array[String] = js.native
  var disk: NoOf = js.native
  var duration: Double = js.native
  var genre: js.Array[String] = js.native
  var picture: js.Array[Picture] = js.native
  var title: String = js.native
  var track: NoOf = js.native
  var year: String = js.native
}

object Metadata {
  @scala.inline
  def apply(
    album: String,
    albumartist: js.Array[String],
    artist: js.Array[String],
    disk: NoOf,
    duration: Double,
    genre: js.Array[String],
    picture: js.Array[Picture],
    title: String,
    track: NoOf,
    year: String
  ): Metadata = {
    val __obj = js.Dynamic.literal(album = album.asInstanceOf[js.Any], albumartist = albumartist.asInstanceOf[js.Any], artist = artist.asInstanceOf[js.Any], disk = disk.asInstanceOf[js.Any], duration = duration.asInstanceOf[js.Any], genre = genre.asInstanceOf[js.Any], picture = picture.asInstanceOf[js.Any], title = title.asInstanceOf[js.Any], track = track.asInstanceOf[js.Any], year = year.asInstanceOf[js.Any])
    __obj.asInstanceOf[Metadata]
  }
  @scala.inline
  implicit class MetadataOps[Self <: Metadata] (val x: Self) extends AnyVal {
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
    def setAlbum(value: String): Self = this.set("album", value.asInstanceOf[js.Any])
    @scala.inline
    def setAlbumartistVarargs(value: String*): Self = this.set("albumartist", js.Array(value :_*))
    @scala.inline
    def setAlbumartist(value: js.Array[String]): Self = this.set("albumartist", value.asInstanceOf[js.Any])
    @scala.inline
    def setArtistVarargs(value: String*): Self = this.set("artist", js.Array(value :_*))
    @scala.inline
    def setArtist(value: js.Array[String]): Self = this.set("artist", value.asInstanceOf[js.Any])
    @scala.inline
    def setDisk(value: NoOf): Self = this.set("disk", value.asInstanceOf[js.Any])
    @scala.inline
    def setDuration(value: Double): Self = this.set("duration", value.asInstanceOf[js.Any])
    @scala.inline
    def setGenreVarargs(value: String*): Self = this.set("genre", js.Array(value :_*))
    @scala.inline
    def setGenre(value: js.Array[String]): Self = this.set("genre", value.asInstanceOf[js.Any])
    @scala.inline
    def setPictureVarargs(value: Picture*): Self = this.set("picture", js.Array(value :_*))
    @scala.inline
    def setPicture(value: js.Array[Picture]): Self = this.set("picture", value.asInstanceOf[js.Any])
    @scala.inline
    def setTitle(value: String): Self = this.set("title", value.asInstanceOf[js.Any])
    @scala.inline
    def setTrack(value: NoOf): Self = this.set("track", value.asInstanceOf[js.Any])
    @scala.inline
    def setYear(value: String): Self = this.set("year", value.asInstanceOf[js.Any])
  }
  
}

