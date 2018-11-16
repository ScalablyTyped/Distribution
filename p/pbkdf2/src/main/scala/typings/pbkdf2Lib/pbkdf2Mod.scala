package typings
package pbkdf2Lib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("pbkdf2", JSImport.Namespace)
@js.native
object pbkdf2Mod extends js.Object {
  def pbkdf2(
    password: java.lang.String,
    salt: java.lang.String,
    iterations: scala.Double,
    keylen: scala.Double,
    callback: js.Function2[/* err */ nodeLib.Error, /* derivedKey */ nodeLib.Buffer, scala.Unit]
  ): scala.Unit = js.native
  def pbkdf2(
    password: java.lang.String,
    salt: java.lang.String,
    iterations: scala.Double,
    keylen: scala.Double,
    digest: java.lang.String,
    callback: js.Function2[/* err */ nodeLib.Error, /* derivedKey */ nodeLib.Buffer, scala.Unit]
  ): scala.Unit = js.native
  def pbkdf2(
    password: java.lang.String,
    salt: nodeLib.Buffer,
    iterations: scala.Double,
    keylen: scala.Double,
    callback: js.Function2[/* err */ nodeLib.Error, /* derivedKey */ nodeLib.Buffer, scala.Unit]
  ): scala.Unit = js.native
  def pbkdf2(
    password: java.lang.String,
    salt: nodeLib.Buffer,
    iterations: scala.Double,
    keylen: scala.Double,
    digest: java.lang.String,
    callback: js.Function2[/* err */ nodeLib.Error, /* derivedKey */ nodeLib.Buffer, scala.Unit]
  ): scala.Unit = js.native
  def pbkdf2(
    password: nodeLib.Buffer,
    salt: java.lang.String,
    iterations: scala.Double,
    keylen: scala.Double,
    callback: js.Function2[/* err */ nodeLib.Error, /* derivedKey */ nodeLib.Buffer, scala.Unit]
  ): scala.Unit = js.native
  def pbkdf2(
    password: nodeLib.Buffer,
    salt: java.lang.String,
    iterations: scala.Double,
    keylen: scala.Double,
    digest: java.lang.String,
    callback: js.Function2[/* err */ nodeLib.Error, /* derivedKey */ nodeLib.Buffer, scala.Unit]
  ): scala.Unit = js.native
  def pbkdf2(
    password: nodeLib.Buffer,
    salt: nodeLib.Buffer,
    iterations: scala.Double,
    keylen: scala.Double,
    callback: js.Function2[/* err */ nodeLib.Error, /* derivedKey */ nodeLib.Buffer, scala.Unit]
  ): scala.Unit = js.native
  def pbkdf2(
    password: nodeLib.Buffer,
    salt: nodeLib.Buffer,
    iterations: scala.Double,
    keylen: scala.Double,
    digest: java.lang.String,
    callback: js.Function2[/* err */ nodeLib.Error, /* derivedKey */ nodeLib.Buffer, scala.Unit]
  ): scala.Unit = js.native
  def pbkdf2Sync(password: java.lang.String, salt: java.lang.String, iterations: scala.Double, keylen: scala.Double): nodeLib.Buffer = js.native
  def pbkdf2Sync(
    password: java.lang.String,
    salt: java.lang.String,
    iterations: scala.Double,
    keylen: scala.Double,
    digest: java.lang.String
  ): nodeLib.Buffer = js.native
  def pbkdf2Sync(password: java.lang.String, salt: nodeLib.Buffer, iterations: scala.Double, keylen: scala.Double): nodeLib.Buffer = js.native
  def pbkdf2Sync(
    password: java.lang.String,
    salt: nodeLib.Buffer,
    iterations: scala.Double,
    keylen: scala.Double,
    digest: java.lang.String
  ): nodeLib.Buffer = js.native
  def pbkdf2Sync(password: nodeLib.Buffer, salt: java.lang.String, iterations: scala.Double, keylen: scala.Double): nodeLib.Buffer = js.native
  def pbkdf2Sync(
    password: nodeLib.Buffer,
    salt: java.lang.String,
    iterations: scala.Double,
    keylen: scala.Double,
    digest: java.lang.String
  ): nodeLib.Buffer = js.native
  def pbkdf2Sync(password: nodeLib.Buffer, salt: nodeLib.Buffer, iterations: scala.Double, keylen: scala.Double): nodeLib.Buffer = js.native
  def pbkdf2Sync(
    password: nodeLib.Buffer,
    salt: nodeLib.Buffer,
    iterations: scala.Double,
    keylen: scala.Double,
    digest: java.lang.String
  ): nodeLib.Buffer = js.native
}

