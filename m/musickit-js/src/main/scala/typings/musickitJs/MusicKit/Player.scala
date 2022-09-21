package typings.musickitJs.MusicKit

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * A media player that represents the media player for a MusicKit instance.
  */
trait Player extends StObject {
  
  /**
    * Adds an event listener as a callback for an event name.
    *
    * @param name The name of the event.
    * @param callback The callback function to invoke when the event occurs.
    */
  def addEventListener(name: String, callback: js.Function0[Any]): Unit
  
  /**
    * The current bit rate of the music player.
    */
  val bitrate: Double
  
  /**
    * The music player has EME loaded.
    */
  val canSupportDRM: Boolean
  
  /**
    * Begins playing the media item at the specified index in the queue immediately.
    *
    * @param The queue index to begin playing media.
    */
  def changeToMediaAtIndex(index: Double): js.Promise[MediaItemPosition]
  
  /**
    * Begins playing the media item in the queue immediately.
    *
    * @param descriptor descriptor can be a MusicKit.MediaItem instance or a
    * string identifier.
    */
  def changeToMediaItem(descriptor: Descriptor): js.Promise[MediaItemPosition]
  
  /**
    * The current playback duration.
    */
  val currentPlaybackDuration: Double
  
  /**
    * The current playback progress.
    */
  val currentPlaybackProgress: Double
  
  /**
    * The current position of the playhead.
    */
  val currentPlaybackTime: Double
  
  /**
    * No description available.
    */
  val currentPlaybackTimeRemaining: Double
  
  /**
    * The current playback duration in hours and minutes.
    */
  val formattedCurrentPlaybackDuration: FormattedPlaybackDuration
  
  /**
    * A Boolean value indicating whether the player is currently playing.
    */
  val isPlaying: Boolean
  
  /**
    * Sets the volume to 0.
    */
  def mute(): Unit
  
  /**
    * The currently-playing media item, or the media item, within an queue,
    * that you have designated to begin playback.
    */
  val nowPlayingItem: MediaItem
  
  /**
    * The index of the now playing item in the current playback queue.
    */
  val nowPlayingItemIndex: js.UndefOr[Double] = js.undefined
  
  /**
    * Pauses playback of the current item.
    */
  def pause(): Unit
  
  /**
    * Initiates playback of the current item.
    */
  def play(): js.Promise[MediaItemPosition]
  
  /**
    * The current playback rate for the player.
    */
  val playbackRate: Double
  
  /**
    * The current playback state of the music player.
    */
  val playbackState: PlaybackState
  
  /**
    * A Boolean value that indicates whether a playback target is available.
    */
  val playbackTargetAvailable: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Prepares a music player for playback.
    *
    * @param descriptor descriptor can be a MusicKit.MediaItem instance or a
    * string identifier.
    */
  def prepareToPlay(descriptor: Descriptor): js.Promise[Unit]
  
  /**
    * The current playback queue of the music player.
    */
  val queue: Queue
  
  /**
    * No description available.
    *
    * @param name The name of the event.
    * @param callback The callback function to remove.
    */
  def removeEventListener(name: String, callback: js.Function0[Any]): Unit
  
  /**
    * The current repeat mode of the music player.
    */
  var repeatMode: PlayerRepeatMode
  
  /**
    * Sets the playback point to a specified time.
    *
    * @param time The time to set as the playback point.
    */
  def seekToTime(time: Double): js.Promise[Unit]
  
  /**
    * Displays the playback target picker if a playback target is available.
    */
  def showPlaybackTargetPicker(): Unit
  
  /**
    * The current shuffle mode of the music player.
    */
  var shuffleMode: PlayerShuffleMode
  
  /**
    * Starts playback of the next media item in the playback queue.
    */
  def skipToNextItem(): js.Promise[MediaItemPosition]
  
  /**
    * Starts playback of the previous media item in the playback queue.
    */
  def skipToPreviousItem(): js.Promise[MediaItemPosition]
  
  /**
    * Stops the currently playing media item.
    */
  def stop(): Unit
  
  /**
    * A number indicating the current volume of the music player.
    */
  var volume: Double
}
object Player {
  
