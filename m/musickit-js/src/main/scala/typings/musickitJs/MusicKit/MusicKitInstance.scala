package typings.musickitJs.MusicKit

import typings.musickitJs.anon.AuthorizationStatus
import typings.musickitJs.anon.OldState
import typings.musickitJs.anon.Progress
import typings.musickitJs.musickitJsStrings.authorizationStatusDidChange
import typings.musickitJs.musickitJsStrings.authorizationStatusWillChange
import typings.musickitJs.musickitJsStrings.eligibleForSubscribeView
import typings.musickitJs.musickitJsStrings.loaded
import typings.musickitJs.musickitJsStrings.mediaCanPlay
import typings.musickitJs.musickitJsStrings.mediaItemDidChange
import typings.musickitJs.musickitJsStrings.mediaItemWillChange
import typings.musickitJs.musickitJsStrings.mediaPlaybackError
import typings.musickitJs.musickitJsStrings.metadataDidChange
import typings.musickitJs.musickitJsStrings.playbackBitrateDidChange
import typings.musickitJs.musickitJsStrings.playbackDurationDidChange
import typings.musickitJs.musickitJsStrings.playbackProgressDidChange
import typings.musickitJs.musickitJsStrings.playbackStateDidChange
import typings.musickitJs.musickitJsStrings.playbackStateWillChange
import typings.musickitJs.musickitJsStrings.playbackTargetAvailableDidChange
import typings.musickitJs.musickitJsStrings.playbackTimeDidChange
import typings.musickitJs.musickitJsStrings.playbackVolumeDidChange
import typings.musickitJs.musickitJsStrings.primaryPlayerDidChange
import typings.musickitJs.musickitJsStrings.queueItemsDidChange
import typings.musickitJs.musickitJsStrings.queuePositionDidChange
import typings.musickitJs.musickitJsStrings.storefrontCountryCodeDidChange
import typings.musickitJs.musickitJsStrings.storefrontIdentifierDidChange
import typings.musickitJs.musickitJsStrings.userTokenDidChange
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * This object provides access to a player instance, and through the player
  * instance, access to control playback.
  */
@js.native
trait MusicKitInstance extends StObject {
  
  /**
    * Add an event listener for a MusicKit instance by name.
    *
    * @param name The name of the event.
    * @param callback The callback function to invoke when the event occurs.
    */
  @JSName("addEventListener")
  def addEventListener_authorizationStatusDidChange(name: authorizationStatusDidChange, callback: js.Function1[/* event */ AuthorizationStatus, Any]): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_authorizationStatusWillChange(name: authorizationStatusWillChange, callback: js.Function1[/* event */ Any, Any]): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_eligibleForSubscribeView(name: eligibleForSubscribeView, callback: js.Function1[/* event */ Any, Any]): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_loaded(name: loaded, callback: js.Function1[/* event */ Any, Any]): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_mediaCanPlay(name: mediaCanPlay, callback: js.Function1[/* event */ Any, Any]): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_mediaItemDidChange(name: mediaItemDidChange, callback: js.Function1[/* event */ Any, Any]): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_mediaItemWillChange(name: mediaItemWillChange, callback: js.Function1[/* event */ Any, Any]): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_mediaPlaybackError(name: mediaPlaybackError, callback: js.Function1[/* event */ Any, Any]): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_metadataDidChange(name: metadataDidChange, callback: js.Function1[/* event */ Any, Any]): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_playbackBitrateDidChange(name: playbackBitrateDidChange, callback: js.Function1[/* event */ Any, Any]): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_playbackDurationDidChange(name: playbackDurationDidChange, callback: js.Function1[/* event */ Any, Any]): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_playbackProgressDidChange(name: playbackProgressDidChange, callback: js.Function1[/* event */ Progress, Any]): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_playbackStateDidChange(name: playbackStateDidChange, callback: js.Function1[/* event */ OldState, Any]): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_playbackStateWillChange(name: playbackStateWillChange, callback: js.Function1[/* event */ Any, Any]): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_playbackTargetAvailableDidChange(name: playbackTargetAvailableDidChange, callback: js.Function1[/* event */ Any, Any]): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_playbackTimeDidChange(name: playbackTimeDidChange, callback: js.Function1[/* event */ Any, Any]): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_playbackVolumeDidChange(name: playbackVolumeDidChange, callback: js.Function1[/* event */ Any, Any]): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_primaryPlayerDidChange(name: primaryPlayerDidChange, callback: js.Function1[/* event */ Any, Any]): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_queueItemsDidChange(name: queueItemsDidChange, callback: js.Function1[/* event */ Any, Any]): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_queuePositionDidChange(name: queuePositionDidChange, callback: js.Function1[/* event */ Any, Any]): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_storefrontCountryCodeDidChange(name: storefrontCountryCodeDidChange, callback: js.Function1[/* event */ Any, Any]): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_storefrontIdentifierDidChange(name: storefrontIdentifierDidChange, callback: js.Function1[/* event */ Any, Any]): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_userTokenDidChange(name: userTokenDidChange, callback: js.Function1[/* event */ Any, Any]): Unit = js.native
  
