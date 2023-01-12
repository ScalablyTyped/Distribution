package typings.musicmatch.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Musicmatch extends StObject {
  
  def album(params: AlbumParams): js.Promise[Any]
  
  def albumTracks(params: AlbumTracksParams): js.Promise[Any]
  
  def artist(params: ArtistParams): js.Promise[Any]
  
  def artistAlbums(params: ArtistAlbumsParams): js.Promise[Any]
  
  def artistRelated(params: ArtistRelatedParams): js.Promise[Any]
  
  def artistSearch(params: ArtistSearchParams): js.Promise[Any]
  
  def chartArtists(params: ChartArtistsParams): js.Promise[Any]
  
  def chartTracks(params: ChartTracksParams): js.Promise[Any]
  
  def matcherLyrics(params: MatcherLyricsParams): js.Promise[Any]
  
  def matcherSubtitle(params: MatcherSubtitleParams): js.Promise[Any]
  
  def matcherTrack(params: MatcherTrackParams): js.Promise[Any]
  
  def track(params: TrackParams): js.Promise[Any]
  
  def trackLyrics(params: TrackLyricsParams): js.Promise[Any]
  
  def trackLyricsAdd(params: TrackLyricsAddParams): js.Promise[Any]
  
  def trackLyricsFeedback(params: TrackLyricsFeedbackParams): js.Promise[Any]
  
  def trackSearch(params: TrackSearchParams): js.Promise[TrackSearchResult]
  
  def trackSnippet(params: TrackSnippetParams): js.Promise[Any]
  
  def trackSubtitle(params: TrackSubtitleParams): js.Promise[Any]
}
object Musicmatch {
  
  inline def apply(
    album: AlbumParams => js.Promise[Any],
    albumTracks: AlbumTracksParams => js.Promise[Any],
    artist: ArtistParams => js.Promise[Any],
    artistAlbums: ArtistAlbumsParams => js.Promise[Any],
    artistRelated: ArtistRelatedParams => js.Promise[Any],
    artistSearch: ArtistSearchParams => js.Promise[Any],
    chartArtists: ChartArtistsParams => js.Promise[Any],
    chartTracks: ChartTracksParams => js.Promise[Any],
    matcherLyrics: MatcherLyricsParams => js.Promise[Any],
    matcherSubtitle: MatcherSubtitleParams => js.Promise[Any],
    matcherTrack: MatcherTrackParams => js.Promise[Any],
    track: TrackParams => js.Promise[Any],
    trackLyrics: TrackLyricsParams => js.Promise[Any],
    trackLyricsAdd: TrackLyricsAddParams => js.Promise[Any],
    trackLyricsFeedback: TrackLyricsFeedbackParams => js.Promise[Any],
    trackSearch: TrackSearchParams => js.Promise[TrackSearchResult],
    trackSnippet: TrackSnippetParams => js.Promise[Any],
    trackSubtitle: TrackSubtitleParams => js.Promise[Any]
  ): Musicmatch = {
    val __obj = js.Dynamic.literal(album = js.Any.fromFunction1(album), albumTracks = js.Any.fromFunction1(albumTracks), artist = js.Any.fromFunction1(artist), artistAlbums = js.Any.fromFunction1(artistAlbums), artistRelated = js.Any.fromFunction1(artistRelated), artistSearch = js.Any.fromFunction1(artistSearch), chartArtists = js.Any.fromFunction1(chartArtists), chartTracks = js.Any.fromFunction1(chartTracks), matcherLyrics = js.Any.fromFunction1(matcherLyrics), matcherSubtitle = js.Any.fromFunction1(matcherSubtitle), matcherTrack = js.Any.fromFunction1(matcherTrack), track = js.Any.fromFunction1(track), trackLyrics = js.Any.fromFunction1(trackLyrics), trackLyricsAdd = js.Any.fromFunction1(trackLyricsAdd), trackLyricsFeedback = js.Any.fromFunction1(trackLyricsFeedback), trackSearch = js.Any.fromFunction1(trackSearch), trackSnippet = js.Any.fromFunction1(trackSnippet), trackSubtitle = js.Any.fromFunction1(trackSubtitle))
    __obj.asInstanceOf[Musicmatch]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Musicmatch] (val x: Self) extends AnyVal {
    
    inline def setAlbum(value: AlbumParams => js.Promise[Any]): Self = StObject.set(x, "album", js.Any.fromFunction1(value))
    
    inline def setAlbumTracks(value: AlbumTracksParams => js.Promise[Any]): Self = StObject.set(x, "albumTracks", js.Any.fromFunction1(value))
    
    inline def setArtist(value: ArtistParams => js.Promise[Any]): Self = StObject.set(x, "artist", js.Any.fromFunction1(value))
    
    inline def setArtistAlbums(value: ArtistAlbumsParams => js.Promise[Any]): Self = StObject.set(x, "artistAlbums", js.Any.fromFunction1(value))
    
    inline def setArtistRelated(value: ArtistRelatedParams => js.Promise[Any]): Self = StObject.set(x, "artistRelated", js.Any.fromFunction1(value))
    
    inline def setArtistSearch(value: ArtistSearchParams => js.Promise[Any]): Self = StObject.set(x, "artistSearch", js.Any.fromFunction1(value))
    
    inline def setChartArtists(value: ChartArtistsParams => js.Promise[Any]): Self = StObject.set(x, "chartArtists", js.Any.fromFunction1(value))
    
    inline def setChartTracks(value: ChartTracksParams => js.Promise[Any]): Self = StObject.set(x, "chartTracks", js.Any.fromFunction1(value))
    
    inline def setMatcherLyrics(value: MatcherLyricsParams => js.Promise[Any]): Self = StObject.set(x, "matcherLyrics", js.Any.fromFunction1(value))
    
    inline def setMatcherSubtitle(value: MatcherSubtitleParams => js.Promise[Any]): Self = StObject.set(x, "matcherSubtitle", js.Any.fromFunction1(value))
    
    inline def setMatcherTrack(value: MatcherTrackParams => js.Promise[Any]): Self = StObject.set(x, "matcherTrack", js.Any.fromFunction1(value))
    
    inline def setTrack(value: TrackParams => js.Promise[Any]): Self = StObject.set(x, "track", js.Any.fromFunction1(value))
    
    inline def setTrackLyrics(value: TrackLyricsParams => js.Promise[Any]): Self = StObject.set(x, "trackLyrics", js.Any.fromFunction1(value))
    
    inline def setTrackLyricsAdd(value: TrackLyricsAddParams => js.Promise[Any]): Self = StObject.set(x, "trackLyricsAdd", js.Any.fromFunction1(value))
    
    inline def setTrackLyricsFeedback(value: TrackLyricsFeedbackParams => js.Promise[Any]): Self = StObject.set(x, "trackLyricsFeedback", js.Any.fromFunction1(value))
    
    inline def setTrackSearch(value: TrackSearchParams => js.Promise[TrackSearchResult]): Self = StObject.set(x, "trackSearch", js.Any.fromFunction1(value))
    
    inline def setTrackSnippet(value: TrackSnippetParams => js.Promise[Any]): Self = StObject.set(x, "trackSnippet", js.Any.fromFunction1(value))
    
    inline def setTrackSubtitle(value: TrackSubtitleParams => js.Promise[Any]): Self = StObject.set(x, "trackSubtitle", js.Any.fromFunction1(value))
  }
}