  inline def apply(
    addEventListener: (String, js.Function0[Any]) => Unit,
    bitrate: Double,
    canSupportDRM: Boolean,
    changeToMediaAtIndex: Double => js.Promise[MediaItemPosition],
    changeToMediaItem: Descriptor => js.Promise[MediaItemPosition],
    currentPlaybackDuration: Double,
    currentPlaybackProgress: Double,
    currentPlaybackTime: Double,
    currentPlaybackTimeRemaining: Double,
    formattedCurrentPlaybackDuration: FormattedPlaybackDuration,
    isPlaying: Boolean,
    mute: () => Unit,
    nowPlayingItem: MediaItem,
    pause: () => Unit,
    play: () => js.Promise[MediaItemPosition],
    playbackRate: Double,
    playbackState: PlaybackState,
    prepareToPlay: Descriptor => js.Promise[Unit],
    queue: Queue,
    removeEventListener: (String, js.Function0[Any]) => Unit,
    repeatMode: PlayerRepeatMode,
    seekToTime: Double => js.Promise[Unit],
    showPlaybackTargetPicker: () => Unit,
    shuffleMode: PlayerShuffleMode,
    skipToNextItem: () => js.Promise[MediaItemPosition],
    skipToPreviousItem: () => js.Promise[MediaItemPosition],
    stop: () => Unit,
    volume: Double
  ): Player = {
    val __obj = js.Dynamic.literal(addEventListener = js.Any.fromFunction2(addEventListener), bitrate = bitrate.asInstanceOf[js.Any], canSupportDRM = canSupportDRM.asInstanceOf[js.Any], changeToMediaAtIndex = js.Any.fromFunction1(changeToMediaAtIndex), changeToMediaItem = js.Any.fromFunction1(changeToMediaItem), currentPlaybackDuration = currentPlaybackDuration.asInstanceOf[js.Any], currentPlaybackProgress = currentPlaybackProgress.asInstanceOf[js.Any], currentPlaybackTime = currentPlaybackTime.asInstanceOf[js.Any], currentPlaybackTimeRemaining = currentPlaybackTimeRemaining.asInstanceOf[js.Any], formattedCurrentPlaybackDuration = formattedCurrentPlaybackDuration.asInstanceOf[js.Any], isPlaying = isPlaying.asInstanceOf[js.Any], mute = js.Any.fromFunction0(mute), nowPlayingItem = nowPlayingItem.asInstanceOf[js.Any], pause = js.Any.fromFunction0(pause), play = js.Any.fromFunction0(play), playbackRate = playbackRate.asInstanceOf[js.Any], playbackState = playbackState.asInstanceOf[js.Any], prepareToPlay = js.Any.fromFunction1(prepareToPlay), queue = queue.asInstanceOf[js.Any], removeEventListener = js.Any.fromFunction2(removeEventListener), repeatMode = repeatMode.asInstanceOf[js.Any], seekToTime = js.Any.fromFunction1(seekToTime), showPlaybackTargetPicker = js.Any.fromFunction0(showPlaybackTargetPicker), shuffleMode = shuffleMode.asInstanceOf[js.Any], skipToNextItem = js.Any.fromFunction0(skipToNextItem), skipToPreviousItem = js.Any.fromFunction0(skipToPreviousItem), stop = js.Any.fromFunction0(stop), volume = volume.asInstanceOf[js.Any])
    __obj.asInstanceOf[Player]
  }
  
  extension [Self <: Player](x: Self) {
    
    inline def setAddEventListener(value: (String, js.Function0[Any]) => Unit): Self = StObject.set(x, "addEventListener", js.Any.fromFunction2(value))
    
    inline def setBitrate(value: Double): Self = StObject.set(x, "bitrate", value.asInstanceOf[js.Any])
    
    inline def setCanSupportDRM(value: Boolean): Self = StObject.set(x, "canSupportDRM", value.asInstanceOf[js.Any])
    
    inline def setChangeToMediaAtIndex(value: Double => js.Promise[MediaItemPosition]): Self = StObject.set(x, "changeToMediaAtIndex", js.Any.fromFunction1(value))
    
    inline def setChangeToMediaItem(value: Descriptor => js.Promise[MediaItemPosition]): Self = StObject.set(x, "changeToMediaItem", js.Any.fromFunction1(value))
    
