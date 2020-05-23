package typings.musicmatch.mod

import typings.musicmatch.anon.Apikey
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("musicmatch", JSImport.Default)
@js.native
class default () extends Musicmatch {
  def this(obj: Apikey) = this()
  /* CompleteClass */
  override def album(params: AlbumParams): js.Promise[_] = js.native
  /* CompleteClass */
  override def albumTracks(params: AlbumTracksParams): js.Promise[_] = js.native
  /* CompleteClass */
  override def artist(params: ArtistParams): js.Promise[_] = js.native
  /* CompleteClass */
  override def artistAlbums(params: ArtistAlbumsParams): js.Promise[_] = js.native
  /* CompleteClass */
  override def artistRelated(params: ArtistRelatedParams): js.Promise[_] = js.native
  /* CompleteClass */
  override def artistSearch(params: ArtistSearchParams): js.Promise[_] = js.native
  /* CompleteClass */
  override def chartArtists(params: ChartArtistsParams): js.Promise[_] = js.native
  /* CompleteClass */
  override def chartTracks(params: ChartTracksParams): js.Promise[_] = js.native
  /* CompleteClass */
  override def matcherLyrics(params: MatcherLyricsParams): js.Promise[_] = js.native
  /* CompleteClass */
  override def matcherSubtitle(params: MatcherSubtitleParams): js.Promise[_] = js.native
  /* CompleteClass */
  override def matcherTrack(params: MatcherTrackParams): js.Promise[_] = js.native
  /* CompleteClass */
  override def track(params: TrackParams): js.Promise[_] = js.native
  /* CompleteClass */
  override def trackLyrics(params: TrackLyricsParams): js.Promise[_] = js.native
  /* CompleteClass */
  override def trackLyricsAdd(params: TrackLyricsAddParams): js.Promise[_] = js.native
  /* CompleteClass */
  override def trackLyricsFeedback(params: TrackLyricsFeedbackParams): js.Promise[_] = js.native
  /* CompleteClass */
  override def trackSearch(params: TrackSearchParams): js.Promise[TrackSearchResult] = js.native
  /* CompleteClass */
  override def trackSnippet(params: TrackSnippetParams): js.Promise[_] = js.native
  /* CompleteClass */
  override def trackSubtitle(params: TrackSubtitleParams): js.Promise[_] = js.native
}

