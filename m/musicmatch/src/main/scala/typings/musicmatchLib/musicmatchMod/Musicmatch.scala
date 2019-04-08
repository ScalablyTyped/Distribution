package typings
package musicmatchLib.musicmatchMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Musicmatch extends js.Object {
  def album(params: AlbumParams): js.Promise[_]
  def albumTracks(params: AlbumTracksParams): js.Promise[_]
  def artist(params: ArtistParams): js.Promise[_]
  def artistAlbums(params: ArtistAlbumsParams): js.Promise[_]
  def artistRelated(params: ArtistRelatedParams): js.Promise[_]
  def artistSearch(params: ArtistSearchParams): js.Promise[_]
  def chartArtists(params: ChartArtistsParams): js.Promise[_]
  def chartTracks(params: ChartTracksParams): js.Promise[_]
  def matcherLyrics(params: MatcherLyricsParams): js.Promise[_]
  def matcherSubtitle(params: MatcherSubtitleParams): js.Promise[_]
  def matcherTrack(params: MatcherTrackParams): js.Promise[_]
  def track(params: TrackParams): js.Promise[_]
  def trackLyrics(params: TrackLyricsParams): js.Promise[_]
  def trackLyricsAdd(params: TrackLyricsAddParams): js.Promise[_]
  def trackLyricsFeedback(params: TrackLyricsFeedbackParams): js.Promise[_]
  def trackSearch(params: TrackSearchParams): js.Promise[TrackSearchResult]
  def trackSnippet(params: TrackSnippetParams): js.Promise[_]
  def trackSubtitle(params: TrackSubtitleParams): js.Promise[_]
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
}

