package typings.musicmatch.anon

import typings.musicmatch.mod.PrimaryGenres
import typings.musicmatch.mod.TBoolean
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Albumid extends js.Object {
  
  var album_id: Double = js.native
  
  var album_name: String = js.native
  
  var artist_id: Double = js.native
  
  var artist_name: String = js.native
  
  var commontrack_id: Double = js.native
  
  var explicit: TBoolean = js.native
  
  var has_lyrics: TBoolean = js.native
  
  var has_richsync: TBoolean = js.native
  
  var has_subtitles: TBoolean = js.native
  
  var instrumental: TBoolean = js.native
  
  var num_favourite: Double = js.native
  
  var primary_genres: PrimaryGenres = js.native
  
  var restricted: TBoolean = js.native
  
  var track_edit_url: String = js.native
  
  var track_id: Double = js.native
  
  var track_name: String = js.native
  
  var track_name_translation_list: js.Array[_] = js.native
  
  var track_rating: Double = js.native
  
  var track_share_url: String = js.native
  
  var updated_time: String = js.native
}
object Albumid {
  
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
  ): Albumid = {
    val __obj = js.Dynamic.literal(album_id = album_id.asInstanceOf[js.Any], album_name = album_name.asInstanceOf[js.Any], artist_id = artist_id.asInstanceOf[js.Any], artist_name = artist_name.asInstanceOf[js.Any], commontrack_id = commontrack_id.asInstanceOf[js.Any], explicit = explicit.asInstanceOf[js.Any], has_lyrics = has_lyrics.asInstanceOf[js.Any], has_richsync = has_richsync.asInstanceOf[js.Any], has_subtitles = has_subtitles.asInstanceOf[js.Any], instrumental = instrumental.asInstanceOf[js.Any], num_favourite = num_favourite.asInstanceOf[js.Any], primary_genres = primary_genres.asInstanceOf[js.Any], restricted = restricted.asInstanceOf[js.Any], track_edit_url = track_edit_url.asInstanceOf[js.Any], track_id = track_id.asInstanceOf[js.Any], track_name = track_name.asInstanceOf[js.Any], track_name_translation_list = track_name_translation_list.asInstanceOf[js.Any], track_rating = track_rating.asInstanceOf[js.Any], track_share_url = track_share_url.asInstanceOf[js.Any], updated_time = updated_time.asInstanceOf[js.Any])
    __obj.asInstanceOf[Albumid]
  }
  
  @scala.inline
  implicit class AlbumidOps[Self <: Albumid] (val x: Self) extends AnyVal {
    
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
    def setAlbum_name(value: String): Self = this.set("album_name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setArtist_id(value: Double): Self = this.set("artist_id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setArtist_name(value: String): Self = this.set("artist_name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCommontrack_id(value: Double): Self = this.set("commontrack_id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setExplicit(value: TBoolean): Self = this.set("explicit", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHas_lyrics(value: TBoolean): Self = this.set("has_lyrics", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHas_richsync(value: TBoolean): Self = this.set("has_richsync", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHas_subtitles(value: TBoolean): Self = this.set("has_subtitles", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInstrumental(value: TBoolean): Self = this.set("instrumental", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNum_favourite(value: Double): Self = this.set("num_favourite", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPrimary_genres(value: PrimaryGenres): Self = this.set("primary_genres", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRestricted(value: TBoolean): Self = this.set("restricted", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTrack_edit_url(value: String): Self = this.set("track_edit_url", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTrack_id(value: Double): Self = this.set("track_id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTrack_name(value: String): Self = this.set("track_name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTrack_name_translation_listVarargs(value: js.Any*): Self = this.set("track_name_translation_list", js.Array(value :_*))
    
    @scala.inline
    def setTrack_name_translation_list(value: js.Array[_]): Self = this.set("track_name_translation_list", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTrack_rating(value: Double): Self = this.set("track_rating", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTrack_share_url(value: String): Self = this.set("track_share_url", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUpdated_time(value: String): Self = this.set("updated_time", value.asInstanceOf[js.Any])
  }
}
