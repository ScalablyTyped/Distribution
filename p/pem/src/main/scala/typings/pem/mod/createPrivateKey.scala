package typings.pem.mod

import typings.pem.anon.Key
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("pem", "createPrivateKey")
@js.native
object createPrivateKey extends js.Object {
  
  def apply(callback: Callback[Key]): Unit = js.native
  def apply(keyBitsize: Double, options: PrivateKeyCreationOptions, callback: Callback[Key]): Unit = js.native
  def apply(optionsOrKeyBitsize: Double, callback: Callback[Key]): Unit = js.native
  def apply(optionsOrKeyBitsize: PrivateKeyCreationOptions, callback: Callback[Key]): Unit = js.native
}
