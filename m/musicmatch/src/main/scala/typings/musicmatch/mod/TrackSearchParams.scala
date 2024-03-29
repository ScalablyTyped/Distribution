package typings.musicmatch.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TrackSearchParams
  extends StObject
     with Pageable {
  
  var f_artist_id: js.UndefOr[Double] = js.undefined
  
  var f_artist_mbid: js.UndefOr[Double] = js.undefined
  
  var f_has_lyrics: js.UndefOr[TBoolean] = js.undefined
  
  var f_lyrics_language: js.UndefOr[String] = js.undefined
  
  var f_music_genre_id: js.UndefOr[Double] = js.undefined
  
  var q: js.UndefOr[String] = js.undefined
  
  var q_lyrics: js.UndefOr[String] = js.undefined
  
  var quorum_factor: js.UndefOr[Double] = js.undefined
  
  var s_artist_rating: js.UndefOr[TSort] = js.undefined
  
  var s_track_rating: js.UndefOr[TSort] = js.undefined
}
object TrackSearchParams {
  
  inline def apply(): TrackSearchParams = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TrackSearchParams]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: TrackSearchParams] (val x: Self) extends AnyVal {
    
    inline def setF_artist_id(value: Double): Self = StObject.set(x, "f_artist_id", value.asInstanceOf[js.Any])
    
    inline def setF_artist_idUndefined: Self = StObject.set(x, "f_artist_id", js.undefined)
    
    inline def setF_artist_mbid(value: Double): Self = StObject.set(x, "f_artist_mbid", value.asInstanceOf[js.Any])
    
    inline def setF_artist_mbidUndefined: Self = StObject.set(x, "f_artist_mbid", js.undefined)
    
    inline def setF_has_lyrics(value: TBoolean): Self = StObject.set(x, "f_has_lyrics", value.asInstanceOf[js.Any])
    
    inline def setF_has_lyricsUndefined: Self = StObject.set(x, "f_has_lyrics", js.undefined)
    
    inline def setF_lyrics_language(value: String): Self = StObject.set(x, "f_lyrics_language", value.asInstanceOf[js.Any])
    
    inline def setF_lyrics_languageUndefined: Self = StObject.set(x, "f_lyrics_language", js.undefined)
    
    inline def setF_music_genre_id(value: Double): Self = StObject.set(x, "f_music_genre_id", value.asInstanceOf[js.Any])
    
    inline def setF_music_genre_idUndefined: Self = StObject.set(x, "f_music_genre_id", js.undefined)
    
    inline def setQ(value: String): Self = StObject.set(x, "q", value.asInstanceOf[js.Any])
    
    inline def setQUndefined: Self = StObject.set(x, "q", js.undefined)
    
    inline def setQ_lyrics(value: String): Self = StObject.set(x, "q_lyrics", value.asInstanceOf[js.Any])
    
    inline def setQ_lyricsUndefined: Self = StObject.set(x, "q_lyrics", js.undefined)
    
    inline def setQuorum_factor(value: Double): Self = StObject.set(x, "quorum_factor", value.asInstanceOf[js.Any])
    
    inline def setQuorum_factorUndefined: Self = StObject.set(x, "quorum_factor", js.undefined)
    
    inline def setS_artist_rating(value: TSort): Self = StObject.set(x, "s_artist_rating", value.asInstanceOf[js.Any])
    
    inline def setS_artist_ratingUndefined: Self = StObject.set(x, "s_artist_rating", js.undefined)
    
    inline def setS_track_rating(value: TSort): Self = StObject.set(x, "s_track_rating", value.asInstanceOf[js.Any])
    
    inline def setS_track_ratingUndefined: Self = StObject.set(x, "s_track_rating", js.undefined)
  }
}
