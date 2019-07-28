package typings.musicmatch

import typings.musicmatch.musicmatchMod.PrimaryGenres
import typings.musicmatch.musicmatchMod.TBoolean
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Albumid extends js.Object {
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

object Anon_Albumid {
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
  ): Anon_Albumid = {
    val __obj = js.Dynamic.literal(album_id = album_id, album_name = album_name, artist_id = artist_id, artist_name = artist_name, commontrack_id = commontrack_id, explicit = explicit, has_lyrics = has_lyrics, has_richsync = has_richsync, has_subtitles = has_subtitles, instrumental = instrumental, num_favourite = num_favourite, primary_genres = primary_genres, restricted = restricted, track_edit_url = track_edit_url, track_id = track_id, track_name = track_name, track_name_translation_list = track_name_translation_list, track_rating = track_rating, track_share_url = track_share_url, updated_time = updated_time)
  
    __obj.asInstanceOf[Anon_Albumid]
  }
}

