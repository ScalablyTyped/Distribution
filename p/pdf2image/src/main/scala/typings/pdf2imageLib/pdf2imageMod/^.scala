package typings
package pdf2imageLib.pdf2imageMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("pdf2image", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  def compileConverter(): pdf2imageLib.pdf2imageMod.Converter = js.native
  def compileConverter(options: stdLib.Partial[pdf2imageLib.pdf2imageMod.Options]): pdf2imageLib.pdf2imageMod.Converter = js.native
  def convertPDF(pdfFilePath: java.lang.String): js.Promise[js.Array[pdf2imageLib.pdf2imageMod.ConvertedFile]] = js.native
  def convertPDF(pdfFilePath: java.lang.String, options: stdLib.Partial[pdf2imageLib.pdf2imageMod.Options]): js.Promise[js.Array[pdf2imageLib.pdf2imageMod.ConvertedFile]] = js.native
}

