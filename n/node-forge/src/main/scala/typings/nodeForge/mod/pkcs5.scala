package typings.nodeForge.mod

import typings.nodeForge.mod.md.MessageDigest
import typings.std.Error
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("node-forge", "pkcs5")
@js.native
object pkcs5 extends js.Object {
  
  def pbkdf2(password: String, salt: String, iterations: Double, keySize: Double): String = js.native
  def pbkdf2(
    password: String,
    salt: String,
    iterations: Double,
    keySize: Double,
    callback: js.Function2[/* err */ Error | Null, /* dk */ String | Null, _]
  ): Unit = js.native
  def pbkdf2(
    password: String,
    salt: String,
    iterations: Double,
    keySize: Double,
    messageDigest: js.UndefOr[scala.Nothing],
    callback: js.Function2[/* err */ Error | Null, /* dk */ String | Null, _]
  ): Unit = js.native
  def pbkdf2(password: String, salt: String, iterations: Double, keySize: Double, messageDigest: MessageDigest): String = js.native
  def pbkdf2(
    password: String,
    salt: String,
    iterations: Double,
    keySize: Double,
    messageDigest: MessageDigest,
    callback: js.Function2[/* err */ Error | Null, /* dk */ String | Null, _]
  ): Unit = js.native
  @JSName("pbkdf2")
  def pbkdf2_Unit(password: String, salt: String, iterations: Double, keySize: Double): Unit = js.native
  @JSName("pbkdf2")
  def pbkdf2_Unit(password: String, salt: String, iterations: Double, keySize: Double, messageDigest: MessageDigest): Unit = js.native
}
