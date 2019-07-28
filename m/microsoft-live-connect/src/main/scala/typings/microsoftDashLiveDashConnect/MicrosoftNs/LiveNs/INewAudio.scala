package typings.microsoftDashLiveDashConnect.MicrosoftNs.LiveNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Represents a new audio item.
  */
trait INewAudio extends js.Object {
  /**
    * The audio's album name.
    */
  var album: js.UndefOr[String] = js.undefined
  /**
    * The artist name of the audio's album.
    */
  var album_artist: js.UndefOr[String] = js.undefined
  /**
    * The audio's artist name.
    */
  var artist: js.UndefOr[String] = js.undefined
  /**
    * A description of the audio.
    */
  var description: js.UndefOr[String] = js.undefined
  /**
    * The audio's genre.
    */
  var genre: js.UndefOr[String] = js.undefined
  /**
    * The name of the audio.
    */
  var name: String
  /**
    * The audio's title.
    */
  var title: js.UndefOr[String] = js.undefined
}

object INewAudio {
  @scala.inline
  def apply(
    name: String,
    album: String = null,
    album_artist: String = null,
    artist: String = null,
    description: String = null,
    genre: String = null,
    title: String = null
  ): INewAudio = {
    val __obj = js.Dynamic.literal(name = name)
    if (album != null) __obj.updateDynamic("album")(album)
    if (album_artist != null) __obj.updateDynamic("album_artist")(album_artist)
    if (artist != null) __obj.updateDynamic("artist")(artist)
    if (description != null) __obj.updateDynamic("description")(description)
    if (genre != null) __obj.updateDynamic("genre")(genre)
    if (title != null) __obj.updateDynamic("title")(title)
    __obj.asInstanceOf[INewAudio]
  }
}

