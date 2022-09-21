package typings.playerframework.PlayerFramework

import typings.playerframework.PlayerFramework.Plugins.PlaylistPlugin
import typings.std.HTMLElement
import typings.std.HTMLMediaElement
import typings.std.MediaError
import typings.winrt.Windows.Media.MediaExtensionManager
import typings.winrt.Windows.Media.Protection.MediaProtectionManager
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  *
  **/
@js.native
trait MediaPlayer extends StObject {
  
  /* Methods */
  /**
    * Adds the specified CSS class to the host element.
    * @param name The name of the class to add. Multiple classes can be added using space-delimited names.
    **/
  def addClass(name: String): Unit = js.native
  
  /**
    * Adds an event listener for the MediaPlayer events.
    * //TODO
    * @param type The type (name) of the event. You can use any of the following: "".
    * @param listener The listener to invoke when the event is raised.
    * @param capture true to initiate capture, otherwise false.
    **/
  def addEventListener(`type`: String, listener: js.Function): Unit = js.native
  def addEventListener(`type`: String, listener: js.Function, capture: Boolean): Unit = js.native
  
  /**
    * Create a new TextTrack object to add to an HTML5 video.
    * @param kind String The type of text track
    * @param label String A user readable title for a text track
    * @param language String The BCP47 language tag of the track. For example "en" for English or "fr" for French
    **/
  def addTextTrack(kind: String): Unit = js.native
  def addTextTrack(kind: String, label: String): Unit = js.native
  def addTextTrack(kind: String, label: String, language: String): Unit = js.native
  def addTextTrack(kind: String, label: Unit, language: String): Unit = js.native
  
  /**
    * Gets or sets the current advertising state of the player.
    **/
  var advertisingState: AdvertisingState = js.native
  
  /**
    * Raises the audioinvoked event used to indicate that an audio selection dialog should be presented to the user (usually in the form of a flyout).
    **/
  def audio(): Unit = js.native
  
  /**
    * Gets the audio tracks for the current media source.
    **/
  var audioTracks: js.Array[Any] = js.native
  
  /**
    * Gets or sets a value that indicates whether to automatically start buffering the current media source.
    **/
  var autobuffer: Boolean = js.native
  
  /**
    * Gets or sets a value that specifies whether interactive elements(e.g.the control panel) will be hidden automatically.
    **/
  var autohide: Boolean = js.native
  
  /**
    * Gets or sets the behavior of the autohide feature.
    **/
  var autohideBehavior: AutohideBehavior = js.native
  
  /**
    * Gets or sets the amount of time (in seconds) before interactive elements(e.g.the control panel) will be hidden automatically.
    **/
  var autohideTime: Double = js.native
  
  /**
    * Gets or sets a value that specifies whether to start loading the current media source automatically.
    **/
  var autoload: Boolean = js.native
  
  /**
    * Gets or sets a value that specifies whether to automatically start playing the current media source.
    **/
  var autoplay: Boolean = js.native
  
  /**
    * Gets the buffered time ranges for the current media source.
    **/
  var buffered: js.Array[Any] = js.native
  
  /**
    * Returns a value that specifies whether the player can play a given media type.
    * @param type The type of media to be played.
    * @returns One of the following values: "probably", "maybe", or an empty string if the media cannot be rendered.
    **/
  def canPlayType(`type`: String): String = js.native
  
  //TODO: (type: TimeRanges, read - only)
  /**
    * Gets the caption and subtitle tracks for the current media source.
    **/
  var captionTracks: js.Array[Any] = js.native
  
  /**
    * Raises the captionsinvoked event used to indicate that closed options should be toggled on/off or
    * that a caption selection dialog should be presented to the user (usually in the form of a flyout).
    **/
  def captions(): Unit = js.native
  
  /**
    * Gets or sets a value that specifies whether to display the native controls for the current media source.
    **/
  var controls: Boolean = js.native
  
  /**
    * Gets or sets the current audio track.
    **/
  var currentAudioTrack: Any = js.native
  
  //TODO: (type: AudioTrack, read / write)
  /**
    * Gets or sets the current caption / subtitle track.
    **/
  var currentCaptionTrack: Any = js.native
  
