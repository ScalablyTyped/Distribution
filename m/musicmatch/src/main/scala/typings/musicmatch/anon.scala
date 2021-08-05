package typings.musicmatch

import typings.musicmatch.mod.MusicGenre
import typings.musicmatch.mod.PrimaryGenres
import typings.musicmatch.mod.TBoolean
import typings.musicmatch.mod.TrackResult
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  trait Albumid extends StObject {
    
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
    
    var track_name_translation_list: js.Array[js.Any]
    
    var track_rating: Double
    
    var track_share_url: String
    
    var updated_time: String
  }
  object Albumid {
    
    inline def apply(
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
      track_name_translation_list: js.Array[js.Any],
      track_rating: Double,
      track_share_url: String,
      updated_time: String
    ): Albumid = {
      val __obj = js.Dynamic.literal(album_id = album_id.asInstanceOf[js.Any], album_name = album_name.asInstanceOf[js.Any], artist_id = artist_id.asInstanceOf[js.Any], artist_name = artist_name.asInstanceOf[js.Any], commontrack_id = commontrack_id.asInstanceOf[js.Any], explicit = explicit.asInstanceOf[js.Any], has_lyrics = has_lyrics.asInstanceOf[js.Any], has_richsync = has_richsync.asInstanceOf[js.Any], has_subtitles = has_subtitles.asInstanceOf[js.Any], instrumental = instrumental.asInstanceOf[js.Any], num_favourite = num_favourite.asInstanceOf[js.Any], primary_genres = primary_genres.asInstanceOf[js.Any], restricted = restricted.asInstanceOf[js.Any], track_edit_url = track_edit_url.asInstanceOf[js.Any], track_id = track_id.asInstanceOf[js.Any], track_name = track_name.asInstanceOf[js.Any], track_name_translation_list = track_name_translation_list.asInstanceOf[js.Any], track_rating = track_rating.asInstanceOf[js.Any], track_share_url = track_share_url.asInstanceOf[js.Any], updated_time = updated_time.asInstanceOf[js.Any])
      __obj.asInstanceOf[Albumid]
    }
    
    extension [Self <: Albumid](x: Self) {
      
      inline def setAlbum_id(value: Double): Self = StObject.set(x, "album_id", value.asInstanceOf[js.Any])
      
      inline def setAlbum_name(value: String): Self = StObject.set(x, "album_name", value.asInstanceOf[js.Any])
      
      inline def setArtist_id(value: Double): Self = StObject.set(x, "artist_id", value.asInstanceOf[js.Any])
      
      inline def setArtist_name(value: String): Self = StObject.set(x, "artist_name", value.asInstanceOf[js.Any])
      
      inline def setCommontrack_id(value: Double): Self = StObject.set(x, "commontrack_id", value.asInstanceOf[js.Any])
      
      inline def setExplicit(value: TBoolean): Self = StObject.set(x, "explicit", value.asInstanceOf[js.Any])
      
      inline def setHas_lyrics(value: TBoolean): Self = StObject.set(x, "has_lyrics", value.asInstanceOf[js.Any])
      
      inline def setHas_richsync(value: TBoolean): Self = StObject.set(x, "has_richsync", value.asInstanceOf[js.Any])
      
      inline def setHas_subtitles(value: TBoolean): Self = StObject.set(x, "has_subtitles", value.asInstanceOf[js.Any])
      
      inline def setInstrumental(value: TBoolean): Self = StObject.set(x, "instrumental", value.asInstanceOf[js.Any])
      
      inline def setNum_favourite(value: Double): Self = StObject.set(x, "num_favourite", value.asInstanceOf[js.Any])
      
      inline def setPrimary_genres(value: PrimaryGenres): Self = StObject.set(x, "primary_genres", value.asInstanceOf[js.Any])
      
      inline def setRestricted(value: TBoolean): Self = StObject.set(x, "restricted", value.asInstanceOf[js.Any])
      
      inline def setTrack_edit_url(value: String): Self = StObject.set(x, "track_edit_url", value.asInstanceOf[js.Any])
      
      inline def setTrack_id(value: Double): Self = StObject.set(x, "track_id", value.asInstanceOf[js.Any])
      
      inline def setTrack_name(value: String): Self = StObject.set(x, "track_name", value.asInstanceOf[js.Any])
      
      inline def setTrack_name_translation_list(value: js.Array[js.Any]): Self = StObject.set(x, "track_name_translation_list", value.asInstanceOf[js.Any])
      
      inline def setTrack_name_translation_listVarargs(value: js.Any*): Self = StObject.set(x, "track_name_translation_list", js.Array(value :_*))
      
      inline def setTrack_rating(value: Double): Self = StObject.set(x, "track_rating", value.asInstanceOf[js.Any])
      
      inline def setTrack_share_url(value: String): Self = StObject.set(x, "track_share_url", value.asInstanceOf[js.Any])
      
      inline def setUpdated_time(value: String): Self = StObject.set(x, "updated_time", value.asInstanceOf[js.Any])
    }
  }
  
  trait Apikey extends StObject {
    
    var apikey: js.UndefOr[String] = js.undefined
    
    var format: js.UndefOr[String] = js.undefined
  }
  object Apikey {
    
    inline def apply(): Apikey = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Apikey]
    }
    
    extension [Self <: Apikey](x: Self) {
      
      inline def setApikey(value: String): Self = StObject.set(x, "apikey", value.asInstanceOf[js.Any])
      
      inline def setApikeyUndefined: Self = StObject.set(x, "apikey", js.undefined)
      
      inline def setFormat(value: String): Self = StObject.set(x, "format", value.asInstanceOf[js.Any])
      
      inline def setFormatUndefined: Self = StObject.set(x, "format", js.undefined)
    }
  }
  
  trait Available extends StObject {
    
    var available: Double
    
    var execute_time: Double
    
    var status_code: Double
  }
  object Available {
    
    inline def apply(available: Double, execute_time: Double, status_code: Double): Available = {
      val __obj = js.Dynamic.literal(available = available.asInstanceOf[js.Any], execute_time = execute_time.asInstanceOf[js.Any], status_code = status_code.asInstanceOf[js.Any])
      __obj.asInstanceOf[Available]
    }
    
    extension [Self <: Available](x: Self) {
      
      inline def setAvailable(value: Double): Self = StObject.set(x, "available", value.asInstanceOf[js.Any])
      
      inline def setExecute_time(value: Double): Self = StObject.set(x, "execute_time", value.asInstanceOf[js.Any])
      
      inline def setStatus_code(value: Double): Self = StObject.set(x, "status_code", value.asInstanceOf[js.Any])
    }
  }
  
  trait Body extends StObject {
    
    var body: Tracklist
    
    var header: Available
  }
  object Body {
    
    inline def apply(body: Tracklist, header: Available): Body = {
      val __obj = js.Dynamic.literal(body = body.asInstanceOf[js.Any], header = header.asInstanceOf[js.Any])
      __obj.asInstanceOf[Body]
    }
    
    extension [Self <: Body](x: Self) {
      
      inline def setBody(value: Tracklist): Self = StObject.set(x, "body", value.asInstanceOf[js.Any])
      
      inline def setHeader(value: Available): Self = StObject.set(x, "header", value.asInstanceOf[js.Any])
    }
  }
  
  trait Musicgenre extends StObject {
    
    var music_genre: MusicGenre
  }
  object Musicgenre {
    
    inline def apply(music_genre: MusicGenre): Musicgenre = {
      val __obj = js.Dynamic.literal(music_genre = music_genre.asInstanceOf[js.Any])
      __obj.asInstanceOf[Musicgenre]
    }
    
    extension [Self <: Musicgenre](x: Self) {
      
      inline def setMusic_genre(value: MusicGenre): Self = StObject.set(x, "music_genre", value.asInstanceOf[js.Any])
    }
  }
  
  trait Tracklist extends StObject {
    
    var track_list: js.Array[TrackResult]
  }
  object Tracklist {
    
    inline def apply(track_list: js.Array[TrackResult]): Tracklist = {
      val __obj = js.Dynamic.literal(track_list = track_list.asInstanceOf[js.Any])
      __obj.asInstanceOf[Tracklist]
    }
    
    extension [Self <: Tracklist](x: Self) {
      
      inline def setTrack_list(value: js.Array[TrackResult]): Self = StObject.set(x, "track_list", value.asInstanceOf[js.Any])
      
      inline def setTrack_listVarargs(value: TrackResult*): Self = StObject.set(x, "track_list", js.Array(value :_*))
    }
  }
}
