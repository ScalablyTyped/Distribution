package typings.plotlyJs.mod

import typings.plotlyJs.plotlyJsStrings.jpeg
import typings.plotlyJs.plotlyJsStrings.png
import typings.plotlyJs.plotlyJsStrings.svg
import typings.plotlyJs.plotlyJsStrings.webp
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ToImgopts extends js.Object {
  var format: jpeg | png | webp | svg = js.native
  var height: Double = js.native
  var scale: js.UndefOr[Double] = js.native
  var width: Double = js.native
}

object ToImgopts {
  @scala.inline
  def apply(format: jpeg | png | webp | svg, height: Double, width: Double): ToImgopts = {
    val __obj = js.Dynamic.literal(format = format.asInstanceOf[js.Any], height = height.asInstanceOf[js.Any], width = width.asInstanceOf[js.Any])
    __obj.asInstanceOf[ToImgopts]
  }
  @scala.inline
  implicit class ToImgoptsOps[Self <: ToImgopts] (val x: Self) extends AnyVal {
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
    def setFormat(value: jpeg | png | webp | svg): Self = this.set("format", value.asInstanceOf[js.Any])
    @scala.inline
    def setHeight(value: Double): Self = this.set("height", value.asInstanceOf[js.Any])
    @scala.inline
    def setWidth(value: Double): Self = this.set("width", value.asInstanceOf[js.Any])
    @scala.inline
    def setScale(value: Double): Self = this.set("scale", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteScale: Self = this.set("scale", js.undefined)
  }
  
}

