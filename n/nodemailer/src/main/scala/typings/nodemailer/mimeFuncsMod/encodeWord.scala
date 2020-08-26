package typings.nodemailer.mimeFuncsMod

import typings.node.Buffer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("nodemailer/lib/mime-funcs", "encodeWord")
@js.native
object encodeWord extends js.Object {
  def apply(data: String): String = js.native
  def apply(data: String, mimeWordEncoding: js.UndefOr[scala.Nothing], maxLength: Double): String = js.native
  def apply(data: Buffer): String = js.native
  def apply(data: Buffer, mimeWordEncoding: js.UndefOr[scala.Nothing], maxLength: Double): String = js.native
}