  //TODO: (type: TextTrack, read / write)
  /**
    * Gets the URL of the current media source.
    **/
  var currentSrc: String = js.native
  
  /**
    * Gets or sets the current playback position (in seconds).
    **/
  var currentTime: Double = js.native
  
  /**
    * Decreases the current playback rate by a factor of two.After the rate reaches 1(normal speed), it will flip to - 1, and then begins to rewind.
    **/
  def decreasePlaybackRate(): Unit = js.native
  
  /**
    * Gets the view model that will be restored following a temporary change to the current interactive view model(e.g.during an ad).
    **/
  var defaultInteractiveViewModel: InteractiveViewModel = js.native
  
  /**
    * Gets or sets the playback rate to use when play is resumed.
    **/
  var defaultPlaybackRate: Double = js.native
  
  /**
    * Shuts down and releases all resources.
    **/
  def dispose(): Unit = js.native
  
  /**
    * Gets the duration (in seconds) of the current media source.
    **/
  var duration: Double = js.native
  
  /**
    * Gets the host element for the control.
    **/
  var element: HTMLElement = js.native
  
  /**
    * Gets or sets the end time (in seconds) of the current media source.This is useful in live streaming scenarios.
    **/
  var endTime: Double = js.native
  
  /**
    * Gets a value that specifies whether playback has ended.
    **/
  var ended: Boolean = js.native
  
  /**
    * Gets the current error state of the player.
    **/
  var error: MediaError = js.native
  
  /**
    * Gives focus to the host element.
    **/
  def focus(): Unit = js.native
  
  /**
    * Gets or sets the height of the host element.
    **/
  var height: String = js.native
  
  /**
    * Increases the current playback rate by a factor of two.After the rate reaches - 1, it flips to 1(normal speed), and then begins to fast forward.
    **/
  def increasePlaybackRate(): Unit = js.native
  
  /**
    * Raises the infoinvoked event used to indicate that more information about the current media should be displayed to the user.
    **/
  def info(): Unit = js.native
  
  /**
    * Gets the earliest possible position (in seconds) that playback can begin.
    **/
  var initialTime: Double = js.native
  
  /**
    * Gets or sets the type of interactions that will cause interactive elements(e.g.the control panel) to be shown.
    **/
  var interactiveActivationMode: InteractionType = js.native
  
  /**
    * Gets or sets the type of interactions that will cause interactive elements(e.g.the control panel) to be hidden.
    **/
  var interactiveDeactivationMode: InteractionType = js.native
  
  /**
    * Gets or sets the view model that interactive elements are bound to(e.g.the control panel).
    **/
  var interactiveViewModel: InteractiveViewModel = js.native
  
  /**
    * Gets a value that specifies whether interaction with the audio control is allowed based on the current state of the player.
    **/
  var isAudioAllowed: Boolean = js.native
  
  /**
    * Gets or sets a value that specifies whether the audio control is enabled.
    **/
  var isAudioEnabled: Boolean = js.native
  
  /**
    * Gets or sets a value that specifies whether the audio control is visible.
    **/
  var isAudioVisible: Boolean = js.native
  
  /**
    * Gets a value that specifies whether interaction with the captions control is allowed based on the current state of the player.
    **/
  var isCaptionsAllowed: Boolean = js.native
  
  /**
    * Gets or sets a value that specifies whether the captions control is enabled.
    **/
  var isCaptionsEnabled: Boolean = js.native
  
  //TODO: READ-ONLY
  /**
    * Gets or sets a value that specifies whether the captions control is visible.
    **/
  var isCaptionsVisible: Boolean = js.native
  
  /**
    * Gets a value that specifies whether the current playback position is "live".
    **/
  var isCurrentTimeLive: Boolean = js.native
  
  /**
    * Gets a value that specifies whether interaction with the elapsed time control is allowed based on the current state of the player.
    **/
  var isElapsedTimeAllowed: Boolean = js.native
  
  /**
    * Gets or sets a value that specifies whether the elapsed time control is enabled.
    **/
  var isElapsedTimeEnabled: Boolean = js.native
  
