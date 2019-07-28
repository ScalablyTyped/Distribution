package typings.nodemailer.libQpMod

import typings.node.Buffer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("nodemailer/lib/qp", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  def encode(buffer: String): String = js.native
  def encode(buffer: Buffer): String = js.native
  def wrap(str: String): String = js.native
  def wrap(str: String, lineLength: Double): String = js.native
}

