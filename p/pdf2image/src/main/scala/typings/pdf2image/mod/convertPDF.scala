package typings.pdf2image.mod

import typings.pdf2image.PartialOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("pdf2image", "convertPDF")
@js.native
object convertPDF extends js.Object {
  def apply(pdfFilePath: String): js.Promise[js.Array[ConvertedFile]] = js.native
  def apply(pdfFilePath: String, options: PartialOptions): js.Promise[js.Array[ConvertedFile]] = js.native
}

