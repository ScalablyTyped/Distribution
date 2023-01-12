package typings.playerframework.PlayerFramework

import typings.std.HTMLElement
import typings.std.MediaSource
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object Plugins {
  
  trait AudioSelectorPlugin
    extends StObject
       with PluginBase {
    
    /**
      * Not available in phone.
      **/
    var alignment: String
    
    /**
      * Not available in phone.
      **/
    var anchor: HTMLElement
    
    def hide(): Unit
    
    /**
      * Not available in phone.
      **/
    var placement: String
    
    def show(): Unit
  }
  object AudioSelectorPlugin {
    
    inline def apply(
      alignment: String,
      anchor: HTMLElement,
      currentMediaSource: MediaSource,
      hide: () => Unit,
      isActive: Boolean,
      isEnabled: Boolean,
      isLoaded: Boolean,
      load: () => Unit,
      mediaPlayer: MediaPlayer,
      placement: String,
      show: () => Unit,
      unload: () => Unit,
      update: MediaSource => Unit
    ): AudioSelectorPlugin = {
      val __obj = js.Dynamic.literal(alignment = alignment.asInstanceOf[js.Any], anchor = anchor.asInstanceOf[js.Any], currentMediaSource = currentMediaSource.asInstanceOf[js.Any], hide = js.Any.fromFunction0(hide), isActive = isActive.asInstanceOf[js.Any], isEnabled = isEnabled.asInstanceOf[js.Any], isLoaded = isLoaded.asInstanceOf[js.Any], load = js.Any.fromFunction0(load), mediaPlayer = mediaPlayer.asInstanceOf[js.Any], placement = placement.asInstanceOf[js.Any], show = js.Any.fromFunction0(show), unload = js.Any.fromFunction0(unload), update = js.Any.fromFunction1(update))
      __obj.asInstanceOf[AudioSelectorPlugin]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: AudioSelectorPlugin] (val x: Self) extends AnyVal {
      
      inline def setAlignment(value: String): Self = StObject.set(x, "alignment", value.asInstanceOf[js.Any])
      
      inline def setAnchor(value: HTMLElement): Self = StObject.set(x, "anchor", value.asInstanceOf[js.Any])
      
      inline def setHide(value: () => Unit): Self = StObject.set(x, "hide", js.Any.fromFunction0(value))
      
      inline def setPlacement(value: String): Self = StObject.set(x, "placement", value.asInstanceOf[js.Any])
      
      inline def setShow(value: () => Unit): Self = StObject.set(x, "show", js.Any.fromFunction0(value))
    }
  }
  
  trait BufferingPlugin
    extends StObject
       with PluginBase {
    
    def hide(): Unit
    
    def show(): Unit
  }
  object BufferingPlugin {
    
    inline def apply(
      currentMediaSource: MediaSource,
      hide: () => Unit,
      isActive: Boolean,
      isEnabled: Boolean,
      isLoaded: Boolean,
      load: () => Unit,
      mediaPlayer: MediaPlayer,
      show: () => Unit,
      unload: () => Unit,
      update: MediaSource => Unit
    ): BufferingPlugin = {
      val __obj = js.Dynamic.literal(currentMediaSource = currentMediaSource.asInstanceOf[js.Any], hide = js.Any.fromFunction0(hide), isActive = isActive.asInstanceOf[js.Any], isEnabled = isEnabled.asInstanceOf[js.Any], isLoaded = isLoaded.asInstanceOf[js.Any], load = js.Any.fromFunction0(load), mediaPlayer = mediaPlayer.asInstanceOf[js.Any], show = js.Any.fromFunction0(show), unload = js.Any.fromFunction0(unload), update = js.Any.fromFunction1(update))
      __obj.asInstanceOf[BufferingPlugin]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: BufferingPlugin] (val x: Self) extends AnyVal {
      
      inline def setHide(value: () => Unit): Self = StObject.set(x, "hide", js.Any.fromFunction0(value))
      
      inline def setShow(value: () => Unit): Self = StObject.set(x, "show", js.Any.fromFunction0(value))
    }
  }
  
  trait CaptionSelectorPlugin
    extends StObject
       with PluginBase {
    
    /**
      * Not available in phone.
      **/
    var alignment: String
    
    /**
      * Not available in phone.
      **/
    var anchor: HTMLElement
    
    def hide(): Unit
    
    /**
      * Not available in phone.
      **/
    var placement: String
    
    def show(): Unit
  }
  object CaptionSelectorPlugin {
    
    inline def apply(
      alignment: String,
      anchor: HTMLElement,
      currentMediaSource: MediaSource,
      hide: () => Unit,
      isActive: Boolean,
      isEnabled: Boolean,
      isLoaded: Boolean,
      load: () => Unit,
      mediaPlayer: MediaPlayer,
      placement: String,
      show: () => Unit,
      unload: () => Unit,
      update: MediaSource => Unit
    ): CaptionSelectorPlugin = {
      val __obj = js.Dynamic.literal(alignment = alignment.asInstanceOf[js.Any], anchor = anchor.asInstanceOf[js.Any], currentMediaSource = currentMediaSource.asInstanceOf[js.Any], hide = js.Any.fromFunction0(hide), isActive = isActive.asInstanceOf[js.Any], isEnabled = isEnabled.asInstanceOf[js.Any], isLoaded = isLoaded.asInstanceOf[js.Any], load = js.Any.fromFunction0(load), mediaPlayer = mediaPlayer.asInstanceOf[js.Any], placement = placement.asInstanceOf[js.Any], show = js.Any.fromFunction0(show), unload = js.Any.fromFunction0(unload), update = js.Any.fromFunction1(update))
      __obj.asInstanceOf[CaptionSelectorPlugin]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: CaptionSelectorPlugin] (val x: Self) extends AnyVal {
      
      inline def setAlignment(value: String): Self = StObject.set(x, "alignment", value.asInstanceOf[js.Any])
      
      inline def setAnchor(value: HTMLElement): Self = StObject.set(x, "anchor", value.asInstanceOf[js.Any])
      
      inline def setHide(value: () => Unit): Self = StObject.set(x, "hide", js.Any.fromFunction0(value))
      
      inline def setPlacement(value: String): Self = StObject.set(x, "placement", value.asInstanceOf[js.Any])
      
      inline def setShow(value: () => Unit): Self = StObject.set(x, "show", js.Any.fromFunction0(value))
    }
  }
  
  trait ChaptersPlugin
    extends StObject
       with PluginBase {
    
    var autoCreateChaptersFromTextTracks: Boolean
    
    var autoCreateDefaultChapters: Boolean
    
    var defaultChapterCount: Double
    
    var visualMarkerClass: String
  }
  object ChaptersPlugin {
    
    inline def apply(
      autoCreateChaptersFromTextTracks: Boolean,
      autoCreateDefaultChapters: Boolean,
      currentMediaSource: MediaSource,
      defaultChapterCount: Double,
      isActive: Boolean,
      isEnabled: Boolean,
      isLoaded: Boolean,
      load: () => Unit,
      mediaPlayer: MediaPlayer,
      unload: () => Unit,
      update: MediaSource => Unit,
      visualMarkerClass: String
    ): ChaptersPlugin = {
      val __obj = js.Dynamic.literal(autoCreateChaptersFromTextTracks = autoCreateChaptersFromTextTracks.asInstanceOf[js.Any], autoCreateDefaultChapters = autoCreateDefaultChapters.asInstanceOf[js.Any], currentMediaSource = currentMediaSource.asInstanceOf[js.Any], defaultChapterCount = defaultChapterCount.asInstanceOf[js.Any], isActive = isActive.asInstanceOf[js.Any], isEnabled = isEnabled.asInstanceOf[js.Any], isLoaded = isLoaded.asInstanceOf[js.Any], load = js.Any.fromFunction0(load), mediaPlayer = mediaPlayer.asInstanceOf[js.Any], unload = js.Any.fromFunction0(unload), update = js.Any.fromFunction1(update), visualMarkerClass = visualMarkerClass.asInstanceOf[js.Any])
      __obj.asInstanceOf[ChaptersPlugin]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: ChaptersPlugin] (val x: Self) extends AnyVal {
      
      inline def setAutoCreateChaptersFromTextTracks(value: Boolean): Self = StObject.set(x, "autoCreateChaptersFromTextTracks", value.asInstanceOf[js.Any])
      
      inline def setAutoCreateDefaultChapters(value: Boolean): Self = StObject.set(x, "autoCreateDefaultChapters", value.asInstanceOf[js.Any])
      
      inline def setDefaultChapterCount(value: Double): Self = StObject.set(x, "defaultChapterCount", value.asInstanceOf[js.Any])
      
      inline def setVisualMarkerClass(value: String): Self = StObject.set(x, "visualMarkerClass", value.asInstanceOf[js.Any])
    }
  }
  
  trait ControlPlugin
    extends StObject
       with PluginBase {
    
    def compactThresholdInInches(): Double
    
    def hide(): Unit
    
    def isCompact(): Boolean
    
    def orientation(): String
    
    def show(): Unit
  }
  object ControlPlugin {
    
    inline def apply(
      compactThresholdInInches: () => Double,
      currentMediaSource: MediaSource,
      hide: () => Unit,
      isActive: Boolean,
      isCompact: () => Boolean,
      isEnabled: Boolean,
      isLoaded: Boolean,
      load: () => Unit,
      mediaPlayer: MediaPlayer,
      orientation: () => String,
      show: () => Unit,
      unload: () => Unit,
      update: MediaSource => Unit
    ): ControlPlugin = {
      val __obj = js.Dynamic.literal(compactThresholdInInches = js.Any.fromFunction0(compactThresholdInInches), currentMediaSource = currentMediaSource.asInstanceOf[js.Any], hide = js.Any.fromFunction0(hide), isActive = isActive.asInstanceOf[js.Any], isCompact = js.Any.fromFunction0(isCompact), isEnabled = isEnabled.asInstanceOf[js.Any], isLoaded = isLoaded.asInstanceOf[js.Any], load = js.Any.fromFunction0(load), mediaPlayer = mediaPlayer.asInstanceOf[js.Any], orientation = js.Any.fromFunction0(orientation), show = js.Any.fromFunction0(show), unload = js.Any.fromFunction0(unload), update = js.Any.fromFunction1(update))
      __obj.asInstanceOf[ControlPlugin]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: ControlPlugin] (val x: Self) extends AnyVal {
      
      inline def setCompactThresholdInInches(value: () => Double): Self = StObject.set(x, "compactThresholdInInches", js.Any.fromFunction0(value))
      
      inline def setHide(value: () => Unit): Self = StObject.set(x, "hide", js.Any.fromFunction0(value))
      
      inline def setIsCompact(value: () => Boolean): Self = StObject.set(x, "isCompact", js.Any.fromFunction0(value))
      
      inline def setOrientation(value: () => String): Self = StObject.set(x, "orientation", js.Any.fromFunction0(value))
      
      inline def setShow(value: () => Unit): Self = StObject.set(x, "show", js.Any.fromFunction0(value))
    }
  }
  
  trait DisplayRequestPlugin
    extends StObject
       with PluginBase {
    
    var isRequestActive: Boolean
  }
  object DisplayRequestPlugin {
    
    inline def apply(
      currentMediaSource: MediaSource,
      isActive: Boolean,
      isEnabled: Boolean,
      isLoaded: Boolean,
      isRequestActive: Boolean,
      load: () => Unit,
      mediaPlayer: MediaPlayer,
      unload: () => Unit,
      update: MediaSource => Unit
    ): DisplayRequestPlugin = {
      val __obj = js.Dynamic.literal(currentMediaSource = currentMediaSource.asInstanceOf[js.Any], isActive = isActive.asInstanceOf[js.Any], isEnabled = isEnabled.asInstanceOf[js.Any], isLoaded = isLoaded.asInstanceOf[js.Any], isRequestActive = isRequestActive.asInstanceOf[js.Any], load = js.Any.fromFunction0(load), mediaPlayer = mediaPlayer.asInstanceOf[js.Any], unload = js.Any.fromFunction0(unload), update = js.Any.fromFunction1(update))
      __obj.asInstanceOf[DisplayRequestPlugin]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: DisplayRequestPlugin] (val x: Self) extends AnyVal {
      
      inline def setIsRequestActive(value: Boolean): Self = StObject.set(x, "isRequestActive", value.asInstanceOf[js.Any])
    }
  }
  
  trait ErrorPlugin
    extends StObject
       with PluginBase {
    
    def hide(): Unit
    
    def show(): Unit
  }
  object ErrorPlugin {
    
    inline def apply(
      currentMediaSource: MediaSource,
      hide: () => Unit,
      isActive: Boolean,
      isEnabled: Boolean,
      isLoaded: Boolean,
      load: () => Unit,
      mediaPlayer: MediaPlayer,
      show: () => Unit,
      unload: () => Unit,
      update: MediaSource => Unit
    ): ErrorPlugin = {
      val __obj = js.Dynamic.literal(currentMediaSource = currentMediaSource.asInstanceOf[js.Any], hide = js.Any.fromFunction0(hide), isActive = isActive.asInstanceOf[js.Any], isEnabled = isEnabled.asInstanceOf[js.Any], isLoaded = isLoaded.asInstanceOf[js.Any], load = js.Any.fromFunction0(load), mediaPlayer = mediaPlayer.asInstanceOf[js.Any], show = js.Any.fromFunction0(show), unload = js.Any.fromFunction0(unload), update = js.Any.fromFunction1(update))
      __obj.asInstanceOf[ErrorPlugin]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: ErrorPlugin] (val x: Self) extends AnyVal {
      
      inline def setHide(value: () => Unit): Self = StObject.set(x, "hide", js.Any.fromFunction0(value))
      
      inline def setShow(value: () => Unit): Self = StObject.set(x, "show", js.Any.fromFunction0(value))
    }
  }
  
  trait LoaderPlugin
    extends StObject
       with PluginBase {
    
    def hide(): Unit
    
    def show(): Unit
  }
  object LoaderPlugin {
    
    inline def apply(
      currentMediaSource: MediaSource,
      hide: () => Unit,
      isActive: Boolean,
      isEnabled: Boolean,
      isLoaded: Boolean,
      load: () => Unit,
      mediaPlayer: MediaPlayer,
      show: () => Unit,
      unload: () => Unit,
      update: MediaSource => Unit
    ): LoaderPlugin = {
      val __obj = js.Dynamic.literal(currentMediaSource = currentMediaSource.asInstanceOf[js.Any], hide = js.Any.fromFunction0(hide), isActive = isActive.asInstanceOf[js.Any], isEnabled = isEnabled.asInstanceOf[js.Any], isLoaded = isLoaded.asInstanceOf[js.Any], load = js.Any.fromFunction0(load), mediaPlayer = mediaPlayer.asInstanceOf[js.Any], show = js.Any.fromFunction0(show), unload = js.Any.fromFunction0(unload), update = js.Any.fromFunction1(update))
      __obj.asInstanceOf[LoaderPlugin]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: LoaderPlugin] (val x: Self) extends AnyVal {
      
      inline def setHide(value: () => Unit): Self = StObject.set(x, "hide", js.Any.fromFunction0(value))
      
      inline def setShow(value: () => Unit): Self = StObject.set(x, "show", js.Any.fromFunction0(value))
    }
  }
  
  trait PlayTimeTrackingPlugin
    extends StObject
       with PluginBase {
    
    var playTime: Double
    
    var playTimePercentage: Double
  }
  object PlayTimeTrackingPlugin {
    
    inline def apply(
      currentMediaSource: MediaSource,
      isActive: Boolean,
      isEnabled: Boolean,
      isLoaded: Boolean,
      load: () => Unit,
      mediaPlayer: MediaPlayer,
      playTime: Double,
      playTimePercentage: Double,
      unload: () => Unit,
      update: MediaSource => Unit
    ): PlayTimeTrackingPlugin = {
      val __obj = js.Dynamic.literal(currentMediaSource = currentMediaSource.asInstanceOf[js.Any], isActive = isActive.asInstanceOf[js.Any], isEnabled = isEnabled.asInstanceOf[js.Any], isLoaded = isLoaded.asInstanceOf[js.Any], load = js.Any.fromFunction0(load), mediaPlayer = mediaPlayer.asInstanceOf[js.Any], playTime = playTime.asInstanceOf[js.Any], playTimePercentage = playTimePercentage.asInstanceOf[js.Any], unload = js.Any.fromFunction0(unload), update = js.Any.fromFunction1(update))
      __obj.asInstanceOf[PlayTimeTrackingPlugin]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: PlayTimeTrackingPlugin] (val x: Self) extends AnyVal {
      
      inline def setPlayTime(value: Double): Self = StObject.set(x, "playTime", value.asInstanceOf[js.Any])
      
      inline def setPlayTimePercentage(value: Double): Self = StObject.set(x, "playTimePercentage", value.asInstanceOf[js.Any])
    }
  }
  
  /**
    *
    **/
  trait PlaylistPlugin
    extends StObject
       with PluginBase {
    
    /**
      *
      **/
    var autoAdvance: Boolean
    
    def canGoToNextPlaylistItem(): Boolean
    
    def canGoToPreviousPlaylistItem(): Boolean
    
    /**
      *
      **/
    var currentPlaylistItem: PlaylistItem
    
    /**
      *
      **/
    var currentPlaylistItemIndex: Double
    
    def goToNextPlaylistItem(): Unit
    
    // Methods
    def goToPreviousPlaylistItem(): Unit
    
    /**
      *
      **/
    var playlist: js.Array[PlaylistItem]
    
    /**
      *
      **/
    var skipBackThreshold: Double
    
    /**
      *
      **/
    var startupPlaylistItemIndex: Double
  }
  object PlaylistPlugin {
    
    inline def apply(
      autoAdvance: Boolean,
      canGoToNextPlaylistItem: () => Boolean,
      canGoToPreviousPlaylistItem: () => Boolean,
      currentMediaSource: MediaSource,
      currentPlaylistItem: PlaylistItem,
      currentPlaylistItemIndex: Double,
      goToNextPlaylistItem: () => Unit,
      goToPreviousPlaylistItem: () => Unit,
      isActive: Boolean,
      isEnabled: Boolean,
      isLoaded: Boolean,
      load: () => Unit,
      mediaPlayer: MediaPlayer,
      playlist: js.Array[PlaylistItem],
      skipBackThreshold: Double,
      startupPlaylistItemIndex: Double,
      unload: () => Unit,
      update: MediaSource => Unit
    ): PlaylistPlugin = {
      val __obj = js.Dynamic.literal(autoAdvance = autoAdvance.asInstanceOf[js.Any], canGoToNextPlaylistItem = js.Any.fromFunction0(canGoToNextPlaylistItem), canGoToPreviousPlaylistItem = js.Any.fromFunction0(canGoToPreviousPlaylistItem), currentMediaSource = currentMediaSource.asInstanceOf[js.Any], currentPlaylistItem = currentPlaylistItem.asInstanceOf[js.Any], currentPlaylistItemIndex = currentPlaylistItemIndex.asInstanceOf[js.Any], goToNextPlaylistItem = js.Any.fromFunction0(goToNextPlaylistItem), goToPreviousPlaylistItem = js.Any.fromFunction0(goToPreviousPlaylistItem), isActive = isActive.asInstanceOf[js.Any], isEnabled = isEnabled.asInstanceOf[js.Any], isLoaded = isLoaded.asInstanceOf[js.Any], load = js.Any.fromFunction0(load), mediaPlayer = mediaPlayer.asInstanceOf[js.Any], playlist = playlist.asInstanceOf[js.Any], skipBackThreshold = skipBackThreshold.asInstanceOf[js.Any], startupPlaylistItemIndex = startupPlaylistItemIndex.asInstanceOf[js.Any], unload = js.Any.fromFunction0(unload), update = js.Any.fromFunction1(update))
      __obj.asInstanceOf[PlaylistPlugin]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: PlaylistPlugin] (val x: Self) extends AnyVal {
      
      inline def setAutoAdvance(value: Boolean): Self = StObject.set(x, "autoAdvance", value.asInstanceOf[js.Any])
      
      inline def setCanGoToNextPlaylistItem(value: () => Boolean): Self = StObject.set(x, "canGoToNextPlaylistItem", js.Any.fromFunction0(value))
      
      inline def setCanGoToPreviousPlaylistItem(value: () => Boolean): Self = StObject.set(x, "canGoToPreviousPlaylistItem", js.Any.fromFunction0(value))
      
      inline def setCurrentPlaylistItem(value: PlaylistItem): Self = StObject.set(x, "currentPlaylistItem", value.asInstanceOf[js.Any])
      
      inline def setCurrentPlaylistItemIndex(value: Double): Self = StObject.set(x, "currentPlaylistItemIndex", value.asInstanceOf[js.Any])
      
      inline def setGoToNextPlaylistItem(value: () => Unit): Self = StObject.set(x, "goToNextPlaylistItem", js.Any.fromFunction0(value))
      
      inline def setGoToPreviousPlaylistItem(value: () => Unit): Self = StObject.set(x, "goToPreviousPlaylistItem", js.Any.fromFunction0(value))
      
      inline def setPlaylist(value: js.Array[PlaylistItem]): Self = StObject.set(x, "playlist", value.asInstanceOf[js.Any])
      
      inline def setPlaylistVarargs(value: PlaylistItem*): Self = StObject.set(x, "playlist", js.Array(value*))
      
      inline def setSkipBackThreshold(value: Double): Self = StObject.set(x, "skipBackThreshold", value.asInstanceOf[js.Any])
      
      inline def setStartupPlaylistItemIndex(value: Double): Self = StObject.set(x, "startupPlaylistItemIndex", value.asInstanceOf[js.Any])
    }
  }
  
  trait PositionTrackingPlugin
    extends StObject
       with PluginBase {
    
    var evaluateOnForwardOnly: Boolean
    
    var position: Double
    
    var positionPercentage: Double
  }
  object PositionTrackingPlugin {
    
    inline def apply(
      currentMediaSource: MediaSource,
      evaluateOnForwardOnly: Boolean,
      isActive: Boolean,
      isEnabled: Boolean,
      isLoaded: Boolean,
      load: () => Unit,
      mediaPlayer: MediaPlayer,
      position: Double,
      positionPercentage: Double,
      unload: () => Unit,
      update: MediaSource => Unit
    ): PositionTrackingPlugin = {
      val __obj = js.Dynamic.literal(currentMediaSource = currentMediaSource.asInstanceOf[js.Any], evaluateOnForwardOnly = evaluateOnForwardOnly.asInstanceOf[js.Any], isActive = isActive.asInstanceOf[js.Any], isEnabled = isEnabled.asInstanceOf[js.Any], isLoaded = isLoaded.asInstanceOf[js.Any], load = js.Any.fromFunction0(load), mediaPlayer = mediaPlayer.asInstanceOf[js.Any], position = position.asInstanceOf[js.Any], positionPercentage = positionPercentage.asInstanceOf[js.Any], unload = js.Any.fromFunction0(unload), update = js.Any.fromFunction1(update))
      __obj.asInstanceOf[PositionTrackingPlugin]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: PositionTrackingPlugin] (val x: Self) extends AnyVal {
      
      inline def setEvaluateOnForwardOnly(value: Boolean): Self = StObject.set(x, "evaluateOnForwardOnly", value.asInstanceOf[js.Any])
      
      inline def setPosition(value: Double): Self = StObject.set(x, "position", value.asInstanceOf[js.Any])
      
      inline def setPositionPercentage(value: Double): Self = StObject.set(x, "positionPercentage", value.asInstanceOf[js.Any])
    }
  }
  
  trait SystemTransportControlsPlugin
    extends StObject
       with PluginBase {
    
    var isNextTrackEnabled: Boolean
    
    var isPreviousTrackEnabled: Boolean
    
    var nextTrackExists: Boolean
    
    var previousTrackExists: Boolean
  }
  object SystemTransportControlsPlugin {
    
    inline def apply(
      currentMediaSource: MediaSource,
      isActive: Boolean,
      isEnabled: Boolean,
      isLoaded: Boolean,
      isNextTrackEnabled: Boolean,
      isPreviousTrackEnabled: Boolean,
      load: () => Unit,
      mediaPlayer: MediaPlayer,
      nextTrackExists: Boolean,
      previousTrackExists: Boolean,
      unload: () => Unit,
      update: MediaSource => Unit
    ): SystemTransportControlsPlugin = {
      val __obj = js.Dynamic.literal(currentMediaSource = currentMediaSource.asInstanceOf[js.Any], isActive = isActive.asInstanceOf[js.Any], isEnabled = isEnabled.asInstanceOf[js.Any], isLoaded = isLoaded.asInstanceOf[js.Any], isNextTrackEnabled = isNextTrackEnabled.asInstanceOf[js.Any], isPreviousTrackEnabled = isPreviousTrackEnabled.asInstanceOf[js.Any], load = js.Any.fromFunction0(load), mediaPlayer = mediaPlayer.asInstanceOf[js.Any], nextTrackExists = nextTrackExists.asInstanceOf[js.Any], previousTrackExists = previousTrackExists.asInstanceOf[js.Any], unload = js.Any.fromFunction0(unload), update = js.Any.fromFunction1(update))
      __obj.asInstanceOf[SystemTransportControlsPlugin]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: SystemTransportControlsPlugin] (val x: Self) extends AnyVal {
      
      inline def setIsNextTrackEnabled(value: Boolean): Self = StObject.set(x, "isNextTrackEnabled", value.asInstanceOf[js.Any])
      
      inline def setIsPreviousTrackEnabled(value: Boolean): Self = StObject.set(x, "isPreviousTrackEnabled", value.asInstanceOf[js.Any])
      
      inline def setNextTrackExists(value: Boolean): Self = StObject.set(x, "nextTrackExists", value.asInstanceOf[js.Any])
      
      inline def setPreviousTrackExists(value: Boolean): Self = StObject.set(x, "previousTrackExists", value.asInstanceOf[js.Any])
    }
  }
  
  trait TrackingPluginBase
    extends StObject
       with PluginBase {
    
    var trackingEvents: js.Array[Any]
  }
  object TrackingPluginBase {
    
    inline def apply(
      currentMediaSource: MediaSource,
      isActive: Boolean,
      isEnabled: Boolean,
      isLoaded: Boolean,
      load: () => Unit,
      mediaPlayer: MediaPlayer,
      trackingEvents: js.Array[Any],
      unload: () => Unit,
      update: MediaSource => Unit
    ): TrackingPluginBase = {
      val __obj = js.Dynamic.literal(currentMediaSource = currentMediaSource.asInstanceOf[js.Any], isActive = isActive.asInstanceOf[js.Any], isEnabled = isEnabled.asInstanceOf[js.Any], isLoaded = isLoaded.asInstanceOf[js.Any], load = js.Any.fromFunction0(load), mediaPlayer = mediaPlayer.asInstanceOf[js.Any], trackingEvents = trackingEvents.asInstanceOf[js.Any], unload = js.Any.fromFunction0(unload), update = js.Any.fromFunction1(update))
      __obj.asInstanceOf[TrackingPluginBase]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: TrackingPluginBase] (val x: Self) extends AnyVal {
      
      inline def setTrackingEvents(value: js.Array[Any]): Self = StObject.set(x, "trackingEvents", value.asInstanceOf[js.Any])
      
      inline def setTrackingEventsVarargs(value: Any*): Self = StObject.set(x, "trackingEvents", js.Array(value*))
    }
  }
}
