package typings.powerappsComponentFramework.ComponentFramework.PropertyTypes

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * The structure returned by getCellImageInfo and propagated down to the control to display conditional images.
  */
@js.native
trait ImageInfo extends js.Object {
  /**
    * The tooltip associated with that image.
    */
  var Tooltip: String = js.native
  /**
    * The Url of the conditional image.
    */
  var Url: String = js.native
}

object ImageInfo {
  @scala.inline
  def apply(Tooltip: String, Url: String): ImageInfo = {
    val __obj = js.Dynamic.literal(Tooltip = Tooltip.asInstanceOf[js.Any], Url = Url.asInstanceOf[js.Any])
    __obj.asInstanceOf[ImageInfo]
  }
  @scala.inline
  implicit class ImageInfoOps[Self <: ImageInfo] (val x: Self) extends AnyVal {
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
    def setTooltip(value: String): Self = this.set("Tooltip", value.asInstanceOf[js.Any])
    @scala.inline
    def setUrl(value: String): Self = this.set("Url", value.asInstanceOf[js.Any])
  }
  
}