  /**
    * Gets or sets a value that specifies whether the elapsed time control is visible.
    **/
  var isElapsedTimeVisible: Boolean = js.native
  
  /**
    * Gets a value that specifies whether interaction with the fast forward control is allowed based on the current state of the player.
    **/
  var isFastForwardAllowed: Boolean = js.native
  
  /**
    * Gets or sets a value that specifies whether the fast forward control is enabled.
    **/
  var isFastForwardEnabled: Boolean = js.native
  
  /**
    * Gets or sets a value that specifies whether the fast forward control is visible.
    **/
  var isFastForwardVisible: Boolean = js.native
  
  /**
    * Gets or sets a value that specifies whether the player is in full screen mode.
    **/
  var isFullScreen: Boolean = js.native
  
  /**
    * Gets a value that specifies whether interaction with the full screen control is allowed based on the current state of the player.
    **/
  var isFullScreenAllowed: Boolean = js.native
  
  /**
    * Gets or sets a value that specifies whether the full screen control is enabled.
    **/
  var isFullScreenEnabled: Boolean = js.native
  
  /**
    * Gets or sets a value that specifies whether the full screen control is visible.
    **/
  var isFullScreenVisible: Boolean = js.native
  
  /**
    * Gets a value that specifies whether interaction with the go live control is allowed based on the current state of the player.
    **/
  var isGoLiveAllowed: Boolean = js.native
  
  /**
    * Gets or sets a value that specifies whether the go live control is enabled.
    **/
  var isGoLiveEnabled: Boolean = js.native
  
  /**
    * Gets or sets a value that specifies whether the go live control is visible.
    **/
  var isGoLiveVisible: Boolean = js.native
  
  /**
    * Gets or sets a value that specifies whether the player is currently in interactive mode(e.g.showing the control panel).
    **/
  var isInteractive: Boolean = js.native
  
  /**
    * Gets a value that specifies whether the current media source is a live stream.
    **/
  var isLive: Boolean = js.native
  
  /**
    * Gets a value that specifies whether interaction with the media quality control is allowed based on the current state of the player.
    **/
  var isMediaQualityAllowed: Boolean = js.native
  
  /**
    * Gets or sets a value that specifies whether the media quality control is enabled.
    **/
  var isMediaQualityEnabled: Boolean = js.native
  
  /**
    * Gets or sets a value that specifies whether the media quality control is visible.
    **/
  var isMediaQualityVisible: Boolean = js.native
  
  /**
    * Gets a value that specifies whether interaction with the mute control is allowed based on the current state of the player.
    **/
  var isMuteAllowed: Boolean = js.native
  
  /**
    * Gets or sets a value that specifies whether the mute control is enabled.
    **/
  var isMuteEnabled: Boolean = js.native
  
  /**
    * Gets or sets a value that specifies whether the mute control is visible.
    **/
  var isMuteVisible: Boolean = js.native
  
  /**
    * Gets a value that specifies whether interaction with the pause control is allowed based on the current state of the player.
    **/
  var isPauseAllowed: Boolean = js.native
  
  /**
    * Gets or sets a value that specifies whether the pause control is enabled.
    **/
  var isPauseEnabled: Boolean = js.native
  
  /**
    * Gets or sets a value that specifies whether the pause control is visible.
    **/
  var isPauseVisible: Boolean = js.native
  
  /**
    * Gets a value that specifies whether interaction with the play / pause control is allowed based on the current state of the player.
    **/
  var isPlayPauseAllowed: Boolean = js.native
  
  /**
    * Gets or sets a value that specifies whether the play / pause control is enabled.
    **/
  var isPlayPauseEnabled: Boolean = js.native
  
  /**
    * Gets or sets a value that specifies whether the play / pause control is visible.
    **/
  var isPlayPauseVisible: Boolean = js.native
  
  /**
    * Gets a value that specifies whether interaction with the play / resume control is allowed based on the current state of the player.
    **/
  var isPlayResumeAllowed: Boolean = js.native
  
  /**
    * Gets or sets a value that specifies whether the play / resume control is enabled.
    **/
  var isPlayResumeEnabled: Boolean = js.native
  
