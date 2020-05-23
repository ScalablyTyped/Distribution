package typings.playerframework.PlayerFramework.UI

import typings.std.HTMLElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Slider extends js.Object {
  var altStep1: Double
  var altStep2: Double
  var altStep3: Double
  var disabled: Boolean
  var element: HTMLElement
  var hidden: Boolean
  var isThumbnailVisible: Boolean
  var label: String
  var markers: js.Array[_]
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
  @scala.inline
  def apply(
    altStep1: Double,
    altStep2: Double,
    altStep3: Double,
    disabled: Boolean,
    element: HTMLElement,
    hidden: Boolean,
    isThumbnailVisible: Boolean,
    label: String,
    markers: js.Array[_],
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
}

