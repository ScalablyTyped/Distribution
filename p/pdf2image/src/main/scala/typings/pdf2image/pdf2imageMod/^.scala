package typings.pdf2image.pdf2imageMod

import typings.std.Partial
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("pdf2image", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  def compileConverter(): Converter = js.native
  def compileConverter(options: Partial[Options]): Converter = js.native
  def convertPDF(pdfFilePath: String): js.Promise[js.Array[ConvertedFile]] = js.native
  def convertPDF(pdfFilePath: String, options: Partial[Options]): js.Promise[js.Array[ConvertedFile]] = js.native
}

