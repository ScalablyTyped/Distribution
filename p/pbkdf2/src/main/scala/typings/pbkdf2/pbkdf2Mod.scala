package typings.pbkdf2

import typings.node.Buffer
import typings.std.Error
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("pbkdf2", JSImport.Namespace)
@js.native
object pbkdf2Mod extends js.Object {
  def pbkdf2(
    password: String,
    salt: String,
    iterations: Double,
    keylen: Double,
    callback: js.Function2[/* err */ Error, /* derivedKey */ Buffer, Unit]
  ): Unit = js.native
  def pbkdf2(
    password: String,
    salt: String,
    iterations: Double,
    keylen: Double,
    digest: String,
    callback: js.Function2[/* err */ Error, /* derivedKey */ Buffer, Unit]
  ): Unit = js.native
  def pbkdf2(
    password: String,
    salt: Buffer,
    iterations: Double,
    keylen: Double,
    callback: js.Function2[/* err */ Error, /* derivedKey */ Buffer, Unit]
  ): Unit = js.native
  def pbkdf2(
    password: String,
    salt: Buffer,
    iterations: Double,
    keylen: Double,
    digest: String,
    callback: js.Function2[/* err */ Error, /* derivedKey */ Buffer, Unit]
  ): Unit = js.native
  def pbkdf2(
    password: Buffer,
    salt: String,
    iterations: Double,
    keylen: Double,
    callback: js.Function2[/* err */ Error, /* derivedKey */ Buffer, Unit]
  ): Unit = js.native
  def pbkdf2(
    password: Buffer,
    salt: String,
    iterations: Double,
    keylen: Double,
    digest: String,
    callback: js.Function2[/* err */ Error, /* derivedKey */ Buffer, Unit]
  ): Unit = js.native
  def pbkdf2(
    password: Buffer,
    salt: Buffer,
    iterations: Double,
    keylen: Double,
    callback: js.Function2[/* err */ Error, /* derivedKey */ Buffer, Unit]
  ): Unit = js.native
  def pbkdf2(
    password: Buffer,
    salt: Buffer,
    iterations: Double,
    keylen: Double,
    digest: String,
    callback: js.Function2[/* err */ Error, /* derivedKey */ Buffer, Unit]
  ): Unit = js.native
  def pbkdf2Sync(password: String, salt: String, iterations: Double, keylen: Double): Buffer = js.native
  def pbkdf2Sync(password: String, salt: String, iterations: Double, keylen: Double, digest: String): Buffer = js.native
  def pbkdf2Sync(password: String, salt: Buffer, iterations: Double, keylen: Double): Buffer = js.native
  def pbkdf2Sync(password: String, salt: Buffer, iterations: Double, keylen: Double, digest: String): Buffer = js.native
  def pbkdf2Sync(password: Buffer, salt: String, iterations: Double, keylen: Double): Buffer = js.native
  def pbkdf2Sync(password: Buffer, salt: String, iterations: Double, keylen: Double, digest: String): Buffer = js.native
  def pbkdf2Sync(password: Buffer, salt: Buffer, iterations: Double, keylen: Double): Buffer = js.native
  def pbkdf2Sync(password: Buffer, salt: Buffer, iterations: Double, keylen: Double, digest: String): Buffer = js.native
}

