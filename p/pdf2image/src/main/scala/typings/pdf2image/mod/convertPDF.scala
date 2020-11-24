package typings.pdf2image.mod

import typings.pdf2image.anon.PartialOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("pdf2image", "convertPDF")
@js.native
object convertPDF extends js.Object {
  
  def apply(pdfFilePath: String): js.Promise[js.Array[ConvertedFile]] = js.native
  def apply(pdfFilePath: String, options: PartialOptions): js.Promise[js.Array[ConvertedFile]] = js.native
}
