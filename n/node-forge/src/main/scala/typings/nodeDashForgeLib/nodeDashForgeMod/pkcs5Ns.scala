package typings
package nodeDashForgeLib.nodeDashForgeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("node-forge", "pkcs5")
@js.native
object pkcs5Ns extends js.Object {
  def pbkdf2(
    password: java.lang.String,
    salt: java.lang.String,
    iterations: scala.Double,
    keySize: scala.Double
  ): java.lang.String = js.native
  def pbkdf2(
    password: java.lang.String,
    salt: java.lang.String,
    iterations: scala.Double,
    keySize: scala.Double,
    callback: js.Function2[/* err */ stdLib.Error | scala.Null, /* dk */ java.lang.String | scala.Null, _]
  ): scala.Unit = js.native
  def pbkdf2(
    password: java.lang.String,
    salt: java.lang.String,
    iterations: scala.Double,
    keySize: scala.Double,
    messageDigest: nodeDashForgeLib.nodeDashForgeMod.mdNs.MessageDigest
  ): java.lang.String = js.native
  def pbkdf2(
    password: java.lang.String,
    salt: java.lang.String,
    iterations: scala.Double,
    keySize: scala.Double,
    messageDigest: nodeDashForgeLib.nodeDashForgeMod.mdNs.MessageDigest,
    callback: js.Function2[/* err */ stdLib.Error | scala.Null, /* dk */ java.lang.String | scala.Null, _]
  ): scala.Unit = js.native
  @JSName("pbkdf2")
  def pbkdf2_Unit(
    password: java.lang.String,
    salt: java.lang.String,
    iterations: scala.Double,
    keySize: scala.Double
  ): scala.Unit = js.native
  @JSName("pbkdf2")
  def pbkdf2_Unit(
    password: java.lang.String,
    salt: java.lang.String,
    iterations: scala.Double,
    keySize: scala.Double,
    messageDigest: nodeDashForgeLib.nodeDashForgeMod.mdNs.MessageDigest
  ): scala.Unit = js.native
}