  /**
    * Gets or sets a value that specifies whether the play / resume control is visible.
    **/
  var isPlayResumeVisible: Boolean = js.native
  
  /**
    * Gets a value that specifies whether interaction with the remaining time control is allowed based on the current state of the player.
    **/
  var isRemainingTimeAllowed: Boolean = js.native
  
  /**
    * Gets or sets a value that specifies whether the remaining time control is enabled.
    **/
  var isRemainingTimeEnabled: Boolean = js.native
  
  /**
    * Gets or sets a value that specifies whether the remaining time control is visible.
    **/
  var isRemainingTimeVisible: Boolean = js.native
  
  /**
    * Gets a value that specifies whether interaction with the replay control is allowed based on the current state of the player.
    **/
  var isReplayAllowed: Boolean = js.native
  
  /**
    * Gets or sets a value that specifies whether the replay control is enabled.
    **/
  var isReplayEnabled: Boolean = js.native
  
  /**
    * Gets or sets a value that specifies whether the replay control is visible.
    **/
  var isReplayVisible: Boolean = js.native
  
  /**
    * Gets a value that specifies whether interaction with the rewind control is allowed based on the current state of the player.
    **/
  var isRewindAllowed: Boolean = js.native
  
  /**
    * Gets or sets a value that specifies whether the rewind control is enabled.
    **/
  var isRewindEnabled: Boolean = js.native
  
  /**
    * Gets or sets a value that specifies whether the rewind control is visible.
    **/
  var isRewindVisible: Boolean = js.native
  
  /**
    * Gets a value that specifies whether interaction with the signal strength control is allowed based on the current state of the player.
    **/
  var isSignalStrengthAllowed: Boolean = js.native
  
  /**
    * Gets or sets a value that specifies whether the signal strength control is enabled.
    **/
  var isSignalStrengthEnabled: Boolean = js.native
  
  /**
    * Gets or sets a value that specifies whether the signal strength control is visible.
    **/
  var isSignalStrengthVisible: Boolean = js.native
  
  /**
    * Gets a value that specifies whether interaction with the skip ahead control is allowed based on the current state of the player.
    **/
  var isSkipAheadAllowed: Boolean = js.native
  
  /**
    * Gets or sets a value that specifies whether the skip ahead control is enabled.
    **/
  var isSkipAheadEnabled: Boolean = js.native
  
  /**
    * Gets or sets a value that specifies whether the skip ahead control is visible.
    **/
  var isSkipAheadVisible: Boolean = js.native
  
  /**
    * Gets a value that specifies whether interaction with the skip back control is allowed based on the current state of the player.
    **/
  var isSkipBackAllowed: Boolean = js.native
  
  /**
    * Gets or sets a value that specifies whether the skip back control is enabled.
    **/
  var isSkipBackEnabled: Boolean = js.native
  
  /**
    * Gets or sets a value that specifies whether the skip back control is visible.
    **/
  var isSkipBackVisible: Boolean = js.native
  
  /**
    * Gets a value that specifies whether interaction with the skip next control is allowed based on the current state of the player.
    **/
  var isSkipNextAllowed: Boolean = js.native
  
  /**
    * Gets or sets a value that specifies whether the skip next control is enabled.
    **/
  var isSkipNextEnabled: Boolean = js.native
  
  /**
    * Gets or sets a value that specifies whether the skip next control is visible.
    **/
  var isSkipNextVisible: Boolean = js.native
  
  /**
    * Gets a value that specifies whether interaction with the skip previous control is allowed based on the current state of the player.
    **/
  var isSkipPreviousAllowed: Boolean = js.native
  
  /**
    * Gets or sets a value that specifies whether the skip previous control is enabled.
    **/
  var isSkipPreviousEnabled: Boolean = js.native
  
  /**
    * Gets or sets a value that specifies whether the skip previous control is visible.
    **/
  var isSkipPreviousVisible: Boolean = js.native
  
  /**
    * Gets or sets a value that specifies whether the player is playing in slow motion.
    **/
  var isSlowMotion: Boolean = js.native
  
