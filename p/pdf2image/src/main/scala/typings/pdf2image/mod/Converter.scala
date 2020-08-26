package typings.pdf2image.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Converter extends js.Object {
  def convertPDF(pdfFilePath: String): js.Promise[js.Array[ConvertedFile]] = js.native
  def convertPDFList(pdfList: js.Array[String]): js.Promise[js.Array[ConvertedFile]] = js.native
}

object Converter {
  @scala.inline
  def apply(
    convertPDF: String => js.Promise[js.Array[ConvertedFile]],
    convertPDFList: js.Array[String] => js.Promise[js.Array[ConvertedFile]]
  ): Converter = {
    val __obj = js.Dynamic.literal(convertPDF = js.Any.fromFunction1(convertPDF), convertPDFList = js.Any.fromFunction1(convertPDFList))
    __obj.asInstanceOf[Converter]
  }
  @scala.inline
  implicit class ConverterOps[Self <: Converter] (val x: Self) extends AnyVal {
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
    def setConvertPDF(value: String => js.Promise[js.Array[ConvertedFile]]): Self = this.set("convertPDF", js.Any.fromFunction1(value))
    @scala.inline
    def setConvertPDFList(value: js.Array[String] => js.Promise[js.Array[ConvertedFile]]): Self = this.set("convertPDFList", js.Any.fromFunction1(value))
  }
  
}

