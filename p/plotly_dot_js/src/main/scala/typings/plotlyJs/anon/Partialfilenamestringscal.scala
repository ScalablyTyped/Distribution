package typings.plotlyJs.anon

import typings.plotlyJs.plotlyJsStrings.jpeg
import typings.plotlyJs.plotlyJsStrings.png
import typings.plotlyJs.plotlyJsStrings.svg
import typings.plotlyJs.plotlyJsStrings.webp
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined std.Partial<{  filename :string,   scale :number,   format :'png' | 'svg' | 'jpeg' | 'webp',   height :number,   width :number}> */
@js.native
trait Partialfilenamestringscal extends js.Object {
  var filename: js.UndefOr[String] = js.native
  var format: js.UndefOr[png | svg | jpeg | webp] = js.native
  var height: js.UndefOr[Double] = js.native
  var scale: js.UndefOr[Double] = js.native
  var width: js.UndefOr[Double] = js.native
}

object Partialfilenamestringscal {
  @scala.inline
  def apply(): Partialfilenamestringscal = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Partialfilenamestringscal]
  }
  @scala.inline
  implicit class PartialfilenamestringscalOps[Self <: Partialfilenamestringscal] (val x: Self) extends AnyVal {
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
    def setFilename(value: String): Self = this.set("filename", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFilename: Self = this.set("filename", js.undefined)
    @scala.inline
    def setFormat(value: png | svg | jpeg | webp): Self = this.set("format", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFormat: Self = this.set("format", js.undefined)
    @scala.inline
    def setHeight(value: Double): Self = this.set("height", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteHeight: Self = this.set("height", js.undefined)
    @scala.inline
    def setScale(value: Double): Self = this.set("scale", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteScale: Self = this.set("scale", js.undefined)
    @scala.inline
    def setWidth(value: Double): Self = this.set("width", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteWidth: Self = this.set("width", js.undefined)
  }
  
}

