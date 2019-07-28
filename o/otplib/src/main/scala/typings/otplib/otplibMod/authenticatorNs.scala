package typings.otplib.otplibMod

import typings.otplib.otplibMod.authenticatorNs.VerifyOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("otplib", "authenticator")
@js.native
object authenticatorNs extends js.Object {
  trait VerifyOptions extends js.Object {
    var secret: String
    var token: String
  }
  
  def check(token: String, secret: String): Boolean = js.native
  def generate(secret: String): String = js.native
  def generateSecret(): String = js.native
  def verify(options: VerifyOptions): Boolean = js.native
}

