package typings.playerframework.global.PlayerFramework

import typings.playerframework.PlayerFramework.PlaylistItem
import typings.std.HTMLElement
import typings.std.MediaSource
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("PlayerFramework.Plugins")
@js.native
object Plugins extends js.Object {
  @js.native
  class AudioSelectorPlugin ()
    extends typings.playerframework.PlayerFramework.Plugins.AudioSelectorPlugin {
    /**
      * Not available in phone.
      **/
    /* CompleteClass */
    override var alignment: String = js.native
    /**
      * Not available in phone.
      **/
    /* CompleteClass */
    override var anchor: HTMLElement = js.native
    /* CompleteClass */
    override var currentMediaSource: MediaSource = js.native
    /* CompleteClass */
    override var isActive: Boolean = js.native
    /* CompleteClass */
    override var isEnabled: Boolean = js.native
    /* CompleteClass */
    override var isLoaded: Boolean = js.native
    /* CompleteClass */
    override var mediaPlayer: typings.playerframework.PlayerFramework.MediaPlayer = js.native
    /**
      * Not available in phone.
      **/
    /* CompleteClass */
    override var placement: String = js.native
    /* CompleteClass */
    override def hide(): Unit = js.native
    /* CompleteClass */
    override def load(): Unit = js.native
    /* CompleteClass */
    override def show(): Unit = js.native
    /* CompleteClass */
    override def unload(): Unit = js.native
    /* CompleteClass */
    override def update(mediaSource: MediaSource): Unit = js.native
  }
  
  @js.native
  class BufferingPlugin ()
    extends typings.playerframework.PlayerFramework.Plugins.BufferingPlugin {
    /* CompleteClass */
    override var currentMediaSource: MediaSource = js.native
    /* CompleteClass */
    override var isActive: Boolean = js.native
    /* CompleteClass */
    override var isEnabled: Boolean = js.native
    /* CompleteClass */
    override var isLoaded: Boolean = js.native
    /* CompleteClass */
    override var mediaPlayer: typings.playerframework.PlayerFramework.MediaPlayer = js.native
    /* CompleteClass */
    override def hide(): Unit = js.native
    /* CompleteClass */
    override def load(): Unit = js.native
    /* CompleteClass */
    override def show(): Unit = js.native
    /* CompleteClass */
    override def unload(): Unit = js.native
    /* CompleteClass */
    override def update(mediaSource: MediaSource): Unit = js.native
  }
  
  @js.native
  class CaptionSelectorPlugin ()
    extends typings.playerframework.PlayerFramework.Plugins.CaptionSelectorPlugin {
    /**
      * Not available in phone.
      **/
    /* CompleteClass */
    override var alignment: String = js.native
    /**
      * Not available in phone.
      **/
    /* CompleteClass */
    override var anchor: HTMLElement = js.native
    /* CompleteClass */
    override var currentMediaSource: MediaSource = js.native
    /* CompleteClass */
    override var isActive: Boolean = js.native
    /* CompleteClass */
    override var isEnabled: Boolean = js.native
    /* CompleteClass */
    override var isLoaded: Boolean = js.native
    /* CompleteClass */
    override var mediaPlayer: typings.playerframework.PlayerFramework.MediaPlayer = js.native
    /**
      * Not available in phone.
      **/
    /* CompleteClass */
    override var placement: String = js.native
    /* CompleteClass */
    override def hide(): Unit = js.native
    /* CompleteClass */
    override def load(): Unit = js.native
    /* CompleteClass */
    override def show(): Unit = js.native
    /* CompleteClass */
    override def unload(): Unit = js.native
    /* CompleteClass */
    override def update(mediaSource: MediaSource): Unit = js.native
  }
  
  @js.native
  class ChaptersPlugin ()
    extends typings.playerframework.PlayerFramework.Plugins.ChaptersPlugin {
    /* CompleteClass */
    override var autoCreateChaptersFromTextTracks: Boolean = js.native
    /* CompleteClass */
    override var autoCreateDefaultChapters: Boolean = js.native
    /* CompleteClass */
    override var currentMediaSource: MediaSource = js.native
    /* CompleteClass */
    override var defaultChapterCount: Double = js.native
    /* CompleteClass */
    override var isActive: Boolean = js.native
    /* CompleteClass */
    override var isEnabled: Boolean = js.native
    /* CompleteClass */
    override var isLoaded: Boolean = js.native
    /* CompleteClass */
    override var mediaPlayer: typings.playerframework.PlayerFramework.MediaPlayer = js.native
    /* CompleteClass */
    override var visualMarkerClass: String = js.native
    /* CompleteClass */
    override def load(): Unit = js.native
    /* CompleteClass */
    override def unload(): Unit = js.native
    /* CompleteClass */
    override def update(mediaSource: MediaSource): Unit = js.native
  }
  