  /**
    * Gets a value that specifies whether interaction with the slow motion control is allowed based on the current state of the player.
    **/
  var isSlowMotionAllowed: Boolean = js.native
  
  /**
    * Gets or sets a value that specifies whether the slow motion control is enabled.
    **/
  var isSlowMotionEnabled: Boolean = js.native
  
  /**
    * Gets or sets a value that specifies whether the slow motion control is visible.
    **/
  var isSlowMotionVisible: Boolean = js.native
  
  /**
    * Gets or sets a value that specifies whether the start time is offset.
    **/
  var isStartTimeOffset: Boolean = js.native
  
  /**
    * Gets a value that specifies whether interaction with the timeline control is allowed based on the current state of the player.
    **/
  var isTimelineAllowed: Boolean = js.native
  
  /**
    * Gets or sets a value that specifies whether the timeline control is enabled.
    **/
  var isTimelineEnabled: Boolean = js.native
  
  /**
    * Gets or sets a value that specifies whether the timeline control is visible.
    **/
  var isTimelineVisible: Boolean = js.native
  
  /**
    * Gets a value that specifies whether interaction with the volume control is allowed based on the current state of the player.
    **/
  var isVolumeAllowed: Boolean = js.native
  
  /**
    * Gets or sets a value that specifies whether the volume control is enabled.
    **/
  var isVolumeEnabled: Boolean = js.native
  
  /**
    * Gets a value that specifies whether interaction with the volume / mute control is allowed based on the current state of the player.
    **/
  var isVolumeMuteAllowed: Boolean = js.native
  
  /**
    * Gets or sets a value that specifies whether the volume / mute control is enabled.
    **/
  var isVolumeMuteEnabled: Boolean = js.native
  
  /**
    * Gets or sets a value that specifies whether the volume / mute control is visible.
    **/
  var isVolumeMuteVisible: Boolean = js.native
  
  /**
    * Gets or sets a value that specifies whether the volume control is visible.
    **/
  var isVolumeVisible: Boolean = js.native
  
  /**
    * Gets or sets the live position (in seconds).
    **/
  var liveTime: Double = js.native
  
  /**
    * Gets or sets the live buffer time (in seconds) for the current playback position to be considered "live".
    **/
  var liveTimeBuffer: Double = js.native
  
  /**
    * Reloads the current media source.
    **/
  def load(): Unit = js.native
  
  /**
    * Gets or sets a value that specifies whether playback should be restarted after it ends.
    **/
  var loop: Boolean = js.native
  
  /**
    * Gets the media element associated with the player.
    **/
  var mediaElement: HTMLMediaElement = js.native
  
  /**
    * Gets or sets the media extension manager to be used by the player and its plugins.A new instance will be created on first use if one is not already set.
    **/
  var mediaExtensionManager: MediaExtensionManager = js.native
  
  /**
    * Gets or sets the quality of the current media source.
    **/
  var mediaQuality: MediaQuality = js.native
  
  /**
    * Raises the moreinvoked event typically used to indicate that more options that were unable to fit in the control panel should be presented to the user (usually in the form of a flyout).
    **/
  def more(): Unit = js.native
  
  /**
    * Gets or sets a value that specifies the purpose of the media, such as background audio or alerts.
    **/
  var msAudioCategory: String = js.native
  
  /**
    * Gets or sets a value that specifies the output device ID that the audio will be sent to.
    **/
  var msAudioDeviceType: String = js.native
  
  /**
    * Clears all effects from the media pipeline.
    **/
  def msClearEffects(): Unit = js.native
  
  /**
    * Steps the video forward or backward by one frame.
    * @param forward If true, the video is stepped forward, otherwise the video is stepped backward.
    **/
  def msFrameStep(forward: Boolean): Unit = js.native
  
  /**
    * Gets or sets a value that specifies whether the media is flipped horizontally.
    **/
  var msHorizontalMirror: Boolean = js.native
  
  /**
    * Inserts the specified audio effect into the media pipeline.
    * @param activatableClassId The audio effects class.
    * @param effectRequired
    * @param config
    **/
  def msInsertAudioEffect(activatableClassId: String, effectRequired: Boolean, config: js.Object): Unit = js.native
  
