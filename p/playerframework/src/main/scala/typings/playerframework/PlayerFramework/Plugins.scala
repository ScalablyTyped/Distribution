package typings.playerframework.PlayerFramework

import typings.std.HTMLElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("PlayerFramework.Plugins")
@js.native
object Plugins extends js.Object {
  @js.native
  class AudioSelectorPlugin () extends PluginBase {
    /**
    			* Not available in phone.
    			**/
    var alignment: String = js.native
    /**
    			* Not available in phone.
    			**/
    var anchor: HTMLElement = js.native
    /**
    			* Not available in phone.
    			**/
    var placement: String = js.native
    def hide(): Unit = js.native
    def show(): Unit = js.native
  }
  
  @js.native
  class BufferingPlugin () extends PluginBase {
    def hide(): Unit = js.native
    def show(): Unit = js.native
  }
  
  @js.native
  class CaptionSelectorPlugin () extends PluginBase {
    /**
    			* Not available in phone.
    			**/
    var alignment: String = js.native
    /**
    			* Not available in phone.
    			**/
    var anchor: HTMLElement = js.native
    /**
    			* Not available in phone.
    			**/
    var placement: String = js.native
    def hide(): Unit = js.native
    def show(): Unit = js.native
  }
  
  @js.native
  class ChaptersPlugin () extends PluginBase {
    var autoCreateChaptersFromTextTracks: Boolean = js.native
    var autoCreateDefaultChapters: Boolean = js.native
    var defaultChapterCount: Double = js.native
    var visualMarkerClass: String = js.native
  }
  
  @js.native
  class ControlPlugin () extends PluginBase {
    def compactThresholdInInches(): Double = js.native
    def hide(): Unit = js.native
    def isCompact(): Boolean = js.native
    def orientation(): String = js.native
    def show(): Unit = js.native
  }
  
  @js.native
  class DisplayRequestPlugin () extends PluginBase {
    var isRequestActive: Boolean = js.native
  }
  
  @js.native
  class ErrorPlugin () extends PluginBase {
    def hide(): Unit = js.native
    def show(): Unit = js.native
  }
  
  @js.native
  class LoaderPlugin () extends PluginBase {
    def hide(): Unit = js.native
    def show(): Unit = js.native
  }
  
  @js.native
  class PlayTimeTrackingPlugin () extends PluginBase {
    var playTime: Double = js.native
    var playTimePercentage: Double = js.native
  }
  
  /**
  		*
  		**/
  @js.native
  class PlaylistPlugin () extends PluginBase {
    /**
    			*
    			**/
    var autoAdvance: Boolean = js.native
    /**
    			*
    			**/
    var currentPlaylistItem: PlaylistItem = js.native
    /**
    			*
    			**/
    var currentPlaylistItemIndex: Double = js.native
    /**
    			*
    			**/
    var playlist: js.Array[PlaylistItem] = js.native
    /**
    			*
    			**/
    var skipBackThreshold: Double = js.native
    /**
    			*
    			**/
    var startupPlaylistItemIndex: Double = js.native
    def canGoToNextPlaylistItem(): Boolean = js.native
    def canGoToPreviousPlaylistItem(): Boolean = js.native
    def goToNextPlaylistItem(): Unit = js.native
    // Methods
    def goToPreviousPlaylistItem(): Unit = js.native
  }
  
  @js.native
  class PositionTrackingPlugin () extends PluginBase {
    var evaluateOnForwardOnly: Boolean = js.native
    var position: Double = js.native
    var positionPercentage: Double = js.native
  }
  
  @js.native
  class SystemTransportControlsPlugin () extends PluginBase {
    var isNextTrackEnabled: Boolean = js.native
    var isPreviousTrackEnabled: Boolean = js.native
    var nextTrackExists: Boolean = js.native
    var previousTrackExists: Boolean = js.native
  }
  
  @js.native
  class TrackingPluginBase () extends PluginBase {
    var trackingEvents: js.Array[_] = js.native
  }
  
}

