package typings.musicmatch.mod

import typings.musicmatch.anon.Apikey
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("musicmatch", JSImport.Default)
@js.native
open class default ()
  extends StObject
     with Musicmatch {
  def this(obj: Apikey) = this()
  
  /* CompleteClass */
  override def album(params: AlbumParams): js.Promise[Any] = js.native
  
  /* CompleteClass */
  override def albumTracks(params: AlbumTracksParams): js.Promise[Any] = js.native
  
  /* CompleteClass */
  override def artist(params: ArtistParams): js.Promise[Any] = js.native
  
  /* CompleteClass */
  override def artistAlbums(params: ArtistAlbumsParams): js.Promise[Any] = js.native
  
  /* CompleteClass */
  override def artistRelated(params: ArtistRelatedParams): js.Promise[Any] = js.native
  
  /* CompleteClass */
  override def artistSearch(params: ArtistSearchParams): js.Promise[Any] = js.native
  
  /* CompleteClass */
  override def chartArtists(params: ChartArtistsParams): js.Promise[Any] = js.native
  
  /* CompleteClass */
  override def chartTracks(params: ChartTracksParams): js.Promise[Any] = js.native
  
  /* CompleteClass */
  override def matcherLyrics(params: MatcherLyricsParams): js.Promise[Any] = js.native
  
  /* CompleteClass */
  override def matcherSubtitle(params: MatcherSubtitleParams): js.Promise[Any] = js.native
  
  /* CompleteClass */
  override def matcherTrack(params: MatcherTrackParams): js.Promise[Any] = js.native
  
  /* CompleteClass */
  override def track(params: TrackParams): js.Promise[Any] = js.native
  
  /* CompleteClass */
  override def trackLyrics(params: TrackLyricsParams): js.Promise[Any] = js.native
  
  /* CompleteClass */
  override def trackLyricsAdd(params: TrackLyricsAddParams): js.Promise[Any] = js.native
  
  /* CompleteClass */
  override def trackLyricsFeedback(params: TrackLyricsFeedbackParams): js.Promise[Any] = js.native
  
  /* CompleteClass */
  override def trackSearch(params: TrackSearchParams): js.Promise[TrackSearchResult] = js.native
  
  /* CompleteClass */
  override def trackSnippet(params: TrackSnippetParams): js.Promise[Any] = js.native
  
  /* CompleteClass */
  override def trackSubtitle(params: TrackSubtitleParams): js.Promise[Any] = js.native
}