  /**
    * Inserts the specified video effect into the media pipeline.
    * @param activatableClassId The video effects class.
    * @param effectRequired
    * @param config
    **/
  def msInsertVideoEffect(activatableClassId: String, effectRequired: Boolean, config: js.Object): Unit = js.native
  
  /**
    * Gets a value that specifies whether the media can be rendered more efficiently.
    **/
  var msIsLayoutOptimalForPlayback: Boolean = js.native
  
  /**
    * Gets a value that specifies whether the system considers the media to be stereo 3D.
    **/
  var msIsStereo3D: Boolean = js.native
  
  /**
    * Gets or sets a value that specifies whether the DLNA PlayTo device is available.
    **/
  var msPlayToDisabled: Boolean = js.native
  
  /**
    * Gets or sets the primary DLNA PlayTo device.
    **/
  var msPlayToPrimary: Boolean = js.native
  
  /**
    * Gets the media source for use by the PlayToManager.
    **/
  var msPlayToSource: js.Object = js.native
  
  /**
    * Gets or sets a value that specifies whether or not to enable low - latency playback.
    **/
  var msRealTime: Boolean = js.native
  
  /**
    * Sets the MSMediaKeys to be used for decrypting media data.
    * @param mediaKeys The media keys to use for decrypting media data.
    **/
  def msSetMediaKeys(mediaKeys: Any): Unit = js.native
  
  /**
    * Sets the media protection manager for a given media pipeline.
    * @param mediaProtectionManager
    **/
  def msSetMediaProtectionManager(mediaProtectionManager: MediaProtectionManager): Unit = js.native
  
  /**
    * Sets the dimensions of a sub - rectangle within a video.
    * @param left The left position of the rectangle.
    * @param top The top position of the rectangle.
    * @param right The right position of the rectangle.
    * @param bottom The bottom position of the rectangle.
    **/
  def msSetVideoRectangle(left: Double, top: Double, right: Double, bottom: Double): Unit = js.native
  
  /**
    * Gets or sets the frame - packing mode for stereo 3D video content.
    **/
  var msStereo3DPackingMode: String = js.native
  
  /**
    * Gets or sets a value that specifies whether the system display is set to stereo display.
    **/
  var msStereo3DRenderMode: String = js.native
  
  /**
    * Gets or sets a value that specifies whether the video frame is trimmed to fit the display.
    **/
  var msZoom: Boolean = js.native
  
  /**
    * Gets or sets a value that indicates whether the audio is muted.
    **/
  var muted: Boolean = js.native
  
  /**
    * Gets the current network state for the player.
    **/
  var networkState: NetworkState = js.native
  
  /**
    * Pauses playback of the current media source.
    **/
  def pause(): Unit = js.native
  
  /**
    * Gets a value that specifies whether playback is paused.
    **/
  var paused: Boolean = js.native
  
  /**
    * Loads and starts playback of the current media source.
    **/
  def play(): Unit = js.native
  
  /**
    * Resets the playback rate and resumes playing the current media source.
    **/
  def playResume(): Unit = js.native
  
  /**
    * Gets or sets the playback rate for the current media source.
    **/
  var playbackRate: Double = js.native
  
  /**
    * Gets the played time ranges for the current media source.
    **/
  var played: js.Array[Any] = js.native
  
  /**
    * Gets or sets the current state of the player.
    **/
  var playerState: PlayerState = js.native
  
  //TODO: (type: TimeRanges, read - only)
  /**
    * Gets the playlist plugin.
    **/
  var playlistPlugin: PlaylistPlugin = js.native
  
  /*
    * Gets the plugins associated with the player.
    **/
  var plugins: js.Array[Any] = js.native
  
  //TODO: (type: ?, read - only)
  /*
    * Gets or sets the URL of an image to display while the current media source is loading.
    **/
  var poster: String = js.native
  
  /**
    ** Gets or sets a hint to how much buffering is advisable for the current media source.
    **/
  var preload: String = js.native
  
  /**
    * Gets the current readiness state of the player.
    **/
  var readyState: ReadyState = js.native
  
