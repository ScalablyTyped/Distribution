package typings.musicmatch.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Musicmatch extends StObject {
  
  def album(params: AlbumParams): js.Promise[js.Any]
  
  def albumTracks(params: AlbumTracksParams): js.Promise[js.Any]
  
  def artist(params: ArtistParams): js.Promise[js.Any]
  
  def artistAlbums(params: ArtistAlbumsParams): js.Promise[js.Any]
  
  def artistRelated(params: ArtistRelatedParams): js.Promise[js.Any]
  
  def artistSearch(params: ArtistSearchParams): js.Promise[js.Any]
  
  def chartArtists(params: ChartArtistsParams): js.Promise[js.Any]
  
  def chartTracks(params: ChartTracksParams): js.Promise[js.Any]
  
  def matcherLyrics(params: MatcherLyricsParams): js.Promise[js.Any]
  
  def matcherSubtitle(params: MatcherSubtitleParams): js.Promise[js.Any]
  
  def matcherTrack(params: MatcherTrackParams): js.Promise[js.Any]
  
  def track(params: TrackParams): js.Promise[js.Any]
  
  def trackLyrics(params: TrackLyricsParams): js.Promise[js.Any]
  
  def trackLyricsAdd(params: TrackLyricsAddParams): js.Promise[js.Any]
  
  def trackLyricsFeedback(params: TrackLyricsFeedbackParams): js.Promise[js.Any]
  
  def trackSearch(params: TrackSearchParams): js.Promise[TrackSearchResult]
  
  def trackSnippet(params: TrackSnippetParams): js.Promise[js.Any]
  
  def trackSubtitle(params: TrackSubtitleParams): js.Promise[js.Any]
}
object Musicmatch {
  
  inline def apply(
    album: AlbumParams => js.Promise[js.Any],
    albumTracks: AlbumTracksParams => js.Promise[js.Any],
    artist: ArtistParams => js.Promise[js.Any],
    artistAlbums: ArtistAlbumsParams => js.Promise[js.Any],
    artistRelated: ArtistRelatedParams => js.Promise[js.Any],
    artistSearch: ArtistSearchParams => js.Promise[js.Any],
    chartArtists: ChartArtistsParams => js.Promise[js.Any],
    chartTracks: ChartTracksParams => js.Promise[js.Any],
    matcherLyrics: MatcherLyricsParams => js.Promise[js.Any],
    matcherSubtitle: MatcherSubtitleParams => js.Promise[js.Any],
    matcherTrack: MatcherTrackParams => js.Promise[js.Any],
    track: TrackParams => js.Promise[js.Any],
    trackLyrics: TrackLyricsParams => js.Promise[js.Any],
    trackLyricsAdd: TrackLyricsAddParams => js.Promise[js.Any],
    trackLyricsFeedback: TrackLyricsFeedbackParams => js.Promise[js.Any],
    trackSearch: TrackSearchParams => js.Promise[TrackSearchResult],
    trackSnippet: TrackSnippetParams => js.Promise[js.Any],
    trackSubtitle: TrackSubtitleParams => js.Promise[js.Any]
  ): Musicmatch = {
    val __obj = js.Dynamic.literal(album = js.Any.fromFunction1(album), albumTracks = js.Any.fromFunction1(albumTracks), artist = js.Any.fromFunction1(artist), artistAlbums = js.Any.fromFunction1(artistAlbums), artistRelated = js.Any.fromFunction1(artistRelated), artistSearch = js.Any.fromFunction1(artistSearch), chartArtists = js.Any.fromFunction1(chartArtists), chartTracks = js.Any.fromFunction1(chartTracks), matcherLyrics = js.Any.fromFunction1(matcherLyrics), matcherSubtitle = js.Any.fromFunction1(matcherSubtitle), matcherTrack = js.Any.fromFunction1(matcherTrack), track = js.Any.fromFunction1(track), trackLyrics = js.Any.fromFunction1(trackLyrics), trackLyricsAdd = js.Any.fromFunction1(trackLyricsAdd), trackLyricsFeedback = js.Any.fromFunction1(trackLyricsFeedback), trackSearch = js.Any.fromFunction1(trackSearch), trackSnippet = js.Any.fromFunction1(trackSnippet), trackSubtitle = js.Any.fromFunction1(trackSubtitle))
    __obj.asInstanceOf[Musicmatch]
  }
  
  extension [Self <: Musicmatch](x: Self) {
    
    inline def setAlbum(value: AlbumParams => js.Promise[js.Any]): Self = StObject.set(x, "album", js.Any.fromFunction1(value))
    
    inline def setAlbumTracks(value: AlbumTracksParams => js.Promise[js.Any]): Self = StObject.set(x, "albumTracks", js.Any.fromFunction1(value))
    
    inline def setArtist(value: ArtistParams => js.Promise[js.Any]): Self = StObject.set(x, "artist", js.Any.fromFunction1(value))
    
    inline def setArtistAlbums(value: ArtistAlbumsParams => js.Promise[js.Any]): Self = StObject.set(x, "artistAlbums", js.Any.fromFunction1(value))
    
    inline def setArtistRelated(value: ArtistRelatedParams => js.Promise[js.Any]): Self = StObject.set(x, "artistRelated", js.Any.fromFunction1(value))
    
    inline def setArtistSearch(value: ArtistSearchParams => js.Promise[js.Any]): Self = StObject.set(x, "artistSearch", js.Any.fromFunction1(value))
    
    inline def setChartArtists(value: ChartArtistsParams => js.Promise[js.Any]): Self = StObject.set(x, "chartArtists", js.Any.fromFunction1(value))
    
    inline def setChartTracks(value: ChartTracksParams => js.Promise[js.Any]): Self = StObject.set(x, "chartTracks", js.Any.fromFunction1(value))
    
    inline def setMatcherLyrics(value: MatcherLyricsParams => js.Promise[js.Any]): Self = StObject.set(x, "matcherLyrics", js.Any.fromFunction1(value))
    
    inline def setMatcherSubtitle(value: MatcherSubtitleParams => js.Promise[js.Any]): Self = StObject.set(x, "matcherSubtitle", js.Any.fromFunction1(value))
    
    inline def setMatcherTrack(value: MatcherTrackParams => js.Promise[js.Any]): Self = StObject.set(x, "matcherTrack", js.Any.fromFunction1(value))
    
    inline def setTrack(value: TrackParams => js.Promise[js.Any]): Self = StObject.set(x, "track", js.Any.fromFunction1(value))
    
    inline def setTrackLyrics(value: TrackLyricsParams => js.Promise[js.Any]): Self = StObject.set(x, "trackLyrics", js.Any.fromFunction1(value))
    
    inline def setTrackLyricsAdd(value: TrackLyricsAddParams => js.Promise[js.Any]): Self = StObject.set(x, "trackLyricsAdd", js.Any.fromFunction1(value))
    
    inline def setTrackLyricsFeedback(value: TrackLyricsFeedbackParams => js.Promise[js.Any]): Self = StObject.set(x, "trackLyricsFeedback", js.Any.fromFunction1(value))
    
    inline def setTrackSearch(value: TrackSearchParams => js.Promise[TrackSearchResult]): Self = StObject.set(x, "trackSearch", js.Any.fromFunction1(value))
    
    inline def setTrackSnippet(value: TrackSnippetParams => js.Promise[js.Any]): Self = StObject.set(x, "trackSnippet", js.Any.fromFunction1(value))
    
    inline def setTrackSubtitle(value: TrackSubtitleParams => js.Promise[js.Any]): Self = StObject.set(x, "trackSubtitle", js.Any.fromFunction1(value))
  }
}