  @js.native
  class ControlPlugin ()
    extends typings.playerframework.PlayerFramework.Plugins.ControlPlugin {
    /* CompleteClass */
    override var currentMediaSource: MediaSource = js.native
    /* CompleteClass */
    override var isActive: Boolean = js.native
    /* CompleteClass */
    override var isEnabled: Boolean = js.native
    /* CompleteClass */
    override var isLoaded: Boolean = js.native
    /* CompleteClass */
    override var mediaPlayer: typings.playerframework.PlayerFramework.MediaPlayer = js.native
    /* CompleteClass */
    override def compactThresholdInInches(): Double = js.native
    /* CompleteClass */
    override def hide(): Unit = js.native
    /* CompleteClass */
    override def isCompact(): Boolean = js.native
    /* CompleteClass */
    override def load(): Unit = js.native
    /* CompleteClass */
    override def orientation(): String = js.native
    /* CompleteClass */
    override def show(): Unit = js.native
    /* CompleteClass */
    override def unload(): Unit = js.native
    /* CompleteClass */
    override def update(mediaSource: MediaSource): Unit = js.native
  }
  
  @js.native
  class DisplayRequestPlugin ()
    extends typings.playerframework.PlayerFramework.Plugins.DisplayRequestPlugin {
    /* CompleteClass */
    override var currentMediaSource: MediaSource = js.native
    /* CompleteClass */
    override var isActive: Boolean = js.native
    /* CompleteClass */
    override var isEnabled: Boolean = js.native
    /* CompleteClass */
    override var isLoaded: Boolean = js.native
    /* CompleteClass */
    override var isRequestActive: Boolean = js.native
    /* CompleteClass */
    override var mediaPlayer: typings.playerframework.PlayerFramework.MediaPlayer = js.native
    /* CompleteClass */
    override def load(): Unit = js.native
    /* CompleteClass */
    override def unload(): Unit = js.native
    /* CompleteClass */
    override def update(mediaSource: MediaSource): Unit = js.native
  }
  
  @js.native
  class ErrorPlugin ()
    extends typings.playerframework.PlayerFramework.Plugins.ErrorPlugin {
    /* CompleteClass */
    override var currentMediaSource: MediaSource = js.native
    /* CompleteClass */
    override var isActive: Boolean = js.native
    /* CompleteClass */
    override var isEnabled: Boolean = js.native
    /* CompleteClass */
    override var isLoaded: Boolean = js.native
    /* CompleteClass */
    override var mediaPlayer: typings.playerframework.PlayerFramework.MediaPlayer = js.native
    /* CompleteClass */
    override def hide(): Unit = js.native
    /* CompleteClass */
    override def load(): Unit = js.native
    /* CompleteClass */
    override def show(): Unit = js.native
    /* CompleteClass */
    override def unload(): Unit = js.native
    /* CompleteClass */
    override def update(mediaSource: MediaSource): Unit = js.native
  }
  
  @js.native
  class LoaderPlugin ()
    extends typings.playerframework.PlayerFramework.Plugins.LoaderPlugin {
    /* CompleteClass */
    override var currentMediaSource: MediaSource = js.native
    /* CompleteClass */
    override var isActive: Boolean = js.native
    /* CompleteClass */
    override var isEnabled: Boolean = js.native
    /* CompleteClass */
    override var isLoaded: Boolean = js.native
    /* CompleteClass */
    override var mediaPlayer: typings.playerframework.PlayerFramework.MediaPlayer = js.native
    /* CompleteClass */
    override def hide(): Unit = js.native
    /* CompleteClass */
    override def load(): Unit = js.native
    /* CompleteClass */
    override def show(): Unit = js.native
    /* CompleteClass */
    override def unload(): Unit = js.native
    /* CompleteClass */
    override def update(mediaSource: MediaSource): Unit = js.native
  }
  
  @js.native
  class PlayTimeTrackingPlugin ()
    extends typings.playerframework.PlayerFramework.Plugins.PlayTimeTrackingPlugin {
    /* CompleteClass */
    override var currentMediaSource: MediaSource = js.native
    /* CompleteClass */
    override var isActive: Boolean = js.native
    /* CompleteClass */
    override var isEnabled: Boolean = js.native
    /* CompleteClass */
    override var isLoaded: Boolean = js.native
    /* CompleteClass */
    override var mediaPlayer: typings.playerframework.PlayerFramework.MediaPlayer = js.native
    /* CompleteClass */
    override var playTime: Double = js.native
    /* CompleteClass */
    override var playTimePercentage: Double = js.native
    /* CompleteClass */
    override def load(): Unit = js.native
    /* CompleteClass */
    override def unload(): Unit = js.native
    /* CompleteClass */
    override def update(mediaSource: MediaSource): Unit = js.native
  }
  