  /**
    * Removes the specified CSS class from the host element.
    * @param name The name of the class to remove. Multiple classes can be removed using space-delimited names.
    **/
  def removeClass(name: String): Unit = js.native
  
  /**
    * Removes an event listener from the media player control.
    * @param type The type (name) of the event. You can use any of the following: "". //TODO
    * @param eventHandler The listener to remove.
    **/
  def removeEventListener(eventName: String, eventHandler: js.Function): Unit = js.native
  
  /**
    * Supports instant replay by applying an offset to the current playback position.
    **/
  def replay(): Unit = js.native
  
  /**
    * Gets or sets the amount of time (in seconds) to offset the current playback position during replay.
    **/
  var replayOffset: Double = js.native
  
  /**
    * Reloads the current media source and resumes where playback was left off.
    **/
  def retry(): Unit = js.native
  
  /**
    * Gets a value that specifies whether the player is currently moving to a new playback position due to a scrub operation.
    **/
  var scrubbing: Boolean = js.native
  
  //TODO: (type: Boolean, read - only)
  /**
    * Gets or sets a value that specifies whether the current video frame should be updated during a scrub operation.
    **/
  var seekWhileScrubbing: Boolean = js.native
  
  //TODO: (type: Boolean, read - only)
  /**
    * Gets the seekable time ranges of the current media source.
    **/
  var seekable: Any = js.native
  
  //TODO: (type: TimeRanges, read - only)
  /**
    * Gets a value that specifies whether the player is currently moving to a new playback position due to a seek operation.
    **/
  var seeking: Boolean = js.native
  
  /**
    * Gets or sets the signal strength of the current media source.This is useful in adaptive streaming scenarios.
    **/
  var signalStrength: Double = js.native
  
  /**
    * Gets or sets the amount of time (in seconds) that the skip ahead control will seek forward.
    **/
  var skipAheadInterval: Double = js.native
  
  /**
    * Gets or sets the amount of time (in seconds) that the skip back control will seek backward.
    **/
  var skipBackInterval: Double = js.native
  
  /**
    * Gets or sets the playback rate to use when in slow motion.
    **/
  var slowMotionPlaybackRate: Double = js.native
  
  /**
    * Gets or sets the media sources to be considered.
    **/
  var sources: js.Array[Any] = js.native
  
  //TODO: (type: Array, read / write)
  /**
    * Gets or sets the URL of the current media source to be considered.
    **/
  var src: String = js.native
  
  /**
    * Gets or sets the start time (in seconds) of the current media source.This is useful in live streaming scenarios.
    **/
  var startTime: Double = js.native
  
  /**
    * Gets or sets the position (in seconds) where playback should start.This is useful for resuming a video where the user left off in a previous session.
    **/
  var startupTime: Double = js.native
  
  /**
    * Stops playback and raises the stopped event.
    **/
  def stop(): Unit = js.native
  
  /**
    * Gets or sets whether a test for the media feature pack should be performed prior to allowing content to be laoded.This is useful to enable if Windows 8 N / KN users will be using this app.
    **/
  var testForMediaPack: Boolean = js.native
  
  /**
    * Gets the text tracks for the current media source.
    **/
  var textTracks: Any = js.native
  
  // TODO: (type: TextTrackList, read - only)
  /**
    * Gets or sets the tracks for the player.
    **/
  var tracks: js.Array[Any] = js.native
  
  /**
    * Updates the player and its plugins with the specified media source(e.g.the current playlist item).
    * @param mediaSource A JSON object containing the set of options that represent a media source.
    **/
  def update(mediaSource: js.Object): Unit = js.native
  
  // TODO: (type: Array, read / write)
  /**
    * Gets the intrinsic height of the current video (in pixels).
    **/
  var videoHeight: Double = js.native
  
  /**
    * Gets the intrinsic width of the current video (in pixels).
    **/
  var videoWidth: Double = js.native
  
  /**
    * Gets or sets the volume level(from 0 to 1) for the audio portions of media playback.
    **/
  var volume: Double = js.native
  
  /**
    * Gets or sets the width of the host element.
    **/
  var width: String = js.native
}
