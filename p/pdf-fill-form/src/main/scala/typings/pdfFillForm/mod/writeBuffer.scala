package typings.pdfFillForm.mod

import typings.node.Buffer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("pdf-fill-form", "writeBuffer")
@js.native
object writeBuffer extends js.Object {
  
  def apply(sourceBuffer: Buffer, fields: WritableFields): js.Promise[Buffer] = js.native
  def apply(sourceBuffer: Buffer, fields: WritableFields, options: Options): js.Promise[Buffer] = js.native
}
