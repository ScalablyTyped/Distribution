package typings.pem.mod

import typings.node.Buffer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("pem", "readPkcs12")
@js.native
object readPkcs12 extends js.Object {
  def apply(bufferOrPath: String, callback: Callback[Pkcs12ReadResult]): js.Any = js.native
  def apply(bufferOrPath: String, options: Pkcs12ReadOptions, callback: Callback[Pkcs12ReadResult]): js.Any = js.native
  def apply(bufferOrPath: Buffer, callback: Callback[Pkcs12ReadResult]): js.Any = js.native
  def apply(bufferOrPath: Buffer, options: Pkcs12ReadOptions, callback: Callback[Pkcs12ReadResult]): js.Any = js.native
}

