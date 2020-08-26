package typings.playerframework.PlayerFramework.UI

import typings.std.HTMLElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ControlPanel extends js.Object {
  var element: HTMLElement = js.native
  var flyoutContainerElement: HTMLElement = js.native
  var hidden: Boolean = js.native
  var isAudioHidden: Boolean = js.native
  var isCaptionsHidden: Boolean = js.native
  var isElapsedTimeHidden: Boolean = js.native
  var isFastForwardHidden: Boolean = js.native
  var isFullScreenHidden: Boolean = js.native
  var isGoLiveHidden: Boolean = js.native
  var isInfoHidden: Boolean = js.native
  var isMediaQualityHidden: Boolean = js.native
  var isMoreHidden: Boolean = js.native
  var isMuteHidden: Boolean = js.native
  var isPauseHidden: Boolean = js.native
  var isPlayPauseHidden: Boolean = js.native
  var isPlayResumeHidden: Boolean = js.native
  var isRemainingTimeHidden: Boolean = js.native
  var isReplayHidden: Boolean = js.native
  var isRewindHidden: Boolean = js.native
  var isSignalStrengthHidden: Boolean = js.native
  var isSkipAheadHidden: Boolean = js.native
  var isSkipBackHidden: Boolean = js.native
  var isSkipNextHidden: Boolean = js.native
  var isSkipPreviousHidden: Boolean = js.native
  var isSlowMotionHidden: Boolean = js.native
  var isStopHidden: Boolean = js.native
  var isTimelineHidden: Boolean = js.native
  var isTotalTimeHidden: Boolean = js.native
  var isVolumeHidden: Boolean = js.native
  var isVolumeMuteHidden: Boolean = js.native
  var isZoomHidden: Boolean = js.native
}

object ControlPanel {
  @scala.inline
  def apply(
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
  implicit class ControlPanelOps[Self <: ControlPanel] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setElement(value: HTMLElement): Self = this.set("element", value.asInstanceOf[js.Any])
    @scala.inline
    def setFlyoutContainerElement(value: HTMLElement): Self = this.set("flyoutContainerElement", value.asInstanceOf[js.Any])
    @scala.inline
    def setHidden(value: Boolean): Self = this.set("hidden", value.asInstanceOf[js.Any])
    @scala.inline
    def setIsAudioHidden(value: Boolean): Self = this.set("isAudioHidden", value.asInstanceOf[js.Any])
    @scala.inline
    def setIsCaptionsHidden(value: Boolean): Self = this.set("isCaptionsHidden", value.asInstanceOf[js.Any])
    @scala.inline
    def setIsElapsedTimeHidden(value: Boolean): Self = this.set("isElapsedTimeHidden", value.asInstanceOf[js.Any])
    @scala.inline
    def setIsFastForwardHidden(value: Boolean): Self = this.set("isFastForwardHidden", value.asInstanceOf[js.Any])
    @scala.inline
    def setIsFullScreenHidden(value: Boolean): Self = this.set("isFullScreenHidden", value.asInstanceOf[js.Any])
    @scala.inline
    def setIsGoLiveHidden(value: Boolean): Self = this.set("isGoLiveHidden", value.asInstanceOf[js.Any])
    @scala.inline
    def setIsInfoHidden(value: Boolean): Self = this.set("isInfoHidden", value.asInstanceOf[js.Any])
    @scala.inline
    def setIsMediaQualityHidden(value: Boolean): Self = this.set("isMediaQualityHidden", value.asInstanceOf[js.Any])
    @scala.inline
    def setIsMoreHidden(value: Boolean): Self = this.set("isMoreHidden", value.asInstanceOf[js.Any])
    @scala.inline
    def setIsMuteHidden(value: Boolean): Self = this.set("isMuteHidden", value.asInstanceOf[js.Any])
    @scala.inline
    def setIsPauseHidden(value: Boolean): Self = this.set("isPauseHidden", value.asInstanceOf[js.Any])
    @scala.inline
    def setIsPlayPauseHidden(value: Boolean): Self = this.set("isPlayPauseHidden", value.asInstanceOf[js.Any])
    @scala.inline
    def setIsPlayResumeHidden(value: Boolean): Self = this.set("isPlayResumeHidden", value.asInstanceOf[js.Any])
    @scala.inline
    def setIsRemainingTimeHidden(value: Boolean): Self = this.set("isRemainingTimeHidden", value.asInstanceOf[js.Any])
    @scala.inline
    def setIsReplayHidden(value: Boolean): Self = this.set("isReplayHidden", value.asInstanceOf[js.Any])
    @scala.inline
    def setIsRewindHidden(value: Boolean): Self = this.set("isRewindHidden", value.asInstanceOf[js.Any])
    @scala.inline
    def setIsSignalStrengthHidden(value: Boolean): Self = this.set("isSignalStrengthHidden", value.asInstanceOf[js.Any])
    @scala.inline
    def setIsSkipAheadHidden(value: Boolean): Self = this.set("isSkipAheadHidden", value.asInstanceOf[js.Any])
    @scala.inline
    def setIsSkipBackHidden(value: Boolean): Self = this.set("isSkipBackHidden", value.asInstanceOf[js.Any])
    @scala.inline
    def setIsSkipNextHidden(value: Boolean): Self = this.set("isSkipNextHidden", value.asInstanceOf[js.Any])
    @scala.inline
    def setIsSkipPreviousHidden(value: Boolean): Self = this.set("isSkipPreviousHidden", value.asInstanceOf[js.Any])
    @scala.inline
    def setIsSlowMotionHidden(value: Boolean): Self = this.set("isSlowMotionHidden", value.asInstanceOf[js.Any])
    @scala.inline
    def setIsStopHidden(value: Boolean): Self = this.set("isStopHidden", value.asInstanceOf[js.Any])
    @scala.inline
    def setIsTimelineHidden(value: Boolean): Self = this.set("isTimelineHidden", value.asInstanceOf[js.Any])
    @scala.inline
    def setIsTotalTimeHidden(value: Boolean): Self = this.set("isTotalTimeHidden", value.asInstanceOf[js.Any])
    @scala.inline
    def setIsVolumeHidden(value: Boolean): Self = this.set("isVolumeHidden", value.asInstanceOf[js.Any])
    @scala.inline
    def setIsVolumeMuteHidden(value: Boolean): Self = this.set("isVolumeMuteHidden", value.asInstanceOf[js.Any])
    @scala.inline
    def setIsZoomHidden(value: Boolean): Self = this.set("isZoomHidden", value.asInstanceOf[js.Any])
  }
  
}

