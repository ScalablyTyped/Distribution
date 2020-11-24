package typings.nodemailer.mimeFuncsMod

import typings.node.Buffer
import typings.nodemailer.nodemailerStrings.B
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("nodemailer/lib/mime-funcs", "encodeWord")
@js.native
object encodeWord_B extends js.Object {
  
  def apply(data: String, mimeWordEncoding: B): String = js.native
  def apply(data: String, mimeWordEncoding: B, maxLength: Double): String = js.native
  def apply(data: Buffer, mimeWordEncoding: B): String = js.native
  def apply(data: Buffer, mimeWordEncoding: B, maxLength: Double): String = js.native
}
