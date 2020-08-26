package typings.microsoftLiveConnect.Microsoft.Live

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Represents a new audio item.
  */
@js.native
trait INewAudio extends js.Object {
  /**
    * The audio's album name.
    */
  var album: js.UndefOr[String] = js.native
  /**
    * The artist name of the audio's album.
    */
  var album_artist: js.UndefOr[String] = js.native
  /**
    * The audio's artist name.
    */
  var artist: js.UndefOr[String] = js.native
  /**
    * A description of the audio.
    */
  var description: js.UndefOr[String] = js.native
  /**
    * The audio's genre.
    */
  var genre: js.UndefOr[String] = js.native
  /**
    * The name of the audio.
    */
  var name: String = js.native
  /**
    * The audio's title.
    */
  var title: js.UndefOr[String] = js.native
}

object INewAudio {
  @scala.inline
  def apply(name: String): INewAudio = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[INewAudio]
  }
  @scala.inline
  implicit class INewAudioOps[Self <: INewAudio] (val x: Self) extends AnyVal {
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
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
    @scala.inline
    def setAlbum(value: String): Self = this.set("album", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAlbum: Self = this.set("album", js.undefined)
    @scala.inline
    def setAlbum_artist(value: String): Self = this.set("album_artist", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAlbum_artist: Self = this.set("album_artist", js.undefined)
    @scala.inline
    def setArtist(value: String): Self = this.set("artist", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteArtist: Self = this.set("artist", js.undefined)
    @scala.inline
    def setDescription(value: String): Self = this.set("description", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDescription: Self = this.set("description", js.undefined)
    @scala.inline
    def setGenre(value: String): Self = this.set("genre", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteGenre: Self = this.set("genre", js.undefined)
    @scala.inline
    def setTitle(value: String): Self = this.set("title", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTitle: Self = this.set("title", js.undefined)
  }
  
}

