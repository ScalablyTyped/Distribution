package typings.musicmatch.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Musicmatch extends StObject {
  
  def album(params: AlbumParams): js.Promise[_] = js.native
  
  def albumTracks(params: AlbumTracksParams): js.Promise[_] = js.native
  
  def artist(params: ArtistParams): js.Promise[_] = js.native
  
  def artistAlbums(params: ArtistAlbumsParams): js.Promise[_] = js.native
  
  def artistRelated(params: ArtistRelatedParams): js.Promise[_] = js.native
  
  def artistSearch(params: ArtistSearchParams): js.Promise[_] = js.native
  
  def chartArtists(params: ChartArtistsParams): js.Promise[_] = js.native
  
  def chartTracks(params: ChartTracksParams): js.Promise[_] = js.native
  
  def matcherLyrics(params: MatcherLyricsParams): js.Promise[_] = js.native
  
  def matcherSubtitle(params: MatcherSubtitleParams): js.Promise[_] = js.native
  
  def matcherTrack(params: MatcherTrackParams): js.Promise[_] = js.native
  
  def track(params: TrackParams): js.Promise[_] = js.native
  
  def trackLyrics(params: TrackLyricsParams): js.Promise[_] = js.native
  
  def trackLyricsAdd(params: TrackLyricsAddParams): js.Promise[_] = js.native
  
  def trackLyricsFeedback(params: TrackLyricsFeedbackParams): js.Promise[_] = js.native
  
  def trackSearch(params: TrackSearchParams): js.Promise[TrackSearchResult] = js.native
  
  def trackSnippet(params: TrackSnippetParams): js.Promise[_] = js.native
  
  def trackSubtitle(params: TrackSubtitleParams): js.Promise[_] = js.native
}
object Musicmatch {
  
  @scala.inline
  def apply(
    album: AlbumParams => js.Promise[_],
    albumTracks: AlbumTracksParams => js.Promise[_],
    artist: ArtistParams => js.Promise[_],
    artistAlbums: ArtistAlbumsParams => js.Promise[_],
    artistRelated: ArtistRelatedParams => js.Promise[_],
    artistSearch: ArtistSearchParams => js.Promise[_],
    chartArtists: ChartArtistsParams => js.Promise[_],
    chartTracks: ChartTracksParams => js.Promise[_],
    matcherLyrics: MatcherLyricsParams => js.Promise[_],
    matcherSubtitle: MatcherSubtitleParams => js.Promise[_],
    matcherTrack: MatcherTrackParams => js.Promise[_],
    track: TrackParams => js.Promise[_],
    trackLyrics: TrackLyricsParams => js.Promise[_],
    trackLyricsAdd: TrackLyricsAddParams => js.Promise[_],
    trackLyricsFeedback: TrackLyricsFeedbackParams => js.Promise[_],
    trackSearch: TrackSearchParams => js.Promise[TrackSearchResult],
    trackSnippet: TrackSnippetParams => js.Promise[_],
    trackSubtitle: TrackSubtitleParams => js.Promise[_]
  ): Musicmatch = {
    val __obj = js.Dynamic.literal(album = js.Any.fromFunction1(album), albumTracks = js.Any.fromFunction1(albumTracks), artist = js.Any.fromFunction1(artist), artistAlbums = js.Any.fromFunction1(artistAlbums), artistRelated = js.Any.fromFunction1(artistRelated), artistSearch = js.Any.fromFunction1(artistSearch), chartArtists = js.Any.fromFunction1(chartArtists), chartTracks = js.Any.fromFunction1(chartTracks), matcherLyrics = js.Any.fromFunction1(matcherLyrics), matcherSubtitle = js.Any.fromFunction1(matcherSubtitle), matcherTrack = js.Any.fromFunction1(matcherTrack), track = js.Any.fromFunction1(track), trackLyrics = js.Any.fromFunction1(trackLyrics), trackLyricsAdd = js.Any.fromFunction1(trackLyricsAdd), trackLyricsFeedback = js.Any.fromFunction1(trackLyricsFeedback), trackSearch = js.Any.fromFunction1(trackSearch), trackSnippet = js.Any.fromFunction1(trackSnippet), trackSubtitle = js.Any.fromFunction1(trackSubtitle))
    __obj.asInstanceOf[Musicmatch]
  }
  
