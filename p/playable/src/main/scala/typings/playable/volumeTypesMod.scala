package typings.playable

import typings.playable.textMapTypesMod.ITextMap
import typings.playable.themeTypesMod.IThemeService
import typings.playable.tooltipTypesMod.ITooltipService
import typings.std.HTMLElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object volumeTypesMod {
  
  @js.native
  trait IVolumeControl extends StObject {
    
    def destroy(): Unit = js.native
    
    def getElement(): HTMLElement = js.native
    
    def hide(): Unit = js.native
    
    def show(): Unit = js.native
  }
  object IVolumeControl {
    
    @scala.inline
    def apply(destroy: () => Unit, getElement: () => HTMLElement, hide: () => Unit, show: () => Unit): IVolumeControl = {
      val __obj = js.Dynamic.literal(destroy = js.Any.fromFunction0(destroy), getElement = js.Any.fromFunction0(getElement), hide = js.Any.fromFunction0(hide), show = js.Any.fromFunction0(show))
      __obj.asInstanceOf[IVolumeControl]
    }
    
    @scala.inline
    implicit class IVolumeControlMutableBuilder[Self <: IVolumeControl] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setDestroy(value: () => Unit): Self = StObject.set(x, "destroy", js.Any.fromFunction0(value))
      
      @scala.inline
      def setGetElement(value: () => HTMLElement): Self = StObject.set(x, "getElement", js.Any.fromFunction0(value))
      
      @scala.inline
      def setHide(value: () => Unit): Self = StObject.set(x, "hide", js.Any.fromFunction0(value))
      
      @scala.inline
      def setShow(value: () => Unit): Self = StObject.set(x, "show", js.Any.fromFunction0(value))
    }
  }
  
  @js.native
  trait IVolumeViewCallbacks extends StObject {
    
    def onDragEnd(): Unit = js.native
    
    def onDragStart(): Unit = js.native
    
    def onToggleMuteClick(): Unit = js.native
    
    def onVolumeLevelChangeFromInput(level: Double): Unit = js.native
    
    def onVolumeLevelChangeFromWheel(delta: Double): Unit = js.native
  }
  object IVolumeViewCallbacks {
    
    @scala.inline
    def apply(
      onDragEnd: () => Unit,
      onDragStart: () => Unit,
      onToggleMuteClick: () => Unit,
      onVolumeLevelChangeFromInput: Double => Unit,
      onVolumeLevelChangeFromWheel: Double => Unit
    ): IVolumeViewCallbacks = {
      val __obj = js.Dynamic.literal(onDragEnd = js.Any.fromFunction0(onDragEnd), onDragStart = js.Any.fromFunction0(onDragStart), onToggleMuteClick = js.Any.fromFunction0(onToggleMuteClick), onVolumeLevelChangeFromInput = js.Any.fromFunction1(onVolumeLevelChangeFromInput), onVolumeLevelChangeFromWheel = js.Any.fromFunction1(onVolumeLevelChangeFromWheel))
      __obj.asInstanceOf[IVolumeViewCallbacks]
    }
    
    @scala.inline
    implicit class IVolumeViewCallbacksMutableBuilder[Self <: IVolumeViewCallbacks] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setOnDragEnd(value: () => Unit): Self = StObject.set(x, "onDragEnd", js.Any.fromFunction0(value))
      
      @scala.inline
      def setOnDragStart(value: () => Unit): Self = StObject.set(x, "onDragStart", js.Any.fromFunction0(value))
      
      @scala.inline
      def setOnToggleMuteClick(value: () => Unit): Self = StObject.set(x, "onToggleMuteClick", js.Any.fromFunction0(value))
      
      @scala.inline
      def setOnVolumeLevelChangeFromInput(value: Double => Unit): Self = StObject.set(x, "onVolumeLevelChangeFromInput", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnVolumeLevelChangeFromWheel(value: Double => Unit): Self = StObject.set(x, "onVolumeLevelChangeFromWheel", js.Any.fromFunction1(value))
    }
  }
  
  @js.native
  trait IVolumeViewConfig extends StObject {
    
    var callbacks: IVolumeViewCallbacks = js.native
    
    var textMap: ITextMap = js.native
    
    var theme: IThemeService = js.native
    
    var tooltipService: ITooltipService = js.native
  }
  object IVolumeViewConfig {
    
    @scala.inline
    def apply(
      callbacks: IVolumeViewCallbacks,
      textMap: ITextMap,
      theme: IThemeService,
      tooltipService: ITooltipService
    ): IVolumeViewConfig = {
      val __obj = js.Dynamic.literal(callbacks = callbacks.asInstanceOf[js.Any], textMap = textMap.asInstanceOf[js.Any], theme = theme.asInstanceOf[js.Any], tooltipService = tooltipService.asInstanceOf[js.Any])
      __obj.asInstanceOf[IVolumeViewConfig]
    }
    
    @scala.inline
    implicit class IVolumeViewConfigMutableBuilder[Self <: IVolumeViewConfig] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setCallbacks(value: IVolumeViewCallbacks): Self = StObject.set(x, "callbacks", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTextMap(value: ITextMap): Self = StObject.set(x, "textMap", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTheme(value: IThemeService): Self = StObject.set(x, "theme", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTooltipService(value: ITooltipService): Self = StObject.set(x, "tooltipService", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait IVolumeViewStyles extends StObject {
    
    var background: String = js.native
    
    var hidden: String = js.native
    
    var hitbox: String = js.native
    
    var icon: String = js.native
    
    var isDragging: String = js.native
    
    var muteIcon: String = js.native
    
    var muteToggle: String = js.native
    
    var muted: String = js.native
    
    var progressBar: String = js.native
    
    var volume: String = js.native
    
    var volume0: String = js.native
    
    var volume0Icon: String = js.native
    
    var volume100: String = js.native
    
    var volume100Icon: String = js.native
    
    var volume50: String = js.native
    
    var volume50Icon: String = js.native
    
    var volumeControl: String = js.native
    
    var volumeInputBlock: String = js.native
  }
  object IVolumeViewStyles {
    
    @scala.inline
    def apply(
      background: String,
      hidden: String,
      hitbox: String,
      icon: String,
      isDragging: String,
      muteIcon: String,
      muteToggle: String,
      muted: String,
      progressBar: String,
      volume: String,
      volume0: String,
      volume0Icon: String,
      volume100: String,
      volume100Icon: String,
      volume50: String,
      volume50Icon: String,
      volumeControl: String,
      volumeInputBlock: String
    ): IVolumeViewStyles = {
      val __obj = js.Dynamic.literal(background = background.asInstanceOf[js.Any], hidden = hidden.asInstanceOf[js.Any], hitbox = hitbox.asInstanceOf[js.Any], icon = icon.asInstanceOf[js.Any], isDragging = isDragging.asInstanceOf[js.Any], muteIcon = muteIcon.asInstanceOf[js.Any], muteToggle = muteToggle.asInstanceOf[js.Any], muted = muted.asInstanceOf[js.Any], progressBar = progressBar.asInstanceOf[js.Any], volume = volume.asInstanceOf[js.Any], volume0 = volume0.asInstanceOf[js.Any], volume0Icon = volume0Icon.asInstanceOf[js.Any], volume100 = volume100.asInstanceOf[js.Any], volume100Icon = volume100Icon.asInstanceOf[js.Any], volume50 = volume50.asInstanceOf[js.Any], volume50Icon = volume50Icon.asInstanceOf[js.Any], volumeControl = volumeControl.asInstanceOf[js.Any], volumeInputBlock = volumeInputBlock.asInstanceOf[js.Any])
      __obj.asInstanceOf[IVolumeViewStyles]
    }
    
    @scala.inline
    implicit class IVolumeViewStylesMutableBuilder[Self <: IVolumeViewStyles] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setBackground(value: String): Self = StObject.set(x, "background", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHidden(value: String): Self = StObject.set(x, "hidden", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHitbox(value: String): Self = StObject.set(x, "hitbox", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIcon(value: String): Self = StObject.set(x, "icon", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIsDragging(value: String): Self = StObject.set(x, "isDragging", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMuteIcon(value: String): Self = StObject.set(x, "muteIcon", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMuteToggle(value: String): Self = StObject.set(x, "muteToggle", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMuted(value: String): Self = StObject.set(x, "muted", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setProgressBar(value: String): Self = StObject.set(x, "progressBar", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setVolume(value: String): Self = StObject.set(x, "volume", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setVolume0(value: String): Self = StObject.set(x, "volume0", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setVolume0Icon(value: String): Self = StObject.set(x, "volume0Icon", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setVolume100(value: String): Self = StObject.set(x, "volume100", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setVolume100Icon(value: String): Self = StObject.set(x, "volume100Icon", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setVolume50(value: String): Self = StObject.set(x, "volume50", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setVolume50Icon(value: String): Self = StObject.set(x, "volume50Icon", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setVolumeControl(value: String): Self = StObject.set(x, "volumeControl", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setVolumeInputBlock(value: String): Self = StObject.set(x, "volumeInputBlock", value.asInstanceOf[js.Any])
    }
  }
}
