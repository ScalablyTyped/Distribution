package typings.pem.pemMod

import typings.pem.Anon_Key
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("pem", "createPrivateKey")
@js.native
object createPrivateKey extends js.Object {
  def apply(callback: Callback[Anon_Key]): Unit = js.native
  def apply(keyBitsize: Double, options: PrivateKeyCreationOptions, callback: Callback[Anon_Key]): Unit = js.native
  def apply(optionsOrKeyBitsize: Double, callback: Callback[Anon_Key]): Unit = js.native
  def apply(optionsOrKeyBitsize: PrivateKeyCreationOptions, callback: Callback[Anon_Key]): Unit = js.native
}

