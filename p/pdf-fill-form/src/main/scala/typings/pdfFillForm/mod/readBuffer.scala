package typings.pdfFillForm.mod

import typings.node.Buffer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("pdf-fill-form", "readBuffer")
@js.native
object readBuffer extends js.Object {
  def apply(sourceBuffer: Buffer): js.Promise[ReadableFields] = js.native
}

