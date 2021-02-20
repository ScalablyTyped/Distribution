package typings.nodeForge.mod

import typings.nodeForge.mod.md.MessageDigest
import typings.std.Error
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object pkcs5 {
  
  @JSImport("node-forge", "pkcs5.pbkdf2")
  @js.native
  def pbkdf2(password: String, salt: String, iterations: Double, keySize: Double): String = js.native
  @JSImport("node-forge", "pkcs5.pbkdf2")
  @js.native
  def pbkdf2(
    password: String,
    salt: String,
    iterations: Double,
    keySize: Double,
    callback: js.Function2[/* err */ Error | Null, /* dk */ String | Null, _]
  ): Unit = js.native
  @JSImport("node-forge", "pkcs5.pbkdf2")
  @js.native
  def pbkdf2(
    password: String,
    salt: String,
    iterations: Double,
    keySize: Double,
    messageDigest: js.UndefOr[scala.Nothing],
    callback: js.Function2[/* err */ Error | Null, /* dk */ String | Null, _]
  ): Unit = js.native
  @JSImport("node-forge", "pkcs5.pbkdf2")
  @js.native
  def pbkdf2(password: String, salt: String, iterations: Double, keySize: Double, messageDigest: MessageDigest): String = js.native
  @JSImport("node-forge", "pkcs5.pbkdf2")
  @js.native
  def pbkdf2(
    password: String,
    salt: String,
    iterations: Double,
    keySize: Double,
    messageDigest: MessageDigest,
    callback: js.Function2[/* err */ Error | Null, /* dk */ String | Null, _]
  ): Unit = js.native
  @JSImport("node-forge", "pkcs5.pbkdf2")
  @js.native
  def pbkdf2_Unit(password: String, salt: String, iterations: Double, keySize: Double): Unit = js.native
  @JSImport("node-forge", "pkcs5.pbkdf2")
  @js.native
  def pbkdf2_Unit(password: String, salt: String, iterations: Double, keySize: Double, messageDigest: MessageDigest): Unit = js.native
}
