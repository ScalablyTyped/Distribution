package typings.playerframework.PlayerFramework

import typings.std.HTMLElement
import typings.std.MediaSource
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object Plugins {
  
  @js.native
  trait AudioSelectorPlugin extends PluginBase {
    
    /**
      * Not available in phone.
      **/
    var alignment: String = js.native
    
    /**
      * Not available in phone.
      **/
    var anchor: HTMLElement = js.native
    
    def hide(): Unit = js.native
    
    /**
      * Not available in phone.
      **/
    var placement: String = js.native
    
    def show(): Unit = js.native
  }
  object AudioSelectorPlugin {
    
    @scala.inline
    def apply(
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
    implicit class AudioSelectorPluginMutableBuilder[Self <: AudioSelectorPlugin] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAlignment(value: String): Self = StObject.set(x, "alignment", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAnchor(value: HTMLElement): Self = StObject.set(x, "anchor", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHide(value: () => Unit): Self = StObject.set(x, "hide", js.Any.fromFunction0(value))
      
      @scala.inline
      def setPlacement(value: String): Self = StObject.set(x, "placement", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setShow(value: () => Unit): Self = StObject.set(x, "show", js.Any.fromFunction0(value))
    }
  }
  
  @js.native
  trait BufferingPlugin extends PluginBase {
    
    def hide(): Unit = js.native
    
    def show(): Unit = js.native
  }
  object BufferingPlugin {
    
    @scala.inline
    def apply(
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
    implicit class BufferingPluginMutableBuilder[Self <: BufferingPlugin] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setHide(value: () => Unit): Self = StObject.set(x, "hide", js.Any.fromFunction0(value))
      
      @scala.inline
      def setShow(value: () => Unit): Self = StObject.set(x, "show", js.Any.fromFunction0(value))
    }
  }
  
  @js.native
  trait CaptionSelectorPlugin extends PluginBase {
    
    /**
      * Not available in phone.
      **/
    var alignment: String = js.native
    
    /**
      * Not available in phone.
      **/
    var anchor: HTMLElement = js.native
    
    def hide(): Unit = js.native
    
    /**
      * Not available in phone.
      **/
    var placement: String = js.native
    
    def show(): Unit = js.native
  }
  object CaptionSelectorPlugin {
    
    @scala.inline
    def apply(
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
    implicit class CaptionSelectorPluginMutableBuilder[Self <: CaptionSelectorPlugin] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAlignment(value: String): Self = StObject.set(x, "alignment", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAnchor(value: HTMLElement): Self = StObject.set(x, "anchor", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHide(value: () => Unit): Self = StObject.set(x, "hide", js.Any.fromFunction0(value))
      
      @scala.inline
      def setPlacement(value: String): Self = StObject.set(x, "placement", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setShow(value: () => Unit): Self = StObject.set(x, "show", js.Any.fromFunction0(value))
    }
  }
  
  @js.native
  trait ChaptersPlugin extends PluginBase {
    
    var autoCreateChaptersFromTextTracks: Boolean = js.native
    
    var autoCreateDefaultChapters: Boolean = js.native
    
    var defaultChapterCount: Double = js.native
    
    var visualMarkerClass: String = js.native
  }
  object ChaptersPlugin {
    
    @scala.inline
    def apply(
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
    implicit class ChaptersPluginMutableBuilder[Self <: ChaptersPlugin] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAutoCreateChaptersFromTextTracks(value: Boolean): Self = StObject.set(x, "autoCreateChaptersFromTextTracks", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAutoCreateDefaultChapters(value: Boolean): Self = StObject.set(x, "autoCreateDefaultChapters", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDefaultChapterCount(value: Double): Self = StObject.set(x, "defaultChapterCount", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setVisualMarkerClass(value: String): Self = StObject.set(x, "visualMarkerClass", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait ControlPlugin extends PluginBase {
    
    def compactThresholdInInches(): Double = js.native
    
    def hide(): Unit = js.native
    
    def isCompact(): Boolean = js.native
    
    def orientation(): String = js.native
    
    def show(): Unit = js.native
  }
  object ControlPlugin {
    
    @scala.inline
    def apply(
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
    implicit class ControlPluginMutableBuilder[Self <: ControlPlugin] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setCompactThresholdInInches(value: () => Double): Self = StObject.set(x, "compactThresholdInInches", js.Any.fromFunction0(value))
      
      @scala.inline
      def setHide(value: () => Unit): Self = StObject.set(x, "hide", js.Any.fromFunction0(value))
      
      @scala.inline
      def setIsCompact(value: () => Boolean): Self = StObject.set(x, "isCompact", js.Any.fromFunction0(value))
      
      @scala.inline
      def setOrientation(value: () => String): Self = StObject.set(x, "orientation", js.Any.fromFunction0(value))
      
      @scala.inline
      def setShow(value: () => Unit): Self = StObject.set(x, "show", js.Any.fromFunction0(value))
    }
  }
  
  @js.native
  trait DisplayRequestPlugin extends PluginBase {
    
    var isRequestActive: Boolean = js.native
  }
  object DisplayRequestPlugin {
    
    @scala.inline
    def apply(
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
    implicit class DisplayRequestPluginMutableBuilder[Self <: DisplayRequestPlugin] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setIsRequestActive(value: Boolean): Self = StObject.set(x, "isRequestActive", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait ErrorPlugin extends PluginBase {
    
    def hide(): Unit = js.native
    
    def show(): Unit = js.native
  }
  object ErrorPlugin {
    
    @scala.inline
    def apply(
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
    implicit class ErrorPluginMutableBuilder[Self <: ErrorPlugin] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setHide(value: () => Unit): Self = StObject.set(x, "hide", js.Any.fromFunction0(value))
      
      @scala.inline
      def setShow(value: () => Unit): Self = StObject.set(x, "show", js.Any.fromFunction0(value))
    }
  }
  
  @js.native
  trait LoaderPlugin extends PluginBase {
    
    def hide(): Unit = js.native
    
    def show(): Unit = js.native
  }
  object LoaderPlugin {
    
    @scala.inline
    def apply(
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
    implicit class LoaderPluginMutableBuilder[Self <: LoaderPlugin] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setHide(value: () => Unit): Self = StObject.set(x, "hide", js.Any.fromFunction0(value))
      
      @scala.inline
      def setShow(value: () => Unit): Self = StObject.set(x, "show", js.Any.fromFunction0(value))
    }
  }
  
  @js.native
  trait PlayTimeTrackingPlugin extends PluginBase {
    
    var playTime: Double = js.native
    
    var playTimePercentage: Double = js.native
  }
  object PlayTimeTrackingPlugin {
    
    @scala.inline
    def apply(
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
    implicit class PlayTimeTrackingPluginMutableBuilder[Self <: PlayTimeTrackingPlugin] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setPlayTime(value: Double): Self = StObject.set(x, "playTime", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPlayTimePercentage(value: Double): Self = StObject.set(x, "playTimePercentage", value.asInstanceOf[js.Any])
    }
  }
  
  /**
    *
    **/
  @js.native
  trait PlaylistPlugin extends PluginBase {
    
    /**
      *
      **/
    var autoAdvance: Boolean = js.native
    
    def canGoToNextPlaylistItem(): Boolean = js.native
    
    def canGoToPreviousPlaylistItem(): Boolean = js.native
    
    /**
      *
      **/
    var currentPlaylistItem: PlaylistItem = js.native
    
    /**
      *
      **/
    var currentPlaylistItemIndex: Double = js.native
    
    def goToNextPlaylistItem(): Unit = js.native
    
    // Methods
    def goToPreviousPlaylistItem(): Unit = js.native
    
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
  }
  object PlaylistPlugin {
    
    @scala.inline
    def apply(
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
    implicit class PlaylistPluginMutableBuilder[Self <: PlaylistPlugin] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAutoAdvance(value: Boolean): Self = StObject.set(x, "autoAdvance", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCanGoToNextPlaylistItem(value: () => Boolean): Self = StObject.set(x, "canGoToNextPlaylistItem", js.Any.fromFunction0(value))
      
      @scala.inline
      def setCanGoToPreviousPlaylistItem(value: () => Boolean): Self = StObject.set(x, "canGoToPreviousPlaylistItem", js.Any.fromFunction0(value))
      
      @scala.inline
      def setCurrentPlaylistItem(value: PlaylistItem): Self = StObject.set(x, "currentPlaylistItem", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCurrentPlaylistItemIndex(value: Double): Self = StObject.set(x, "currentPlaylistItemIndex", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setGoToNextPlaylistItem(value: () => Unit): Self = StObject.set(x, "goToNextPlaylistItem", js.Any.fromFunction0(value))
      
      @scala.inline
      def setGoToPreviousPlaylistItem(value: () => Unit): Self = StObject.set(x, "goToPreviousPlaylistItem", js.Any.fromFunction0(value))
      
      @scala.inline
      def setPlaylist(value: js.Array[PlaylistItem]): Self = StObject.set(x, "playlist", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPlaylistVarargs(value: PlaylistItem*): Self = StObject.set(x, "playlist", js.Array(value :_*))
      
      @scala.inline
      def setSkipBackThreshold(value: Double): Self = StObject.set(x, "skipBackThreshold", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStartupPlaylistItemIndex(value: Double): Self = StObject.set(x, "startupPlaylistItemIndex", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait PositionTrackingPlugin extends PluginBase {
    
    var evaluateOnForwardOnly: Boolean = js.native
    
    var position: Double = js.native
    
    var positionPercentage: Double = js.native
  }
  object PositionTrackingPlugin {
    
    @scala.inline
    def apply(
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
    implicit class PositionTrackingPluginMutableBuilder[Self <: PositionTrackingPlugin] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setEvaluateOnForwardOnly(value: Boolean): Self = StObject.set(x, "evaluateOnForwardOnly", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPosition(value: Double): Self = StObject.set(x, "position", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPositionPercentage(value: Double): Self = StObject.set(x, "positionPercentage", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait SystemTransportControlsPlugin extends PluginBase {
    
    var isNextTrackEnabled: Boolean = js.native
    
    var isPreviousTrackEnabled: Boolean = js.native
    
    var nextTrackExists: Boolean = js.native
    
    var previousTrackExists: Boolean = js.native
  }
  object SystemTransportControlsPlugin {
    
    @scala.inline
    def apply(
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
    implicit class SystemTransportControlsPluginMutableBuilder[Self <: SystemTransportControlsPlugin] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setIsNextTrackEnabled(value: Boolean): Self = StObject.set(x, "isNextTrackEnabled", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIsPreviousTrackEnabled(value: Boolean): Self = StObject.set(x, "isPreviousTrackEnabled", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNextTrackExists(value: Boolean): Self = StObject.set(x, "nextTrackExists", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPreviousTrackExists(value: Boolean): Self = StObject.set(x, "previousTrackExists", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait TrackingPluginBase extends PluginBase {
    
    var trackingEvents: js.Array[_] = js.native
  }
  object TrackingPluginBase {
    
    @scala.inline
    def apply(
      currentMediaSource: MediaSource,
      isActive: Boolean,
      isEnabled: Boolean,
      isLoaded: Boolean,
      load: () => Unit,
      mediaPlayer: MediaPlayer,
      trackingEvents: js.Array[_],
      unload: () => Unit,
      update: MediaSource => Unit
    ): TrackingPluginBase = {
      val __obj = js.Dynamic.literal(currentMediaSource = currentMediaSource.asInstanceOf[js.Any], isActive = isActive.asInstanceOf[js.Any], isEnabled = isEnabled.asInstanceOf[js.Any], isLoaded = isLoaded.asInstanceOf[js.Any], load = js.Any.fromFunction0(load), mediaPlayer = mediaPlayer.asInstanceOf[js.Any], trackingEvents = trackingEvents.asInstanceOf[js.Any], unload = js.Any.fromFunction0(unload), update = js.Any.fromFunction1(update))
      __obj.asInstanceOf[TrackingPluginBase]
    }
    
    @scala.inline
    implicit class TrackingPluginBaseMutableBuilder[Self <: TrackingPluginBase] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setTrackingEvents(value: js.Array[_]): Self = StObject.set(x, "trackingEvents", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTrackingEventsVarargs(value: js.Any*): Self = StObject.set(x, "trackingEvents", js.Array(value :_*))
    }
  }
}
