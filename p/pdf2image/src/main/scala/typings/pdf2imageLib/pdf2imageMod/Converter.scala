package typings
package pdf2imageLib.pdf2imageMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Converter extends js.Object {
  def convertPDF(pdfFilePath: java.lang.String): js.Promise[js.Array[ConvertedFile]]
  def convertPDFList(pdfList: js.Array[java.lang.String]): js.Promise[js.Array[ConvertedFile]]
}

object Converter {
  @scala.inline
  def apply(
    convertPDF: js.Function1[java.lang.String, js.Promise[js.Array[ConvertedFile]]],
    convertPDFList: js.Function1[js.Array[java.lang.String], js.Promise[js.Array[ConvertedFile]]]
  ): Converter = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("convertPDF")(convertPDF)
    __obj.updateDynamic("convertPDFList")(convertPDFList)
    __obj.asInstanceOf[Converter]
  }
}

