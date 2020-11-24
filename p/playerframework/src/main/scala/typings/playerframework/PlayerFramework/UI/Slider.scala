package typings.playerframework.PlayerFramework.UI

import typings.std.HTMLElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Slider extends js.Object {
  
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
  
  @scala.inline
  implicit class SliderOps[Self <: Slider] (val x: Self) extends AnyVal {
    
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
    def setAltStep1(value: Double): Self = this.set("altStep1", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAltStep2(value: Double): Self = this.set("altStep2", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAltStep3(value: Double): Self = this.set("altStep3", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDisabled(value: Boolean): Self = this.set("disabled", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setElement(value: HTMLElement): Self = this.set("element", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHidden(value: Boolean): Self = this.set("hidden", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIsThumbnailVisible(value: Boolean): Self = this.set("isThumbnailVisible", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLabel(value: String): Self = this.set("label", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMarkersVarargs(value: js.Any*): Self = this.set("markers", js.Array(value :_*))
    
    @scala.inline
    def setMarkers(value: js.Array[_]): Self = this.set("markers", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMax(value: Double): Self = this.set("max", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMin(value: Double): Self = this.set("min", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setProgress(value: Double): Self = this.set("progress", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStep(value: Double): Self = this.set("step", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setThumbnailImageSrc(value: String): Self = this.set("thumbnailImageSrc", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTooltip(value: String): Self = this.set("tooltip", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setValue(value: Double): Self = this.set("value", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVertical(value: Boolean): Self = this.set("vertical", value.asInstanceOf[js.Any])
  }
}
