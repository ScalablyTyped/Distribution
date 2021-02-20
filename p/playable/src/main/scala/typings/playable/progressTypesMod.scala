package typings.playable

import typings.playable.textMapTypesMod.ITextMap
import typings.playable.themeTypesMod.IThemeService
import typings.playable.tooltipTypesMod.ITooltipService
import typings.std.Event
import typings.std.EventListenerOrEventListenerObject
import typings.std.HTMLElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object progressTypesMod {
  
  @js.native
  trait IProgressControl extends StObject {
    
    def addTimeIndicator(time: Double): Unit = js.native
    
    def addTimeIndicators(times: js.Array[Double]): Unit = js.native
    
    def clearTimeIndicators(): Unit = js.native
    
    def destroy(): Unit = js.native
    
    def getElement(): HTMLElement = js.native
    
    def hide(): Unit = js.native
    
    def seekOnProgressDrag(): Unit = js.native
    
    def show(): Unit = js.native
    
    def showPreviewOnProgressDrag(): Unit = js.native
  }
  object IProgressControl {
    
    @scala.inline
    def apply(
      addTimeIndicator: Double => Unit,
      addTimeIndicators: js.Array[Double] => Unit,
      clearTimeIndicators: () => Unit,
      destroy: () => Unit,
      getElement: () => HTMLElement,
      hide: () => Unit,
      seekOnProgressDrag: () => Unit,
      show: () => Unit,
      showPreviewOnProgressDrag: () => Unit
    ): IProgressControl = {
      val __obj = js.Dynamic.literal(addTimeIndicator = js.Any.fromFunction1(addTimeIndicator), addTimeIndicators = js.Any.fromFunction1(addTimeIndicators), clearTimeIndicators = js.Any.fromFunction0(clearTimeIndicators), destroy = js.Any.fromFunction0(destroy), getElement = js.Any.fromFunction0(getElement), hide = js.Any.fromFunction0(hide), seekOnProgressDrag = js.Any.fromFunction0(seekOnProgressDrag), show = js.Any.fromFunction0(show), showPreviewOnProgressDrag = js.Any.fromFunction0(showPreviewOnProgressDrag))
      __obj.asInstanceOf[IProgressControl]
    }
    
    @scala.inline
    implicit class IProgressControlMutableBuilder[Self <: IProgressControl] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAddTimeIndicator(value: Double => Unit): Self = StObject.set(x, "addTimeIndicator", js.Any.fromFunction1(value))
      
      @scala.inline
      def setAddTimeIndicators(value: js.Array[Double] => Unit): Self = StObject.set(x, "addTimeIndicators", js.Any.fromFunction1(value))
      
      @scala.inline
      def setClearTimeIndicators(value: () => Unit): Self = StObject.set(x, "clearTimeIndicators", js.Any.fromFunction0(value))
      
      @scala.inline
      def setDestroy(value: () => Unit): Self = StObject.set(x, "destroy", js.Any.fromFunction0(value))
      
      @scala.inline
      def setGetElement(value: () => HTMLElement): Self = StObject.set(x, "getElement", js.Any.fromFunction0(value))
      
      @scala.inline
      def setHide(value: () => Unit): Self = StObject.set(x, "hide", js.Any.fromFunction0(value))
      
      @scala.inline
      def setSeekOnProgressDrag(value: () => Unit): Self = StObject.set(x, "seekOnProgressDrag", js.Any.fromFunction0(value))
      
      @scala.inline
      def setShow(value: () => Unit): Self = StObject.set(x, "show", js.Any.fromFunction0(value))
      
      @scala.inline
      def setShowPreviewOnProgressDrag(value: () => Unit): Self = StObject.set(x, "showPreviewOnProgressDrag", js.Any.fromFunction0(value))
    }
  }
  
  @js.native
  trait IProgressControlAPI extends StObject {
    
    var addTimeIndicator: js.UndefOr[js.Function1[/* time */ Double, Unit]] = js.native
    
    var addTimeIndicators: js.UndefOr[js.Function1[/* times */ js.Array[Double], Unit]] = js.native
    
    var clearTimeIndicators: js.UndefOr[js.Function0[Unit]] = js.native
    
    var seekOnProgressDrag: js.UndefOr[js.Function0[Unit]] = js.native
    
    var showPreviewOnProgressDrag: js.UndefOr[js.Function0[Unit]] = js.native
  }
  object IProgressControlAPI {
    
    @scala.inline
    def apply(): IProgressControlAPI = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[IProgressControlAPI]
    }
    
    @scala.inline
    implicit class IProgressControlAPIMutableBuilder[Self <: IProgressControlAPI] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAddTimeIndicator(value: /* time */ Double => Unit): Self = StObject.set(x, "addTimeIndicator", js.Any.fromFunction1(value))
      
      @scala.inline
      def setAddTimeIndicatorUndefined: Self = StObject.set(x, "addTimeIndicator", js.undefined)
      
      @scala.inline
      def setAddTimeIndicators(value: /* times */ js.Array[Double] => Unit): Self = StObject.set(x, "addTimeIndicators", js.Any.fromFunction1(value))
      
      @scala.inline
      def setAddTimeIndicatorsUndefined: Self = StObject.set(x, "addTimeIndicators", js.undefined)
      
      @scala.inline
      def setClearTimeIndicators(value: () => Unit): Self = StObject.set(x, "clearTimeIndicators", js.Any.fromFunction0(value))
      
      @scala.inline
      def setClearTimeIndicatorsUndefined: Self = StObject.set(x, "clearTimeIndicators", js.undefined)
      
      @scala.inline
      def setSeekOnProgressDrag(value: () => Unit): Self = StObject.set(x, "seekOnProgressDrag", js.Any.fromFunction0(value))
      
      @scala.inline
      def setSeekOnProgressDragUndefined: Self = StObject.set(x, "seekOnProgressDrag", js.undefined)
      
      @scala.inline
      def setShowPreviewOnProgressDrag(value: () => Unit): Self = StObject.set(x, "showPreviewOnProgressDrag", js.Any.fromFunction0(value))
      
      @scala.inline
      def setShowPreviewOnProgressDragUndefined: Self = StObject.set(x, "showPreviewOnProgressDrag", js.undefined)
    }
  }
  
  @js.native
  trait IProgressViewCallbacks extends StObject {
    
    def onChangePlayedPercent(percent: Double): Unit = js.native
    
    def onDragEnd(): Unit = js.native
    
    def onDragStart(): Unit = js.native
    
    def onSeekToByMouseEnd(): Unit = js.native
    
    def onSeekToByMouseStart(percent: Double): Unit = js.native
    
    def onSyncWithLiveClick(): Unit = js.native
    
    var onSyncWithLiveMouseEnter: EventListenerOrEventListenerObject = js.native
    
    var onSyncWithLiveMouseLeave: EventListenerOrEventListenerObject = js.native
  }
  object IProgressViewCallbacks {
    
    @scala.inline
    def apply(
      onChangePlayedPercent: Double => Unit,
      onDragEnd: () => Unit,
      onDragStart: () => Unit,
      onSeekToByMouseEnd: () => Unit,
      onSeekToByMouseStart: Double => Unit,
      onSyncWithLiveClick: () => Unit,
      onSyncWithLiveMouseEnter: EventListenerOrEventListenerObject,
      onSyncWithLiveMouseLeave: EventListenerOrEventListenerObject
    ): IProgressViewCallbacks = {
      val __obj = js.Dynamic.literal(onChangePlayedPercent = js.Any.fromFunction1(onChangePlayedPercent), onDragEnd = js.Any.fromFunction0(onDragEnd), onDragStart = js.Any.fromFunction0(onDragStart), onSeekToByMouseEnd = js.Any.fromFunction0(onSeekToByMouseEnd), onSeekToByMouseStart = js.Any.fromFunction1(onSeekToByMouseStart), onSyncWithLiveClick = js.Any.fromFunction0(onSyncWithLiveClick), onSyncWithLiveMouseEnter = onSyncWithLiveMouseEnter.asInstanceOf[js.Any], onSyncWithLiveMouseLeave = onSyncWithLiveMouseLeave.asInstanceOf[js.Any])
      __obj.asInstanceOf[IProgressViewCallbacks]
    }
    
    @scala.inline
    implicit class IProgressViewCallbacksMutableBuilder[Self <: IProgressViewCallbacks] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setOnChangePlayedPercent(value: Double => Unit): Self = StObject.set(x, "onChangePlayedPercent", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnDragEnd(value: () => Unit): Self = StObject.set(x, "onDragEnd", js.Any.fromFunction0(value))
      
      @scala.inline
      def setOnDragStart(value: () => Unit): Self = StObject.set(x, "onDragStart", js.Any.fromFunction0(value))
      
      @scala.inline
      def setOnSeekToByMouseEnd(value: () => Unit): Self = StObject.set(x, "onSeekToByMouseEnd", js.Any.fromFunction0(value))
      
      @scala.inline
      def setOnSeekToByMouseStart(value: Double => Unit): Self = StObject.set(x, "onSeekToByMouseStart", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnSyncWithLiveClick(value: () => Unit): Self = StObject.set(x, "onSyncWithLiveClick", js.Any.fromFunction0(value))
      
      @scala.inline
      def setOnSyncWithLiveMouseEnter(value: EventListenerOrEventListenerObject): Self = StObject.set(x, "onSyncWithLiveMouseEnter", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOnSyncWithLiveMouseEnterFunction1(value: /* evt */ Event => Unit): Self = StObject.set(x, "onSyncWithLiveMouseEnter", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnSyncWithLiveMouseLeave(value: EventListenerOrEventListenerObject): Self = StObject.set(x, "onSyncWithLiveMouseLeave", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOnSyncWithLiveMouseLeaveFunction1(value: /* evt */ Event => Unit): Self = StObject.set(x, "onSyncWithLiveMouseLeave", js.Any.fromFunction1(value))
    }
  }
  
  @js.native
  trait IProgressViewConfig extends StObject {
    
    var callbacks: IProgressViewCallbacks = js.native
    
    var textMap: ITextMap = js.native
    
    var theme: IThemeService = js.native
    
    var tooltipService: ITooltipService = js.native
  }
  object IProgressViewConfig {
    
    @scala.inline
    def apply(
      callbacks: IProgressViewCallbacks,
      textMap: ITextMap,
      theme: IThemeService,
      tooltipService: ITooltipService
    ): IProgressViewConfig = {
      val __obj = js.Dynamic.literal(callbacks = callbacks.asInstanceOf[js.Any], textMap = textMap.asInstanceOf[js.Any], theme = theme.asInstanceOf[js.Any], tooltipService = tooltipService.asInstanceOf[js.Any])
      __obj.asInstanceOf[IProgressViewConfig]
    }
    
    @scala.inline
    implicit class IProgressViewConfigMutableBuilder[Self <: IProgressViewConfig] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setCallbacks(value: IProgressViewCallbacks): Self = StObject.set(x, "callbacks", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTextMap(value: ITextMap): Self = StObject.set(x, "textMap", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTheme(value: IThemeService): Self = StObject.set(x, "theme", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTooltipService(value: ITooltipService): Self = StObject.set(x, "tooltipService", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait IProgressViewStyles extends StObject {
    
    var background: String = js.native
    
    var buffered: String = js.native
    
    var hidden: String = js.native
    
    var hitbox: String = js.native
    
    var inLive: String = js.native
    
    var isDragging: String = js.native
    
    var liveSync: String = js.native
    
    var played: String = js.native
    
    var progressBar: String = js.native
    
    var progressBarsWrapper: String = js.native
    
    var seekBlock: String = js.native
    
    var seekTo: String = js.native
    
    var syncButton: String = js.native
    
    var timeIndicators: String = js.native
  }
  object IProgressViewStyles {
    
    @scala.inline
    def apply(
      background: String,
      buffered: String,
      hidden: String,
      hitbox: String,
      inLive: String,
      isDragging: String,
      liveSync: String,
      played: String,
      progressBar: String,
      progressBarsWrapper: String,
      seekBlock: String,
      seekTo: String,
      syncButton: String,
      timeIndicators: String
    ): IProgressViewStyles = {
      val __obj = js.Dynamic.literal(background = background.asInstanceOf[js.Any], buffered = buffered.asInstanceOf[js.Any], hidden = hidden.asInstanceOf[js.Any], hitbox = hitbox.asInstanceOf[js.Any], inLive = inLive.asInstanceOf[js.Any], isDragging = isDragging.asInstanceOf[js.Any], liveSync = liveSync.asInstanceOf[js.Any], played = played.asInstanceOf[js.Any], progressBar = progressBar.asInstanceOf[js.Any], progressBarsWrapper = progressBarsWrapper.asInstanceOf[js.Any], seekBlock = seekBlock.asInstanceOf[js.Any], seekTo = seekTo.asInstanceOf[js.Any], syncButton = syncButton.asInstanceOf[js.Any], timeIndicators = timeIndicators.asInstanceOf[js.Any])
      __obj.asInstanceOf[IProgressViewStyles]
    }
    
    @scala.inline
    implicit class IProgressViewStylesMutableBuilder[Self <: IProgressViewStyles] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setBackground(value: String): Self = StObject.set(x, "background", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBuffered(value: String): Self = StObject.set(x, "buffered", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHidden(value: String): Self = StObject.set(x, "hidden", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHitbox(value: String): Self = StObject.set(x, "hitbox", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setInLive(value: String): Self = StObject.set(x, "inLive", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIsDragging(value: String): Self = StObject.set(x, "isDragging", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLiveSync(value: String): Self = StObject.set(x, "liveSync", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPlayed(value: String): Self = StObject.set(x, "played", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setProgressBar(value: String): Self = StObject.set(x, "progressBar", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setProgressBarsWrapper(value: String): Self = StObject.set(x, "progressBarsWrapper", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSeekBlock(value: String): Self = StObject.set(x, "seekBlock", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSeekTo(value: String): Self = StObject.set(x, "seekTo", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSyncButton(value: String): Self = StObject.set(x, "syncButton", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTimeIndicators(value: String): Self = StObject.set(x, "timeIndicators", value.asInstanceOf[js.Any])
    }
  }
}