  /**
    *
    **/
  @js.native
  class PlaylistPlugin ()
    extends typings.playerframework.PlayerFramework.Plugins.PlaylistPlugin {
    /**
      *
      **/
    /* CompleteClass */
    override var autoAdvance: Boolean = js.native
    /* CompleteClass */
    override var currentMediaSource: MediaSource = js.native
    /**
      *
      **/
    /* CompleteClass */
    override var currentPlaylistItem: PlaylistItem = js.native
    /**
      *
      **/
    /* CompleteClass */
    override var currentPlaylistItemIndex: Double = js.native
    /* CompleteClass */
    override var isActive: Boolean = js.native
    /* CompleteClass */
    override var isEnabled: Boolean = js.native
    /* CompleteClass */
    override var isLoaded: Boolean = js.native
    /* CompleteClass */
    override var mediaPlayer: typings.playerframework.PlayerFramework.MediaPlayer = js.native
    /**
      *
      **/
    /* CompleteClass */
    override var playlist: js.Array[PlaylistItem] = js.native
    /**
      *
      **/
    /* CompleteClass */
    override var skipBackThreshold: Double = js.native
    /**
      *
      **/
    /* CompleteClass */
    override var startupPlaylistItemIndex: Double = js.native
    /* CompleteClass */
    override def canGoToNextPlaylistItem(): Boolean = js.native
    /* CompleteClass */
    override def canGoToPreviousPlaylistItem(): Boolean = js.native
    /* CompleteClass */
    override def goToNextPlaylistItem(): Unit = js.native
    // Methods
    /* CompleteClass */
    override def goToPreviousPlaylistItem(): Unit = js.native
    /* CompleteClass */
    override def load(): Unit = js.native
    /* CompleteClass */
    override def unload(): Unit = js.native
    /* CompleteClass */
    override def update(mediaSource: MediaSource): Unit = js.native
  }
  
  @js.native
  class PositionTrackingPlugin ()
    extends typings.playerframework.PlayerFramework.Plugins.PositionTrackingPlugin {
    /* CompleteClass */
    override var currentMediaSource: MediaSource = js.native
    /* CompleteClass */
    override var evaluateOnForwardOnly: Boolean = js.native
    /* CompleteClass */
    override var isActive: Boolean = js.native
    /* CompleteClass */
    override var isEnabled: Boolean = js.native
    /* CompleteClass */
    override var isLoaded: Boolean = js.native
    /* CompleteClass */
    override var mediaPlayer: typings.playerframework.PlayerFramework.MediaPlayer = js.native
    /* CompleteClass */
    override var position: Double = js.native
    /* CompleteClass */
    override var positionPercentage: Double = js.native
    /* CompleteClass */
    override def load(): Unit = js.native
    /* CompleteClass */
    override def unload(): Unit = js.native
    /* CompleteClass */
    override def update(mediaSource: MediaSource): Unit = js.native
  }
  
  @js.native
  class SystemTransportControlsPlugin ()
    extends typings.playerframework.PlayerFramework.Plugins.SystemTransportControlsPlugin {
    /* CompleteClass */
    override var currentMediaSource: MediaSource = js.native
    /* CompleteClass */
    override var isActive: Boolean = js.native
    /* CompleteClass */
    override var isEnabled: Boolean = js.native
    /* CompleteClass */
    override var isLoaded: Boolean = js.native
    /* CompleteClass */
    override var isNextTrackEnabled: Boolean = js.native
    /* CompleteClass */
    override var isPreviousTrackEnabled: Boolean = js.native
    /* CompleteClass */
    override var mediaPlayer: typings.playerframework.PlayerFramework.MediaPlayer = js.native
    /* CompleteClass */
    override var nextTrackExists: Boolean = js.native
    /* CompleteClass */
    override var previousTrackExists: Boolean = js.native
    /* CompleteClass */
    override def load(): Unit = js.native
    /* CompleteClass */
    override def unload(): Unit = js.native
    /* CompleteClass */
    override def update(mediaSource: MediaSource): Unit = js.native
  }
  
  @js.native
  class TrackingPluginBase ()
    extends typings.playerframework.PlayerFramework.Plugins.TrackingPluginBase {
    /* CompleteClass */
    override var currentMediaSource: MediaSource = js.native
    /* CompleteClass */
    override var isActive: Boolean = js.native
    /* CompleteClass */
    override var isEnabled: Boolean = js.native
    /* CompleteClass */
    override var isLoaded: Boolean = js.native
    /* CompleteClass */
    override var mediaPlayer: typings.playerframework.PlayerFramework.MediaPlayer = js.native
    /* CompleteClass */
    override var trackingEvents: js.Array[_] = js.native
    /* CompleteClass */
    override def load(): Unit = js.native
    /* CompleteClass */
    override def unload(): Unit = js.native
    /* CompleteClass */
    override def update(mediaSource: MediaSource): Unit = js.native
  }
  
}

