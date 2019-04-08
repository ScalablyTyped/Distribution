package typings
package musicmatchLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Albumid extends js.Object {
  var album_id: scala.Double
  var album_name: java.lang.String
  var artist_id: scala.Double
  var artist_name: java.lang.String
  var commontrack_id: scala.Double
  var explicit: musicmatchLib.musicmatchMod.TBoolean
  var has_lyrics: musicmatchLib.musicmatchMod.TBoolean
  var has_richsync: musicmatchLib.musicmatchMod.TBoolean
  var has_subtitles: musicmatchLib.musicmatchMod.TBoolean
  var instrumental: musicmatchLib.musicmatchMod.TBoolean
  var num_favourite: scala.Double
  var primary_genres: musicmatchLib.musicmatchMod.PrimaryGenres
  var restricted: musicmatchLib.musicmatchMod.TBoolean
  var track_edit_url: java.lang.String
  var track_id: scala.Double
  var track_name: java.lang.String
  var track_name_translation_list: js.Array[_]
  var track_rating: scala.Double
  var track_share_url: java.lang.String
  var updated_time: java.lang.String
}

object Anon_Albumid {
  @scala.inline
  def apply(
    album_id: scala.Double,
    album_name: java.lang.String,
    artist_id: scala.Double,
    artist_name: java.lang.String,
    commontrack_id: scala.Double,
    explicit: musicmatchLib.musicmatchMod.TBoolean,
    has_lyrics: musicmatchLib.musicmatchMod.TBoolean,
    has_richsync: musicmatchLib.musicmatchMod.TBoolean,
    has_subtitles: musicmatchLib.musicmatchMod.TBoolean,
    instrumental: musicmatchLib.musicmatchMod.TBoolean,
    num_favourite: scala.Double,
    primary_genres: musicmatchLib.musicmatchMod.PrimaryGenres,
    restricted: musicmatchLib.musicmatchMod.TBoolean,
    track_edit_url: java.lang.String,
    track_id: scala.Double,
    track_name: java.lang.String,
    track_name_translation_list: js.Array[_],
    track_rating: scala.Double,
    track_share_url: java.lang.String,
    updated_time: java.lang.String
  ): Anon_Albumid = {
    val __obj = js.Dynamic.literal(album_id = album_id, album_name = album_name, artist_id = artist_id, artist_name = artist_name, commontrack_id = commontrack_id, explicit = explicit, has_lyrics = has_lyrics, has_richsync = has_richsync, has_subtitles = has_subtitles, instrumental = instrumental, num_favourite = num_favourite, primary_genres = primary_genres, restricted = restricted, track_edit_url = track_edit_url, track_id = track_id, track_name = track_name, track_name_translation_list = track_name_translation_list, track_rating = track_rating, track_share_url = track_share_url, updated_time = updated_time)
  
    __obj.asInstanceOf[Anon_Albumid]
  }
}

