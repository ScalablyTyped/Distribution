package typings.playable

import typings.playable.distSrcModulesTextMapTypesMod.ITextMap
import typings.playable.distSrcModulesUiCoreThemeTypesMod.IThemeService
import typings.playable.distSrcModulesUiCoreTooltipTypesMod.ITooltipService
import typings.std.Event
import typings.std.EventListenerOrEventListenerObject
import typings.std.HTMLElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distSrcModulesUiControlsProgressTypesMod {
  
  trait IProgressControl extends StObject {
    
    def addTimeIndicator(time: Double): Unit
    
    def addTimeIndicators(times: js.Array[Double]): Unit
    
    def clearTimeIndicators(): Unit
    
    def destroy(): Unit
    
    def getElement(): HTMLElement
    
    def hide(): Unit
    
    def seekOnProgressDrag(): Unit
    
    def show(): Unit
    
    def showPreviewOnProgressDrag(): Unit
  }
  object IProgressControl {
    
    inline def apply(
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
    implicit open class MutableBuilder[Self <: IProgressControl] (val x: Self) extends AnyVal {
      
      inline def setAddTimeIndicator(value: Double => Unit): Self = StObject.set(x, "addTimeIndicator", js.Any.fromFunction1(value))
      
      inline def setAddTimeIndicators(value: js.Array[Double] => Unit): Self = StObject.set(x, "addTimeIndicators", js.Any.fromFunction1(value))
      
      inline def setClearTimeIndicators(value: () => Unit): Self = StObject.set(x, "clearTimeIndicators", js.Any.fromFunction0(value))
      
      inline def setDestroy(value: () => Unit): Self = StObject.set(x, "destroy", js.Any.fromFunction0(value))
      
      inline def setGetElement(value: () => HTMLElement): Self = StObject.set(x, "getElement", js.Any.fromFunction0(value))
      
      inline def setHide(value: () => Unit): Self = StObject.set(x, "hide", js.Any.fromFunction0(value))
      
      inline def setSeekOnProgressDrag(value: () => Unit): Self = StObject.set(x, "seekOnProgressDrag", js.Any.fromFunction0(value))
      
      inline def setShow(value: () => Unit): Self = StObject.set(x, "show", js.Any.fromFunction0(value))
      
      inline def setShowPreviewOnProgressDrag(value: () => Unit): Self = StObject.set(x, "showPreviewOnProgressDrag", js.Any.fromFunction0(value))
    }
  }
  
  trait IProgressControlAPI extends StObject {
    
    var addTimeIndicator: js.UndefOr[js.Function1[/* time */ Double, Unit]] = js.undefined
    
    var addTimeIndicators: js.UndefOr[js.Function1[/* times */ js.Array[Double], Unit]] = js.undefined
    
    var clearTimeIndicators: js.UndefOr[js.Function0[Unit]] = js.undefined
    
    var seekOnProgressDrag: js.UndefOr[js.Function0[Unit]] = js.undefined
    
    var showPreviewOnProgressDrag: js.UndefOr[js.Function0[Unit]] = js.undefined
  }
  object IProgressControlAPI {
    
    inline def apply(): IProgressControlAPI = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[IProgressControlAPI]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: IProgressControlAPI] (val x: Self) extends AnyVal {
      
      inline def setAddTimeIndicator(value: /* time */ Double => Unit): Self = StObject.set(x, "addTimeIndicator", js.Any.fromFunction1(value))
      
      inline def setAddTimeIndicatorUndefined: Self = StObject.set(x, "addTimeIndicator", js.undefined)
      
      inline def setAddTimeIndicators(value: /* times */ js.Array[Double] => Unit): Self = StObject.set(x, "addTimeIndicators", js.Any.fromFunction1(value))
      
      inline def setAddTimeIndicatorsUndefined: Self = StObject.set(x, "addTimeIndicators", js.undefined)
      
      inline def setClearTimeIndicators(value: () => Unit): Self = StObject.set(x, "clearTimeIndicators", js.Any.fromFunction0(value))
      
      inline def setClearTimeIndicatorsUndefined: Self = StObject.set(x, "clearTimeIndicators", js.undefined)
      
      inline def setSeekOnProgressDrag(value: () => Unit): Self = StObject.set(x, "seekOnProgressDrag", js.Any.fromFunction0(value))
      
      inline def setSeekOnProgressDragUndefined: Self = StObject.set(x, "seekOnProgressDrag", js.undefined)
      
      inline def setShowPreviewOnProgressDrag(value: () => Unit): Self = StObject.set(x, "showPreviewOnProgressDrag", js.Any.fromFunction0(value))
      
      inline def setShowPreviewOnProgressDragUndefined: Self = StObject.set(x, "showPreviewOnProgressDrag", js.undefined)
    }
  }
  
  trait IProgressViewCallbacks extends StObject {
    
    def onChangePlayedPercent(percent: Double): Unit
    
    def onDragEnd(): Unit
    
    def onDragStart(): Unit
    
    def onSeekToByMouseEnd(): Unit
    
    def onSeekToByMouseStart(percent: Double): Unit
    
    def onSyncWithLiveClick(): Unit
    
    var onSyncWithLiveMouseEnter: EventListenerOrEventListenerObject
    
    var onSyncWithLiveMouseLeave: EventListenerOrEventListenerObject
  }
  object IProgressViewCallbacks {
    
    inline def apply(
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
    implicit open class MutableBuilder[Self <: IProgressViewCallbacks] (val x: Self) extends AnyVal {
      
      inline def setOnChangePlayedPercent(value: Double => Unit): Self = StObject.set(x, "onChangePlayedPercent", js.Any.fromFunction1(value))
      
      inline def setOnDragEnd(value: () => Unit): Self = StObject.set(x, "onDragEnd", js.Any.fromFunction0(value))
      
      inline def setOnDragStart(value: () => Unit): Self = StObject.set(x, "onDragStart", js.Any.fromFunction0(value))
      
      inline def setOnSeekToByMouseEnd(value: () => Unit): Self = StObject.set(x, "onSeekToByMouseEnd", js.Any.fromFunction0(value))
      
      inline def setOnSeekToByMouseStart(value: Double => Unit): Self = StObject.set(x, "onSeekToByMouseStart", js.Any.fromFunction1(value))
      
      inline def setOnSyncWithLiveClick(value: () => Unit): Self = StObject.set(x, "onSyncWithLiveClick", js.Any.fromFunction0(value))
      
      inline def setOnSyncWithLiveMouseEnter(value: EventListenerOrEventListenerObject): Self = StObject.set(x, "onSyncWithLiveMouseEnter", value.asInstanceOf[js.Any])
      
      inline def setOnSyncWithLiveMouseEnterFunction1(value: /* evt */ Event => Unit): Self = StObject.set(x, "onSyncWithLiveMouseEnter", js.Any.fromFunction1(value))
      
      inline def setOnSyncWithLiveMouseLeave(value: EventListenerOrEventListenerObject): Self = StObject.set(x, "onSyncWithLiveMouseLeave", value.asInstanceOf[js.Any])
      
      inline def setOnSyncWithLiveMouseLeaveFunction1(value: /* evt */ Event => Unit): Self = StObject.set(x, "onSyncWithLiveMouseLeave", js.Any.fromFunction1(value))
    }
  }
  
  trait IProgressViewConfig extends StObject {
    
    var callbacks: IProgressViewCallbacks
    
    var textMap: ITextMap
    
    var theme: IThemeService
    
    var tooltipService: ITooltipService
  }
  object IProgressViewConfig {
    
    inline def apply(
      callbacks: IProgressViewCallbacks,
      textMap: ITextMap,
      theme: IThemeService,
      tooltipService: ITooltipService
    ): IProgressViewConfig = {
      val __obj = js.Dynamic.literal(callbacks = callbacks.asInstanceOf[js.Any], textMap = textMap.asInstanceOf[js.Any], theme = theme.asInstanceOf[js.Any], tooltipService = tooltipService.asInstanceOf[js.Any])
      __obj.asInstanceOf[IProgressViewConfig]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: IProgressViewConfig] (val x: Self) extends AnyVal {
      
      inline def setCallbacks(value: IProgressViewCallbacks): Self = StObject.set(x, "callbacks", value.asInstanceOf[js.Any])
      
      inline def setTextMap(value: ITextMap): Self = StObject.set(x, "textMap", value.asInstanceOf[js.Any])
      
      inline def setTheme(value: IThemeService): Self = StObject.set(x, "theme", value.asInstanceOf[js.Any])
      
      inline def setTooltipService(value: ITooltipService): Self = StObject.set(x, "tooltipService", value.asInstanceOf[js.Any])
    }
  }
  
  trait IProgressViewStyles extends StObject {
    
    var background: String
    
    var buffered: String
    
    var hidden: String
    
    var hitbox: String
    
    var inLive: String
    
    var isDragging: String
    
    var liveSync: String
    
    var played: String
    
    var progressBar: String
    
    var progressBarsWrapper: String
    
    var seekBlock: String
    
    var seekTo: String
    
    var syncButton: String
    
    var timeIndicators: String
  }
  object IProgressViewStyles {
    
    inline def apply(
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
    implicit open class MutableBuilder[Self <: IProgressViewStyles] (val x: Self) extends AnyVal {
      
      inline def setBackground(value: String): Self = StObject.set(x, "background", value.asInstanceOf[js.Any])
      
      inline def setBuffered(value: String): Self = StObject.set(x, "buffered", value.asInstanceOf[js.Any])
      
      inline def setHidden(value: String): Self = StObject.set(x, "hidden", value.asInstanceOf[js.Any])
      
      inline def setHitbox(value: String): Self = StObject.set(x, "hitbox", value.asInstanceOf[js.Any])
      
      inline def setInLive(value: String): Self = StObject.set(x, "inLive", value.asInstanceOf[js.Any])
      
      inline def setIsDragging(value: String): Self = StObject.set(x, "isDragging", value.asInstanceOf[js.Any])
      
      inline def setLiveSync(value: String): Self = StObject.set(x, "liveSync", value.asInstanceOf[js.Any])
      
      inline def setPlayed(value: String): Self = StObject.set(x, "played", value.asInstanceOf[js.Any])
      
      inline def setProgressBar(value: String): Self = StObject.set(x, "progressBar", value.asInstanceOf[js.Any])
      
      inline def setProgressBarsWrapper(value: String): Self = StObject.set(x, "progressBarsWrapper", value.asInstanceOf[js.Any])
      
      inline def setSeekBlock(value: String): Self = StObject.set(x, "seekBlock", value.asInstanceOf[js.Any])
      
      inline def setSeekTo(value: String): Self = StObject.set(x, "seekTo", value.asInstanceOf[js.Any])
      
      inline def setSyncButton(value: String): Self = StObject.set(x, "syncButton", value.asInstanceOf[js.Any])
      
      inline def setTimeIndicators(value: String): Self = StObject.set(x, "timeIndicators", value.asInstanceOf[js.Any])
    }
  }
}
