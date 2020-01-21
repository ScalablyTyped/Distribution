package typings.pem.mod

import typings.pem.AnonKey
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("pem", "createPrivateKey")
@js.native
object createPrivateKey extends js.Object {
  def apply(callback: Callback[AnonKey]): Unit = js.native
  def apply(keyBitsize: Double, options: PrivateKeyCreationOptions, callback: Callback[AnonKey]): Unit = js.native
  def apply(optionsOrKeyBitsize: Double, callback: Callback[AnonKey]): Unit = js.native
  def apply(optionsOrKeyBitsize: PrivateKeyCreationOptions, callback: Callback[AnonKey]): Unit = js.native
}

