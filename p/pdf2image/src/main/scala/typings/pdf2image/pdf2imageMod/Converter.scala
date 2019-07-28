package typings.pdf2image.pdf2imageMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Converter extends js.Object {
  def convertPDF(pdfFilePath: String): js.Promise[js.Array[ConvertedFile]]
  def convertPDFList(pdfList: js.Array[String]): js.Promise[js.Array[ConvertedFile]]
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
}