  @scala.inline
  implicit class MusicmatchMutableBuilder[Self <: Musicmatch] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAlbum(value: AlbumParams => js.Promise[_]): Self = StObject.set(x, "album", js.Any.fromFunction1(value))
    
    @scala.inline
    def setAlbumTracks(value: AlbumTracksParams => js.Promise[_]): Self = StObject.set(x, "albumTracks", js.Any.fromFunction1(value))
    
    @scala.inline
    def setArtist(value: ArtistParams => js.Promise[_]): Self = StObject.set(x, "artist", js.Any.fromFunction1(value))
    
    @scala.inline
    def setArtistAlbums(value: ArtistAlbumsParams => js.Promise[_]): Self = StObject.set(x, "artistAlbums", js.Any.fromFunction1(value))
    
    @scala.inline
    def setArtistRelated(value: ArtistRelatedParams => js.Promise[_]): Self = StObject.set(x, "artistRelated", js.Any.fromFunction1(value))
    
    @scala.inline
    def setArtistSearch(value: ArtistSearchParams => js.Promise[_]): Self = StObject.set(x, "artistSearch", js.Any.fromFunction1(value))
    
    @scala.inline
    def setChartArtists(value: ChartArtistsParams => js.Promise[_]): Self = StObject.set(x, "chartArtists", js.Any.fromFunction1(value))
    
    @scala.inline
    def setChartTracks(value: ChartTracksParams => js.Promise[_]): Self = StObject.set(x, "chartTracks", js.Any.fromFunction1(value))
    
    @scala.inline
    def setMatcherLyrics(value: MatcherLyricsParams => js.Promise[_]): Self = StObject.set(x, "matcherLyrics", js.Any.fromFunction1(value))
    
    @scala.inline
    def setMatcherSubtitle(value: MatcherSubtitleParams => js.Promise[_]): Self = StObject.set(x, "matcherSubtitle", js.Any.fromFunction1(value))
    
    @scala.inline
    def setMatcherTrack(value: MatcherTrackParams => js.Promise[_]): Self = StObject.set(x, "matcherTrack", js.Any.fromFunction1(value))
    
    @scala.inline
    def setTrack(value: TrackParams => js.Promise[_]): Self = StObject.set(x, "track", js.Any.fromFunction1(value))
    
    @scala.inline
    def setTrackLyrics(value: TrackLyricsParams => js.Promise[_]): Self = StObject.set(x, "trackLyrics", js.Any.fromFunction1(value))
    
    @scala.inline
    def setTrackLyricsAdd(value: TrackLyricsAddParams => js.Promise[_]): Self = StObject.set(x, "trackLyricsAdd", js.Any.fromFunction1(value))
    
    @scala.inline
    def setTrackLyricsFeedback(value: TrackLyricsFeedbackParams => js.Promise[_]): Self = StObject.set(x, "trackLyricsFeedback", js.Any.fromFunction1(value))
    
    @scala.inline
    def setTrackSearch(value: TrackSearchParams => js.Promise[TrackSearchResult]): Self = StObject.set(x, "trackSearch", js.Any.fromFunction1(value))
    
    @scala.inline
    def setTrackSnippet(value: TrackSnippetParams => js.Promise[_]): Self = StObject.set(x, "trackSnippet", js.Any.fromFunction1(value))
    
    @scala.inline
    def setTrackSubtitle(value: TrackSubtitleParams => js.Promise[_]): Self = StObject.set(x, "trackSubtitle", js.Any.fromFunction1(value))
  }
}
