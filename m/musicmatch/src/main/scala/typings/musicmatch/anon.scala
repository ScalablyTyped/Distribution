package typings.musicmatch

import typings.musicmatch.mod.MusicGenre
import typings.musicmatch.mod.PrimaryGenres
import typings.musicmatch.mod.TBoolean
import typings.musicmatch.mod.TrackResult
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  @js.native
  trait Albumid extends StObject {
    
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
    implicit class AlbumidMutableBuilder[Self <: Albumid] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAlbum_id(value: Double): Self = StObject.set(x, "album_id", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAlbum_name(value: String): Self = StObject.set(x, "album_name", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setArtist_id(value: Double): Self = StObject.set(x, "artist_id", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setArtist_name(value: String): Self = StObject.set(x, "artist_name", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCommontrack_id(value: Double): Self = StObject.set(x, "commontrack_id", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setExplicit(value: TBoolean): Self = StObject.set(x, "explicit", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHas_lyrics(value: TBoolean): Self = StObject.set(x, "has_lyrics", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHas_richsync(value: TBoolean): Self = StObject.set(x, "has_richsync", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHas_subtitles(value: TBoolean): Self = StObject.set(x, "has_subtitles", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setInstrumental(value: TBoolean): Self = StObject.set(x, "instrumental", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNum_favourite(value: Double): Self = StObject.set(x, "num_favourite", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPrimary_genres(value: PrimaryGenres): Self = StObject.set(x, "primary_genres", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRestricted(value: TBoolean): Self = StObject.set(x, "restricted", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTrack_edit_url(value: String): Self = StObject.set(x, "track_edit_url", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTrack_id(value: Double): Self = StObject.set(x, "track_id", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTrack_name(value: String): Self = StObject.set(x, "track_name", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTrack_name_translation_list(value: js.Array[_]): Self = StObject.set(x, "track_name_translation_list", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTrack_name_translation_listVarargs(value: js.Any*): Self = StObject.set(x, "track_name_translation_list", js.Array(value :_*))
      
      @scala.inline
      def setTrack_rating(value: Double): Self = StObject.set(x, "track_rating", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTrack_share_url(value: String): Self = StObject.set(x, "track_share_url", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setUpdated_time(value: String): Self = StObject.set(x, "updated_time", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait Apikey extends StObject {
    
    var apikey: js.UndefOr[String] = js.native
    
    var format: js.UndefOr[String] = js.native
  }
  object Apikey {
    
    @scala.inline
    def apply(): Apikey = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Apikey]
    }
    
    @scala.inline
    implicit class ApikeyMutableBuilder[Self <: Apikey] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setApikey(value: String): Self = StObject.set(x, "apikey", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setApikeyUndefined: Self = StObject.set(x, "apikey", js.undefined)
      
      @scala.inline
      def setFormat(value: String): Self = StObject.set(x, "format", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFormatUndefined: Self = StObject.set(x, "format", js.undefined)
    }
  }
  
  @js.native
  trait Available extends StObject {
    
    var available: Double = js.native
    
    var execute_time: Double = js.native
    
    var status_code: Double = js.native
  }
  object Available {
    
    @scala.inline
    def apply(available: Double, execute_time: Double, status_code: Double): Available = {
      val __obj = js.Dynamic.literal(available = available.asInstanceOf[js.Any], execute_time = execute_time.asInstanceOf[js.Any], status_code = status_code.asInstanceOf[js.Any])
      __obj.asInstanceOf[Available]
    }
    
    @scala.inline
    implicit class AvailableMutableBuilder[Self <: Available] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAvailable(value: Double): Self = StObject.set(x, "available", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setExecute_time(value: Double): Self = StObject.set(x, "execute_time", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStatus_code(value: Double): Self = StObject.set(x, "status_code", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait Body extends StObject {
    
    var body: Tracklist = js.native
    
    var header: Available = js.native
  }
  object Body {
    
    @scala.inline
    def apply(body: Tracklist, header: Available): Body = {
      val __obj = js.Dynamic.literal(body = body.asInstanceOf[js.Any], header = header.asInstanceOf[js.Any])
      __obj.asInstanceOf[Body]
    }
    
    @scala.inline
    implicit class BodyMutableBuilder[Self <: Body] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setBody(value: Tracklist): Self = StObject.set(x, "body", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHeader(value: Available): Self = StObject.set(x, "header", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait Musicgenre extends StObject {
    
    var music_genre: MusicGenre = js.native
  }
  object Musicgenre {
    
    @scala.inline
    def apply(music_genre: MusicGenre): Musicgenre = {
      val __obj = js.Dynamic.literal(music_genre = music_genre.asInstanceOf[js.Any])
      __obj.asInstanceOf[Musicgenre]
    }
    
    @scala.inline
    implicit class MusicgenreMutableBuilder[Self <: Musicgenre] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setMusic_genre(value: MusicGenre): Self = StObject.set(x, "music_genre", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait Tracklist extends StObject {
    
    var track_list: js.Array[TrackResult] = js.native
  }
  object Tracklist {
    
    @scala.inline
    def apply(track_list: js.Array[TrackResult]): Tracklist = {
      val __obj = js.Dynamic.literal(track_list = track_list.asInstanceOf[js.Any])
      __obj.asInstanceOf[Tracklist]
    }
    
    @scala.inline
    implicit class TracklistMutableBuilder[Self <: Tracklist] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setTrack_list(value: js.Array[TrackResult]): Self = StObject.set(x, "track_list", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTrack_listVarargs(value: TrackResult*): Self = StObject.set(x, "track_list", js.Array(value :_*))
    }
  }
}
