package typings.playerframework.PlayerFramework

import typings.std.Element
import typings.std.HTMLElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("PlayerFramework.UI")
@js.native
object UI extends js.Object {
  @js.native
  class Button () extends js.Object {
    var content: String = js.native
    var disabled: Boolean = js.native
    var element: HTMLElement = js.native
    var flyout: Element = js.native
    var hidden: Boolean = js.native
    var hoverContent: String = js.native
    var label: String = js.native
    var tooltip: String = js.native
    var `type`: String = js.native
  }
  
  @js.native
  class ControlPanel () extends js.Object {
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
  
  @js.native
  class Indicator () extends js.Object {
    var disabled: Boolean = js.native
    var element: HTMLElement = js.native
    var hidden: Boolean = js.native
    var label: String = js.native
    var tooltip: String = js.native
    var value: String = js.native
  }
  
  @js.native
  class Meter () extends js.Object {
    var disabled: Boolean = js.native
    var element: HTMLElement = js.native
    var hidden: Boolean = js.native
    var label: String = js.native
    var tooltip: String = js.native
    var value: Double = js.native
  }
  
  @js.native
  class Slider () extends js.Object {
    var altStep1: Double = js.native
    var altStep2: Double = js.native
    var altStep3: Double = js.native
    var disabled: Boolean = js.native
    var element: HTMLElement = js.native
    var hidden: Boolean = js.native
    var isThumbnailVisible: Boolean = js.native
    var label: String = js.native
    var markers: js.Array[_] = js.native
    var max: Double = js.native
    var min: Double = js.native
    var progress: Double = js.native
    var step: Double = js.native
    var thumbnailImageSrc: String = js.native
    var tooltip: String = js.native
    var value: Double = js.native
    var vertical: Boolean = js.native
  }
  
}

