package typings
package playerframeworkLib.PlayerFrameworkNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
	*
	**/
@JSGlobal("PlayerFramework.MediaPlayer")
@js.native
class MediaPlayer protected () extends js.Object {
  def this(element: stdLib.HTMLElement) = this()
  def this(element: stdLib.HTMLElement, options: js.Any) = this()
  /**
  		* Gets or sets the current advertising state of the player.
  		**/
  var advertisingState: AdvertisingState = js.native
  /**
  		* Gets the audio tracks for the current media source.
  		**/
  var audioTracks: js.Array[_] = js.native
  /**
  		* Gets or sets a value that indicates whether to automatically start buffering the current media source.
  		**/
  var autobuffer: scala.Boolean = js.native
  /**
  		* Gets or sets a value that specifies whether interactive elements(e.g.the control panel) will be hidden automatically.
  		**/
  var autohide: scala.Boolean = js.native
  /**
  		* Gets or sets the behavior of the autohide feature.
  		**/
  var autohideBehavior: AutohideBehavior = js.native
  /**
  		* Gets or sets the amount of time (in seconds) before interactive elements(e.g.the control panel) will be hidden automatically.
  		**/
  var autohideTime: scala.Double = js.native
  /**
  		* Gets or sets a value that specifies whether to start loading the current media source automatically.
  		**/
  var autoload: scala.Boolean = js.native
  /**
  		* Gets or sets a value that specifies whether to automatically start playing the current media source.
  		**/
  var autoplay: scala.Boolean = js.native
  /**
  		* Gets the buffered time ranges for the current media source.
  		**/
  var buffered: js.Array[_] = js.native
   //TODO: (type: TimeRanges, read - only)
  /**
  		* Gets the caption and subtitle tracks for the current media source.
  		**/
  var captionTracks: js.Array[_] = js.native
  /**
  		* Gets or sets a value that specifies whether to display the native controls for the current media source.
  		**/
  var controls: scala.Boolean = js.native
  /**
  		* Gets or sets the current audio track.
  		**/
  var currentAudioTrack: js.Any = js.native
   //TODO: (type: AudioTrack, read / write)
  /**
  		* Gets or sets the current caption / subtitle track.
  		**/
  var currentCaptionTrack: js.Any = js.native
   //TODO: (type: TextTrack, read / write)
  /**
  		* Gets the URL of the current media source.
  		**/
  var currentSrc: java.lang.String = js.native
  /**
  		* Gets or sets the current playback position (in seconds).
  		**/
  var currentTime: scala.Double = js.native
  /**
  		* Gets the view model that will be restored following a temporary change to the current interactive view model(e.g.during an ad).
  		**/
  var defaultInteractiveViewModel: InteractiveViewModel = js.native
  /**
  		* Gets or sets the playback rate to use when play is resumed.
  		**/
  var defaultPlaybackRate: scala.Double = js.native
  /**
  		* Gets the duration (in seconds) of the current media source.
  		**/
  var duration: scala.Double = js.native
  /**
  		* Gets the host element for the control.
  		**/
  var element: stdLib.HTMLElement = js.native
  /**
  		* Gets or sets the end time (in seconds) of the current media source.This is useful in live streaming scenarios.
  		**/
  var endTime: scala.Double = js.native
  /**
  		* Gets a value that specifies whether playback has ended.
  		**/
  var ended: scala.Boolean = js.native
  /**
  		* Gets the current error state of the player.
  		**/
  var error: stdLib.MediaError = js.native
  /**
  		* Gets or sets the height of the host element.
  		**/
  var height: java.lang.String = js.native
  /**
  		* Gets the earliest possible position (in seconds) that playback can begin.
  		**/
  var initialTime: scala.Double = js.native
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
  var isAudioAllowed: scala.Boolean = js.native
  /**
  		* Gets or sets a value that specifies whether the audio control is enabled.
  		**/
  var isAudioEnabled: scala.Boolean = js.native
  /**
  		* Gets or sets a value that specifies whether the audio control is visible.
  		**/
  var isAudioVisible: scala.Boolean = js.native
  /**
  		* Gets a value that specifies whether interaction with the captions control is allowed based on the current state of the player.
  		**/
  var isCaptionsAllowed: scala.Boolean = js.native
  /**
  		* Gets or sets a value that specifies whether the captions control is enabled.
  		**/
  var isCaptionsEnabled: scala.Boolean = js.native
   //TODO: READ-ONLY
  /**
  		* Gets or sets a value that specifies whether the captions control is visible.
  		**/
  var isCaptionsVisible: scala.Boolean = js.native
  /**
  		* Gets a value that specifies whether the current playback position is "live".
  		**/
  var isCurrentTimeLive: scala.Boolean = js.native
  /**
  		* Gets a value that specifies whether interaction with the elapsed time control is allowed based on the current state of the player.
  		**/
  var isElapsedTimeAllowed: scala.Boolean = js.native
  /**
  		* Gets or sets a value that specifies whether the elapsed time control is enabled.
  		**/
  var isElapsedTimeEnabled: scala.Boolean = js.native
  /**
  		* Gets or sets a value that specifies whether the elapsed time control is visible.
  		**/
  var isElapsedTimeVisible: scala.Boolean = js.native
  /**
  		* Gets a value that specifies whether interaction with the fast forward control is allowed based on the current state of the player.
  		**/
  var isFastForwardAllowed: scala.Boolean = js.native
  /**
  		* Gets or sets a value that specifies whether the fast forward control is enabled.
  		**/
  var isFastForwardEnabled: scala.Boolean = js.native
  /**
  		* Gets or sets a value that specifies whether the fast forward control is visible.
  		**/
  var isFastForwardVisible: scala.Boolean = js.native
  /**
  		* Gets or sets a value that specifies whether the player is in full screen mode.
  		**/
  var isFullScreen: scala.Boolean = js.native
  /**
  		* Gets a value that specifies whether interaction with the full screen control is allowed based on the current state of the player.
  		**/
  var isFullScreenAllowed: scala.Boolean = js.native
  /**
  		* Gets or sets a value that specifies whether the full screen control is enabled.
  		**/
  var isFullScreenEnabled: scala.Boolean = js.native
  /**
  		* Gets or sets a value that specifies whether the full screen control is visible.
  		**/
  var isFullScreenVisible: scala.Boolean = js.native
  /**
  		* Gets a value that specifies whether interaction with the go live control is allowed based on the current state of the player.
  		**/
  var isGoLiveAllowed: scala.Boolean = js.native
  /**
  		* Gets or sets a value that specifies whether the go live control is enabled.
  		**/
  var isGoLiveEnabled: scala.Boolean = js.native
  /**
  		* Gets or sets a value that specifies whether the go live control is visible.
  		**/
  var isGoLiveVisible: scala.Boolean = js.native
  /**
  		* Gets or sets a value that specifies whether the player is currently in interactive mode(e.g.showing the control panel).
  		**/
  var isInteractive: scala.Boolean = js.native
  /**
  		* Gets a value that specifies whether the current media source is a live stream.
  		**/
  var isLive: scala.Boolean = js.native
  /**
  		* Gets a value that specifies whether interaction with the media quality control is allowed based on the current state of the player.
  		**/
  var isMediaQualityAllowed: scala.Boolean = js.native
  /**
  		* Gets or sets a value that specifies whether the media quality control is enabled.
  		**/
  var isMediaQualityEnabled: scala.Boolean = js.native
  /**
  		* Gets or sets a value that specifies whether the media quality control is visible.
  		**/
  var isMediaQualityVisible: scala.Boolean = js.native
  /**
  		* Gets a value that specifies whether interaction with the mute control is allowed based on the current state of the player.
  		**/
  var isMuteAllowed: scala.Boolean = js.native
  /**
  		* Gets or sets a value that specifies whether the mute control is enabled.
  		**/
  var isMuteEnabled: scala.Boolean = js.native
  /**
  		* Gets or sets a value that specifies whether the mute control is visible.
  		**/
  var isMuteVisible: scala.Boolean = js.native
  /**
  		* Gets a value that specifies whether interaction with the pause control is allowed based on the current state of the player.
  		**/
  var isPauseAllowed: scala.Boolean = js.native
  /**
  		* Gets or sets a value that specifies whether the pause control is enabled.
  		**/
  var isPauseEnabled: scala.Boolean = js.native
  /**
  		* Gets or sets a value that specifies whether the pause control is visible.
  		**/
  var isPauseVisible: scala.Boolean = js.native
  /**
  		* Gets a value that specifies whether interaction with the play / pause control is allowed based on the current state of the player.
  		**/
  var isPlayPauseAllowed: scala.Boolean = js.native
  /**
  		* Gets or sets a value that specifies whether the play / pause control is enabled.
  		**/
  var isPlayPauseEnabled: scala.Boolean = js.native
  /**
  		* Gets or sets a value that specifies whether the play / pause control is visible.
  		**/
  var isPlayPauseVisible: scala.Boolean = js.native
  /**
  		* Gets a value that specifies whether interaction with the play / resume control is allowed based on the current state of the player.
  		**/
  var isPlayResumeAllowed: scala.Boolean = js.native
  /**
  		* Gets or sets a value that specifies whether the play / resume control is enabled.
  		**/
  var isPlayResumeEnabled: scala.Boolean = js.native
  /**
  		* Gets or sets a value that specifies whether the play / resume control is visible.
  		**/
  var isPlayResumeVisible: scala.Boolean = js.native
  /**
  		* Gets a value that specifies whether interaction with the remaining time control is allowed based on the current state of the player.
  		**/
  var isRemainingTimeAllowed: scala.Boolean = js.native
  /**
  		* Gets or sets a value that specifies whether the remaining time control is enabled.
  		**/
  var isRemainingTimeEnabled: scala.Boolean = js.native
  /**
  		* Gets or sets a value that specifies whether the remaining time control is visible.
  		**/
  var isRemainingTimeVisible: scala.Boolean = js.native
  /**
  		* Gets a value that specifies whether interaction with the replay control is allowed based on the current state of the player.
  		**/
  var isReplayAllowed: scala.Boolean = js.native
  /**
  		* Gets or sets a value that specifies whether the replay control is enabled.
  		**/
  var isReplayEnabled: scala.Boolean = js.native
  /**
  		* Gets or sets a value that specifies whether the replay control is visible.
  		**/
  var isReplayVisible: scala.Boolean = js.native
  /**
  		* Gets a value that specifies whether interaction with the rewind control is allowed based on the current state of the player.
  		**/
  var isRewindAllowed: scala.Boolean = js.native
  /**
  		* Gets or sets a value that specifies whether the rewind control is enabled.
  		**/
  var isRewindEnabled: scala.Boolean = js.native
  /**
  		* Gets or sets a value that specifies whether the rewind control is visible.
  		**/
  var isRewindVisible: scala.Boolean = js.native
  /**
  		* Gets a value that specifies whether interaction with the signal strength control is allowed based on the current state of the player.
  		**/
  var isSignalStrengthAllowed: scala.Boolean = js.native
  /**
  		* Gets or sets a value that specifies whether the signal strength control is enabled.
  		**/
  var isSignalStrengthEnabled: scala.Boolean = js.native
  /**
  		* Gets or sets a value that specifies whether the signal strength control is visible.
  		**/
  var isSignalStrengthVisible: scala.Boolean = js.native
  /**
  		* Gets a value that specifies whether interaction with the skip ahead control is allowed based on the current state of the player.
  		**/
  var isSkipAheadAllowed: scala.Boolean = js.native
  /**
  		* Gets or sets a value that specifies whether the skip ahead control is enabled.
  		**/
  var isSkipAheadEnabled: scala.Boolean = js.native
  /**
  		* Gets or sets a value that specifies whether the skip ahead control is visible.
  		**/
  var isSkipAheadVisible: scala.Boolean = js.native
  /**
  		* Gets a value that specifies whether interaction with the skip back control is allowed based on the current state of the player.
  		**/
  var isSkipBackAllowed: scala.Boolean = js.native
  /**
  		* Gets or sets a value that specifies whether the skip back control is enabled.
  		**/
  var isSkipBackEnabled: scala.Boolean = js.native
  /**
  		* Gets or sets a value that specifies whether the skip back control is visible.
  		**/
  var isSkipBackVisible: scala.Boolean = js.native
  /**
  		* Gets a value that specifies whether interaction with the skip next control is allowed based on the current state of the player.
  		**/
  var isSkipNextAllowed: scala.Boolean = js.native
  /**
  		* Gets or sets a value that specifies whether the skip next control is enabled.
  		**/
  var isSkipNextEnabled: scala.Boolean = js.native
  /**
  		* Gets or sets a value that specifies whether the skip next control is visible.
  		**/
  var isSkipNextVisible: scala.Boolean = js.native
  /**
  		* Gets a value that specifies whether interaction with the skip previous control is allowed based on the current state of the player.
  		**/
  var isSkipPreviousAllowed: scala.Boolean = js.native
  /**
  		* Gets or sets a value that specifies whether the skip previous control is enabled.
  		**/
  var isSkipPreviousEnabled: scala.Boolean = js.native
  /**
  		* Gets or sets a value that specifies whether the skip previous control is visible.
  		**/
  var isSkipPreviousVisible: scala.Boolean = js.native
  /**
  		* Gets or sets a value that specifies whether the player is playing in slow motion.
  		**/
  var isSlowMotion: scala.Boolean = js.native
  /**
  		* Gets a value that specifies whether interaction with the slow motion control is allowed based on the current state of the player.
  		**/
  var isSlowMotionAllowed: scala.Boolean = js.native
  /**
  		* Gets or sets a value that specifies whether the slow motion control is enabled.
  		**/
  var isSlowMotionEnabled: scala.Boolean = js.native
  /**
  		* Gets or sets a value that specifies whether the slow motion control is visible.
  		**/
  var isSlowMotionVisible: scala.Boolean = js.native
  /**
  		* Gets or sets a value that specifies whether the start time is offset.
  		**/
  var isStartTimeOffset: scala.Boolean = js.native
  /**
  		* Gets a value that specifies whether interaction with the timeline control is allowed based on the current state of the player.
  		**/
  var isTimelineAllowed: scala.Boolean = js.native
  /**
  		* Gets or sets a value that specifies whether the timeline control is enabled.
  		**/
  var isTimelineEnabled: scala.Boolean = js.native
  /**
  		* Gets or sets a value that specifies whether the timeline control is visible.
  		**/
  var isTimelineVisible: scala.Boolean = js.native
  /**
  		* Gets a value that specifies whether interaction with the volume control is allowed based on the current state of the player.
  		**/
  var isVolumeAllowed: scala.Boolean = js.native
  /**
  		* Gets or sets a value that specifies whether the volume control is enabled.
  		**/
  var isVolumeEnabled: scala.Boolean = js.native
  /**
  		* Gets a value that specifies whether interaction with the volume / mute control is allowed based on the current state of the player.
  		**/
  var isVolumeMuteAllowed: scala.Boolean = js.native
  /**
  		* Gets or sets a value that specifies whether the volume / mute control is enabled.
  		**/
  var isVolumeMuteEnabled: scala.Boolean = js.native
  /**
  		* Gets or sets a value that specifies whether the volume / mute control is visible.
  		**/
  var isVolumeMuteVisible: scala.Boolean = js.native
  /**
  		* Gets or sets a value that specifies whether the volume control is visible.
  		**/
  var isVolumeVisible: scala.Boolean = js.native
  /**
  		* Gets or sets the live position (in seconds).
  		**/
  var liveTime: scala.Double = js.native
  /**
  		* Gets or sets the live buffer time (in seconds) for the current playback position to be considered "live".
  		**/
  var liveTimeBuffer: scala.Double = js.native
  /**
  		* Gets or sets a value that specifies whether playback should be restarted after it ends.
  		**/
  var loop: scala.Boolean = js.native
  /**
  		* Gets the media element associated with the player.
  		**/
  var mediaElement: stdLib.HTMLMediaElement = js.native
  /**
  		* Gets or sets the media extension manager to be used by the player and its plugins.A new instance will be created on first use if one is not already set.
  		**/
  var mediaExtensionManager: winrtLib.WindowsNs.MediaNs.MediaExtensionManager = js.native
  /**
  		* Gets or sets the quality of the current media source.
  		**/
  var mediaQuality: MediaQuality = js.native
  /**
  		* Gets or sets a value that specifies the purpose of the media, such as background audio or alerts.
  		**/
  var msAudioCategory: java.lang.String = js.native
  /**
  		* Gets or sets a value that specifies the output device ID that the audio will be sent to.
  		**/
  var msAudioDeviceType: java.lang.String = js.native
  /**
  		* Gets or sets a value that specifies whether the media is flipped horizontally.
  		**/
  var msHorizontalMirror: scala.Boolean = js.native
  /**
  		* Gets a value that specifies whether the media can be rendered more efficiently.
  		**/
  var msIsLayoutOptimalForPlayback: scala.Boolean = js.native
  /**
  		* Gets a value that specifies whether the system considers the media to be stereo 3D.
  		**/
  var msIsStereo3D: scala.Boolean = js.native
  /**
  		* Gets or sets a value that specifies whether the DLNA PlayTo device is available.
  		**/
  var msPlayToDisabled: scala.Boolean = js.native
  /**
  		* Gets or sets the primary DLNA PlayTo device.
  		**/
  var msPlayToPrimary: scala.Boolean = js.native
  /**
  		* Gets the media source for use by the PlayToManager.
  		**/
  var msPlayToSource: js.Object = js.native
  /**
  		* Gets or sets a value that specifies whether or not to enable low - latency playback.
  		**/
  var msRealTime: scala.Boolean = js.native
  /**
  		* Gets or sets the frame - packing mode for stereo 3D video content.
  		**/
  var msStereo3DPackingMode: java.lang.String = js.native
  /**
  		* Gets or sets a value that specifies whether the system display is set to stereo display.
  		**/
  var msStereo3DRenderMode: java.lang.String = js.native
  /**
  		* Gets or sets a value that specifies whether the video frame is trimmed to fit the display.
  		**/
  var msZoom: scala.Boolean = js.native
  /**
  		* Gets or sets a value that indicates whether the audio is muted.
  		**/
  var muted: scala.Boolean = js.native
  /**
  		* Gets the current network state for the player.
  		**/
  var networkState: NetworkState = js.native
  /**
  		* Gets a value that specifies whether playback is paused.
  		**/
  var paused: scala.Boolean = js.native
  /**
  		* Gets or sets the playback rate for the current media source.
  		**/
  var playbackRate: scala.Double = js.native
  /**
  		* Gets the played time ranges for the current media source.
  		**/
  var played: js.Array[_] = js.native
  /**
  		* Gets or sets the current state of the player.
  		**/
  var playerState: PlayerState = js.native
   //TODO: (type: TimeRanges, read - only)
  /**
  		* Gets the playlist plugin.
  		**/
  var playlistPlugin: playerframeworkLib.PlayerFrameworkNs.PluginsNs.PlaylistPlugin = js.native
  /*
  		* Gets the plugins associated with the player.
  		**/
  var plugins: js.Array[_] = js.native
   //TODO: (type: ?, read - only)
  /*
  		* Gets or sets the URL of an image to display while the current media source is loading.
  		**/
  var poster: java.lang.String = js.native
  /**
  		** Gets or sets a hint to how much buffering is advisable for the current media source.
  		**/
  var preload: java.lang.String = js.native
  /**
  		* Gets the current readiness state of the player.
  		**/
  var readyState: ReadyState = js.native
  /**
  		* Gets or sets the amount of time (in seconds) to offset the current playback position during replay.
  		**/
  var replayOffset: scala.Double = js.native
  /**
  		* Gets a value that specifies whether the player is currently moving to a new playback position due to a scrub operation.
  		**/
  var scrubbing: scala.Boolean = js.native
   //TODO: (type: Boolean, read - only)
  /**
  		* Gets or sets a value that specifies whether the current video frame should be updated during a scrub operation.
  		**/
  var seekWhileScrubbing: scala.Boolean = js.native
   //TODO: (type: Boolean, read - only)
  /**
  		* Gets the seekable time ranges of the current media source.
  		**/
  var seekable: js.Any = js.native
   //TODO: (type: TimeRanges, read - only)
  /**
  		* Gets a value that specifies whether the player is currently moving to a new playback position due to a seek operation.
  		**/
  var seeking: scala.Boolean = js.native
  /**
  		* Gets or sets the signal strength of the current media source.This is useful in adaptive streaming scenarios.
  		**/
  var signalStrength: scala.Double = js.native
  /**
  		* Gets or sets the amount of time (in seconds) that the skip ahead control will seek forward.
  		**/
  var skipAheadInterval: scala.Double = js.native
  /**
  		* Gets or sets the amount of time (in seconds) that the skip back control will seek backward.
  		**/
  var skipBackInterval: scala.Double = js.native
  /**
  		* Gets or sets the playback rate to use when in slow motion.
  		**/
  var slowMotionPlaybackRate: scala.Double = js.native
  /**
  		* Gets or sets the media sources to be considered.
  		**/
  var sources: js.Array[_] = js.native
   //TODO: (type: Array, read / write)
  /**
  		* Gets or sets the URL of the current media source to be considered.
  		**/
  var src: java.lang.String = js.native
  /**
  		* Gets or sets the start time (in seconds) of the current media source.This is useful in live streaming scenarios.
  		**/
  var startTime: scala.Double = js.native
  /**
  		* Gets or sets the position (in seconds) where playback should start.This is useful for resuming a video where the user left off in a previous session.
  		**/
  var startupTime: scala.Double = js.native
  /**
  		* Gets or sets whether a test for the media feature pack should be performed prior to allowing content to be laoded.This is useful to enable if Windows 8 N / KN users will be using this app.
  		**/
  var testForMediaPack: scala.Boolean = js.native
  /**
  		* Gets the text tracks for the current media source.
  		**/
  var textTracks: js.Any = js.native
   // TODO: (type: TextTrackList, read - only)
  /**
  		* Gets or sets the tracks for the player.
  		**/
  var tracks: js.Array[_] = js.native
   // TODO: (type: Array, read / write)
  /**
  		* Gets the intrinsic height of the current video (in pixels).
  		**/
  var videoHeight: scala.Double = js.native
  /**
  		* Gets the intrinsic width of the current video (in pixels).
  		**/
  var videoWidth: scala.Double = js.native
  /**
  		* Gets or sets the volume level(from 0 to 1) for the audio portions of media playback.
  		**/
  var volume: scala.Double = js.native
  /**
  		* Gets or sets the width of the host element.
  		**/
  var width: java.lang.String = js.native
  /* Methods */
  /**
  		* Adds the specified CSS class to the host element.
  		* @param name The name of the class to add. Multiple classes can be added using space-delimited names.
  		**/
  def addClass(name: java.lang.String): scala.Unit = js.native
  /**
  		* Adds an event listener for the MediaPlayer events.
  		* //TODO
  		* @param type The type (name) of the event. You can use any of the following: "".
  		* @param listener The listener to invoke when the event is raised.
  		* @param capture true to initiate capture, otherwise false.
  		**/
  def addEventListener(`type`: java.lang.String, listener: js.Function): scala.Unit = js.native
  def addEventListener(`type`: java.lang.String, listener: js.Function, capture: scala.Boolean): scala.Unit = js.native
  /**
  		* Create a new TextTrack object to add to an HTML5 video.
  		* @param kind String The type of text track
  		* @param label String A user readable title for a text track
  		* @param language String The BCP47 language tag of the track. For example "en" for English or "fr" for French
  		**/
  def addTextTrack(kind: java.lang.String): scala.Unit = js.native
  def addTextTrack(kind: java.lang.String, label: java.lang.String): scala.Unit = js.native
  def addTextTrack(kind: java.lang.String, label: java.lang.String, language: java.lang.String): scala.Unit = js.native
  /**
  		* Raises the audioinvoked event used to indicate that an audio selection dialog should be presented to the user (usually in the form of a flyout).
  		**/
  def audio(): scala.Unit = js.native
  /**
  		* Returns a value that specifies whether the player can play a given media type.
  		* @param type The type of media to be played.
  		* @returns One of the following values: "probably", "maybe", or an empty string if the media cannot be rendered.
  		**/
  def canPlayType(`type`: java.lang.String): java.lang.String = js.native
  /**
  		* Raises the captionsinvoked event used to indicate that closed options should be toggled on/off or that a caption selection dialog should be presented to the user (usually in the form of a flyout).
  		**/
  def captions(): scala.Unit = js.native
  /**
  		* Decreases the current playback rate by a factor of two.After the rate reaches 1(normal speed), it will flip to - 1, and then begins to rewind.
  		**/
  def decreasePlaybackRate(): scala.Unit = js.native
  /**
  		* Shuts down and releases all resources.
  		**/
  def dispose(): scala.Unit = js.native
  /**
  		* Gives focus to the host element.
  		**/
  def focus(): scala.Unit = js.native
  /**
  		* Increases the current playback rate by a factor of two.After the rate reaches - 1, it flips to 1(normal speed), and then begins to fast forward.
  		**/
  def increasePlaybackRate(): scala.Unit = js.native
  /**
  		* Raises the infoinvoked event used to indicate that more information about the current media should be displayed to the user.
  		**/
  def info(): scala.Unit = js.native
  /**
  		* Reloads the current media source.
  		**/
  def load(): scala.Unit = js.native
  /**
  		* Raises the moreinvoked event typically used to indicate that more options that were unable to fit in the control panel should be presented to the user (usually in the form of a flyout).
  		**/
  def more(): scala.Unit = js.native
  /**
  		* Clears all effects from the media pipeline.
  		**/
  def msClearEffects(): scala.Unit = js.native
  /**
  		* Steps the video forward or backward by one frame.
  		* @param forward If true, the video is stepped forward, otherwise the video is stepped backward.
  		**/
  def msFrameStep(forward: scala.Boolean): scala.Unit = js.native
  /**
  		* Inserts the specified audio effect into the media pipeline.
  		* @param activatableClassId The audio effects class.
  		* @param effectRequired
  		* @param config
  		**/
  def msInsertAudioEffect(activatableClassId: java.lang.String, effectRequired: scala.Boolean, config: js.Object): scala.Unit = js.native
  /**
  		* Inserts the specified video effect into the media pipeline.
  		* @param activatableClassId The video effects class.
  		* @param effectRequired
  		* @param config
  		**/
  def msInsertVideoEffect(activatableClassId: java.lang.String, effectRequired: scala.Boolean, config: js.Object): scala.Unit = js.native
  /**
  		* Sets the MSMediaKeys to be used for decrypting media data.
  		* @param mediaKeys The media keys to use for decrypting media data.
  		**/
  def msSetMediaKeys(mediaKeys: stdLib.MSMediaKeys): scala.Unit = js.native
  /**
  		* Sets the media protection manager for a given media pipeline.
  		* @param mediaProtectionManager
  		**/
  def msSetMediaProtectionManager(mediaProtectionManager: winrtLib.WindowsNs.MediaNs.ProtectionNs.MediaProtectionManager): scala.Unit = js.native
  /**
  		* Sets the dimensions of a sub - rectangle within a video.
  		* @param left The left position of the rectangle.
  		* @param top The top position of the rectangle.
  		* @param right The right position of the rectangle.
  		* @param bottom The bottom position of the rectangle.
  		**/
  def msSetVideoRectangle(left: scala.Double, top: scala.Double, right: scala.Double, bottom: scala.Double): scala.Unit = js.native
  /**
  		* Pauses playback of the current media source.
  		**/
  def pause(): scala.Unit = js.native
  /**
  		* Loads and starts playback of the current media source.
  		**/
  def play(): scala.Unit = js.native
  /**
  		* Resets the playback rate and resumes playing the current media source.
  		**/
  def playResume(): scala.Unit = js.native
  /**
  		* Removes the specified CSS class from the host element.
  		* @param name The name of the class to remove. Multiple classes can be removed using space-delimited names.
  		**/
  def removeClass(name: java.lang.String): scala.Unit = js.native
  /**
  		* Removes an event listener from the media player control.
  		* @param type The type (name) of the event. You can use any of the following: "". //TODO
  		* @param eventHandler The listener to remove.
  		**/
  def removeEventListener(eventName: java.lang.String, eventHandler: js.Function): scala.Unit = js.native
  /**
  		* Supports instant replay by applying an offset to the current playback position.
  		**/
  def replay(): scala.Unit = js.native
  /**
  		* Reloads the current media source and resumes where playback was left off.
  		**/
  def retry(): scala.Unit = js.native
  /**
  		* Stops playback and raises the stopped event.
  		**/
  def stop(): scala.Unit = js.native
  /**
  		* Updates the player and its plugins with the specified media source(e.g.the current playlist item).
  		* @param mediaSource A JSON object containing the set of options that represent a media source.
  		**/
  def update(mediaSource: js.Object): scala.Unit = js.native
}

