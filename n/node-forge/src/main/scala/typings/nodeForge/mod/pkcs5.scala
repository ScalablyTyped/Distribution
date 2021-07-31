package typings.nodeForge.mod

import typings.nodeForge.mod.md.MessageDigest
import typings.std.Error
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object pkcs5 {
  
  @JSImport("node-forge", "pkcs5")
  @js.native
  val ^ : js.Any = js.native
  
  @scala.inline
  def pbkdf2(password: String, salt: String, iterations: Double, keySize: Double): String = (^.asInstanceOf[js.Dynamic].applyDynamic("pbkdf2")(password.asInstanceOf[js.Any], salt.asInstanceOf[js.Any], iterations.asInstanceOf[js.Any], keySize.asInstanceOf[js.Any])).asInstanceOf[String]
  @scala.inline
  def pbkdf2(
    password: String,
    salt: String,
    iterations: Double,
    keySize: Double,
    callback: js.Function2[/* err */ Error | Null, /* dk */ String | Null, js.Any]
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("pbkdf2")(password.asInstanceOf[js.Any], salt.asInstanceOf[js.Any], iterations.asInstanceOf[js.Any], keySize.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
  @scala.inline
  def pbkdf2(
    password: String,
    salt: String,
    iterations: Double,
    keySize: Double,
    messageDigest: Unit,
    callback: js.Function2[/* err */ Error | Null, /* dk */ String | Null, js.Any]
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("pbkdf2")(password.asInstanceOf[js.Any], salt.asInstanceOf[js.Any], iterations.asInstanceOf[js.Any], keySize.asInstanceOf[js.Any], messageDigest.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
  @scala.inline
  def pbkdf2(password: String, salt: String, iterations: Double, keySize: Double, messageDigest: MessageDigest): String = (^.asInstanceOf[js.Dynamic].applyDynamic("pbkdf2")(password.asInstanceOf[js.Any], salt.asInstanceOf[js.Any], iterations.asInstanceOf[js.Any], keySize.asInstanceOf[js.Any], messageDigest.asInstanceOf[js.Any])).asInstanceOf[String]
  @scala.inline
  def pbkdf2(
    password: String,
    salt: String,
    iterations: Double,
    keySize: Double,
    messageDigest: MessageDigest,
    callback: js.Function2[/* err */ Error | Null, /* dk */ String | Null, js.Any]
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("pbkdf2")(password.asInstanceOf[js.Any], salt.asInstanceOf[js.Any], iterations.asInstanceOf[js.Any], keySize.asInstanceOf[js.Any], messageDigest.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  @scala.inline
  def pbkdf2_Unit(password: String, salt: String, iterations: Double, keySize: Double): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("pbkdf2")(password.asInstanceOf[js.Any], salt.asInstanceOf[js.Any], iterations.asInstanceOf[js.Any], keySize.asInstanceOf[js.Any])).asInstanceOf[Unit]
  @scala.inline
  def pbkdf2_Unit(password: String, salt: String, iterations: Double, keySize: Double, messageDigest: MessageDigest): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("pbkdf2")(password.asInstanceOf[js.Any], salt.asInstanceOf[js.Any], iterations.asInstanceOf[js.Any], keySize.asInstanceOf[js.Any], messageDigest.asInstanceOf[js.Any])).asInstanceOf[Unit]
}