  /**
    * No description available.
    */
  def addToLibrary(id: Any, `type`: Any): js.Promise[Any] = js.native
  
  /**
    * An instance of the MusicKit API.
    */
  val api: API = js.native
  
  /**
    * Returns a promise containing a music user token when a user has
    * authenticated and authorized the app.
    */
  def authorize(): js.Promise[String] = js.native
  
  /**
    * An instance of the MusicKit API.
    */
  val bitrate: PlaybackBitrate = js.native
  
  /**
    * Begins playing the media item at the specified index in the queue.
    *
    * @param index The queue index to begin playing media.
    */
  def changeToMediaAtIndex(index: Double): js.Promise[Double] = js.native
  
  /**
    * The developer token to identify yourself as a trusted developer and
    * member of the Apple Developer Program.
    */
  val developerToken: String = js.native
  
  /**
    * A Boolean value indicating whether the user has authenticated and
    * authorized the application for use.
    */
  val isAuthorized: Boolean = js.native
  
  /**
    * A user token used to access personalized Apple Music content.
    */
  val musicUserToken: String = js.native
  
  /**
    * Pauses playback of the media player.
    */
  def pause(): Unit = js.native
  
  /**
    * Begins playback of the current media item.
    */
  def play(): js.Promise[MediaItemPosition] = js.native
  
  /**
    * No description available.
    */
  def playLater(options: SetQueueOptions): js.Promise[Unit] = js.native
  
  /**
    * No description available.
    */
  def playNext(options: SetQueueOptions): js.Promise[Unit] = js.native
  
  /**
    * The current playback state of the music player.
    */
  val playbackState: PlaybackStates = js.native
  
  /**
    * A Boolean value that indicates if a playback target is available.
    */
  val playbackTargetAvailable: Boolean = js.native
  
  /**
    * An instance of the MusicKit player.
    */
  val player: Player = js.native
  
  /**
    * Removes an event listener for a MusicKit instance by name.
    *
    * @param name The name of the event.
    * @param callback The callback function to remove.
    */
  def removeEventListener(name: String): Unit = js.native
  def removeEventListener(name: String, callback: js.Function0[Any]): Unit = js.native
  
  /**
    * Sets the playback point to a specified time.
    *
    * @param time The time to set as the playback point.
    */
  def seekToTime(time: Double): js.Promise[Any] = js.native
  
  /**
    * Sets a music player's playback queue using queue options.
    *
    * @param options The option used to set the playback queue.
    */
  def setQueue(options: SetQueueOptions): js.Promise[Queue] = js.native
  
  /**
    * Starts playback of the next media item in the playback queue.
    */
  def skipToNextItem(): js.Promise[MediaItemPosition] = js.native
  
  /**
    * Starts playback of the previous media item in the playback queue.
    */
  def skipToPreviousItem(): js.Promise[MediaItemPosition] = js.native
  
  /**
    * Stops playback of the media player.
    */
  def stop(): Unit = js.native
  
  /**
    * The current storefront for the configured MusicKit instance.
    */
  val storefrontId: String = js.native
  
  /**
    * Unauthorizes the app for the current user.
    */
  def unauthorize(): js.Promise[Any] = js.native
}
