package typings.playerframework.PlayerFramework

import typings.std.Element
import typings.std.HTMLElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object UI {
  
  trait Button extends StObject {
    
    var content: String
    
    var disabled: Boolean
    
    var element: HTMLElement
    
    var flyout: Element
    
    var hidden: Boolean
    
    var hoverContent: String
    
    var label: String
    
    var tooltip: String
    
    var `type`: String
  }
  object Button {
    
    inline def apply(
      content: String,
      disabled: Boolean,
      element: HTMLElement,
      flyout: Element,
      hidden: Boolean,
      hoverContent: String,
      label: String,
      tooltip: String,
      `type`: String
    ): Button = {
      val __obj = js.Dynamic.literal(content = content.asInstanceOf[js.Any], disabled = disabled.asInstanceOf[js.Any], element = element.asInstanceOf[js.Any], flyout = flyout.asInstanceOf[js.Any], hidden = hidden.asInstanceOf[js.Any], hoverContent = hoverContent.asInstanceOf[js.Any], label = label.asInstanceOf[js.Any], tooltip = tooltip.asInstanceOf[js.Any])
      __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      __obj.asInstanceOf[Button]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Button] (val x: Self) extends AnyVal {
      
      inline def setContent(value: String): Self = StObject.set(x, "content", value.asInstanceOf[js.Any])
      
      inline def setDisabled(value: Boolean): Self = StObject.set(x, "disabled", value.asInstanceOf[js.Any])
      
      inline def setElement(value: HTMLElement): Self = StObject.set(x, "element", value.asInstanceOf[js.Any])
      
      inline def setFlyout(value: Element): Self = StObject.set(x, "flyout", value.asInstanceOf[js.Any])
      
      inline def setHidden(value: Boolean): Self = StObject.set(x, "hidden", value.asInstanceOf[js.Any])
      
      inline def setHoverContent(value: String): Self = StObject.set(x, "hoverContent", value.asInstanceOf[js.Any])
      
      inline def setLabel(value: String): Self = StObject.set(x, "label", value.asInstanceOf[js.Any])
      
      inline def setTooltip(value: String): Self = StObject.set(x, "tooltip", value.asInstanceOf[js.Any])
      
      inline def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    }
  }
  
  trait ControlPanel extends StObject {
    
    var element: HTMLElement
    
    var flyoutContainerElement: HTMLElement
    
    var hidden: Boolean
    
    var isAudioHidden: Boolean
    
    var isCaptionsHidden: Boolean
    
    var isElapsedTimeHidden: Boolean
    
    var isFastForwardHidden: Boolean
    
    var isFullScreenHidden: Boolean
    
    var isGoLiveHidden: Boolean
    
    var isInfoHidden: Boolean
    
    var isMediaQualityHidden: Boolean
    
    var isMoreHidden: Boolean
    
    var isMuteHidden: Boolean
    
    var isPauseHidden: Boolean
    
    var isPlayPauseHidden: Boolean
    
    var isPlayResumeHidden: Boolean
    
    var isRemainingTimeHidden: Boolean
    
    var isReplayHidden: Boolean
    
    var isRewindHidden: Boolean
    
    var isSignalStrengthHidden: Boolean
    
    var isSkipAheadHidden: Boolean
    
    var isSkipBackHidden: Boolean
    
    var isSkipNextHidden: Boolean
    
    var isSkipPreviousHidden: Boolean
    
    var isSlowMotionHidden: Boolean
    
    var isStopHidden: Boolean
    
    var isTimelineHidden: Boolean
    
    var isTotalTimeHidden: Boolean
    
    var isVolumeHidden: Boolean
    
    var isVolumeMuteHidden: Boolean
    
    var isZoomHidden: Boolean
  }
  object ControlPanel {
    
    inline def apply(
      element: HTMLElement,
      flyoutContainerElement: HTMLElement,
      hidden: Boolean,
      isAudioHidden: Boolean,
      isCaptionsHidden: Boolean,
      isElapsedTimeHidden: Boolean,
      isFastForwardHidden: Boolean,
      isFullScreenHidden: Boolean,
      isGoLiveHidden: Boolean,
      isInfoHidden: Boolean,
      isMediaQualityHidden: Boolean,
      isMoreHidden: Boolean,
      isMuteHidden: Boolean,
      isPauseHidden: Boolean,
      isPlayPauseHidden: Boolean,
      isPlayResumeHidden: Boolean,
      isRemainingTimeHidden: Boolean,
      isReplayHidden: Boolean,
      isRewindHidden: Boolean,
      isSignalStrengthHidden: Boolean,
      isSkipAheadHidden: Boolean,
      isSkipBackHidden: Boolean,
      isSkipNextHidden: Boolean,
      isSkipPreviousHidden: Boolean,
      isSlowMotionHidden: Boolean,
      isStopHidden: Boolean,
      isTimelineHidden: Boolean,
      isTotalTimeHidden: Boolean,
      isVolumeHidden: Boolean,
      isVolumeMuteHidden: Boolean,
      isZoomHidden: Boolean
    ): ControlPanel = {
      val __obj = js.Dynamic.literal(element = element.asInstanceOf[js.Any], flyoutContainerElement = flyoutContainerElement.asInstanceOf[js.Any], hidden = hidden.asInstanceOf[js.Any], isAudioHidden = isAudioHidden.asInstanceOf[js.Any], isCaptionsHidden = isCaptionsHidden.asInstanceOf[js.Any], isElapsedTimeHidden = isElapsedTimeHidden.asInstanceOf[js.Any], isFastForwardHidden = isFastForwardHidden.asInstanceOf[js.Any], isFullScreenHidden = isFullScreenHidden.asInstanceOf[js.Any], isGoLiveHidden = isGoLiveHidden.asInstanceOf[js.Any], isInfoHidden = isInfoHidden.asInstanceOf[js.Any], isMediaQualityHidden = isMediaQualityHidden.asInstanceOf[js.Any], isMoreHidden = isMoreHidden.asInstanceOf[js.Any], isMuteHidden = isMuteHidden.asInstanceOf[js.Any], isPauseHidden = isPauseHidden.asInstanceOf[js.Any], isPlayPauseHidden = isPlayPauseHidden.asInstanceOf[js.Any], isPlayResumeHidden = isPlayResumeHidden.asInstanceOf[js.Any], isRemainingTimeHidden = isRemainingTimeHidden.asInstanceOf[js.Any], isReplayHidden = isReplayHidden.asInstanceOf[js.Any], isRewindHidden = isRewindHidden.asInstanceOf[js.Any], isSignalStrengthHidden = isSignalStrengthHidden.asInstanceOf[js.Any], isSkipAheadHidden = isSkipAheadHidden.asInstanceOf[js.Any], isSkipBackHidden = isSkipBackHidden.asInstanceOf[js.Any], isSkipNextHidden = isSkipNextHidden.asInstanceOf[js.Any], isSkipPreviousHidden = isSkipPreviousHidden.asInstanceOf[js.Any], isSlowMotionHidden = isSlowMotionHidden.asInstanceOf[js.Any], isStopHidden = isStopHidden.asInstanceOf[js.Any], isTimelineHidden = isTimelineHidden.asInstanceOf[js.Any], isTotalTimeHidden = isTotalTimeHidden.asInstanceOf[js.Any], isVolumeHidden = isVolumeHidden.asInstanceOf[js.Any], isVolumeMuteHidden = isVolumeMuteHidden.asInstanceOf[js.Any], isZoomHidden = isZoomHidden.asInstanceOf[js.Any])
      __obj.asInstanceOf[ControlPanel]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: ControlPanel] (val x: Self) extends AnyVal {
      
      inline def setElement(value: HTMLElement): Self = StObject.set(x, "element", value.asInstanceOf[js.Any])
      
      inline def setFlyoutContainerElement(value: HTMLElement): Self = StObject.set(x, "flyoutContainerElement", value.asInstanceOf[js.Any])
      
      inline def setHidden(value: Boolean): Self = StObject.set(x, "hidden", value.asInstanceOf[js.Any])
      
      inline def setIsAudioHidden(value: Boolean): Self = StObject.set(x, "isAudioHidden", value.asInstanceOf[js.Any])
      
      inline def setIsCaptionsHidden(value: Boolean): Self = StObject.set(x, "isCaptionsHidden", value.asInstanceOf[js.Any])
      
      inline def setIsElapsedTimeHidden(value: Boolean): Self = StObject.set(x, "isElapsedTimeHidden", value.asInstanceOf[js.Any])
      
      inline def setIsFastForwardHidden(value: Boolean): Self = StObject.set(x, "isFastForwardHidden", value.asInstanceOf[js.Any])
      
      inline def setIsFullScreenHidden(value: Boolean): Self = StObject.set(x, "isFullScreenHidden", value.asInstanceOf[js.Any])
      
      inline def setIsGoLiveHidden(value: Boolean): Self = StObject.set(x, "isGoLiveHidden", value.asInstanceOf[js.Any])
      
      inline def setIsInfoHidden(value: Boolean): Self = StObject.set(x, "isInfoHidden", value.asInstanceOf[js.Any])
      
      inline def setIsMediaQualityHidden(value: Boolean): Self = StObject.set(x, "isMediaQualityHidden", value.asInstanceOf[js.Any])
      
      inline def setIsMoreHidden(value: Boolean): Self = StObject.set(x, "isMoreHidden", value.asInstanceOf[js.Any])
      
      inline def setIsMuteHidden(value: Boolean): Self = StObject.set(x, "isMuteHidden", value.asInstanceOf[js.Any])
      
      inline def setIsPauseHidden(value: Boolean): Self = StObject.set(x, "isPauseHidden", value.asInstanceOf[js.Any])
      
      inline def setIsPlayPauseHidden(value: Boolean): Self = StObject.set(x, "isPlayPauseHidden", value.asInstanceOf[js.Any])
      
      inline def setIsPlayResumeHidden(value: Boolean): Self = StObject.set(x, "isPlayResumeHidden", value.asInstanceOf[js.Any])
      
      inline def setIsRemainingTimeHidden(value: Boolean): Self = StObject.set(x, "isRemainingTimeHidden", value.asInstanceOf[js.Any])
      
      inline def setIsReplayHidden(value: Boolean): Self = StObject.set(x, "isReplayHidden", value.asInstanceOf[js.Any])
      
      inline def setIsRewindHidden(value: Boolean): Self = StObject.set(x, "isRewindHidden", value.asInstanceOf[js.Any])
      
      inline def setIsSignalStrengthHidden(value: Boolean): Self = StObject.set(x, "isSignalStrengthHidden", value.asInstanceOf[js.Any])
      
      inline def setIsSkipAheadHidden(value: Boolean): Self = StObject.set(x, "isSkipAheadHidden", value.asInstanceOf[js.Any])
      
      inline def setIsSkipBackHidden(value: Boolean): Self = StObject.set(x, "isSkipBackHidden", value.asInstanceOf[js.Any])
      
      inline def setIsSkipNextHidden(value: Boolean): Self = StObject.set(x, "isSkipNextHidden", value.asInstanceOf[js.Any])
      
      inline def setIsSkipPreviousHidden(value: Boolean): Self = StObject.set(x, "isSkipPreviousHidden", value.asInstanceOf[js.Any])
      
      inline def setIsSlowMotionHidden(value: Boolean): Self = StObject.set(x, "isSlowMotionHidden", value.asInstanceOf[js.Any])
      
      inline def setIsStopHidden(value: Boolean): Self = StObject.set(x, "isStopHidden", value.asInstanceOf[js.Any])
      
      inline def setIsTimelineHidden(value: Boolean): Self = StObject.set(x, "isTimelineHidden", value.asInstanceOf[js.Any])
      
      inline def setIsTotalTimeHidden(value: Boolean): Self = StObject.set(x, "isTotalTimeHidden", value.asInstanceOf[js.Any])
      
      inline def setIsVolumeHidden(value: Boolean): Self = StObject.set(x, "isVolumeHidden", value.asInstanceOf[js.Any])
      
      inline def setIsVolumeMuteHidden(value: Boolean): Self = StObject.set(x, "isVolumeMuteHidden", value.asInstanceOf[js.Any])
      
      inline def setIsZoomHidden(value: Boolean): Self = StObject.set(x, "isZoomHidden", value.asInstanceOf[js.Any])
    }
  }
  
  trait Indicator extends StObject {
    
    var disabled: Boolean
    
    var element: HTMLElement
    
    var hidden: Boolean
    
    var label: String
    
    var tooltip: String
    
    var value: String
  }
  object Indicator {
    
    inline def apply(
      disabled: Boolean,
      element: HTMLElement,
      hidden: Boolean,
      label: String,
      tooltip: String,
      value: String
    ): Indicator = {
      val __obj = js.Dynamic.literal(disabled = disabled.asInstanceOf[js.Any], element = element.asInstanceOf[js.Any], hidden = hidden.asInstanceOf[js.Any], label = label.asInstanceOf[js.Any], tooltip = tooltip.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
      __obj.asInstanceOf[Indicator]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Indicator] (val x: Self) extends AnyVal {
      
      inline def setDisabled(value: Boolean): Self = StObject.set(x, "disabled", value.asInstanceOf[js.Any])
      
      inline def setElement(value: HTMLElement): Self = StObject.set(x, "element", value.asInstanceOf[js.Any])
      
      inline def setHidden(value: Boolean): Self = StObject.set(x, "hidden", value.asInstanceOf[js.Any])
      
      inline def setLabel(value: String): Self = StObject.set(x, "label", value.asInstanceOf[js.Any])
      
      inline def setTooltip(value: String): Self = StObject.set(x, "tooltip", value.asInstanceOf[js.Any])
      
      inline def setValue(value: String): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    }
  }
  
  trait Meter extends StObject {
    
    var disabled: Boolean
    
    var element: HTMLElement
    
    var hidden: Boolean
    
    var label: String
    
    var tooltip: String
    
    var value: Double
  }
  object Meter {
    
    inline def apply(
      disabled: Boolean,
      element: HTMLElement,
      hidden: Boolean,
      label: String,
      tooltip: String,
      value: Double
    ): Meter = {
      val __obj = js.Dynamic.literal(disabled = disabled.asInstanceOf[js.Any], element = element.asInstanceOf[js.Any], hidden = hidden.asInstanceOf[js.Any], label = label.asInstanceOf[js.Any], tooltip = tooltip.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
      __obj.asInstanceOf[Meter]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Meter] (val x: Self) extends AnyVal {
      
      inline def setDisabled(value: Boolean): Self = StObject.set(x, "disabled", value.asInstanceOf[js.Any])
      
      inline def setElement(value: HTMLElement): Self = StObject.set(x, "element", value.asInstanceOf[js.Any])
      
      inline def setHidden(value: Boolean): Self = StObject.set(x, "hidden", value.asInstanceOf[js.Any])
      
      inline def setLabel(value: String): Self = StObject.set(x, "label", value.asInstanceOf[js.Any])
      
      inline def setTooltip(value: String): Self = StObject.set(x, "tooltip", value.asInstanceOf[js.Any])
      
      inline def setValue(value: Double): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    }
  }
  
  trait Slider extends StObject {
    
    var altStep1: Double
    
    var altStep2: Double
    
    var altStep3: Double
    
    var disabled: Boolean
    
    var element: HTMLElement
    
    var hidden: Boolean
    
    var isThumbnailVisible: Boolean
    
    var label: String
    
    var markers: js.Array[Any]
    
    var max: Double
    
    var min: Double
    
    var progress: Double
    
    var step: Double
    
    var thumbnailImageSrc: String
    
    var tooltip: String
    
    var value: Double
    
    var vertical: Boolean
  }
  object Slider {
    
    inline def apply(
      altStep1: Double,
      altStep2: Double,
      altStep3: Double,
      disabled: Boolean,
      element: HTMLElement,
      hidden: Boolean,
      isThumbnailVisible: Boolean,
      label: String,
      markers: js.Array[Any],
      max: Double,
      min: Double,
      progress: Double,
      step: Double,
      thumbnailImageSrc: String,
      tooltip: String,
      value: Double,
      vertical: Boolean
    ): Slider = {
      val __obj = js.Dynamic.literal(altStep1 = altStep1.asInstanceOf[js.Any], altStep2 = altStep2.asInstanceOf[js.Any], altStep3 = altStep3.asInstanceOf[js.Any], disabled = disabled.asInstanceOf[js.Any], element = element.asInstanceOf[js.Any], hidden = hidden.asInstanceOf[js.Any], isThumbnailVisible = isThumbnailVisible.asInstanceOf[js.Any], label = label.asInstanceOf[js.Any], markers = markers.asInstanceOf[js.Any], max = max.asInstanceOf[js.Any], min = min.asInstanceOf[js.Any], progress = progress.asInstanceOf[js.Any], step = step.asInstanceOf[js.Any], thumbnailImageSrc = thumbnailImageSrc.asInstanceOf[js.Any], tooltip = tooltip.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any], vertical = vertical.asInstanceOf[js.Any])
      __obj.asInstanceOf[Slider]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Slider] (val x: Self) extends AnyVal {
      
      inline def setAltStep1(value: Double): Self = StObject.set(x, "altStep1", value.asInstanceOf[js.Any])
      
      inline def setAltStep2(value: Double): Self = StObject.set(x, "altStep2", value.asInstanceOf[js.Any])
      
      inline def setAltStep3(value: Double): Self = StObject.set(x, "altStep3", value.asInstanceOf[js.Any])
      
      inline def setDisabled(value: Boolean): Self = StObject.set(x, "disabled", value.asInstanceOf[js.Any])
      
      inline def setElement(value: HTMLElement): Self = StObject.set(x, "element", value.asInstanceOf[js.Any])
      
      inline def setHidden(value: Boolean): Self = StObject.set(x, "hidden", value.asInstanceOf[js.Any])
      
      inline def setIsThumbnailVisible(value: Boolean): Self = StObject.set(x, "isThumbnailVisible", value.asInstanceOf[js.Any])
      
      inline def setLabel(value: String): Self = StObject.set(x, "label", value.asInstanceOf[js.Any])
      
      inline def setMarkers(value: js.Array[Any]): Self = StObject.set(x, "markers", value.asInstanceOf[js.Any])
      
      inline def setMarkersVarargs(value: Any*): Self = StObject.set(x, "markers", js.Array(value*))
      
      inline def setMax(value: Double): Self = StObject.set(x, "max", value.asInstanceOf[js.Any])
      
      inline def setMin(value: Double): Self = StObject.set(x, "min", value.asInstanceOf[js.Any])
      
      inline def setProgress(value: Double): Self = StObject.set(x, "progress", value.asInstanceOf[js.Any])
      
      inline def setStep(value: Double): Self = StObject.set(x, "step", value.asInstanceOf[js.Any])
      
      inline def setThumbnailImageSrc(value: String): Self = StObject.set(x, "thumbnailImageSrc", value.asInstanceOf[js.Any])
      
      inline def setTooltip(value: String): Self = StObject.set(x, "tooltip", value.asInstanceOf[js.Any])
      
      inline def setValue(value: Double): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
      
      inline def setVertical(value: Boolean): Self = StObject.set(x, "vertical", value.asInstanceOf[js.Any])
    }
  }
}
