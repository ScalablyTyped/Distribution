package typings.musicmatch

import typings.musicmatch.mod.PrimaryGenres
import typings.musicmatch.mod.TBoolean
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonAlbumid extends js.Object {
  var album_id: Double
  var album_name: String
  var artist_id: Double
  var artist_name: String
  var commontrack_id: Double
  var explicit: TBoolean
  var has_lyrics: TBoolean
  var has_richsync: TBoolean
  var has_subtitles: TBoolean
  var instrumental: TBoolean
  var num_favourite: Double
  var primary_genres: PrimaryGenres
  var restricted: TBoolean
  var track_edit_url: String
  var track_id: Double
  var track_name: String
  var track_name_translation_list: js.Array[_]
  var track_rating: Double
  var track_share_url: String
  var updated_time: String
}

object AnonAlbumid {
  @scala.inline
  def apply(
    album_id: Double,
    album_name: String,
    artist_id: Double,
    artist_name: String,
    commontrack_id: Double,
    explicit: TBoolean,
    has_lyrics: TBoolean,
    has_richsync: TBoolean,
    has_subtitles: TBoolean,
    instrumental: TBoolean,
    num_favourite: Double,
    primary_genres: PrimaryGenres,
    restricted: TBoolean,
    track_edit_url: String,
    track_id: Double,
    track_name: String,
    track_name_translation_list: js.Array[_],
    track_rating: Double,
    track_share_url: String,
    updated_time: String
  ): AnonAlbumid = {
    val __obj = js.Dynamic.literal(album_id = album_id.asInstanceOf[js.Any], album_name = album_name.asInstanceOf[js.Any], artist_id = artist_id.asInstanceOf[js.Any], artist_name = artist_name.asInstanceOf[js.Any], commontrack_id = commontrack_id.asInstanceOf[js.Any], explicit = explicit.asInstanceOf[js.Any], has_lyrics = has_lyrics.asInstanceOf[js.Any], has_richsync = has_richsync.asInstanceOf[js.Any], has_subtitles = has_subtitles.asInstanceOf[js.Any], instrumental = instrumental.asInstanceOf[js.Any], num_favourite = num_favourite.asInstanceOf[js.Any], primary_genres = primary_genres.asInstanceOf[js.Any], restricted = restricted.asInstanceOf[js.Any], track_edit_url = track_edit_url.asInstanceOf[js.Any], track_id = track_id.asInstanceOf[js.Any], track_name = track_name.asInstanceOf[js.Any], track_name_translation_list = track_name_translation_list.asInstanceOf[js.Any], track_rating = track_rating.asInstanceOf[js.Any], track_share_url = track_share_url.asInstanceOf[js.Any], updated_time = updated_time.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AnonAlbumid]
  }
}

