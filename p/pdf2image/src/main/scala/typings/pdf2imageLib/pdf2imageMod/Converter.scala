package typings
package pdf2imageLib.pdf2imageMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Converter extends js.Object {
  def convertPDF(pdfFilePath: java.lang.String): js.Promise[js.Array[ConvertedFile]]
  def convertPDFList(pdfList: js.Array[java.lang.String]): js.Promise[js.Array[ConvertedFile]]
}

