package typings.pkcs7DashPadding

import typings.node.Buffer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("pkcs7-padding", JSImport.Namespace)
@js.native
object pkcs7DashPaddingMod extends js.Object {
  def pad(data: String, size: Double): String = js.native
  def pad(data: Buffer, size: Double): Buffer = js.native
  def unpad(data: String): String = js.native
  def unpad(data: Buffer): Buffer = js.native
}