    inline def setCurrentPlaybackDuration(value: Double): Self = StObject.set(x, "currentPlaybackDuration", value.asInstanceOf[js.Any])
    
    inline def setCurrentPlaybackProgress(value: Double): Self = StObject.set(x, "currentPlaybackProgress", value.asInstanceOf[js.Any])
    
    inline def setCurrentPlaybackTime(value: Double): Self = StObject.set(x, "currentPlaybackTime", value.asInstanceOf[js.Any])
    
    inline def setCurrentPlaybackTimeRemaining(value: Double): Self = StObject.set(x, "currentPlaybackTimeRemaining", value.asInstanceOf[js.Any])
    
    inline def setFormattedCurrentPlaybackDuration(value: FormattedPlaybackDuration): Self = StObject.set(x, "formattedCurrentPlaybackDuration", value.asInstanceOf[js.Any])
    
    inline def setIsPlaying(value: Boolean): Self = StObject.set(x, "isPlaying", value.asInstanceOf[js.Any])
    
    inline def setMute(value: () => Unit): Self = StObject.set(x, "mute", js.Any.fromFunction0(value))
    
    inline def setNowPlayingItem(value: MediaItem): Self = StObject.set(x, "nowPlayingItem", value.asInstanceOf[js.Any])
    
    inline def setNowPlayingItemIndex(value: Double): Self = StObject.set(x, "nowPlayingItemIndex", value.asInstanceOf[js.Any])
    
    inline def setNowPlayingItemIndexUndefined: Self = StObject.set(x, "nowPlayingItemIndex", js.undefined)
    
    inline def setPause(value: () => Unit): Self = StObject.set(x, "pause", js.Any.fromFunction0(value))
    
    inline def setPlay(value: () => js.Promise[MediaItemPosition]): Self = StObject.set(x, "play", js.Any.fromFunction0(value))
    
    inline def setPlaybackRate(value: Double): Self = StObject.set(x, "playbackRate", value.asInstanceOf[js.Any])
    
    inline def setPlaybackState(value: PlaybackState): Self = StObject.set(x, "playbackState", value.asInstanceOf[js.Any])
    
    inline def setPlaybackTargetAvailable(value: Boolean): Self = StObject.set(x, "playbackTargetAvailable", value.asInstanceOf[js.Any])
    
    inline def setPlaybackTargetAvailableUndefined: Self = StObject.set(x, "playbackTargetAvailable", js.undefined)
    
    inline def setPrepareToPlay(value: Descriptor => js.Promise[Unit]): Self = StObject.set(x, "prepareToPlay", js.Any.fromFunction1(value))
    
    inline def setQueue(value: Queue): Self = StObject.set(x, "queue", value.asInstanceOf[js.Any])
    
    inline def setRemoveEventListener(value: (String, js.Function0[Any]) => Unit): Self = StObject.set(x, "removeEventListener", js.Any.fromFunction2(value))
    
    inline def setRepeatMode(value: PlayerRepeatMode): Self = StObject.set(x, "repeatMode", value.asInstanceOf[js.Any])
    
    inline def setSeekToTime(value: Double => js.Promise[Unit]): Self = StObject.set(x, "seekToTime", js.Any.fromFunction1(value))
    
    inline def setShowPlaybackTargetPicker(value: () => Unit): Self = StObject.set(x, "showPlaybackTargetPicker", js.Any.fromFunction0(value))
    
    inline def setShuffleMode(value: PlayerShuffleMode): Self = StObject.set(x, "shuffleMode", value.asInstanceOf[js.Any])
    
    inline def setSkipToNextItem(value: () => js.Promise[MediaItemPosition]): Self = StObject.set(x, "skipToNextItem", js.Any.fromFunction0(value))
    
    inline def setSkipToPreviousItem(value: () => js.Promise[MediaItemPosition]): Self = StObject.set(x, "skipToPreviousItem", js.Any.fromFunction0(value))
    
    inline def setStop(value: () => Unit): Self = StObject.set(x, "stop", js.Any.fromFunction0(value))
    
    inline def setVolume(value: Double): Self = StObject.set(x, "volume", value.asInstanceOf[js.Any])
  }
}
