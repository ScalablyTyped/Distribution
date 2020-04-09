package typings.pdfFillForm.mod

import typings.node.Buffer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("pdf-fill-form", "write")
@js.native
object write extends js.Object {
  def apply(sourceFile: String, fields: WritableFields): js.Promise[Buffer] = js.native
  def apply(sourceFile: String, fields: WritableFields, options: Options): js.Promise[Buffer] = js.native
}

