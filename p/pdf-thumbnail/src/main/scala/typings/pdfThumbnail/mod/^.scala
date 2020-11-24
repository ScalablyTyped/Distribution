package typings.pdfThumbnail.mod

import typings.node.Buffer
import typings.node.NodeJS.ReadableStream
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("pdf-thumbnail", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  
  def apply(body: String): js.Promise[ReadableStream] = js.native
  def apply(body: String, options: PDFThumbnailOptions): js.Promise[ReadableStream] = js.native
  def apply(body: Buffer): js.Promise[ReadableStream] = js.native
  def apply(body: Buffer, options: PDFThumbnailOptions): js.Promise[ReadableStream] = js.native
  def apply(body: ReadableStream): js.Promise[ReadableStream] = js.native
  def apply(body: ReadableStream, options: PDFThumbnailOptions): js.Promise[ReadableStream] = js.native
}
