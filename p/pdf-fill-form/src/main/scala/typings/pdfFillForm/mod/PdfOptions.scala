package typings.pdfFillForm.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PdfOptions extends Options {
  var antialias: js.UndefOr[Boolean] = js.native
  var cores: js.UndefOr[Double] = js.native
  var save: js.UndefOr[String] = js.native
  var scale: js.UndefOr[Double] = js.native
}

object PdfOptions {
  @scala.inline
  def apply(): PdfOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PdfOptions]
  }
  @scala.inline
  implicit class PdfOptionsOps[Self <: PdfOptions] (val x: Self) extends AnyVal {
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
    def setAntialias(value: Boolean): Self = this.set("antialias", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAntialias: Self = this.set("antialias", js.undefined)
    @scala.inline
    def setCores(value: Double): Self = this.set("cores", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCores: Self = this.set("cores", js.undefined)
    @scala.inline
    def setSave(value: String): Self = this.set("save", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSave: Self = this.set("save", js.undefined)
    @scala.inline
    def setScale(value: Double): Self = this.set("scale", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteScale: Self = this.set("scale", js.undefined)
  }
  
}

