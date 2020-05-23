package typings.pdfParse.mod

import typings.node.Buffer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("pdf-parse", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  def apply(dataBuffer: Buffer): js.Promise[Result] = js.native
  def apply(dataBuffer: Buffer, options: Options): js.Promise[Result] = js.native
}

